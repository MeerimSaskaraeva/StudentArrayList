import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> student=new ArrayList<>();
        student.add(new Student("Anar",23,"Java"));
        student.add(new Student("Asil",33,"JS"));
        student.add(new Student("Uluk",22,"Java"));
        student.add(new Student("Rasul",34,"Java"));
        student.add(new Student("Kuban",23,"Java"));
        student.add(new Student("Cninara",26,"JS"));
        student.add(new Student("jika",23,"Java"));
        student.add(new Student("Lira",25,"JS"));
        student.add(new Student("Bolot",28,"Java"));
        student.add(new Student("Sagin",19,"Java"));

        Student student1=new Student();
        //student1.getAllStudents(student);
        //student1.filterByGroup(student);
        //student1.sortAgeFromTo(student);
        student1.findNameA(student);




    }
}