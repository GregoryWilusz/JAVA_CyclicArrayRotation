package com.company;

import java.util.Arrays;

/*  Rotation of the array means that each element is shifted right by one index, and the last element of the array
    is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]
    (elements are shifted right by one index and 6 is moved to the first place).

    The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
*/

public class Main {

    private static int[] rotateArray(int[] A, int K) {
        int lastIndexValue;
        int[] rotatedArray = new int[A.length];

        try {
            if (K <= 0) {
                return A;
            } else {
                for (int i = 0; i < K; i++) {
                    lastIndexValue = A[A.length - 1];
                    System.arraycopy(A, 0, rotatedArray, 1, A.length - 1);
                    rotatedArray[0] = lastIndexValue;
                    A = rotatedArray;
                    System.out.println(Arrays.toString(rotatedArray));
                }
                return rotatedArray;
            }
        } catch (Exception E) {
            System.out.println(E);
        }
        return rotatedArray;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, -1, -2, -3, -4, -5};
        rotateArray(array, 3);
    }
}
