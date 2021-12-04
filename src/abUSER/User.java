package abUSER;

public class User {
    public User(String namesurname, String login, int age, String password, boolean isLocked) {
        this.namesurname = namesurname;
        this.login = login;
        this.age = age;
        this.password = password;
        this.isLocked = isLocked;
    }


    @Override
    public String toString() {
        return "User{" +
                "namesurname='" + namesurname + '\'' +
                ", login='" + login + '\'' +
                ", age=" + age +
                ", password=" + password +
                ", isLocked=" + isLocked +
                '}';
    }

    private String namesurname;
    private String login;
    private int age;
    private String password;
    private boolean isLocked;


    public String getNamesurname() {
        return namesurname;
    }

    public void setNamesurname(String namesurname) {
        this.namesurname = namesurname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }
}
