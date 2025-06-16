public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("20230001", "홍길동", "재학", "2001-05-10", "010-1234-5678");

        student1.addCourse("Java");
        student1.addCourse("Python");

        System.out.println("학생1의 정보");
        student1.printInfo();

        Professor professor = new Professor("P001", "남교수", "재직","1980-11-01", "010-1234-5678");
        professor.addLecture("Java");
        professor.addLecture("Application Security");

        System.out.println("교수의 정보");
        professor.printInfo();
    }
}

































//import java.util.ArrayList;
//
//public class Main {
//    final static int studentNum = 3;
//    // 0: id | 1: name | 2: status | 3: birthdate | 4: contact
//    static String[][] students = new String[studentNum][5];
//    static ArrayList<String>[] courseLists = new ArrayList[studentNum];
//
//    public static void main(String[] args) {
//
//        for (int i = 0; i < studentNum; i++) {
//            courseLists[i] = new ArrayList<>();
//        }
//
//        setStudent(0, "20230001", "안규현", "재학", "2003-11-14", "010-3096-5544");
//        setStudent(1, "20230002", "홍길동", "졸업", "2003-10-14", "010-3000-5544");
//        setStudent(2, "20230003", "강감찬", "휴학", "2003-09-14", "010-4000-5544");
//
//        addCourse(0,"자료구조");
//        addCourse(0,"운영체제");
//        addCourse(0,"자바");
//
//        addCourse(1,"데이터베이스");
//        addCourse(1,"자바");
//
//        addCourse(2,"네트워크");
//        addCourse(2,"자료구조");
//        addCourse(2,"운영체제");
//        addCourse(2,"자바");
//
//        removeCourse(2,"자료구조");
//
//        printAllStudents();
//    }
//
//    public static int getcourseNumber(int index) {
//        return courseLists[index].size();
//    }
//
//    static void printAllStudents() {
//        for (int i = 0; i < students.length; i++) {
//            printStudentInfo(i);
//            System.out.println();
//        }
//    }
//
//    static void printStudentInfo(int index) {
//        System.out.println("----- 학생" + (index + 1) + "정보 -----");
//        System.out.println(students[index][0]);
//        System.out.println(students[index][1]);
//        System.out.println(students[index][2]);
//        System.out.println(students[index][3]);
//        System.out.println(students[index][4]);
//        System.out.println();
//
//        int corseNum = getcourseNumber(index);
//        System.out.println("     <수강 과목 수: " + corseNum + "개>" );
//        if (courseLists[index].isEmpty()) {
//            System.out.println("없음");
//        } else {
//            for (String course : courseLists[index]) {
//                System.out.print(" ["+course+"] ");
//            }
//            System.out.println();
//        }
//    }
//
//    static public void setStudent(int index, String id, String name, String status, String birthDate,  String contact) {
//        students[index][0] = id;
//        students[index][1] = name;
//        students[index][2] = status;
//        students[index][3] = birthDate;
//        students[index][4] = contact;
//    }
//
//    public static void addCourse(int index, String CourseName) {
//        courseLists[index].add(CourseName);
//    }
//
//    public static void removeCourse(int index, String CourseName) {
//        courseLists[index].remove(CourseName);
//    }
//}