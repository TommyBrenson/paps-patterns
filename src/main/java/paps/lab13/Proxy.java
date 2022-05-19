package paps.lab13;

public class Proxy {
    public static void main(String [] args) {
        IUser user1 = new AccountValidator("213jjadw21kmkda", "Andrew", UserRole.CUSTOMER, UserAccountStatus.NEW);
        IUser user2 = new AccountValidator("21lmau8v845n2jj", "Bob", UserRole.DIRECTOR, UserAccountStatus.ACTIVE);
        IUser user3 = new AccountValidator("mnv0352j4nmcz34", "Nick", UserRole.CUSTOMER, UserAccountStatus.BLOCKED);

        user1.auth("example1@test.com", "123456789");
        user2.auth("example2@test.com", "123456789");
        user3.auth("example3@test.com", "123456789");
    }
}
