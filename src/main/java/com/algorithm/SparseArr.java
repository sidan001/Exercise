package com.algorithm;


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

    }
}
