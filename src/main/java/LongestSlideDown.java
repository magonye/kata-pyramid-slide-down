public class LongestSlideDown {
    public static int longestSlideDown(int[][] test) {

        if (test.length>2){
            test[1][0] = test[1][0] + (test[2][0]>test[2][1]?test[2][0]:test[2][1]);
            test[1][1] = test[1][1] + (test[2][1]>test[2][2]?test[2][1]:test[2][2]);

        }

        test[1][0] = test[1][0] + test[0][0];
        test[1][1] = test[1][1] + test[0][0];

        return test[1][0]>test[1][1]?test[1][0]:test[1][1];
    }
}
