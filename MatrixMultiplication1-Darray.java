import java.util.Scanner;

class MatrixMultiplication1Darray{
    public static void main(String args[]){
        Scanner scan =  new Scanner(System.in); 
        int TotalRowForMatrix1 = scan.nextInt(); // totalrow of the matrix 1
        int TotalColumnForMatrix1 = scan.nextInt(); // totalColumn of the matrix 1
        
        int TotalRowForMatrix2 = scan.nextInt(); // totalrow of the matrix 2
        int TotalColumnForMatrix2 = scan.nextInt(); // totalColumn of the matrix 2
        
        int sumUp1 = TotalRowForMatrix1 * TotalColumnForMatrix1; 
        int sumUp2 = TotalRowForMatrix2 * TotalColumnForMatrix2;
        int sumUp3 = TotalRowForMatrix1 * TotalColumnForMatrix2;
        
        int Matrix1[] = new int[sumUp1 + 1];
        int Matrix2[] = new int[sumUp2 + 1]; 
       
        int n = 0;
        for(int i = 1; i <= sumUp1 ; i++)
            Matrix1[i] = scan.nextInt();
        
        for(int j = 1; j <= sumUp2 ; j++)
            Matrix2[j] = scan.nextInt();
        
        int val = 0;
        int num = 1;
        int tempa = 1;
        int tempb = 1;
        int neutral = 1;   
        while(n < sumUp3){  
          for(int a = 1; a <=  TotalColumnForMatrix2; a++ ){  
              for(int b = 1; b <=  TotalColumnForMatrix1; b++){
                  val = val+ Matrix1[tempa]*Matrix2[tempb];
                  tempb = tempb + TotalColumnForMatrix2;
                  tempa++ ;
              }
              System.out.print(val + " ");
              val = 0;
              tempa = neutral;
              num++;
              tempb = num;
              n++ ;
          } 
            System.out.println();
            tempa = tempa + TotalColumnForMatrix1 ;
            neutral = tempa;
            tempb = 1;
            num = 1;
        }
            
    }
}