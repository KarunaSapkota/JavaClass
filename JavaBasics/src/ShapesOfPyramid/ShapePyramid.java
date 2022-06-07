package ShapesOfPyramid;

public class ShapePyramid {
public static void main (String []args) {
	int i,j;
	int rows=5;
	for(i=1; i<=rows; i++) {
		for(j=1; j<=i-1; j++) {
		System.out.print("  ");	
		}
		for(j=1; j<=6-i; j++) {
			System.out.print("* ");	
			}
		System.out.println();		
					
		}
			
}	
}
