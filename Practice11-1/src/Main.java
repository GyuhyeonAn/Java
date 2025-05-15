import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        for (;;) {
            System.out.print("1부터 100사이의 값을 입력하세요: ");
            num = sc.nextInt();

            if (num >= 1 && num <= 100) {
                break;
            }
            else { System.out.println("잘못된 값 입력했습니다."); }
        }
        System.out.println("입력완료! 프로그램을 종료합니다. ");
    }
}