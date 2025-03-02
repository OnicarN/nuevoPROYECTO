import java.util.ArrayList;
public class Actividad9772{
    ArrayList<String>origen;
    int numero;

    public int cuantasPalabrasHayDeNLetras(ArrayList<String> origen, int numero){
        int contador;
        int iterador = 0; 
        int palabrasMismaLongitud = 0; 
        int resultado = 0; 
        if (origen != null){
            for(String palabras: origen){
                System.out.println(palabras);
                contador = palabras.length();
                if(contador == numero){
                    palabrasMismaLongitud++;
                    resultado = palabrasMismaLongitud;
                }
            }
        }
      return resultado;
    }

}
