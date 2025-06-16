import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class test {
    @Test
    public void test1() {
        String[][] seat_ref = new String[] {"| 1 |", "| 2 |", "| 3 |", "| 4 |"};

        String[][] seat = Main.generateSeat(2, 2, 0);

        // 루프 돌면서 seat랑 seatRef랑 똑같은지 비교. Assert.assertEquals(A, B); <- 이런식으로
      ....
    }

    @Test
    public void test2() {
        String[][] seat1 = {
                "| 1 |" ....
        "|김영철|"
    };

        int[] ret = Main.findSeat("1", 3, 4, seat1);
        Assert.assertEquals(ret, new int[]{2, 1, 2});
    }
}