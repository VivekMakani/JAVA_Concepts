import java.util.Scanner;

class FirstClass{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

       
    //    System.out.println("Enter the Action:");
    //    int action = sc.nextInt();
    //    System.out.println("Enter first Value:");
    //    int a = sc.nextInt();
    //    System.out.println("Enter first Value:");
    //    int b = sc.nextInt();
    //    float c = 0;

    //    switch(action){
    //     case 1:
    //         c = a+b;
    //         break;
    //     case 2:
    //         c = a-b;
    //         break;
    //     case 3:
    //         c = a*b;
    //         break;
    //     case 4:
    //         c = a/b;
    //         break;
    //     case 5:
    //         c = a%b;
    //         break;
    //     default: System.out.println("Something Wrong");
    //    }
    //    System.out.println("Final value is :"+c);

    int action = sc.nextInt();

    switch(action){
        case 1:
            System.out.println("January");
            break;
        case 2:
            System.out.println("February");
            break;
        case 3:
            System.out.println("March");
            break;
        case 4:
            System.out.println("April");
            break;
        case 5:
            System.out.println("May");
            break;
        case 6:
            System.out.println("June");
            break;
    }


sc.close();
    }
}