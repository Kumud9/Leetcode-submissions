class Solution {
    public boolean sumGame(String num) {
         int n = num.length();
        int sumLeft = 0;
        int sumRight = 0;
        int qLeft = 0;
        int qRight = 0;
        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?')
                qLeft++;
            else
                sumLeft += num.charAt(i) -'0';
        }

        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?')
                qRight++;
            else
                sumRight += num.charAt(i)-'0';
        }
        int diff = sumLeft - sumRight;
        int qDiff = qLeft - qRight;

        // If the number of ? is odd, Alice always wins.
        if ((qDiff & 1) != 0)
            return true;
        return diff != -(qDiff / 2) * 9;
    }
}