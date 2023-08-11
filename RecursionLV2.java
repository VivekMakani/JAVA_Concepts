class RecursionLV2{


    public static void main(String[] args) {
    
        int x = 2, n = 5;
        int ans = calcpowr(x, n);
        System.out.println(ans);

    }


//Calculate x^n where (stack height = logn) 

/*  For this log n height logic is different for both the cases for odd or even numbers 
 * For odd numbers logic will be  x^n = x^ n/2 * x^n/2 * n 
 * 
 * For even numbers logic will be x^n = x^ n/2 * x^n/2 
 */

    public static int calcpowr(int x, int n){
        
        //base Cases
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 1;
        }

        // if n is even 
        if(n%2 == 0){
            //Logic Part
            return calcpowr(x, n/2) * calcpowr(x, n/2);
        }
        else{ // if n is odd
            return calcpowr(x, n/2) * calcpowr(x, n/2) * x;
        }
    
    }
    
}