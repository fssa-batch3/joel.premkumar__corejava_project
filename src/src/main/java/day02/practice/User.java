package day02.practice;

public class User {
	
    private int id;
    private String name;
    private String password;
    private String emailId;

    public User(int id, String name, String password, String emailId) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.emailId = emailId;
    }

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String newEmailId) {
        this.emailId = newEmailId;
    }
}
