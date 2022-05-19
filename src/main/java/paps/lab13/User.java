package paps.lab13;

public class User implements IUser {
    private String id;
    private String first_name;
    private UserRole role;
    private UserAccountStatus status;

    public String getId() {
        return id;
    }
    public String getFirstName() {
        return first_name;
    }
    public UserRole getRole() {
        return role;
    }
    public UserAccountStatus getStatus() { return status; }

    public User(String id, String first_name, UserRole role, UserAccountStatus status) {
        this.id = id;
        this.first_name = first_name;
        this.role = role;
        this.status = status;
    }

    @Override
    public void auth(String email, String password) {
        System.out.println(String.format("User %s (#%s) has successfully been logged in as %s!", this.first_name, this.id, role.getName().toLowerCase()));
    }
}
