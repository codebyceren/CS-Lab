package Lab1.Lab1Codes;
import java.util.ArrayList;

class Student {
    
    private String name;
    private final int id;
    private double quizzes;
    private double midterm;
    private double finalExam;

    public Student(String name, int id, double quizzes, double midterm, double finalExam) {

        this.name = name;
        this.id = id;
        this.quizzes = quizzes;
        this.midterm = midterm;
        this.finalExam = finalExam;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    
    public double getAverage() {
        return (quizzes * 0.20 + midterm * 0.30 + finalExam * 0.50);
    }


    @Override 
    public String toString() {
        return id + " - " + name + " - Average: " + 
        String.format("%.2f", getAverage());
    }


}

class Task1 {

    public static void main(String[] args) {
    
        ArrayList<Student> students = new ArrayList<>();

        students.add(
            new Student(
                "John Doe", 12345, 85.0, 90.0, 88.0));
        students.add(
            new Student(
                "Jane Smith", 67890, 92.0, 87.0, 91.0));
        students.add(
            new Student(
                "Alice Johnson", 54321, 78.0, 82.0, 80.0));
        students.add(
            new Student("Bob Brown", 98765, 95.0, 89.0, 93.0));
        students.add(
            new Student(
                "Charlie Davis", 24680, 88.0, 85.0, 90.0));

        double totalAverage = 0;
        for(Student student : students) {
            totalAverage += student.getAverage();
            
        }
        System.out.println("Average of all students: " + (totalAverage / students.size()));

        students.sort((s1, s2) -> Double.compare(s2.getAverage(), s1.getAverage()));

        students.removeIf(s -> s.getAverage() < 60.0);
        System.out.println("Students who passed: ");
        for(Student student : students) {
            System.out.println(student);
        }

    }
    

}

        

