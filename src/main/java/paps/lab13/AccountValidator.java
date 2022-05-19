package paps.lab13;

// Прокси-объект с ленивой инициализацией реального объекта
public class AccountValidator implements IUser {
    private String id;
    private String first_name;
    private UserRole role;
    private UserAccountStatus status;
    private User user;

    public AccountValidator(String id, String first_name, UserRole role, UserAccountStatus status) {
        this.id = id;
        this.first_name = first_name;
        this.role = role;
        this.status = status;
    }

    @Override
    public void auth(String email, String password) {
        this.user = new User(id, first_name, role, status);

        System.out.println("-------------------");

        switch(status) {
            case ACTIVE:
                user.auth(email, password);
                break;
            case NEW:
                user.auth(email, password);
                System.out.println("!Remember to complete your profile!");
                break;
            case BLOCKED:
                System.out.println(String.format("Sorry %s (#%s), your account has been blocked! Contact with the tech support.", this.first_name, this.id));
                break;
        }

    }
}
