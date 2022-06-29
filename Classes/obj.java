package Classes;

public class obj {
    int age; // Atrributes
    String name = "hello";
    int cnic;

    public obj() { // constructer
        age = 0;
        System.out.println("hello i am constructer");
    }

    public void get() {
        // functions
        System.out.println("hwllo");
        age = Integer.parseInt(System.console().readLine());
    }

    public void set(int a) {
        this.age = a;
    }

    public void show() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        obj j = new obj(); // object
        j.get();
        j.set(90);
        j.show();

        // System.out.println(j.name);
    }

}
