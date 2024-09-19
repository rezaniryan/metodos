package maior;

public class numeromaior {
	

	    public static void main(String[] args) {
	        // metodo
	        System.out.println("O maior número é: " + encontraMaior(333, 217, 51));
	    }

	    // recebe o tres numeros escolhidos e mostra o maior entra eles 
	    public static int encontraMaior(int a, int b, int c) {
	        return Math.max(a, Math.max(b, c));
	    }
	}



