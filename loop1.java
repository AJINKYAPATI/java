import java.util.*;
class loop1 {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size for array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter values for array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Value from array:");
        for(int a:arr){
            System.out.println(a);
        }

    }
}

