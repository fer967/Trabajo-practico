package gabriel;

import java.util.Arrays;

public class Punto1a {
       // 1 ABRIR TERMINAL NUEVA
	   // 2 VOY A LA UBICACION DE LA CLASE
	   // 3 COMPILO ARCHIVO JAVA
	   // 4 EJECUTO LA CLASE Y EL METODO MAIM CON LOS ARGUMENTOS QUE YO QUIERO
	
	public static void main(String[] args) {
	     // ARGS ["1","3","4",d]
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int n3 = Integer.parseInt(args[2]);
		String orden = (args[3]);
		
		System.out.println(Arrays.toString(ordenarNumeros(n1,n2,n3,orden)));
		
	}
   
	public static int[]ordenarNumeros (int n1,int n2,int n3,String orden){
		int[]vector= new int[] {n1,n2,n3};
		 for (int i = 0;i<vector.length;i++) {
			 for(int j=i+1;j<vector.length;j++) {
				 if(orden.equals("a")) {
					 if(vector[i]>vector[j]) {
						 int temp = vector[i];
						 vector[i]= vector[j];
						 vector[j]= temp;
					 }
				 }
			 }
			 
		 }
		 return vector;
	}
}
