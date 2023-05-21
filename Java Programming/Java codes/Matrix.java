import java.util.*;

public class Matrix {
   public static void darray(){
    int matrix[][] = new int[3][3]; 
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<3 ; i++){
        for (int j = 0; j< 3; j++) {
            matrix[i][j] = sc.nextInt();
        }
    }

    for(int i=0; i<3 ; i++){
        for (int j = 0; j < 3; j++) {
            System.out.print(matrix[i][j]);
        }
        System.out.println();
    }
   }
 

   public static void spiralmatrix(int matrix[][]){
    int startrow =0,endrow=matrix.length-1,startcol =0,endcol =matrix[0].length-1;
    while (startrow<=endrow && startcol<=endcol) {
        // top
        for (int i = startcol; i <= endcol; i++) {
            System.out.print(matrix[startrow][i]+ " ");
        }
        //right
        for (int i = startrow+1; i <= endrow; i++) {
            System.out.print(matrix[i][endcol] + " ");
        }

        //bottom
        for (int i = endcol-1; i >=startcol ; i--) {
            if(startrow==endrow){
               break;
            }
            System.out.print(matrix[endrow][i]+ " ");
        }

        //left
        for (int i = endrow-1; i > startrow+1; i--) {
            if(startcol==endcol){
                break;
            }
            System.out.print(matrix[i][startcol] + " ");
        }

        startrow++;
        endrow--;
        startcol++;
        endcol--;
    } 
   }

   public static int disgonalsum(int matrix[][]){
        int sum =0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(i==j){
                    sum += matrix[i][j];
                } else if(i+j == matrix.length-1){
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
   }

   public static int diafoanlsumtwo(int matrix[][]){
    int sum=0;
    for (int i = 0; i < matrix.length; i++) {
        sum += matrix[i][i];
        
        if(i != matrix.length - 1 -i)
        sum += matrix[i][matrix.length-1-i];
    }

    return sum;
   }

    public static void main(String[] args) {

    int[][] matrix = {
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}

   };

 System.out.println(diafoanlsumtwo(matrix));

}
}
