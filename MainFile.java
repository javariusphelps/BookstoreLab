import java.util.*;

public class MainFile {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        Bookstore bk = new Bookstore("Einstein Books", "1234 Smartway Dr.");
        System.out.println("The bookstore name is " + bk.getName());
        System.out.println("The address is " + bk.getAdress());
        System.out.println("If it is between the hours of 8pm-8am the bookstore is open " + bk.getIsOpen());
        System.out.println("The store size is " + bk.getsqft());
        System.out.println("If you were wondering if we sold used books " + bk.getIsOpen());

    }
}