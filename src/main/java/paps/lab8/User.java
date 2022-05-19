package paps.lab8;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private String id;
    private String password;
    private UserData personal_info;

    public User(String id, String password, String email, String first_name, String last_name, int phone_number, Date birth_date) {
        this.id = id;
        this.password = password;
        this.personal_info = new UserData(email, first_name, last_name, phone_number, birth_date);
    }

    public ArrayList getUserParams() {
        ArrayList<Object> userParams = new ArrayList<Object>();
        userParams.add(this.id);
        userParams.add(this.password);
        userParams.add(this.personal_info.phone_number);
        userParams.add(this.personal_info.birth_date);
        userParams.add(this.personal_info.first_name);
        userParams.add(this.personal_info.last_name);
        userParams.add(this.personal_info.email);
        return userParams;
    }

    public void requestHelp(String operator_id) {
        System.out.println(operator_id);
    }

    public Appeal createAppeal(String id, String description) {
        return new Appeal(id, this.id, new Date(), description, this);
    }



}

class UserData {
    protected String email;
    protected String first_name;
    protected String last_name;
    protected int phone_number;
    protected Date birth_date;

    public UserData(String email, String first_name, String last_name, int phone_number, Date birth_date) {
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.birth_date = birth_date;
    }
}