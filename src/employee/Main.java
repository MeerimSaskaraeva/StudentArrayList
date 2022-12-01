package employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws MyException{
        try {
            ArrayList<Employee> employees = new ArrayList<>();
            employees.add(new Employee("Ulan", 34, "engineer"));
            employees.add(new Employee("Uluk", 23, "technologist"));
            employees.add(new Employee("Anara", 25, "teacher"));
            employees.add(new Employee("Dinara", 29, "accountant"));
            employees.add(new Employee("Fara", 32, "teacher"));


            employees.forEach(System.out::println);

            System.out.println(employees.get(2));


        } catch (MyException | IndexOutOfBoundsException | NullPointerException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();

        } finally {
            System.out.println("Final");
        }

    }
}
