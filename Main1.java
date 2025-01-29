// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*
Attached: Hw 10A,
====================================================================
Program: 10A
====================================================================
Programmer: Sam Klapper
Class: CMPR_112 Wed 12-3
====================================================================
Desc:Write a class named PhoneBookEntry that has fields for a person’s name
and phone number. The class should have a constructor and appropriate
accessor and mutator methods. Then write a program that creates at
least five PhoneBookEntry objects and stores them in an ArrayList. Use
a loop to display the contents of each object in the ArrayList
====================================================================
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    //testtesttest11213112
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int SIZE = 5;

        ArrayList<PhoneBookEntry> list = new ArrayList<>();

        System.out.println("I am going to ask you to enter " + SIZE + "Names and Phone numbers: ");
        System.out.println();

        for(int i = 0; i < SIZE; i++)
        {
            list.add(getEntry());
            System.out.println();

        }

        System.out.println("Here is the data you entered ");

        for ( int i = 0; i < list.size(); i ++)
        {
            displayEntry(list.get(i));
        }

    }
    //METHODS==-=-=-=--=-=-=-=-

    public static PhoneBookEntry getEntry()
    {
        Scanner in = new Scanner(System.in);
        String name;
        String phoneNumber;

        System.out.println("Enter person's name: ");
        name = in.nextLine();

        System.out.println("Enter the phone number: ");
        phoneNumber = in.nextLine();

        PhoneBookEntry entry = new PhoneBookEntry(name, phoneNumber);

        return entry;

    }

    public static void displayEntry(PhoneBookEntry entry)
    {
        System.out.println("-------------------------------");

        System.out.println("Name: " + entry.getName());
        System.out.println("Phone num: " + entry.getPhoneNumber());
    }

}
/*
====================================================================
OUTPUT

Enter person's name:
Med Magasemi
Enter the phone number:
714-234-6800

Enter person's name:
Moe Bob
Enter the phone number:
949-231-58974

Enter person's name:
Jack Lee
Enter the phone number:
949-023-2085

Enter person's name:
Joe smith
Enter the phone number:
714-234-6843

Enter person's name:
Bob Jack
Enter the phone number:
121-654-0993

-=-=-

Here is the data you entered
-------------------------------
Name: Med Magasemi
Phone num: 714-234-6800
-------------------------------
Name: Moe Bob
Phone num: 949-231-58974
-------------------------------
Name: Jack Lee
Phone num: 949-023-2085
-------------------------------
Name: Joe smith
Phone num: 714-234-6843
-------------------------------
Name: Bob Jack
Phone num: 121-654-0993


 */