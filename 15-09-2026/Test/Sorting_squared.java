import java.util.*;

class Main{
	
	private static void MergeSort(int[] arr, int left, int right){
		if(left>=right) return;
		
		int mid = left + (right-left)/2;
		
		MergeSort(arr, left, mid);
		MergeSort(arr, mid+1, right);
		Merge(arr, left, mid, right);
	}
	
	private static void Merge(int[] arr, int left, int mid, int right){
		int s1 = mid - left + 1;
		int s2 = right - mid;
		
		int[] L = new int[s1];
		int[] R = new int[s2];
		int ptr = 0;
		for(int i=left; i<=mid; i++) L[ptr++] = arr[i];
		ptr = 0;
		for(int i=mid+1; i<=right; i++) R[ptr++] = arr[i];
		
		int i = 0, j = 0;
		ptr = left;
		while(i<s1 && j<s2){
			if(L[i]<=R[j]) arr[ptr] = L[i++];
			else arr[ptr] = R[j++];
			ptr++;
		}
		
		while(i<s1) arr[ptr++] = L[i++];
		while(j<s2) arr[ptr++] = R[j++];
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++){
			arr[i] = sc.nextInt();
			arr[i] *= arr[i];
		}
		MergeSort(arr, 0, N-1);
		for(int i : arr){
			System.out.print(i+" ");
		}
		sc.close();
	}
}