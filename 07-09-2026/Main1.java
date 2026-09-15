import java.util.*;

class IHateMyLife{
    int LinearSearch(int[] arr, int target){
        int N = arr.length;
        for(int i=0; i<N; i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }

    int binarySearch(int[] arr, int target){
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;

        while(left<=right){
            int mid = left + (right-left)/2;

            if(arr[mid]==target) return mid;
            else if(target>arr[mid]) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }
}

public class Main1{

    /*
    private static int binarySearch_main(int[] arr, int target){
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while(left<=right){
            int mid = left + (right-left)/2;

            if(arr[mid]==target) return mid;
            else if(target>arr[mid]) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }

    private static int searcher_main(int[] arr, int target){
        int N = arr.length;
        for(int i=0; i<N; i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }
    */
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        IHateMyLife searcher = new IHateMyLife();


        int pos2 = searcher.LinearSearch(arr, target);
        int pos1 = searcher.binarySearch(arr, target);
        
        System.out.println("Linear Search: " + pos2);
        System.out.print("Binary Search: " + pos1);

        sc.close();
    }
}
