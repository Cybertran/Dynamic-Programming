package dp;

public class LIS {
	
	private static int getLIS(int arr[]){
		int lookup[] = new int[arr.length+1];
		lookup[0] = 1;
		for(int i =1;i<arr.length;i++){
			for(int j=0;j<i;j++){
				if(arr[i] > arr[j] && lookup[i]<lookup[j]){
					lookup[i] = 1+ lookup[i-1];
				}
					
			}
		}
		int max = lookup[0];
		for(int i =1 ;i<lookup.length;i++){
			if( lookup[i] >max)
				max = lookup[i];
		}
		return max;
	}
	
	public static void main(String args[]){
		int arr[] ={10,12,2,4,6, 22, 9, 33, 21, 50, 41, 60, 80,100};
		System.out.print(getLIS(arr));
		
	}

}
