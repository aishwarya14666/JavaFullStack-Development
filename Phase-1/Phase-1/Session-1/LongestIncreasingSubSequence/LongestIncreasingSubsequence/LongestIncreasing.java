package LongestIncreasingSubsequence;

import java.util.ArrayDeque;
import java.util.Scanner;

public class LongestIncreasing {
	
	public static class pair{
		int l;
		int i;
		int v;
		String psf;
		
		pair(int l,int i,int v,String psf){
			this.l=l;
			this.i=i;
			this.v=v;
			this.psf=psf;
		}
	}
	public static void solution(int []arr) {
		int[] dp=new int[arr.length];
		int omax=0;
		
		for(int i=0;i<dp.length;i++) {
			int max=0;
			
			for(int j=0;j<i;j++) {
				if(arr[j] <= arr[i]) {
					if(dp[j] > max){
					max=dp[j];	
					}
				}
			}
			dp[i]=max+1;
			if(dp[i] > omax) {
				omax=dp[i];
			}
		}
		System.out.println("Size of longest Increasing Subsequence: ");
		System.out.println(omax);
		
		ArrayDeque<pair> queue=new ArrayDeque<>();
		
		for(int i=0;i<dp.length;i++) {
			if(omax==dp[i]) {
				queue.add(new pair(omax,i,arr[i],arr[i]+""));
			}
		}
		while(queue.size()>0) {
			pair rem=queue.removeFirst();
			
			if(rem.l==1) {
				System.out.println("Longest Increasing Subsequence is: ");
				System.out.println(rem.psf);
			}
			
			for(int j=0;j<rem.i;j++) {
				if(dp[j]== rem.l-1 && arr[j] <= rem.v) {
					queue.add(new pair(dp[j],j,arr[j],arr[j]+" -> "+rem.psf));
					
				}
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		solution(arr);
		sc.close();
		
	}
}
