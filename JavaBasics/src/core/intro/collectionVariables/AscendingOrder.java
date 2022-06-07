package core.intro.collectionVariables;

public class AscendingOrder {
public static void main (String[]args) {
	int [] num= {5,4,3,2,1};
	int i,j,k;
	int temp;
	for(k=0; k<4; k++) {
		for(i=0; i<=3-k; i++) {
			if(num[i]>num[i+1]) {
			temp=num[i];
			num[i]=num[i+1];
			num[i+1]=temp;
				
			}	
			for(j=0; j<5; j++) {
				System.out.print(num[j]+"\t");	
			}
			System.out.println();
		}
	}	
} 	
}
