
// Print sum of first n natural numbers 

class Recursion {


// Main Method

public static void main(String args[]) {

    //Recursion Concept
    System.out.println("\nRecursion Answer: ");
    printsum(1, 5, 0);

    //Find Factorial using Recursion
    int ans = printFactorial(2);
    System.out.println("\nFactorial Answer: "+ans);


    // Find Fibbonacci Series By Recursion
     int a = 0;
    int b = 1;
    int n = 7;
    System.out.println("\nFibbonacci Series");
    System.out.println(a);
    System.out.println(b);
    printFibbonacci(a, b, n-2);

    
    }

  
public static void printsum(int i, int n, int sum) {
    
    // Return Calling to stop the Recursion
    if(i == n ){
        sum += i;
        System.out.println(sum);
        return;
    }

    // Addition of the value of sum
    sum += i;
    
    //Print Statement
    printsum(i+1, n,sum);
    
    System.out.println(i);
}


//-------------------------------------------------------------------

// Count Factorial amount by  using Recursion

public static int printFactorial(int n) {

    //Base Cases
    if(n == 1 || n == 0){ 
        return 1;
    }

    //Logic Part
    int fact_nm1 = printFactorial(n-1);
    int fact = n * fact_nm1;

    //Return
    return fact;
    
    }

//-------------------------------------------------------------------

//Count Fibbonacci Sequence by using Recursion

public static void printFibbonacci(int a,int b, int n){
    
    //Base Part
    if(n == 0){
        return ;
    }

    //Logic Part
    int c = a+b ;

    //Print Series numbers 
    System.out.println(c);
    
    //Recursive Part
    printFibbonacci(b, c,n-1);
    
}

}