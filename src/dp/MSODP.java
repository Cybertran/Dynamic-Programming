package dp;

public class MSODP {
	
	private static int getMinStep(int n){
		int arr[] = new int [n+1];
		for(int i =2;i<=n;i++){
			arr[i] = 1+ arr[i-1];
			if(n%2 == 0) arr[i] = Math.min(arr[i], 1+arr[i/2]);
			if(n%3 == 0) arr[i] = Math.min(arr[i], 1+arr[i/3]);
		}
		return arr[n];
	}
 
	public static void main(String[] args) {
                System.out.print(getMinStep(5));
	}

}
