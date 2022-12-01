import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String group;

    public Student(){}
    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                '}';
    }
    public void getAllStudents(List<Student>students){
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public void filterByGroup(List<Student>students){
        ArrayList<Student>java=new ArrayList<>();
        ArrayList<Student>js=new ArrayList<>();
        for (Student student : students) {
            if (student.getGroup().equals("Java")){
                java.add(student);
            }else {
                js.add(student);
            }
        }
        java.forEach(System.out::println);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        js.forEach(System.out::println);
    }
    public void sortAgeFromTo(List<Student>students){
        ArrayList<Student>age1=new ArrayList<>();
        for (Student student : students) {
            if (student.getAge()>=19 && student.getAge()<=25){
                age1.add(student);
            }
        } age1.forEach(System.out::println);


    }public void findNameA(List<Student>students){
        ArrayList<Student>nameA=new ArrayList<>();
        for (Student student : students) {
            if (student.getName().contains("A")){
                nameA.add(student);
            }
        }nameA.forEach(System.out::println);
    }
}
