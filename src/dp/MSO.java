package dp;

public class MSO {
	
	public static int getMinStep(int n){
		int arr[] = new int [n+1];
		for(int i=0;i<=n;i++){
			arr[i]=-1;
		}
		if(n==1) return 0; // base case
		
		if(arr[n]!=-1) return arr[n];  // already solved
		
		int r = 1 + getMinStep(n-1);
		if(r%2 == 0)
			r = Math.min(r, 1+getMinStep(n/2));
		if(n%3 == 0)
			r = Math.min(r,1+ getMinStep(n/3));
		arr[n]=r;
		return r;
	}
	
	public static void main(String[]args){
		System.out.print(getMinStep(5));
		
	}

}
