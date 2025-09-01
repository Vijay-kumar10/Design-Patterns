public class MainUser {
    public static void main(String[] args) {
        Employee androidDeveloper = EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.println(androidDeveloper.name());
        System.out.println("Salary: " + androidDeveloper.salary());

        System.out.println("----------------------------");
        Employee webDeveloper = EmployeeFactory.getEmployee(new WebDevFactory());
        System.out.println(webDeveloper.name());
        System.out.println("Salary: " + webDeveloper.salary());
    }
}
