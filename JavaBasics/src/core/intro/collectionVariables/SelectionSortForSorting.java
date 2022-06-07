package core.intro.collectionVariables;

public class SelectionSortForSorting {
	public static void main(String[] args) {
		int [] num= {5,4,3,2,1};
		int i,j,k;
		int temp;
		for(i=0; i<4; i++) {
			for(j=i+1; j<5; j++) {
				if(num[i]>num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
			for(k=0; k<5; k++) {
				System.out.print(num[k]+"\t");
			}
			System.out.println();
		}
	}
}
