public class Tmp{

    public static void main(String[] args) {

        Person tom = new Person("Tom");
        tom.display();
        Person sam = new Employee("Sam", "Oracle");
        sam.display();
        System.out.println(sam.name);
        sam.f();
//        System.out.println(sam.company);
    }
}
class Person {

    String name;

    public String getName() { return name; }

    public Person(String name){

        this.name=name;
    }

    public void display(){

        System.out.printf("Person %s \n", name);
    }
}

class Employee extends Person{

    String company;

    public Employee(String name, String company) {

        super(name);
        this.company = company;
    }
    @Override
    public void display(){

        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }

    public void f() {
        System.out.println(this.name);
    }
}