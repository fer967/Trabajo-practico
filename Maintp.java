package gabriel;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Maintp {
	public static void main(String[] args) {
		Collection<Partido>partidos = new ArrayList<Partido>();
		Path pathResultados = Paths.get("src/test/resources/resultados_test1");
       List<String> lineasResultados = null;
	try {
		lineasResultados = Files.readAllLines(pathResultados);
	} catch (IOException e) {
		System.out.println("No se pudo leer la linea de resultados...");
		System.exit(1);
	}
	   boolean primera = true;
       for(String lineaResultado : lineasResultados) {
    	   if(primera) {
    		   primera = false;
    	   } else {
    		   String[] campos = lineaResultado.split(",");
    		   Equipo equipo1 = new Equipo(campos[0]);
    		   Equipo equipo2 = new Equipo(campos[3]);
    		   Partido partido = new Partido(equipo1,equipo2);
    		   partido.setGolesEquipo1(Integer.parseInt(campos[1]));
    		   partido.setGolesEquipo2(Integer.parseInt(campos[2]));
    		   partidos.add(partido);
    	   }
    	  
       }
       int puntos = 0;
       Path pathPronostico = Paths.get("src/test/resources/pronstico_test1");
       List<String> lineasPronostico = null;
	try {
		lineasPronostico = Files.readAllLines(pathPronostico);
	} catch (IOException e) {
		System.out.println("No se pudo leer la linea de pronosticos...");
		System.out.println(e.getMessage());
		System.exit(1);
	}
	  primera = true;
     for(String lineaPronostico : lineasPronostico) {
  	   if(primera) {
  		   primera = false;
  	   } else {	
  		   String[] campos = lineaPronostico.split(",");
  		   Equipo equipo1 = new Equipo(campos[0]);
  		   Equipo equipo2 = new Equipo(campos[4]);
  		   Partido partido = null;
  		   
  		   for(Partido partidoCol: partidos) {
  			   if(partidoCol.getEquipo1().getNombre().equals(equipo1.getNombre()) && partidoCol.getEquipo2().getNombre().equals(equipo2.getNombre())){
  				  partido = partidoCol;
  				  
  			   }
  		   }
  		   Equipo equipo = null;
  		   String resultado = null;
  		   if("x".equals(campos[1])) {
  			   equipo = equipo1;
  			   resultado = "ganador";
  			   
  		   }
  		   if("x".equals(campos[2])) {
  			   equipo = equipo1;
  			   resultado = "empate";
  			   
  		   }
  		   if("x".equals(campos[3])) {
  			   equipo = equipo1;
  			   resultado = "perdedor";
  			   
  		   }
  		   Pronostico pronostico = new Pronostico(partido,equipo,resultado);
  		   
  		   puntos += pronostico.puntos();
  		   
  		   
  	   }
	} 
     System.out.println("Los puntos obtenidos por el usuario son:");
     System.out.println(puntos);
     
	}
}
