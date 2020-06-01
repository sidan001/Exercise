package com.algorithm;


import java.util.Arrays;

/**
 * 转换稀疏数组：
 * 1. 遍历原始数组，得到有效数据的个数sum
 * 2. 创建稀疏数组 sparseArr ==> int[sum+1][3]
 * 3. 将二维数组的有效数据存入稀疏数组
 *
 *  稀疏组织接口
 *  row col val
 *  11  11  2    //原始数组11*11  总共有2个数据
 *  1   2   1    //原始数组 oriArr[1][2] = 1
 *  2   3   2    //原始数组 oriArr[2][3] = 2
 *
 * 还原原始数组
 * 1. 读取稀疏数组第一行 -->  row = sparseArr[0][0], col = sparseArr[0][1], oriArr = int [row][col]
 * 2. 读取稀疏数组剩余数据，填充到原始数组中。如：row=sparseArr[1][0], col=sparseArr[1][1],  oriArr[row][col] = sparseArr[1][3]
 *
 *
 */
public class SparseArr {
    public static void main(String[] args) {

        int[][] chessArr = new int[5][6];

        System.out.println("=============原始数组=============");
        print(chessArr);

        System.out.println("=============填充数据=============");
        chessArr[0][0] = 1;
        chessArr[2][3] = 1;
        chessArr[3][4] = 2;
        print(chessArr);

        System.out.println("=============convert to sparse array=============");
        int[][] sparseArr = convertToSparseArr(chessArr);
        print(sparseArr);

        System.out.println("=============restore oriArr from sparseArr=======");

        int[][] oriArr = restoreOriArr(sparseArr);

        print(oriArr);

    }

    private static int[][] restoreOriArr(int[][] sparseArr) {
        final int totalRow = sparseArr[0][0];
        final int totalCol = sparseArr[0][1];
        final int totalValueNum = sparseArr[0][2];

        int[][] oriArr = new int[totalRow][totalCol];

        if (totalValueNum > 0) {
            for (int i = 1; i <= totalValueNum; i++) {
                final int rowNo = sparseArr[i][0];
                final int colNo = sparseArr[i][1];

                oriArr[rowNo][colNo] = sparseArr[i][2];
            }
        }
        return oriArr;
    }

    private static int[][] convertToSparseArr(int[][] chessArr) {
        int totalNum = getChessArrValueTotalNum(chessArr);

        int[][] sparseArr = new int[totalNum+1][3];
        sparseArr[0][0] = chessArr.length;
        sparseArr[0][1] = chessArr[0].length;
        sparseArr[0][2] = totalNum;

        int rowNum = 1;
        for (int i = 0; i < chessArr.length; i++) {
            for (int j = 0; j < chessArr[i].length; j++) {
                if (chessArr[i][j] != 0) {
                    sparseArr[rowNum][0] = i;
                    sparseArr[rowNum][1] = j;
                    sparseArr[rowNum][2] = chessArr[i][j];
                    rowNum++;
                }
            }
        }
        return sparseArr;
    }

    private static int getChessArrValueTotalNum(int[][] chessArr) {
        int totalNum = 0;
        for (int[] ints : chessArr) {
            for (int anInt : ints) {
                if (anInt != 0 ) {
                    totalNum++;
                }
            }
        }
        return totalNum;
    }

    private static void print(int[][] chessArr) {
        for (int i = 0; i < chessArr.length; i++) {
            final String row = Arrays.toString(chessArr[i]);
            System.out.printf("row: %2d   %s%n", i, row);
        }
    }
}
