import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //1.Main functions
        task1_1(10);
        /// task2 primary function of main function is executing project, all functions which should work in project will be called here to execute. Reason of being static is : function should not depend on class instance.
        /// task3 in c++ it will be generally public while in java it should be public static, in c++ main function return type should be int(status)
        /// task4 when returning exit code in java we may define these codes as exceptions and from these exceptions we will show errors

        //2.Variables
        swapBoth();
        /// task2: in primitive types, value itself will be stored in stack. in reference types, references will be saved in stack but values will saved in heap memory
        /// task3: scope means border for variables. I mean, variables will be only will be valid in this border.
        /// task4: in dynamic langguages there will be some types that gets all types of variables. F.e: in dart they have dynamic and var keyword that accepts all type, you should not declare spesific type to declare. but in java and c++ it doesnot have

        // 3.Control Flow
        fibonaci();
        /// task2: in do while first operations which are inside of do will be done, after operations inside of while will be executed. in while always operations inside this, will be done first
        /// task3: switch gives us variable which we should do opration in it. F.e if swtich(a) in case scopes there should be functions when a gets this case value. break will break statement, it doesnot check other cases. default will be given for default value of a;
        /// task4:Efficiency : avoids extra computations.
        /// Safety:prevents runtime errors (e.g., null checks, division by zero).
        /// Cleaner code: conditions can be chained logically.

        //4. Functions / Methods
        System.out.println("madam is palindrome? " + (isPalindrome("madam") ? "true" : "false"));
        /// task1 C++
        /// Pass-by-value: Function gets a copy → original unchanged.
        /// Pass-by-pointer: Function gets a memory address → can modify original via pointer.
        /// Pass-by-reference: Function gets an alias of the variable → can directly modify original.
        /// Java
        /// Always pass-by-value.
        /// For primitives: value is copied.
        /// For objects: the reference itself is copied by value → both variables point to the same object, so object’s contents can change, but the reference itself cannot be redirected inside the method

        /// task2 Having multiple functions/methods with the same name but different parameter lists.
        /// Valid differences (C++ & Java):
        /// Number of parameters.
        /// Types of parameters.
        /// Order of parameters (when types differ).
        /// Not valid: Return type alone is not enough to overload.

        /// task3: A function calling itself to solve a problem by breaking it into smaller subproblems.
        /// Base case: The stopping condition that ends recursion.
        /// Importance: Without a base case, recursion would run forever (infinite recursion).

        //5.Comments
        /// task1: i am using comments in all tasks:)))
        /// task2: They improve readability, explain logic, and help teammates maintain/understand code faster.
        /// task3: To automatically generate structured documentation from comments, making APIs easier to use
        /// task4: Clear code reduces need for comments, but comments are still needed for explaining why something is done, complex algorithms, or non-obvious design choices.

        //6.Classes
        /// task1
        BankAccount bankAccount = new BankAccount(3400);
        bankAccount.deposit(340);
        System.out.println("Bank account : " + bankAccount.getBankBalance());

        /// task2  A class is a blueprint or template; an object (instance) is a real entity created from that class.
        /// task3: public :accessible from anywhere.
        /// private : accessible only within the class.
        /// protected : accessible within the class and its subclasses.
        /// task4: A constructor initializes objects when created. A default constructor has no parameters and is provided automatically if no constructor is defined.

        //7.Enums
        /// task1
        Season now = Season.AUTUMN;
        System.out.println(recommendActivity(now));
        /// task2: 2. Enums prevent invalid values, are more readable, and make code easier to maintain compared to raw strings or integers.
        /// task3: Enums enforce valid choices only, reducing bugs (type safety). Their named constants make the code more self-explanatory (self-documenting).
        /// task4:Java enums: can have fields, methods, and constructors → very powerful.
        /// C++11 scoped enums (enum class): strongly typed, but more limited (can’t directly add methods).
        /// Old C-style enums: not type-safe, just integers under the hood, prone to errors.

        // 8.Inheritance
        /// task1
        Car myCar = new Car();
        myCar.startEngine();
        myCar.drive();
        /// task2. Is-a: inheritance. Has-a: composition.
        /// task3. Overriding = redefining parent method. C++ → virtual/override. Java → @Override.
        /// task4. Diamond = multiple inheritance conflict. C++ → virtual inheritance. Java → only interfaces.

        //9. Mixins (in Flutter, Multiple Inheritance in C++) and Interfaces
        /// task1
        Book myBook = new Book("The Hobbit", "J.R.R. Tolkien");
        Printable p = new Printable();
        p.print(myBook);

        //11 Async
        /// task1
        System.out.println("Main thread: Starting calculation...");
        CompletableFuture<Long> sumFuture = CompletableFuture.supplyAsync(Main::calculateSum);
        System.out.println("Main thread: Waiting for result...");
        long result = sumFuture.get();

        //12. Exceptions
        /// task1
        int userAge = -5;
        try {
            System.out.println("Processing age: " + userAge);
            processAge(userAge);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        /// task2. try runs risky code, catch handles errors, finally runs cleanup.
        /// C++ uses RAII: destructors release resources automatically.
        /// task3 Java:
        /// Checked : must be declared/handled.
        /// Unchecked : runtime errors, no need to declare.
        /// C++: no such distinction.
        /// task4.Advantages: cleaner code, separates logic from error handling.
        ///  Disadvantages: overhead, harder to follow if overused.

    }

    static void task1_1(int numbers) {
        for (int i = 0; i < numbers; i++) {
            System.out.println("numbers index ::" + i);
        }
    }

    static void swapBoth() {
        int number1 = 10;
        int number2 = 30;
        System.out.println("Before swap : number1: " + number1 + "\nnumber2" + number2);
        number1 = number2 + number1;
        number2 = number2 - number1;
        number1 = number2 - number1;
        System.out.println("After swap : number1: " + number1 + "\nnumber2" + number2);
    }

    static void fibonaci() {
        int n1 = 0, n2 = 1, nextTerm = 0;
        for (int i = 2; i < 10; i++) {
            nextTerm = n1 + n2;
            n1 = n2;
            n2 = nextTerm;
        }
    }

    static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    static class BankAccount {
        private double bankBalance;

        public BankAccount(double bankBalance) {
            if (bankBalance > 0) {
                this.bankBalance = bankBalance;
            } else {
                bankBalance = 0;
            }
        }

        void deposit(double amount) {
            if (amount > 0) {
                bankBalance += amount;
            }
        }

        double getBankBalance() {
            return bankBalance;
        }
    }

    enum Season {
        SPRING,
        SUMMER,
        AUTUMN,
        WINTER
    }

    static String recommendActivity(Season currentSeason) {
        return switch (currentSeason) {
            case SPRING -> "Plant flowers";
            case SUMMER -> "Go to the beach";
            case AUTUMN -> "Rake leaves";
            case WINTER -> "Build a snowman";
            default -> "Rest";
        };
    }

    static class Vehicle {
        public void startEngine() {
            System.out.println("Engine has started.");
        }
    }

    static class Car extends Vehicle {
        public void drive() {
            System.out.println("The car is moving.");
        }
    }


    interface IStringable {
        String toString();
    }

    static class Printable {
        public void print(IStringable obj) {
            System.out.println(obj.toString());
        }
    }

    static class Book implements IStringable {
        private String title;
        private String author;

        public Book(String t, String a) {
            this.title = t;
            this.author = a;
        }

        @Override
        public String toString() {
            return "'" + title + "' by " + author;
        }
    }
    public static long calculateSum() {
        long sum = 0;
        for (long i = 1; i <= 1_000_000_000L; i++) {
            sum += i;
        }
        return sum;
    }

    static void processAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        System.out.println("Age processed successfully: " + age);
    }
}