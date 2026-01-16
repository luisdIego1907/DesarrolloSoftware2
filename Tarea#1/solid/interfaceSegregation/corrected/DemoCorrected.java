package solid.interfaceSegregation.corrected;

public class DemoCorrected {

    public static void main(String args[]){

        Employee employee = new Employee();

        Robot robot = new Robot();

        employee.eat();

        employee.work();

        employee.sleep();

        robot.work();
    }
}



