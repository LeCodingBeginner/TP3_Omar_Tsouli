package exercice3;
import java.util.Arrays;
import static exercice1.SortArray.sortDescending;

public class Jagged2DArray {
    public static void displayJagged2DArray(int[] sorted){
        // let's check wether or not the array is fit for this transormation:
        if (sorted.length !=15){
            System.out.println("Invalid array length");
        }

        // let's work on the display:
        int[][] result = new int[5][];
        for (int i = 0; i<5; i++){
            result[i] = new int[i+1];
        }

        int tracker = 0;
        for (int i = 0; i<result.length; i++){
            int numAdditions = i+1;
            // now what would we add:
            for (int j = 0; j<numAdditions;j++){
                result[i][j] = sorted[tracker];
                tracker++;
            }
        }

        for (int i = 0; i< result.length; i++){
            for (int j = 0; j<i+1; j++){
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[] test = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Arrays.sort(test);
        displayJagged2DArray(test);
    }
}
