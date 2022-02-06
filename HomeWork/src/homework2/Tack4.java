package homework2;

public class Tack4 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Петро";
        person1.age = 50;
        person1.speak();
        person1.sayHello();
        Person person2 = new Person();
        person2.name = "Женя";
        person2.age = 25;
        person2.speak();

    }
}
class Person{
    String name;
    int age;

    void speak(){
        for (int i = 0; i < 5;i++) {
            System.out.println("Меня зовут " + name + " , мне " + age + " лет");}
        }
        void sayHello(){
            System.out.println(" Привет");
        }
    }
