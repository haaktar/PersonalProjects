public class EmployeeObject {


    public static void main(String[] args) {

        CapitalOneEmployees capitalOneEmployees = new CapitalOneEmployees("Hakan", 38, "Director Of Finance");

        capitalOneEmployees.setID(1234);
        capitalOneEmployees.setSalary(120_000);
        capitalOneEmployees.setAddress("5846 Sheridan Dr.");

        System.out.println(capitalOneEmployees.employeeName);
        System.out.println(capitalOneEmployees.age);

        System.out.println(capitalOneEmployees);


    }

}
