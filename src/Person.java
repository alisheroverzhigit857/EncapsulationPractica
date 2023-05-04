public class Person {
    private String fullName;
    private int age;
    private String email;
    private int salary;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age in a negative! ");
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println(" Mynday @ symbol jazuu kerek!");
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 500) {
            this.salary = salary;
        } else {
            System.out.println("Mynachalyk zarplata jok!!");
        }
    }
}
