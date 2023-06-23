public class backtracking {

    public static void changearray(int arr[] , int i , int val){
        //basecase
        if (i == arr.length) {
          printarray(arr);
          return;
        }

        //kaam  recursion

        arr[i] = val;
        changearray(arr, i+1, val+1); // recussion
        arr[i] = val -2; // backtracking
    }

    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void findsubset(String str , String ans , int i ) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
       
        findsubset(str, ans+str.charAt(i), i+1);
        findsubset(str, ans, i+1);
    }

    public static void permutation(String str , String ans ) {
        if(str.length()== 0){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            String newstr = str.substring(0, i) + str.substring(i+1);
            permutation(newstr, ans+c);
        }
    }

    public static Boolean issafe(char board[][] , int row , int col ) {
        // vertically up
        for (int i = row-1; i >=0 ; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diag left up 
        for (int i = row-1 , j=col-1; i>=0 && j>=0; i-- , j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row-1 , j = col+1; i >=0 && j<board.length; i-- , j++) {
            if (board[i][j]== 'Q') {
                return false;
            }

         
        }
        return true;   
    }

    public static boolean nqueens(char board[][] , int row){
       // int count =0;
        if(row== board.length){
           // printboard(board);
           county++;
            return true;
        }



        for (int j = 0; j < board.length; j++) {
            if (issafe(board , row , j)) {
                board[row][j] = 'Q';
                if(nqueens(board, row+1)){
                    return true;
                }
                board[row][j] = '.';
            }
           
        }

        return false;

     //System.out.println(count);   
    }

    public static void printboard(char board[][]){
        System.out.println("------------nqueen-----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }

    static int county = 0;

    public static int gridways(int i, int j , int m , int n) {
        if (i==n-1 && j==m-1) {
            return 1;
        }else if(i==n || j==m){
            return 0;
        }

        int w1 = gridways(i, j+1, m, n);
        int w2 = gridways(i+1, j, m, n);

        return w1 + w2;
    }

    public static boolean issafey(int sudoku[][] , int row , int col , int digit) {
       // row
       for (int i = 0; i < sudoku.length; i++) {
        if (sudoku[i][col] == digit) {
            return false;
        }
    }

        // col
        for (int j = 0; j < sudoku.length; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
    }
    // 1 grid

    int sr = (row/3) * 3;
    int sc = (col/3) * 3;

    for (int  i = 0;  i< sr+3; i++) {
        for(int j= 0 ; j<sc+3 ; j++){

            if (sudoku[sr][sc] == digit) {
                return false;
            }
        }
    }
       

    return true;
       

       
    }

    public static boolean sudokusolver(int sudoku[][] , int row , int col) {
        //base case
        if (row==9 && col == 0) {
            return true;
        } 

        //work
        int nextrow = row, nextcol = col+1;
        if(col+1 == 9){
            nextrow = row+1;
            nextcol =0;
        }

        if (sudoku[row][col] != 0) {
            return sudokusolver(sudoku, nextrow, nextcol);
        }

        for (int digit = 1; digit <=9 ; digit++) {
            if(issafey(sudoku , row, col, digit)){
                sudoku[row][col] = digit;
                if (sudokusolver(sudoku, nextrow, nextcol)) {
                    return true;
                }
            sudoku[row][col] = 0;    
            }
        }

        return false;
        //y

    }

    public static boolean isSafe_sudoku(int sudoku[][], int row, int col, int j) {

        //same col
        for(int i=0; i<9; i++) {
            if(sudoku[i][col]==j) {
                return false;
            }
        }

        //same row
        for(int i=0; i<9; i++) {
            if(sudoku[row][i]==j) {
                return false;
            }
        }

        //same grid
        int gridRow = (row/3) * 3;
        int gridCol = (col/3) * 3;
        for(int i=gridRow; i<gridRow+3; i++) {
            for(int k=gridCol; k<gridCol+3; k++) {
                if(sudoku[i][k]==j) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col) {

        if(row==9) {
            return true;
        }

        int nextRow = row;
        int nextCol = col+1;
        if(col==8) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if(sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, row, col+1);
        }
        
        for (int j = 1; j <= 9; j++) {
            if(isSafe_sudoku(sudoku, row, col, j)) {
                sudoku[row][col] = j;
                if(sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;

    }

    public static void printSudoku(int sudoku[][]) {
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    

    public static void printsuduko(int sudoku[][]) {
        for (int i = 0; i <9; i++) {
            for (int j = 0; j< 9; j++) {
                System.out.print(sudoku[i][j]+ " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        
        // int arr[] = new int[5];
        // changearray(arr, 0, 1);
        // printarray(arr);

        int n=5;
        char board[][] = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }

        if(nqueens(board, 0)){
            System.out.println("sol possible");
            printboard(board);
        }
        //System.out.println(county);
    }
    // int n=3 , m=3;
  
    // System.out.println(  gridways(0, 0, m, n));

    // int sudoku[][] = {{0,0,8,0,0,0,0,0,0},
    // {4,9,0,1,5,7,0,0,2},
    // {0,0,3,0,0,4,1,9,0},
    // {1,8,5,0,6,0,0,2,0},
    // {0,0,0,0,2,0,0,6,0},
    // {9,6,0,4,0,5,3,0,0},
    // {0,3,0,0,7,2,0,0,4},
    // {0,4,9,0,3,0,0,5,7},
    // {8,2,7,0,0,9,0,1,3}};
    // System.out.println(sudoku.length);

    // if (sudokuSolver(sudoku, 0, 0)) {
    //     System.out.println("solution exist");
    //     printsuduko(sudoku);
    // }else{
    //     System.out.println("solution does not exist");
    // }

    // int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
    //             { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
    //             { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
    //             { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
    //             { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
    //             { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
    //             { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
    //             { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
    //             { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };
    //     if(sudokuSolver(sudoku,0,0)) {
    //         printSudoku(sudoku);
    //     }
    //     else {
    //         System.out.println("No solution");
    //     }
    }
