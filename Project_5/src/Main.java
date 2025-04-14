import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kor, eng, math, sci, sum, doubleAvg;
        int intAvg;
        boolean boolResult;

        System.out.print("국어점수를 입력하세요: ");
        kor = sc.nextDouble();
        System.out.print("영어점수를 입력하세요: ");
        eng = sc.nextDouble();
        System.out.print("수학점수를 입력하세요: ");
        math = sc.nextDouble();
        System.out.print("과학점수를 입력하세요: ");
        sci = sc.nextDouble();

        sum = kor + eng + math + sci;
        intAvg = (int) sum / 4;
        doubleAvg = sum / 4;
        boolResult = intAvg == doubleAvg;

        System.out.println("총점: "+ sum/4 + " 정수형: " + intAvg + " 실수형: " + doubleAvg + " 평균값 비교: " + boolResult);
    }
}