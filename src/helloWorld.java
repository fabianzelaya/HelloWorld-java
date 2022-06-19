// My first Java program

public class helloWorld {
    public static void main(String[] args) {
        //The main method executes the tasks of the class
        System.out.println("Hi, my name is Fabian.");
        // Output "Hi, my name is Fabian." to the counsole

        String myName = "Fabian";
        String myLastName = "Zelaya";
        System.out.println("Hi, my name is " + myName + " " + myLastName);
        // Output "Hi, my name is Fabian Zelaya." to the counsole

        String greeting = "Hello, World";
        System.out.println(greeting);

        String salutations = new String("Hello World");
        System.out.println(salutations);

        String sFZ = "HELLO EVERYONE, how are you?";
        String sFZlower = sFZ.toLowerCase();
        System.out.println(sFZlower);
        
        System.out.println("\"Hello, World\"");
        System.out.println("Hi and\nGoodbye");
    }
}
// FZ

//Double slash create comments.
//Class - Contains everything - has members.
//Methods - Do something.
//arguments - What you pass to a method.
//parameter - Variables to store arguments "data".
//Properties - Store something.
//Access modifiers (public or private) - Who can use?.
//Static - No instance of class is needed.
