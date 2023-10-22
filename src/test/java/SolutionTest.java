import org.junit.Test;
import org.junit.Assert;

public class SolutionTest {
    @Test
    public void maximumScoreTest1() {
        int[] nums = {1, 4, 3, 7, 4, 5};
        int k = 3;
        int expected = 15;
        int actual = new Solution().maximumScore(nums, k);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maximumScoreTest2() {
        int[] nums = {5, 5, 4, 5, 4, 1, 1, 1};
        int k = 0;
        int expected = 20;
        int actual = new Solution().maximumScore(nums, k);

        Assert.assertEquals(expected, actual);
    }

}
