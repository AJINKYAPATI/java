import java.util.Scanner;

public class max_and_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("Enter values for array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Using advanced for loop to find max and min
        int max = arr[0];
        int min = arr[0];
        
        for(int value : arr) {
            if(value > max) {
                max = value;
            }
            if(value < min) {
                min = value;
            }
        }
        
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
