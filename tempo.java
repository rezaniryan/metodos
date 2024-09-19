package tempo;

public class tempo {

	    public static void main(String[] args) {
	        // metodo
	        System.out.println(converterMinutos(213)); // Saída: 3 horas e 33 minutos
	    }

	    // converte minutos em horas e minutos
	    public static String converterMinutos(int minutos) {
	        return (minutos / 60) + " hora(s) e " + (minutos % 60) + " minuto(s)";
	    }
	}


