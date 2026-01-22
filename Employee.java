import java.util.*;

public class Employee {
    protected String name;
    protected double salary;
    protected Date birthdate;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }
    /*
     * public String toString(){
     * return "ชื่อพนักงาน:" + this.name + ", "
     * + "เงินเดือนพนักงาน:" + this.salary + "," + "วันเกิด:"
     * + this.birthdate;
     * }
     */

    public String toString() {
        return "ชื่อพนักงาน:" + this.getName();

    }
}