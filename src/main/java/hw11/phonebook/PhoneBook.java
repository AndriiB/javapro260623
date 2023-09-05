package hw11.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private final List<Record> recordList;
    public PhoneBook() {
        recordList = new ArrayList<>();;
    }

    public void add(Record record) {
        recordList.add(record);
    }

    public Record find(String name) {
        for (Record record : recordList) {
            if (record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> foundRecords = new ArrayList<>();
        for (Record record : recordList) {
            if (record.getName().equals(name)) {
                foundRecords.add(record);
            }
        }
        if (foundRecords.isEmpty()) {
            return null;
        } else {
            return foundRecords;
        }
    }
}
