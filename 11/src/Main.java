import java.util.Scanner;

public class Main {

    //메소드 2 개를 분리할거야
    //하나는 row / col 입력받아서 행렬만드는거랑
    //또 하나는 사용자 인풋 받아서 어레이에서 찾는거 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String temp;
        System.out.print("행을 입력해주세요: ");
        temp = sc.nextLine();
        int rowMax = Integer.parseInt(temp);
        System.out.print("열을 입력해주세요: ");
        temp = sc.nextLine();
        int colMax = Integer.parseInt(temp);
        System.out.print("빈 열을 입력하세요(없으면 0): ");
        temp = sc.nextLine();
        int emptyLine = Integer.parseInt(temp);
        emptyLine -= 1;

        String[][] seat     = generateSeat(rowMax, colMax, emptyLine);
        String[][] seatCopy = generateSeat(rowMax, colMax, emptyLine);

        while (true) {
            System.out.println();
            System.out.println("----------현재 좌석-----------");
            for (int col = 0; col < colMax; col++) {
                for (int row = 0; row < rowMax; row++) {
                    System.out.print(seat[col][row]);
                }
                System.out.println();
            }//좌석 구성 및 출력 끝
            System.out.println();
            System.out.print("좌석 혹은 이름을 입력하세요(종료하려면 exit 입력): ");
            String input = sc.nextLine().strip();


            if (input.equals("exit")) {
                break;
            }

            int[] ret = findSeat(input, rowMax, colMax, seat);
            int col = ret[0];
            int row = ret[1];
            int type = ret[2];
            if (type == 1) {
                System.out.print("이름을 입력해주세요: ");
                String name = sc.nextLine();
                seat[col][row] = String.format("|%3s|", name);
            } else if (type == 2) {
                seat[col][row] = seatCopy[col][row];
                System.out.println("고생하셨습니다.");
            } else {
                notFindSeat(false);
            }
        }
        System.out.println("프로그램이 종료되었습니다.");
        sc.close();
    }

    static public String[][] generateSeat(int rowMax, int colMax, int emptyLine) {
        String[][] seat = new String[colMax][rowMax];
        int seatNum = 1;
        for (int col = 0; col < colMax; col++) {
            for (int row = 0; row < rowMax; row++) {
                if (row == emptyLine) {
                    seat[col][row] = "    ";
                } else {
                    seat[col][row] = String.format("|%3s |", seatNum++);
                }
            }
        }
        return seat;
    }

    static public int[] findSeat(String input, int rowMax, int colMax, String[][] seat) {
        String findSeatNum = String.format("|%3s |", input);
        String findSeatName = String.format("|%3s|", input);
        for(int col = 0; col < colMax; col++) {
            for(int row = 0; row < rowMax; row++) {
                if(seat[col][row].equals(findSeatNum)) { //일치하는 번호 찾기
                    return new int[] { col, row, 1 };
                }
                else if (seat[col][row].equals(findSeatName)) { //번호가 없을 때 일치하는 이름 찾기
                    return new int[] { col, row, 2 };
                }
            }
        }
        return new int[] { 0, 0, 0 };
    }

    static public void notFindSeat(boolean findSeat) {
        if (!findSeat) {
            System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해주세요.");
            System.out.println();
        }
    }
}

