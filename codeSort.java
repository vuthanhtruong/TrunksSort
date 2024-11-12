package code;
import java.util.Random;
public class codeSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] M = new int[10];
		Random rd=new Random();
		for (int i = 0; i < M.length; i++) {
		M[i] = rd.nextInt(100)+3;
		}
		for(int i=0;i<M.length;i++) {
		Sort(M,i,M.length-1);
		}
		for(int i=0;i<M.length;i++) {
			System.out.print(M[i]+" ");
		}
	}
	private static void Sort(int[] M, int left, int right) {
		// TODO Auto-generated method stub
		if(left<right) {
			int mid=(right+left)/2;
			if(M[mid]>M[right]) {
				int teamp=M[mid];
				M[mid]=M[right];
				M[right]=teamp;
			}
			Sort(M,left+1,right-1);
			Sort(M,left,mid);
			Sort(M,mid+1,right);
		}
		else {
			return;
		}
	}
}
