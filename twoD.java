/*public class twoD {
    public static void main(String[] args) {
        int[][] ar = {{2,4,6},
                      {1,3,5}};
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]+" ");
            }
        System.out.println();
        }
    }
}
______________________________________________________________________________*/
public class twoD {
    public static void main(String[] args) {
        int[][] ar = {{10,20},
                      {13,14},
                      {15,16,18}};
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]+" ");
            }
        System.out.println();
        }
    }
}
/*______________________________________________________________________________
public class twoD {
    public static void main(String[] args) {
        int[ ][ ] multiArr = new int[3][];    OR    int[ ][ ] multiArr = new int[][];
        multiArr[0] = new int[] {1, 2};       OR     multiArr[0][0]= 12 ;
        multiArr[1] = new int[] {3, 4, 5};
        multiArr[2] = new int[] {6, 7, 8, 9};
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                System.out.print(multiArr[i][j]+" ");
            }
        System.out.println();
        }
    }
}*/