import java.util.*;

public class theExample{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt(); //length of both BitSets
        int m = scan.nextInt(); //NO. of operations to perform
        
        BitSet B1 = new BitSet(n);
        BitSet B2 = new BitSet(n);
       
        for(int i = 0; i < m; i++){
            String str = scan.next(); //Enter the operation
            int num1 , num2 ;
            
            if(str.equals("AND")){
              num1 = scan.nextInt(); //for Bitset 1  
              num2 = scan.nextInt();//for Bitset 2
              if(num1 == 1)
                B1.and(B2);
              else if(num2 == 1)
                 B2.and(B1); 
              System.out.println(B1.cardinality() + " " + B2.cardinality());
            }
            
            if(str.equals("OR")) {
               num1 = scan.nextInt(); //for Bitset 1  
               num2 = scan.nextInt();//for Bitset 2
                if(num1 == 1)
                  B1.or(B2);
                else if(num2 == 1)
                  B2.or(B1); 
                System.out.println(B1.cardinality() + " " + B2.cardinality());
            }
            if(str.equals("XOR")){
              num1 = scan.nextInt(); //for Bitset 1  
              num2 = scan.nextInt();//for Bitset 2
                if(num1 == 1)
                  B1.xor(B2);
                else if(num2 == 1)
                  B2.xor(B1); 
                System.out.println(B1.cardinality() + " " + B2.cardinality());
            }
            if(str.equals("FLIP")){
              num1 = scan.nextInt(); //for Bitset 1 or 2  
              num2 = scan.nextInt();//for flipping the bitset 
               if(num1 == 1) 
                 B1.flip(num2);
               else if(num1 == 2)
                 B2.flip(num2);
               System.out.println(B1.cardinality() + " " + B2.cardinality());
            }
            if(str.equals("SET")){
              num1 = scan.nextInt(); //for Bitset 1 or 2  
              num2 = scan.nextInt();//for setting the bit true at a specific index 
               if(num1 == 1) 
                 B1.set(num2);
               else if(num1 == 2)
                 B2.set(num2);
               System.out.println(B1.cardinality() + " " + B2.cardinality());
            }
        }
    }
}