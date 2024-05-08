import java.util.*;
public class TestClass {
    public static void main(String[] args) {
        boolean menuBool = false;
        int switchInt;
        PhoneBook phoneBook = new PhoneBook();
        Scanner word = new Scanner(System.in);
        String name;
        String newName;
        String address;
        String city;
        String phoneNumber;

        do {
            System.out.println("Add Entry = 1, Remove Entry = 2, Edit Entry = 3, Print Phonebook = 4, Exit = 5: ");
            switchInt = word.nextInt();
            word.nextLine();
            switch (switchInt) {
                case 1:
                    System.out.println("Enter new entry in the following format, hitting enter between each entry.\n Name\n Address\n City\n Phone Number: ");
                    name = word.nextLine();
                    address = word.nextLine();
                    city = word.nextLine();
                    phoneNumber = word.nextLine();

                    phoneBook.addEntry(name, address, city, phoneNumber);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter entry you'd like to deletes name (Case sensitive): ");
                    name = word.nextLine();
                    boolean wasDeleted = phoneBook.deleteEntryByName(name);

                    if (wasDeleted) {
                        System.out.println("Contact deleted successfully.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter entry you want to edit in the following format, hitting enter between each entry.\n Name\n New Name\n Address\n City\n Phone Number");
                    name = word.nextLine();
                    newName = word.nextLine();
                    address = word.nextLine();
                    city = word.nextLine();
                    phoneNumber = word.nextLine();
                    phoneBook.editEntryByName(name, newName, address, city, phoneNumber);
                    System.out.println();
                    break;
                case 4:
                    phoneBook.sortEntries();
                    for (Contact contact : phoneBook.getContacts()) {
                        System.out.println(contact);
                    }
                    System.out.println();
                    break;
                case 5:
                    menuBool = true;
                    break;
            }
        } while (!menuBool);
    }
}
