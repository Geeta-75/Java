package Encapsulation;

public class Employee {
    private int emp_id;

    public void setemp_id(int emp) {
        emp_id = emp;
    }

    public int getemp_id() {
        return emp_id;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setemp_id(101);
        System.out.println(e.getemp_id());
    }
}
