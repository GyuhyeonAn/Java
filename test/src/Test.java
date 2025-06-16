import org.junit.Assert;
import org.junit.test;

public class Test {
    @Test
    public void test1() {
        String[][] seat_ref = {
                "| 1 |", "| 2 |", "| 3 |", "| 4 |" ;
      };
        String[][] seat = Main.generateSeat(2, 2, 0);


      ....
    }

    @Test
    public void test2() {
        String[][] seat1 = {
                "| 1 |", "| 2 |", "| 3 |", "| 4 |" ;
    };

        int[] ret = Main.findSeat("1", 3, 4, seat1);
        Assert.assertEquals(ret, new int[] {2, 1, 2});
