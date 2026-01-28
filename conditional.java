import java.util.Scanner;
class conditional{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("--------calculator-------");
        System.out.println("1.addition");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        System.out.println("Enter your choice: ");
        int choice=sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Addition: "+(a+b));
                break;
            case 2:
                System.out.println("Subtraction: "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication: "+(a*b));
                break;
            case 4:
                System.out.println("Division: "+(a/b));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
