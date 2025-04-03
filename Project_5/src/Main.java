import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kor, eng, math, sci, sum, doubleAvg;
        int intAvg;
        boolean boolResult;

        kor = sc.nextDouble();
        eng = sc.nextDouble();
        math = sc.nextDouble();
        sci = sc.nextDouble();

        sum = kor + eng + math + sci;
        intAvg = sum / 4;
        doubleAvg = sum / 4;
        boolResult = intAvg == doubleAvg;

        System.out.println(sum + "" + intAvg + "" + doubleAvg + "" + boolResult);
    }
}