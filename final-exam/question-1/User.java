package finalexam.question1;

public abstract class User {

    protected String name;

    public User(String name) {
        this.name = name;
    }

    public abstract void doLogin();
}
