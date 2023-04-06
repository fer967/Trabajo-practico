package gabriel;

import java.util.Arrays;

public class Clase3 {

	public static void main(String[] args) {
		int[] numerosOrdenados = ordenarNumeros(1,9,6,"asc");
		System.out.println(Arrays.toString(numerosOrdenados));
		
	}	
		public static int[]ordenarNumeros(int n1, int n2,int n3,String orden){
			int[]vector=new int[] {n1,n2,n3};
			for (int i=0;i<vector.length;i++) {
				System.out.println("i"+vector[i]);
				for (int j=i+1;j<vector.length;j++) {
					System.out.println("j"+vector[j]);
					if(vector[i]>vector[j]) {
						System.out.println("encontre el mayor"+ vector[i]);
						int temp = vector[i];
						vector[i]= vector[j];
						vector[j]= temp;
					}
				}
			}
			return vector;
		}
				
		
	
}	
     
    			
    			
    			
    			
    		
    		
    	
     

