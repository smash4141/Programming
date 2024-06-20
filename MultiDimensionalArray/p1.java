package MultiDimensionalArray;

import java.util.*;
import java.io.*;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		String[] strArr=new String[3];
		for(int i=0; i<3; i++) {
			strArr[i] = sc.nextLine();
		}
		System.out.print(SearchingChallenge(strArr));
	}
public static int SearchingChallenge(String [] strArr) {
	int rows = strArr.length;
	int cols = strArr[0].length();
	int[][] matrix = new int[rows][cols];

	for(int i=0; i<rows; i++) {
		for(int j=0; j<cols; j++) {
			matrix[i][j] = strArr[i].charAt(j)-'0';
		}
	}
	int[][] memo= new int[rows][cols];
	int maxpath=0;
	for(int i=0; i<rows; i++) {
		for(int j=0; j<cols; j++) {
			maxPath = Math.max(maxPath, dfs(matrix,i,j,-1,memo));
		}
	}
	return maxPath-1;
}
}
