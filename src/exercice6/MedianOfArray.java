package exercice6;

public class MedianOfArray {
    public static int median(int[] a){

        // instanciated the result array:
        int[] sorted = new int[a.length];

        // copying the elements in the new array:
        for (int i = 0; i<a.length; i++) {
            sorted[i] = a[i];
        }

        // sorting the new array:
        for (int i = 0; i<sorted.length-1; i++) {
            int min_ = i;
            for (int j = i + 1; j < sorted.length; j++) {
                // let's find the max:
                if (sorted[min_] >= sorted[j]) {
                    min_ = j;
                }
            }
            // let's swap it:
            int temp = sorted[i];
            sorted[i] = sorted[min_];
            sorted[min_] = temp;
        }

        return sorted[(a.length-1)/2]; // needs rounding

    }

    public static void main(String[] args){
        int[] a = new int[]{5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};

        System.out.println(median(a));
    }

}
