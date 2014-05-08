package dp;

public class LCS {
	
	public static int getLcs(String str1,String str2){
		
		if(str1.length() ==0 || str2.length() == 0) return 0;
		
		if(str1.charAt(str1.length()-1) == str2.charAt(str2.length()-1))
			return 1+getLcs(str1.substring(0, str1.length()-1),str2.substring(0, str2.length()-1));
		else
			return Math.max(getLcs(str1,str2.substring(0, str2.length()-1)),getLcs(str2,str1.substring(0, str1.length()-1)));
		
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
