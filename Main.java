public class Main {
    public static void main(String[] args) {
        Person person = new Person("ELahe",18);
        person.display();
        person.old();
        person.setName("Mahsa");
        person.setAge(15);
        System.out.println("Name : " + person.getName() + " Age : " + person.getAge());
        person.old();
    }
}
