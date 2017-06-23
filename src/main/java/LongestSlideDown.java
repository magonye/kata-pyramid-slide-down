public class LongestSlideDown {
    public static int longestSlideDown(int[][] test) {
        for (int i = test.length-1;i>1;i--){
            for (int j = 0; j<i;j++){
                test[i-1][j] = test[i-1][j] + (test[i][j]>test[i][j+1]?test[i][j]:test[i][j+1]);
            }
        }
        test[1][0] = test[1][0] + test[0][0];
        test[1][1] = test[1][1] + test[0][0];

        return test[1][0]>test[1][1]?test[1][0]:test[1][1];
    }
}
