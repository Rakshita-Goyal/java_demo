
package CollectionProject;

import java.util.*;
class Tasks {
    private int id;
    private String name;

    public Tasks(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public String toString() {
        return "Task ID: " + id + ", Name: " + name;
    }
}

class TaskManager {

  private List<Tasks> taskList = new ArrayList<>();
    private Set<String> categories = new HashSet<>();

  private Map<Integer, String> taskCategoryMap = new HashMap<>();

     private Queue<Tasks> taskQueue = new LinkedList<>();


 public void showTaks() {
        Iterator<Tasks> itr = taskList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }


public void addTask(int id, String name) {
        Tasks t = new Tasks(id, name);
        taskList.add(t);
        taskQueue.offer(t);
        System.out.println("Task added.");
    }


      public void showCategories() {
        System.out.println("Categories:");
        for (String c : categories) {
            System.out.println(c);
        }
    }

 public void addCategory(String category) {
        if (categories.add(category)) {
            System.out.println("Category added.");
        } else {
            System.out.println("Category already exists.");
        }
    }


  public void showTasks() {
        for (Tasks t : taskList) {
            System.out.println(t);
        }
    }

public void assignCategory(int taskId, String category) {
        if (!categories.contains(category)) {
            System.out.println("Category does not exist.");
            return;
        }
        taskCategoryMap.put(taskId, category);
        System.out.println("Category assigned.");
    }


    public void processNextTask() {
        Tasks t = taskQueue.poll(); // FIFO
        if (t == null) {
            System.out.println("No tasks in queue.");
        } else {
            String cat = taskCategoryMap.getOrDefault(t.getId(), "No Category");
            System.out.println("Processing: " + t + " | Category: " + cat);
        }
    }

}

public class Task{
    public static void main(String args[])
{

        TaskManager manager = new TaskManager();
        Scanner sc = new Scanner(System.in);


   while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Add Category");
            System.out.println("4. Assign Category to Task");
            System.out.println("5. Process Next Task");
            System.out.println("6. View Categories");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();


 switch (ch) {
                case 1:
                    System.out.print("Enter task id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter task name: ");
                    String name = sc.nextLine();
                    manager.addTask(id, name);
                    break;

                case 2:
                    manager.showTasks();
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter category: ");
                    manager.addCategory(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Enter task id: ");
                    int tid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter category: ");
                    String cat = sc.nextLine();
                    manager.assignCategory(tid, cat);
                    break;

                case 5:
                    manager.processNextTask();
                    break;

                case 6:
                    manager.showCategories();
                    break;

                case 7:
                    System.out.println("Bye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }

   }

}
}