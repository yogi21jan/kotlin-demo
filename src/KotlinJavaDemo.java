import java.util.UUID;

public class KotlinJavaDemo {

    public static void main(String[] args){

        Employee employee = new Employee("Test", UUID.randomUUID(),300,"Employee");
        employee.getEmpNumber();
        System.out.println(employee.toString());

    }
}
