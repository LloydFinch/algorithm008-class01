package Week_04;

public class UglyNumber {

    public static void main(String[] args) {
        UglyNumber number = new UglyNumber();
        int n = number.nthUglyNumber(10);
        System.out.println(n);
    }

    /**
     * 求丑数，只有因子2、3、5的数字，用动态规划
     * 
     * @param n
     * @return
     */
    public int nthUglyNumber(int n) {
        // 记录下标
        int i2 = 0, i3 = 0, i5 = 0;
        int[] number = new int[n];
        number[0] = 1;
        for (int i = 1; i < number.length; i++) {
            number[i] = Math.min(number[i2] * 2, Math.min(number[i3] * 3, number[i5] * 5));
            if (number[i] == number[i2] * 2) {
                i2++;
            }
            if (number[i] == number[i3] * 3) {
                i3++;
            }
            if (number[i] == number[i5] * 5) {
                i5++;
            }
        }

        return number[n - 1];
    }

    public int nthUglyNumber2(int n) {
        int p2 = 0, p3 = 0, p5 = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(dp[p2] * 2, Math.min(dp[p3] * 3, dp[p5] * 5));
            if (dp[i] == dp[p2] * 2)
                p2++;
            if (dp[i] == dp[p3] * 3)
                p3++;
            if (dp[i] == dp[p5] * 5)
                p5++;
        }
        return dp[n - 1];
    }
}