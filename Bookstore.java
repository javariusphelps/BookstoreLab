import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.io.File;

public class Bookstore {
    Scanner userInput = new Scanner(System.in);

    String name;
    String address;
    int sqFt;
    boolean usedBooks;
    boolean isOpen;
    boolean openWeekdays;
    boolean openSunday;
    String openingTime;
    String closingTime;

    public Bookstore() {
        name = "Phelps Bookstore ";
        address = "2300 Circleberry Drive";
        sqFt = 1050;
        usedBooks = false;
        isOpen = true;
        openWeekdays = true;
        openSunday = true;
        openingTime = "8:00am";
        closingTime = "8:00pm";

    }

    public Bookstore(String name, String address) {

        this.name = name;
        this.address = address;
    }

    public String getName() {

        return name;

    }

    public String getAdress() {

        return address;

    }

    public Integer getsqft() {

        return sqFt;
    }

    public boolean getUsedBooks() {

        return usedBooks;

    }

    public boolean getIsOpen() {

        return isOpen;

    }

    public boolean getOpenWeekdays() {

        return openWeekdays;

    }

    public boolean getOpenSunday() {

        return openSunday;

    }

    public String getOpeningTime() {

        return openingTime;

    }

    public String getClosingTime() {

        return closingTime;

    }

}