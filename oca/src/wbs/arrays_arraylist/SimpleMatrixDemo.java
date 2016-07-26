package wbs.arrays_arraylist;

public class SimpleMatrixDemo {
/*
 * Wir bestücken ein 5*5 int Array so, 
 * das in den beiden Diagonalen in jedem Feld eine 1 steht 
 * und in jedem anderen Feld eine 0
 */
	public static void main(String[] args) {
		int[][] matrix1 = { {1,0,0,0,1},{0,1,0,1,0},{0,0,1,0,0},{0,1,0,1,0},{1,0,0,0,1}};
		int[][] matrix2 = new int[5][5];
		int x = 0;
		int y=0;
		for(x = 0; x <5 ; x++) {
			for(y=0; y <5 ; y++) {
				System.out.print(matrix1[x][y]);
			}
			System.out.println();
		}
	
		
		System.out.println("******************************");
		
		
		
		int xmax = matrix2[0].length-1;
		for(x = 0; x <5 ; x++) {
			for(y=0; y <5 ; y++) {
				if (x == y || y == xmax){
					matrix2[x][y] = 1;
				} 
				System.out.print(matrix2[x][y]);
			}
			System.out.println();
			xmax--;
		}
	}

}
