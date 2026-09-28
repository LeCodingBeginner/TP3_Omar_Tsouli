package exercice1;

public class SortArray {
    public static int[] sortDescending(int [] a){
        if (a.length == 0){
            return a;
        }
        // instanciated the result array:
        int[] sorted = new int[a.length];

        // copying the elements in the new array:
        for (int i = 0; i<a.length; i++) {
            sorted[i] = a[i];
        }

        // sorting the new array:
        for (int i = 0; i<sorted.length-1; i++){
            int max_ = i;
            for (int j = i+1; j<sorted.length; j++){
                // let's find the max:
                if (sorted[max_]<= sorted[j]){
                    max_ = j;
                }

            }
            // let's swap it:
            int temp = sorted[i];
            sorted[i] = sorted[max_];
            sorted[max_] = temp;
        }

        return sorted;
    }

    // the print method:
    public static void printArray(int[] a){
        for (int i = 0 ; i<a.length; i++){
            System.out.println("Element " + i + " contents " + a[i]);
        }
    }

    // the main method:
    public static void main(String[] args){
        int[] test1 = {106,26,81,5,15};

        // test display:
        printArray(sortDescending(test1));
    }

}
