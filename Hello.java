import java.util.Scanner;

public class Hello {
    private String name;
    public void setName() {
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Hi! Please enter your name: ");
        String name = myScanner.nextLine();
        this.name = name;
    }

    public void printName () {
        System.out.println("Hi " + this.name + "! Nice to meet you :)");
    }

    public static void main (String[] args) {
        Hello person = new Hello();
        person.setName();
        person.printName();
    }
}
