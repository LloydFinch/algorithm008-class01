package Week_02;

class AddDigits {
    public int addDigits(int num) {
        int result = 0;
        int temp = num;

        // 将各位数字加起来
        while (temp != 0) {
            result += (temp % 10);
            temp /= 10;
        }

        // 检测各位数字长度
        while (result > 9) {
            result = addDigits(result);
        }

        return result;
    }
}