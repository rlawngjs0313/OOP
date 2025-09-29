import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        String[] S1 = new String[]{"첫", "두", "세"};

        for (int i = 0; i < 3; i++){

            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            Long studentId = input.nextLong();
            String name = input.next();
            String major = input.next();
            Long phoneNumber = input.nextLong();

            Student student = new Student(studentId, name, major, phoneNumber);
            studentList.add(student);
        }

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i<studentList.size(); i++){
            System.out.printf("%s번째 학생: ", S1[i]);
            System.out.printf("%d %s %s %s\n",
                    studentList.get(i).getStudentId(),
                    studentList.get(i).getName(),
                    studentList.get(i).getMajor(),
                    studentList.get(i).getPhoneNumber()
            );
        }
    }
}