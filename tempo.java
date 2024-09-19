package tempo;

public class tempo {

	    public static void main(String[] args) {
	        // Testando o método
	        System.out.println(converterMinutos(213)); // Saída: 1 hora(s) e 30 minuto(s)
	    }

	    // Método que converte minutos em horas e minutos
	    public static String converterMinutos(int minutos) {
	        return (minutos / 60) + " hora(s) e " + (minutos % 60) + " minuto(s)";
	    }
	}


