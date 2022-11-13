package br.com.erickfreire.incremento;

public class Incremento {

	public static void main(String[] args) {
		int c = 5;
		
		System.out.printf("C antes de incrementar: %d%n", c);
		System.out.printf("C incrementado: %d%n", c++);
		System.out.printf("C depois de incrementar: %d%n", c);
		
		System.out.println();
		
		c = 5;		
		System.out.printf("C antes de pre-incrementar: %d%n", c);
		System.out.printf("C pre-incrementado: %d%n", ++c);
		System.out.printf("C depois de pre-incrementar: %d%n", c);

	}

}
