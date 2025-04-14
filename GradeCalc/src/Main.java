import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade = "Score";

        System.out.print("학점을 입력해주세요 : ");
        int score = sc.nextInt();

        if (score >= 90) {
            grade = "A";
        }
        else if (score >= 80) {
            grade = "B";
        }
        else if (score >= 70) {
            grade = "C";
        }
        else if (score >= 60) {
            grade = "D";
        }
        else if (score < 60) {
            grade = "F";
        }
        System.out.println("학점 : " +grade);
    }
}
