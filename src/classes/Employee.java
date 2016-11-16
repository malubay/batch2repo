package classes;

/**
 * Created by JPMPC-B213 on 11/10/2016.
 */
public class Employee extends Person{

    public String department;
    public int sssId;
    public  int pagibigId;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSssid() {
        return sssId;
    }

    public void setSssid(int sssid) {
        this.sssId = sssid;
    }

    public int getPagibigid() {
        return pagibigId;
    }

    public void setPagibigid(int pagibigid) {
        this.pagibigId = pagibigid;
    }
}
