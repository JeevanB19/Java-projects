import java.util.Scanner; 

 class Arithmetic  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
    
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        

        
        System.out.println("a + b = " + (a + b));
  
  
      System.out.println("a - b = " + (a - b));
  
      
      System.out.println("a * b = " + (a * b));
  
      
      System.out.println("a / b = " + (a / b));
  
  
      System.out.println("a % b = " + (a % b));

 }
}