
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        String name;
        String studentNumber;
        String searchTerm;
        while (true) {
            System.out.print("name: ");
            name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("studentnumber: ");
            studentNumber = reader.nextLine();

            Student student = new Student(name, studentNumber);
            list.add(student);

        }

        for (Student person : list) {
            System.out.println(person);

        }
        System.out.print("Give search term: ");
        searchTerm = reader.nextLine();
        
        System.out.println("Result: ");
        for (Student searchedStudents : list) {
            if (searchedStudents.getName().contains(searchTerm)) {
                System.out.println(searchedStudents);
            }
            
        }
    }
}
