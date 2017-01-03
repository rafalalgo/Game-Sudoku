package model;

/**
 * Created by rafal_algo on 03.01.17.
 */
public class Solution {
    private int FIRST[][];
    private int SECOND[][];
    private int THIRD[][];

    public Solution() {
        FIRST = new int[6][];
        FIRST[1] = new int[]{0, 3, 1, 4, 5, 2};
        FIRST[2] = new int[]{0, 2, 4, 5, 1, 3};
        FIRST[3] = new int[]{0, 5, 2, 3, 4, 1};
        FIRST[4] = new int[]{0, 4, 3, 1, 2, 5};
        FIRST[5] = new int[]{0, 1, 5, 2, 3, 4};

        SECOND = new int[7][];
        SECOND[1] = new int[]{0, 6, 4, 1, 3, 5, 2};
        SECOND[2] = new int[]{0, 2, 5, 3, 4, 1, 6};
        SECOND[3] = new int[]{0, 1, 6, 4, 2, 3, 5};
        SECOND[4] = new int[]{0, 3, 2, 5, 6, 4, 1};
        SECOND[5] = new int[]{0, 5, 3, 2, 1, 6, 4};
        SECOND[6] = new int[]{0, 4, 1, 6, 5, 2, 3};

        THIRD = new int[8][];
        THIRD[1] = new int[]{0, 2, 6, 1, 4, 3, 7, 5};
        THIRD[2] = new int[]{0, 4, 1, 5, 7, 2, 6, 3};
        THIRD[3] = new int[]{0, 7, 3, 2, 6, 5, 4, 1};
        THIRD[4] = new int[]{0, 5, 4, 6, 3, 1, 2, 7};
        THIRD[5] = new int[]{0, 6, 7, 3, 5, 4, 1, 2};
        THIRD[6] = new int[]{0, 3, 2, 4, 1, 7, 5, 6};
        THIRD[7] = new int[]{0, 1, 5, 7, 2, 6, 3, 4};
    }

    public int get(int tab, int row, int column) {
        if (tab == 1) {
            return FIRST[row][column];
        } else if (tab == 2) {
            return SECOND[row][column];
        } else if (tab == 3) {
            return THIRD[row][column];
        } else {
            return 0;
        }
    }
}
