package employee;

public class Employee {
    private String name;
    private int age;
    private String job;

    public Employee(){}

    public Employee(String name, int age, String job) throws MyException{
        notCorrectName(name);
        correctAge(age);
        notCorrectJob(job);
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
    private void notCorrectName(String name) throws MyException{
        if (name.matches("[a-zA-Zа-яА-Я]*")){
            this.name=name;
        }else {
            System.out.println("Name can't be number");
        }

    }
    private void correctAge(int age) {
        if (age <= 0) {
            System.out.println("Age can't be negative number or 0");
        } else {
            this.age = age;
        }
    }
    private void notCorrectJob(String job){
        if (!job.matches("[a-zA-Zа-яА-Я]*")){
            System.out.println("Job  can't be number");
        }else {
            this.job=job;
        }
    }

}
