public class Contact {
    private String contctName;
    private int phoneNumber;

    public Contact(String contctName, int phoneNumber) {
        this.contctName = contctName;
        this.phoneNumber = phoneNumber;
    }

    public String getContctName() {
        return contctName;
    }

    public void setContctName(String contctName) {
        this.contctName = contctName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
