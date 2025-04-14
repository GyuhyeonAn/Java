import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int coin;

        System.out.println("동전을 넣어주세요 : ");
        coin = sc.nextInt();

        if (coin == 500) {
            System.out.println("레버를 돌리면 운세가 나옵니다.");
        }
        else {
            System.out.println("500원 동전만 사용 가능합니다.");
        }
    }
}