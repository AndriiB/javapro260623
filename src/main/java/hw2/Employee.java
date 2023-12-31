package hw2;

public class Employee {
private String lastFirstName;
private String position;

private String email;

private int phone;

private int age;

    public Employee(String lastFirstName, String position, String email, int phone, int age) {
        this.lastFirstName = lastFirstName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getLastFirstName() {
        return lastFirstName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public void setLastFirstName(String lastFirstName) {
        this.lastFirstName = lastFirstName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }
}