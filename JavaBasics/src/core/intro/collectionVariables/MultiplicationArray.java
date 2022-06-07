package core.intro.collectionVariables;

public class MultiplicationArray {
public static void main (String[]args) {
	int [][] A = {{1,2,3},{2,3,4},{3,2,1}};
	int [][] B = {{2,3,4},{1,2,3},{2,3,4}};
	int [][] P = new int [3][3];
	int i,j,k;
	System.out.println("The product of the matrix is:");
	
	for(i=0; i<3; i++) {
		for(j=0; j<3; j++) {
			P [i][j]= 0;
			for(k=0; k<3; k++) {
				P[i][j]+=A[i][k]*B[k][j];
			}
			System.out.print(P[i][j]+ "\t");
		}
		System.out.println();
	}
}
}
