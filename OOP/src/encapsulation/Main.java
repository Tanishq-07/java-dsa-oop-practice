package encapsulation;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Dictator");
        person.setAge(73);

        System.out.println("Name : "+person.getName());
        System.out.println("Age : "+person.getAge());
        
    }
}
