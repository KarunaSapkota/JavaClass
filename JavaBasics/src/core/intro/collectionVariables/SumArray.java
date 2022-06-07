package core.intro.collectionVariables;

public class SumArray {
	public static void main(String[]args) {
		int [][] num1= {{1,2,3},{3,4,5},{5,6,7}};
		int [][] num2= {{1,1,1},{2,3,4},{3,2,1}};
		int [][] sum= new int[3][3];
		int i,j;
		System.out.println("The sum of the matrix is:" );
		 for( i=0; i<3; i++) {
			 
			 for(j=0; j<3; j++) {
			 sum [i][j]	 = num1[i][j]+ num2[i][j];
			System.out.print(sum [i][j] + "\t");	 
			 }
			 System.out.println();
		 }
	}
	
}
