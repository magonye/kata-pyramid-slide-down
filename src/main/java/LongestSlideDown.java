public class LongestSlideDown {
    public static int longestSlideDown(int[][] pyramid) {
        calculateBiggerPathFromBottomToUp(pyramid);


        return getBiggerElement(pyramid,1,0);
    }

    private static void calculateBiggerPathFromBottomToUp(int[][] pyramid) {
        for (int i = pyramid.length-1;i>1;i--){
            calculateBiggerPath(pyramid, i);
        }
        pyramid[1][0] = pyramid[1][0] + pyramid[0][0];
        pyramid[1][1] = pyramid[1][1] + pyramid[0][0];
    }

    private static void calculateBiggerPath(int[][] pyramid, int i) {
        for (int j = 0; j<i;j++){
            pyramid[i-1][j] = getBiggerStepPath(pyramid, i, j);
        }
    }

    private static int getBiggerStepPath(int[][] pyramid, int i, int j) {
        return pyramid[i-1][j] + getBiggerElement(pyramid,i,j);
    }

    private static int getBiggerElement(int[][] ints, int x, int y) {
        return ints[x][y]> ints[x][y+1]? ints[x][y]: ints[x][y+1];
    }
}
