package daily.string;

import java.util.Scanner;

public class FindingDuplicatesInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l =5;
		int[] in = new int[l];
		for(int i =0; i< in.length;i++) {
			System.out.println("enter "+ (i+1) + " "+ "element");
			int element = sc.nextInt();
			in[i]= element;
		}
		boolean is = true;
		for(int i=0;i < in.length;i++) {
			for(int j =i;j<in.length-i-1;j++) {
				//if(j==in.length) break;
				if(in[i]==in[j+1]) {
					System.out.println("there was a similar value in the array");
					is = false;
					break;
				}
			}
		}
		if(is) {
			System.out.println("there is no similar value");
		}
	}
}
