import java.util.ArrayList;

public class BasicJavaTest {
    public static void main(String[] args) {
        
        BasicJava twofiftyfive = new BasicJava();

        // Print 1-255
        // twofiftyfive.allNumFrom();

        // Print odd numbers between 1-255
        // twofiftyfive.getOddNums();

        // Sigma of 255 AKA Sum to 255
        // int getNum = ;
        // System.out.println(twofiftyfive.getSumOf());

        // Iterating through an array
        ArrayList<Integer> mylist = new ArrayList<Integer>(); 
        mylist.add(2);
        mylist.add(4);
        mylist.add(12);
        mylist.add(56);
        mylist.add(93);
        mylist.add(345);
        mylist.add(27);
        // twofiftyfive.iterateThrough(mylist);
        
        // Find Max
        int[] sets;
        sets = new int[10];
        sets[0] = 23; 
        sets[1] = 54;
        sets[2] = 5;
        sets[3] = 87;
        sets[4] = 8;
        sets[5] = 9;
        sets[6] = 15;
        sets[7] = 45;
        sets[8] = 33;
        sets[9] = 72;
        // System.out.println(twofiftyfive.getMax(sets));

        int[] negatives = {10,-43, -1, 0, 5, -3, -20, 1, 20};
        // System.out.println(twofiftyfive.getMax(negatives));

        // Array with Odd Numbers
        // System.out.println(twofiftyfive.getOddArr());

        // Get Average
        // System.out.println(twofiftyfive.getAverage(sets));
        // System.out.println(twofiftyfive.getAverage(negatives)); 
        
        // Greater Than Y
        // System.out.println(twofiftyfive.getGreaterThanY(sets,10));

        // Square the Values
        int[] sqrVals = {1, 5, 10, -2};
        // System.out.println(twofiftyfive.getSquareVals(sqrVals));

        // Eliminate Negative Numbers
        // System.out.println(twofiftyfive.deleteNegatives(negatives));
        // System.out.println(twofiftyfive.deleteNegatives(sqrVals));

        // Max, Min, and Average
        // System.out.println(twofiftyfive.getMaxMinAvg(sets));

        // Shifting the values int he arrays
        int[] anotherSet = {1, 5, 10, 7, -2};
        System.out.print(twofiftyfive.shiftingValues(anotherSet));
        System.out.print(twofiftyfive.shiftingValues(negatives));
        System.out.print(twofiftyfive.shiftingValues(sets));











    }
}
