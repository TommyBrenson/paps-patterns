package paps.lab8;
import com.sun.jdi.InvalidTypeException;

import java.util.Date;

public class Appeal {
    private String id;
    private String customer_id;
    public String operator_id;
    private Date appeal_date;
    private String description;
    private User user;

    public Appeal(String id, String customer_id, Date appeal_date, String description, User user) {
        this.id = id;
        this.customer_id = customer_id;
        this.appeal_date = appeal_date;
        this.description = description;
        this.user = user;
    }

    public String getCustomerId() { return this.customer_id; }

    public Date getAppealDate() {
        return this.appeal_date;
    }

    public void requestProcessing(String operator_id) {
        this.operator_id = operator_id;
        this.user.requestHelp(operator_id);
    }

    public void checkCustomerId(String customer_id) throws InvalidTypeException {
        if (this.customer_id.equals(customer_id)) System.out.println("Customer ID is correct!");
        else throw new InvalidTypeException("Customer ID is not correct!");
    }

}
