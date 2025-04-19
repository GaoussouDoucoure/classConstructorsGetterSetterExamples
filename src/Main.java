
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setString("Atomicccc", "Duke", 10);

        Book b2 = new Book("Java", "Dave", 25); // HERE WE ARE NOT USING GETTER AND SETTER JUST THE CONSTRUCTOR; = "Python";

        b1.show();
        System.out.println("You got the book: " + b1.getTitle());
        System.out.println("The author of book 1 is: " + b1.getAuthor());
        System.out.println("The number of book 1 copies are: " + b1.getCopies());

        b2.show();


        // Create a Person object
        Person person = new Person();

        // Use setters to set field values
        person.setName("Alice");
        person.setAge(25);

        // Use getters to access field values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Try to set an invalid age
        person.setAge(-5); // Output: Age must be positive.

        Greeter worldGreeting = new Greeter();
        System.out.println("" + worldGreeting.getGreeting());

    }
}

class Greeter {

    String getGreeting() {
        return "Hello, World!";
    }

}