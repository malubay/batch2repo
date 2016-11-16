package classes;

/**
 * Created by JPMPC-B213 on 11/10/2016.
 */
public class Customer extends Person {


    public  long telephoneNo;
    public  int customerId;

    public long getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(long telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
