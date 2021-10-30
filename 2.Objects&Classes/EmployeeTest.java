
public class EmployeeTest {
  public static void main(String[] args) {
    Employee empOne = new Employee("james smith");
    Employee empTwo = new Employee("Marry Anne");
    empOne.empAge(26);
    empOne.empDesignation("Senior Software Engineer");
    empOne.empSallary(1000);
    empOne.printEmployee();

    empTwo.empAge(26);
    empTwo.empDesignation("Senior Software Engineer");
    empTwo.empSallary(500);
    empTwo.printEmployee();
  }

}
