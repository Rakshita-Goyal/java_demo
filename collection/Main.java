package collection;
import java.util.*;

//The Java Collection Framework is a set of classes and interfaces that implement commonly reusable data structures.

public class Main {
    public static void main(String[] args) {
        List <String>list=new ArrayList<>();//Dynamic array (resizable).
list.add("A"); list.add("B"); list.add("A"); // duplicates allowed
        //System.out.println(list);
        
List<Integer>li=new LinkedList<>(List.of(1,2,3));
//System.out.println(l1.size());
li.add(1, 15);            // Add at specific index. shift to right others
//System.out.println(li);
li.set(1,100 );   //replace the element at that index
//System.out.println(li);
li.get(1);  //give element at that index
//System.out.println(li.get(1));
li.remove(1);
//System.out.println(li);
//System.out.println(li.contains(10));
//System.out.println(li.indexOf(10));

//ways of iterations
for (int x : li) System.out.println(x);         // For-each loop
//li.forEach(System.out::println);               // Lambda expression
Iterator<Integer> it = li.iterator();          // Using Iterator
//while (it.hasNext()) System.out.println(it.next());


        //LinkedList
//Doubly linked list (better for frequent insert/delete).

List<Integer>l1 = new LinkedList<>();
l1.addFirst(10);
l1.addFirst(20);
l1.addLast(30);
//System.out.println(l1.getFirst());
//System.out.println(l1.getLast());
l1.remove(0);
//l1.removeFirst();
//l1.removeLast();
//System.out.println(l1);

Stack<Integer> stack = new Stack<>();
stack.push(10);  // works
stack.push(20);

//System.out.println(stack.pop()); // 20
//System.out.println(stack.pop()); // 10

//Set (Unordered, no duplicates)
//HashSet::No order, fast lookup.

Set<String> set = new HashSet<>();
set.add("A"); set.add("B"); set.add("A");
System.out.println(set); // [A, B]
//set.remove("B");         
//System.out.println(set); // [A, B]     // Remove element
//System.out.println(set.contains("A"));            // Check if present → true
//System.out.println(set.isEmpty());                // Check if empty
//System.out.println(set.size());                   // Number of elements
//set.clear();                  // Remove all elements
//System.out.println(set);

// Iteration
for (String s : set) System.out.println(s);
//set.forEach(System.out::println);

Set<String> another = new HashSet<>(List.of("A", "D"));

//working on two sets 
System.out.println(set.addAll(another));         // Union
System.out.println(set.retainAll(another));    // Intersection
   
System.out.println(set.removeAll(another));       // Difference

//LinkedHashSet:Maintains insertion order.
Set<Integer> s = new LinkedHashSet<>();
s.add(3); s.add(1); s.add(2);
//System.out.println(s); // [3, 1, 2]
//same operations as hashset


//TreeSet::Sorted in ascending order.

Set<Integer> ss = new TreeSet<>();
ss.add(5); ss.add(1); ss.add(3);
System.out.println(ss); // [1, 3, 5]
// TreeSet specific operations
// //System.out.println(((TreeSet<Integer>) ss).first());      // Smallest element → 1
// System.out.println(((TreeSet<Integer>) ss).last());       // Largest element → 5
// System.out.println(((TreeSet<Integer>) ss).ceiling(2));   // Smallest >= 2 → 3
// System.out.println(((TreeSet<Integer>) ss).floor(4));     // Largest <= 4 → 3
// System.out.println(((TreeSet<Integer>) ss).headSet(4));   // Elements < 4 → [1,3]
// System.out.println(((TreeSet<Integer>) ss).tailSet(3));   // Elements >= 3 → [3,5]
// ((TreeSet<Integer>) ss).subSet(2,5);  // Elements from 2 (inclusive) to 5 (exclusive) → [3]

//Map (Key-Value pairs, keys unique)
//HashMap::Unordered.


//LinkedHashMap:Maintains insertion order.
Map<Integer, String> map = new HashMap<>();
map.put(1, "A");
map.put(2, "B");
map.put(3, "C");

// Get value by key
System.out.println(map.get(2)); // B

// Remove by key
map.remove(1);
System.out.println(map); // {2=B, 3=C}

// Check if key exists
System.out.println(map.containsKey(2)); // true

// Check if value exists
System.out.println(map.containsValue("C")); // true

// Iterate over keys
for (Integer key : map.keySet()) {
    System.out.println(key);
}

// Iterate over values
for (String value : map.values()) {
    System.out.println(value);
}

// Iterate over entries
for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}

// Size
System.out.println(map.size()); // 2

//linkerlistmap
Map<Integer, String> lmap = new LinkedHashMap<>();
lmap.put(1, "A");
lmap.put(2, "B");
lmap.put(3, "C");

// Iterate same as HashMap
for (Map.Entry<Integer, String> entry : lmap.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}

// Remove or get is same as HashMap
lmap.remove(2);
System.out.println(lmap); // {1=A, 3=C}


//treeMap::Sorted by keys.

Map<Integer, String> tmap = new TreeMap<>();
tmap.put(3, "C");
tmap.put(1, "A");
tmap.put(2, "B");

System.out.println(tmap); // {1=A, 2=B, 3=C}

// Get first and last key
// System.out.println(tmap.firstKey()); // 1
// System.out.println(tmap.lastKey()); // 3

// // Get submap
// System.out.println(tmap.subMap(1, 3)); // {1=A, 2=B}

// // Navigable methods
// System.out.println(((TreeMap<Integer,String>)tmap).ceilingKey(2)); // 2
// System.out.println(((TreeMap<Integer,String>)tmap).floorKey(2)); // 2
// System.out.println(((TreeMap<Integer,String>)tmap).higherKey(2)); // 3


//Queue (FIFO structure)
//PriorityQueue:Elements ordered by priority (natural order by default).



Queue<Integer> pq = new PriorityQueue<>();
pq.add(5); pq.add(1); pq.add(3);

 System.out.println(pq.peek()); // 1

        // Poll (remove + return smallest element)
        System.out.println(pq.poll()); // 1

        // Remaining elements (in heap order, not sorted)
        System.out.println(pq); // [3, 5]

        // Remove specific element
        pq.remove(5);
        System.out.println(pq); // [3]

        // Contains
        System.out.println(pq.contains(3)); // true

        // Size
        System.out.println(pq.size()); // 1

        // Clear
        pq.clear();
        System.out.println(pq.isEmpty()); // true
//Deque (Double-Ended Queue)::Supports insertion/removal from both ends.

Deque<String> dq = new ArrayDeque<>();
dq.addFirst("A");
        dq.addLast("B");
        dq.offerFirst("X"); // same as addFirst but doesn’t throw exception
        dq.offerLast("Y");  // same as addLast
        System.out.println(dq); // [X, A, B, Y]

        // Remove from both ends
        System.out.println(dq.removeFirst()); // X
        System.out.println(dq.removeLast());  // Y

        // Peek at both ends (no removal)
        System.out.println(dq.peekFirst()); // A
        System.out.println(dq.peekLast());  // B

        // Poll from both ends (removes + returns)
        System.out.println(dq.pollFirst()); // A
        System.out.println(dq.pollLast());  // B

        // Add in middle (just normal add = addLast)
        dq.add("M");
        dq.add("N");
        System.out.println(dq); // [M, N]

        // Check size
        System.out.println(dq.size()); // 2

        // Clear
        dq.clear();
        System.out.println(dq.isEmpty()); // true

List<Integer> nums = new ArrayList<>(List.of(3,1,2));
        Collections.sort(nums); // [1,2,3]
        Collections.reverse(nums); // [3,2,1]
        System.out.println(nums);

    


    //iterators::used to traverse collections.

//Iterator
List<String> l = new ArrayList<>(List.of("A", "B", "C"));
Iterator<String> i= l.iterator();
while (i.hasNext()) {
    System.out.println(i.next());
}

//ListIterator (only for List, allows bidirectional traversal)
ListIterator<String> its = list.listIterator();
while (its.hasNext()) System.out.println(it.next());
while (its.hasPrevious()) System.out.println(its.previous());

}
}



// LIST (ordered, duplicates allowed)
// 🔹 Properties of List
// Maintains insertion order
// Allows duplicate elements
// Access using index

// ArrayList
// Dynamic array
// Fast random access
// Slow insertion/deletion in middle

// LinkedList
// Doubly linked list
// Fast insertion/deletion
// Slower access

// Vector
// Same as ArrayList but thread-safe
// Slower

// Stack (LIFO)
// Last In First Out

// 2. SET (no duplicates)
// 🔹 Properties
// No duplicates
// No index
// Mostly unordered

// HashSet
// Unordered
// Fast

// LinkedHashSet
// Maintains insertion order

// TreeSet
// Sorted automatically

// 3. QUEUE (FIFO)
// 🔹 Properties
// First In First Out
// Used in scheduling

// PriorityQueue
// Smallest element first
// Queue<Integer> q = new PriorityQueue<>();

// ArrayDeque (Double-ended queue)
// Deque<String> dq = new ArrayDeque<>();


// MAP (key-value pair)
// 🔹 Properties
// Stores key-value
// Keys are unique
// Values can repeat

// ✅ Types of Map
// HashMap
// Unordered
// Fast

// LinkedHashMap
// Maintains insertion order

// TreeMap
// Sorted by key

// Hashtable
// Thread-safe
// No null key/value
// Hashtable<Integer,String> ht = new Hashtable<>();

// . ITERATORS
// Used to traverse collections.
// ✅ Types of Iterators
// 1️⃣ Iterator
// Forward only

// ListIterator
// Forward + backward
// ListIterator<String> it = list.listIterator();


