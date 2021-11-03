import java.util.Arrays;
import java.util.ArrayList;

import javax.lang.model.type.ArrayType;
import javax.swing.text.html.HTMLDocument.RunElement;

public class BasicJava {

    // Print 1-255 
    // Write a method that prints all the numbers from 1 to 255.
    public void allNumFrom() {
        for (int i = 1; i < 256; i++ ) {
            System.out.println(i);
        }
        
    }
    
    // Print odd numbers between 1-255
    // Write a method that prints all the odd numbers from 1 to 255.
    public void getOddNums() {
        for (int i = 1; i < 256; i = i+2 ) {
            System.out.println(i);
        }
        
    } 

    /* 
    Sigma of 255 AKA Sum to 255
    Write a method that creates and eventually returns a sum variable
    that adds up all the numbers from 1 to 255.
    */
    public int getSumOf() {
        int sum = 0;
        for (int i = 1; i < 256; i++) {
            sum = sum + i;
        }
        return sum;
    } 

    /*
    Iterating through an array
    Given an array X, say [1,3,5,7,9,13], write a method that would iterate 
    through each member of the array and print each value on the screen.
    */
    public void iterateThrough(ArrayList x) {
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < x.size();i++) {
            System.out.println(x.get(i));
        }
    }

    /*
    Find Max
    Write a method (sets of instructions) that takes any array and 
    prints the maximum value in the array. Your method should also work 
    with a given array that has all negative numbers (e.g. [-3, -5, -7]), 
    or even a mix of positive numbers, negative numbers and zero.
    */
    public int getMax(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length;i++) {
            System.out.println("Max: " + max);
            System.out.println("Array index " + i + " value: " + arr[i]);
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    /*
    Array with Odd Numbers
    Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255. 
    When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].
    */
    public int[] getOddArr() {
        int[] y;
        y = new int[128];
        int index = 0;
        for (int i = 1; i < 256; i = i+2) {
            y[index] = i;
            index++;
        }
        for (int i = 0; i < y.length; i ++) {
            System.out.println(y[i]);
        }
        return y;
    }

    /*****Ninja Bonuses (Optional):*****/

    /* 
    Get Average
    Write a method that takes an array, and prints the AVERAGE of the values in the array. 
    For example for an array [2, 10, 3], your method should print an average of 5. 
    Again, make sure you come up with a simple base case and write instructions to solve that base case first, 
    then test your instructions for other complicated cases.
    */
    public int getAverage(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        int average = sum/arr.length;
        
        return average;
    }

    /**
    Greater Than Y
    Write a method that takes an array and returns the number of values in that array whose value is greater 
    than a given value y. For example, if array = [1, 3, 5, 7] and y = 3, after your method is run 
    it will print 2 (since there are two values in the array that are greater than 3).
     */
    public int getGreaterThanY(int[] arr, int y){
            int largerThanY = 0;
            for(int i = 0; i < arr.length;i++){
                if (y < arr[i]){
                    largerThanY++;
                }
            }
            return largerThanY;
    }

    /*
    Square the values
    Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself. 
    When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].
     */
    public int[] getSquareVals(int[] arr){
        for (int i = 0;i < arr.length;i++){
            arr[i] = arr[i]*arr[i];
        }
        for (int i = 0; i < arr.length; i ++) {
            System.out.println(arr[i]);
        }
        return arr;
    }

    /*
    Eliminate Negative Numbers
    Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0. 
    When the method is done, x should have no negative values, say [1, 5, 10, 0].
    */
    public int[] deleteNegatives(int[] arr) {
        for (int i = 0;i<arr.length;i++){
            if (arr[i] < 0){
                arr[i] = 0;
            }
        }
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        return arr;
    }

    /*****Sensei Bonuses (Optional):*****/
    
    /*
    Max, Min, and Average
    Given any array x, say [1, 5, 10, -2], write a method that returns an array with the maximum number in the array, the minimum value in the array, 
    and the average of the values in the array. The returned array should be three elements long and contain: [MAXNUM, MINNUM, AVG]
    */
    public int[] getMaxMinAvg(int[] arr){
        int max = 0;
        int min = 0;
        int sum = 0;
        // Find MAX
        for (int i = 1; i < arr.length;i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        // Find MiN
        for (int i = 1; i < arr.length;i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        // Find Average
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        int average = sum/arr.length;
        
        int[] maxminavg = {max,min, average};
        // Loop through list
        for (int i = 0;i<maxminavg.length;i++){
            System.out.println(maxminavg[i]);
        }
        return maxminavg;
    }

    /*
    Shifting the Values in the Array
    Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number by one to the front. 
    For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. 
    Notice that the last number is 0. The method does not need to wrap around the values shifted out of bounds.
    */
    public int[] shiftingValues(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if ( i == arr.length-1){
                arr[i] = 0;
                break;
            }
            arr[i] = arr[i+1];
        }
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        return arr;
    }


}
