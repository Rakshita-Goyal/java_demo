package generics;

public class make<T> {
     private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

}
// T is a type parameter

public class maker<T> {
     private T[] items=(T[])new Object[10];
private int count=0;
    public void add(T item ) {
        items[count++]=item;
    }

    public T get(int index) {
        return items[index];
    }

}
public class Box {
    public static void main(String[] args) {
        make<Integer> intBox = new make<>();
        intBox.set(10);
        System.out.println("Integer Value: " + intBox.get());

        make<String> strBox = new Box<>();
        strBox.set("Hello Generics");
        System.out.println("String Value: " + strBox.get());

        
    }
}
