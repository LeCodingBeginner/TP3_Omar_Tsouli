package exercice4;

public class MtxManipulation {
    public static void copyCols(int[][] mtx){
        // let's display the matrix before:
        System.out.println("Before: ");
        for(int[] e : mtx){
            for (int i : e){
                System.out.print(i +" ");
            }
            System.out.println();
        }

        for (int i = 0; i<mtx.length; i++){
            mtx[i][4] = mtx[i][1];
        }

        // let's display:
        System.out.println("After: ");
        for(int[] e : mtx){
            for (int i : e){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] m = new int[6][8];

        // initializing m:
        m[0] = new int[]{1,2,3,4,5,6,7,8};
        m[1] = new int[]{0,3,4,5,7,8,8,0};
        m[2] = new int[]{1,0,2,4,2,6,7,8};
        m[3] = new int[]{1,0,3,4,5,6,7,8};
        m[4] = new int[]{1,0,3,4,5,6,7,8};
        m[5] = new int[]{1,0,3,4,5,6,7,8};


        copyCols(m);

    }
}
