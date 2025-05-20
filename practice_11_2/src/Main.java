import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 행 수 입력 받기
        System.out.print("행 수를 입력하세요: ");
        int rows = scanner.nextInt();
        // 열 수 입력 받기
        System.out.print("열 수를 입력하세요: ");
        int cols = scanner.nextInt();
        // 빈 열 인덱스 입력 받기 (0부터 시작)
        System.out.print("빈 열 인덱스 입력 (0 ~ " + (cols - 1) + "): ");
        int blankCol = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거

        // 좌석 배열 초기화
        String[][] seats = new String[rows][cols];
        int seatNum = 1;
        // 각 좌석에 번호 배정 (빈 열은 공백 처리)
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (c == blankCol) {
                    seats[r][c] = "|빈칸|"; // 빈 칸
                } else {
                    seats[r][c] = String.format("| %d |", seatNum++); // 번호 할당
                }
            }
        }
    }
}