import java.util.*;

class Merge_two_arrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] arr1 = new int[M];
        int[] arr2 = new int[N];
        for(int i=0; i<M; i++){
            arr1[i] = sc.nextInt();
        }
        sc.nextLine();
        for(int i=0; i<M; i++){
            arr2[i] = sc.nextInt();
        }
        
        int[] ans = new int[M+N];
        int ptr = 0;
        int i = 0, j = 0;
        while(i<M && j<N){
            if(arr1[i]<=arr2[j]) ans[ptr++] = arr1[i++];
            else ans[ptr++] = arr2[j++];
        }

        while(i<M) ans[ptr++] = arr1[i++];
        while(j<N) ans[ptr++] = arr2[j++];

        for(int t : ans){
            System.out.print(t+" ");
        }
        sc.close();
    }
}