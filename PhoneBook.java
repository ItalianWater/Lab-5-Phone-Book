import java.util.*;

public class PhoneBook {
    private LinkedList<Contact> contacts = new LinkedList<>();

    public void addEntry(String name, String address, String city, String phoneNumber) {
        contacts.offer(new Contact(name, address, city, phoneNumber));
    }

    public void sortEntries() {
        contacts.sort(Comparator.comparing(contact -> contact.getName()));
    }

    public LinkedList<Contact> getContacts() {
        return contacts;
    }

    public boolean deleteEntryByName(String name) {
        return contacts.removeIf(contact -> contact.getName().equals(name));
    }

    public boolean editEntryByName(String name, String newName, String newAddress, String newCity, String newPhoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contact.setName(newName);
                contact.setAddress(newAddress);
                contact.setCity(newCity);
                contact.setPhoneNumber(newPhoneNumber);
                return true; // Successfully updated
            }
        }
        return false; // No contact with the given name found
    }
}
