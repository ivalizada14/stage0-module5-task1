package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String[] seasons = {"winter", "spring", "summer", "fall"};
        return seasons;
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int numberArray[] = new int[length];
        for(int i = 0; i<length; i++)
        {
            numberArray[i] = i+1;
        }
        return numberArray;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i<arr.length; i++)
            sum+=arr[i];
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for(int i = 0; i<arr.length; i++)
            if(arr[i] == number)
                return i+1;

        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String reversedArr[] = new String[arr.length];
        for(int i = 0; i<arr.length; i++)
        {
            reversedArr[i] = arr[arr.length-i-1];
        }
        return reversedArr;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int numberOfPositives = 0, index = 0;
        for(int i = 0; i< arr.length; i++)
            if(arr[i]>0)
                numberOfPositives++;
        int positiveArr[] = new int[numberOfPositives];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>0)
                positiveArr[index++] = arr[i];
        }
        return positiveArr;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        for(int i = 0; i<arr.length; i++)
        {
            for(int x = 0; x<arr[i].length; x++)
            {
                for(int y = x+1; y<arr[i].length; y++)
                {
                    if(arr[i][x]>arr[i][y])
                    {
                        int sw = arr[i][x];
                        arr[i][x] = arr[i][y];
                        arr[i][y] = sw;
                    }
                }
            }
            for(int z = 0; z<arr.length; z++)
            {
                if(arr[i].length>arr[z].length)
                {
                    int[] sw = arr[i];
                    arr[i] = arr[z];
                    arr[z] = sw;
                }
            }
        }
        return arr;
    }
}
