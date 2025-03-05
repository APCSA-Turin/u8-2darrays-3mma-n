package U8T2;

public class FunWith2DArrays {

    public static double average(int[][] list) {
        int count = list.length * list[0].length;
        int sum = 0;
        for (int[] row : list) {
            for (int item : row) {
                sum += item;
            }
        }
        return (double) sum / count;
    }

    public static int edgeSum(int[][] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                if (i == 0 || i == list.length - 1 || j == 0 || j == list[0].length - 1) {
                    sum += list[i][j];
                }
            }
        }
        return sum;
    }

    public static int[] indexFound(String[][] list, String target) {
        int[] found = {-1, -1};
        for (int i = 0; i < list[0].length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[j][i].equals(target)) {
                    found[0] = j;
                    found[1] = i;
                    return found;
                }
            }
        }
        return found;
    }

    public static int[][] split(int[][] list, int row, int col) {
        if (row >= list.length || col >= list[0].length) {
            return new int[0][0];
        }
        int[][] splitList = new int[row + 1][col + 1];
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                splitList[i][j] = list[i][j];
            }
        }
        return splitList;
    }

    public static int[][] invert(int[][] list) {
        int[][] inverted = new int[list[0].length][list.length];
        for (int i = 0; i < list[0].length; i++) {
            for (int j = 0; j < list.length; j++) {
                inverted[i][j] = list[j][i];
            }
        }
        return inverted;
    }

}
