import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.print("점수를 입력해주세요: ");
        score = sc.nextInt();

        if (score <= 100 && score >= 0) {
            switch (score/10) {
                case 9, 10:
                    System.out.print("A");
                    break;
                case 8:
                    System.out.print("B");
                    break;
                case 7:
                    System.out.print("C");
                    break;
                case 6:
                    System.out.print("D");
                    break;
                default:
                    System.out.print("F");
                    break;
            }
        }
        else {
            System.out.print("잘못된 값을 입력하셨습니다.");
        }
    }
}