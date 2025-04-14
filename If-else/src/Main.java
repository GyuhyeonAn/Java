import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu, size, option, total = 0;

        System.out.print("메뉴를 입력해주세요. 아메리카노-1 카페라떼-2 카푸치노-3 : ");
        menu = sc.nextInt();
        System.out.print("사이즈를 선택하세요. 1-Small 2-Medium, 3-Large : ");
        size = sc.nextInt();
        System.out.print("옵션을 선택하세요 1-기본 2-샷추가 3-시럽추가 4-샷+시럽추가 : ");
        option = sc.nextInt();

        if (menu == 1) {
            total += 3000;
        }
        else if (menu == 2) {
            total += 4000;
        }
        else {
            total += 4500;
        }

        if (size == 2) {
            total += 500;
        }
        else if (size == 3) {
            total += 1000;
        }

        if (option == 2) {
            total += 500;
        }
        else if (option == 3) {
            total += 300;
        }
        else if (option == 4) {
            total += 800;
        }

        System.out.println("최종 가격은 " +total +"입니다.");
    }
}