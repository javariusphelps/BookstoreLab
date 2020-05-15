import java.util.*;

public class MainFile {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        Bookstore bk = new Bookstore("Einstein Books", "1234 Smartway Dr.");
        System.out.println("The bookstore name is " + bk.getName());
        System.out.println("The address is " + bk.getAdress());

    }
}