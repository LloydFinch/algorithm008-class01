package Week_02;

public class GuessWord {
    /**
     * @param secret 要猜的字符串
     * @param guess  猜的字符串
     * @return 结果描述
     */
    public String getHint(String secret, String guess) {
        int[] words = new int[10];
        StringBuilder sb = new StringBuilder();
        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < secret.length(); i++) {
            // 位置对，且字符也对
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
                continue;
            }

            // 如果secret里面有，就加1
            words[secret.charAt(i) - '0']++;
            // 如果guess里面有，就减1
            words[guess.charAt(i) - '0']--;
        }

        // 统计words里面大于0的，就是secret里面有而guess里面没有的，也就是位置没猜对，且数字没猜对的
        for (int i = 0; i < words.length; i++) {
            if (words[i] > 0) {
                cows += words[i];
            }
        }
        cows = secret.length() - bulls - cows;

        return sb.append(bulls).append("A").append(cows).append("B").toString();
    }
}