public class Student {

    private String name;
    private double gpa;
    private double height;

    public Student(String studentName, double studentGpa, double studentHeight){
        name = studentName;
        gpa = studentGpa;
        height = studentHeight;

    }

    public void intro() {
        System.out.println("Student's name: " + name);
    }
    public void stats() {
        System.out.println("Their gpa: " + gpa);
        System.out.println("They are " + height + " feet tall");

    }
}


