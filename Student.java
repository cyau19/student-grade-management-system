import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getAverage() {
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return grades.size() == 0 ? 0 : (double) sum / grades.size();
    }
}