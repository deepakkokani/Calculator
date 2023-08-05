import java.util.*;
class Calculator
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int op,result;
    char proceed;

    System.out.println();
    System.out.println("*******************************");
    while(true)
    {
      System.out.print("Enter first number : ");
      int a = sc.nextInt();
      System.out.print("Enter second number : ");
      int b = sc.nextInt();
      System.out.println("-------------------------------");
      System.out.println("- 1.Addition                  -");
      System.out.println("- 2.Subtraction               -");
      System.out.println("- 3.Multiplication            -");
      System.out.println("- 4.Division                  -");
      System.out.println("- 5.Modulus                   -");
      System.out.println("-------------------------------");
      System.out.print("Enter your choice : ");
      op = sc.nextInt();
      switch(op)
      {
        case 1 : result = a+b;
                 System.out.println("The sum is : "+result);
                 break;
        case 2 : result = a-b;
                 System.out.println("The subtraction is : "+result);
                 break;
        case 3 : result = a*b;
                 System.out.println("The Multiplication is : "+result);
                 break;
        case 4 : result = a/b;
                 System.out.println("The Division is : "+result);
                 break;
        case 5 : result = a%b;
                 System.out.println("The mod is : "+result);
                 break;
        default: System.out.println("Invalid choice");
      }

      System.out.print("Do you want to proceed? (y/n): ");
      proceed = sc.next().charAt(0);
      if (proceed == 'n' || proceed == 'N') 
      {
        System.out.println("Exiting calculator...");
        System.exit(0);
      }
      System.out.println("*******************************");
    }
    
  }
}