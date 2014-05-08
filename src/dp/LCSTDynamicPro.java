package dp;

public class LCSTDynamicPro {
	
	
	private static int getLcs(String s,String s1){
		int len1 = s.length(); int len2 = s1.length();
		int[][]lookup = new int[len1+1][len2+1];

		// base case
		if(s.charAt(0)==s1.charAt(0)){
			lookup[0][0]=1;
		}
		
		for(int i=1;i<len1;i++){
			for(int j=1;j<len2;j++){
				if(s.charAt(i)==s1.charAt(j)){
					lookup[i][j]=1+lookup[i-1][j-1];
				}else if(lookup[i-1][j] > lookup[i][j-1]){
					lookup[i][j] = lookup[i-1][j];
				}else{
					lookup[i][j]= lookup[i][j-1];
				}
			}
		}
		
		int max = lookup[0][0];
		for(int i=0;i<lookup.length;i++){
			for(int j=0;j<lookup[0].length;j++){
				if(lookup[i][j] > max){
					max = lookup[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		String[][]testCase = {
	             {"ABCDGH","AEDFHR"},
	             {"AGGTAB","GXTXAYB"},
	             {"ABCBDAB","BDCABA"},
	             {"ACCGGTCGAGTGCGCGGAAGCCGGCCGAA","GTCGTTCGGAATGCCGTTGCTCTGTAAA"},
	             };

		for(int i=0;i<testCase.length;i++){
			 System.out.println(getLcs(testCase[i][0],testCase[i][1]));
		}
	}

}
