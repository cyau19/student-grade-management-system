import java.util.*;

public class GradeManager {

    static HashMap<String, Student> students = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\n1 Add Student");
            System.out.println("2 Add Grade");
            System.out.println("3 Show Average");
            System.out.println("4 Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if(choice == 1){
                System.out.print("Student name: ");
                String name = scanner.nextLine();
                students.put(name, new Student(name));
                System.out.println("Student added.");
            }

            if(choice == 2){
                System.out.print("Student name: ");
                String name = scanner.nextLine();

                if(students.containsKey(name)){
                    System.out.print("Grade: ");
                    int grade = scanner.nextInt();
                    scanner.nextLine();
                    students.get(name).addGrade(grade);
                } else {
                    System.out.println("Student could not be found.");
                }
            }

            if(choice == 3){
                System.out.print("Student name: ");
                String name = scanner.nextLine();

                if(students.containsKey(name)){
                    System.out.println("Average: " +
                        students.get(name).getAverage());
                } else {
                    System.out.println("Student could not be found.");
                }
            }

            if(choice == 4){
                break;
            }
        }
    }
}