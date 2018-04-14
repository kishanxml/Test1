
import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array");
        int N = scan.nextInt();
        int[] arr = new int[ N ];
        /* Accept N elements */
        System.out.println("Enter "+ N +" elements");
        for (int i = 0; i < N; i++)
            arr[i] = scan.nextInt();
        /* Find Peak Elements */        
        System.out.print("\nPeak Elements : ");
        peak(arr);
        System.out.println();
    } 
    public static void peak(int[] arr)
    {
        peak(arr, 0, arr.length - 1);
    }    
    public static void peak (int arr[], int low, int high)
    {
        int N = arr.length;
        if (high - low < 2)
            return;
        int mid = (low + high) / 2;
        if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
            System.out.print(arr[mid] +" ");
        /* Recursively find other peak elements */        
        peak (arr, low, mid);
        peak (arr, mid, high);    
    }        
}
