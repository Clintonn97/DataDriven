package Array;

import java.util.Scanner;

public class multidimensionalarray {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] [] [] twod = new int[3][3][3];
		for(int i =0;i<twod.length;i++){
		for(int j=0;j<twod.length;j++){
		for(int k=0;k<twod.length;k++){
		twod[i][j][k]=scan.nextInt();
		}
		}

		}
		for(int i =0;i<twod.length;i++){
		for(int j=0;j<twod.length;j++){
		for(int k=0;k<twod.length;k++){
		System.out.print(twod[i][j][k]+"\t");
		}
		}
		}

		}

}
