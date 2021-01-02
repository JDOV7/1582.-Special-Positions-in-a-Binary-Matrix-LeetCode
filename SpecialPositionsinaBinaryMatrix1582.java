/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Daniel Ochoa
 */
public class SpecialPositionsinaBinaryMatrix1582 {

    public void SpecialPositionsinaBinaryMatrix1582() {
        int[][] mat
                = {{1, 0, 3},
                {0, 0, 1},
                {1, 0, 6}};
        int iCounter = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1 && checkSpecial(mat, i, j)) {
                    iCounter++;
                }
            }
        }
        System.out.println(iCounter);
    }

    public boolean checkSpecial(int iArr[][], int i, int j) {
        int iCounter = 0;
        for (int k = 0; k < iArr[i].length; k++) {
            if (iArr[i][k] == 1) {
                iCounter++;
            }
            if (iCounter > 1) {
                return false;
            }
        }

        for (int k = 0; k < iArr.length; k++) {
            if (iArr[k][j] == 1) {
                iCounter++;
            }
            if (iCounter > 2) {
                return false;
            }
        }
        return true;
    }
}
