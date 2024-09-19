package ads;

public class verificarnumero {
	

	    public static void main(String[] args) {
	        System.out.println(verificaNumero(5));   // Saída: positivo
	        System.out.println(verificaNumero(-3));  // Saída: negativo
	        System.out.println(verificaNumero(0));   // Saída: positivo
	    }

	    public static String verificaNumero(int numero) {
	        return numero >= 0 ? "positivo" : "negativo";
	    }
	}


