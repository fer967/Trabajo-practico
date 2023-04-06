package gabriel;

public class Ejercicio2 {                    //MOSTRAR UNICAMENTE NUMEROS PARES
public static void main(String[]arg) {
	int numeroInicio=3;
	int numeroFin=24;
	boolean mostrarPar=true;                //CONDICION
	int contador=numeroInicio;
	while(contador<=numeroFin) {
		if(mostrarPar==true) {
			if(contador%2==0) {
				System.out.println(contador);
			}
			contador=contador+1;
		}
	}
	
	
}
}
