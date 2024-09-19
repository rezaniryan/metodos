package fator;

public class fatorial {

	    public static void main(String[] args) {
	    
	        // metodo
	        System.out.println("Fatorial de 10 é: " + calcularFatorial(10));
	    }

	    // calcula o fatorial do numero 
	    public static long calcularFatorial(int n) {
	        long fatorial = 1;
	        for (int i = 1; i <= n; i++) {
	            fatorial *= i;
	        }
	        return fatorial;
	    }
	}



