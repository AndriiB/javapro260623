package hw11.phonebook;

import java.util.List;

public class App {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(new Record("Andy", "09876543"));
        phoneBook.add(new Record("Andy", "09876544"));
        phoneBook.add(new Record("Andy", "09876545"));
        phoneBook.add(new Record("Test", "09876541"));
        phoneBook.add(new Record("Testson", "09876543"));

        Record foundRecord = phoneBook.find("Andy");
        if (foundRecord != null) {
            System.out.println("Found record: " + foundRecord.getName() + ": " + foundRecord.getPhoneNumber());
        } else {
            System.out.println("Record not found");
        }

        String lookingForName = "Andy";

        List<Record> allRecords = phoneBook.findAll(lookingForName);
        if (allRecords != null) {
            System.out.println("Found records by name " + lookingForName + ":");
            for (Record record : allRecords) {
                System.out.println("Name: " + record.getName() + ", " + "phone: " + record.getPhoneNumber());
            }
        } else {
            System.out.println("Records by name " + lookingForName + " not found");
        }
    }
}
