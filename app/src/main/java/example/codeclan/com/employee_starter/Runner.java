package example.codeclan.com.employee_starter;

/**
 * Created by user on 22/02/2017.
 */

public class Runner {
    public static void main(String[] args){
        Employee.deleteAll();
        Department.deleteAll();
        Department department1 = new Department("HR");
        Department department2 = new Department("Marketing");
        Department department3 = new Department("Sales");
        Department department4 = new Department("Finance");
        Department department5 = new Department("Admin");

        department1.save();
        department2.save();
        department3.save();
        department4.save();
        department5.save();

        Employee employee1 = new Employee("Suzie Smith", department1, 45000);
        Employee employee2 = new Employee("Jamie Jones", department2, 25000);
        Employee employee3 = new Employee("Anthony Jackson", department3, 70000);
        Employee employee4 = new Employee("Lucy Findlay", department3, 50000);
        Employee employee5 = new Employee("Angus MacDonald", department4, 62000);
        Employee employee6 = new Employee("Scarlet Hara", department4, 90000);
        Employee employee7 = new Employee("Keith Richards", department4, 40000);
        Employee employee8 = new Employee("Mark Spencer", department4, 55000);

        employee1.save();
        employee2.save();
        employee3.save();
        employee4.save();
        employee5.save();
        employee6.save();
        employee7.save();
        employee8.save();
//        employee8.delete();
//        Employee.all();
//        department1.delete();
//        Department.all();
//        Employee.findByName("Lucy Findlay");
//        Department.findByName("Finance");
        employee8.department();

    }
}
