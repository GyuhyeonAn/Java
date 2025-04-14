import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu, size, option;

        System.out.println("메뉴 : 아메리카노 | 카페라떼 | 카푸치노" + "\n" + "크기 : Small | Medium | large" + "\n" + "옵션 : 기본 | 샷 추가 | 시럽 추가 | 샷과 시럽 모두 추가");
        System.out.print("메뉴를 입력해주세요. : ");
        menu = sc.nextLine();
        System.out.print("사이즈를 선택하세요. : ");
        size = sc.nextLine();
        System.out.print("옵션을 선택하세요. : ");
        option = sc.nextLine();

        System.out.println(menu + " " + size + " " + option);
    }
}