import java.util.Scanner;

public class SeatManager {
    private int rows;
    private int cols;
    private String[][] seats;

    public SeatManager(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        seats = new String[rows][cols];
        // Initialize seats with numbers
        int seatNumber = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = String.valueOf(seatNumber++);
            }
        }
    }

    public boolean isValidSeatNumber(int number) {
        return number >= 1 && number <= rows * cols;
    }

    public void setSeatLabel(int number, String label) {
        if (isValidSeatNumber(number)) {
            int index = number - 1;
            int row = index / cols;
            int col = index % cols;
            // Toggle: if same label exists, revert to original number
            if (seats[row][col].equals(label)) {
                seats[row][col] = String.valueOf(number);
            } else {
                seats[row][col] = label;
            }
        } else {
            System.out.println("Invalid seat number: " + number);
        }
    }

    public void printSeats() {
        System.out.println("Seat Layout:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%-4s", seats[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int c = scanner.nextInt();

        SeatManager manager = new SeatManager(r, c);
        manager.printSeats();

        System.out.print("How many updates? ");
        int updates = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < updates; i++) {
            System.out.print("Enter seat number to label: ");
            int num = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Enter label (e.g., 한글): ");
            String label = scanner.nextLine();
            manager.setSeatLabel(num, label);
            manager.printSeats();
        }

        scanner.close();
    }
}
