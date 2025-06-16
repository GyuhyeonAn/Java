import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 0:id | 1:name | 2:status | 3:birthdate | 4:contact
        String[] student = new String[5];

        ArrayList<String> enrolledCourses = new ArrayList<>();
        student[0] = "20230001";
        student[1] = "안규현";
        student[2] = "재학";
        student[3] = "2003-11-14";
        student[4] = "010-3096-5544";

        enrolledCourses.add("자료구조");
        enrolledCourses.add("운영체제");
        enrolledCourses.add("네트워크");
        enrolledCourses.add("자바");


        enrolledCourses.remove("운영체제");

        System.out.println(student[0]);
        System.out.println(student[1]);
        System.out.println(student[2]);
        System.out.println(student[3]);
        System.out.println(student[4]);

        System.out.println("수강 교과목 목록");

        if(enrolledCourses.isEmpty()) {
            System.out.println("없음");
        }
        else {
            for(int i = 0; i < enrolledCourses.size(); i++) {
                System.out.println(enrolledCourses.get(i));
            }
        }
    }
}