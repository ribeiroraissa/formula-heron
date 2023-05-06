import java.util.Scanner;

//instrução1
//instrução2
//instrução3
//instrução4
//instrução5
//...

class RenomearClasse {
  
	public static void main(String args[]){  
   
    	Scanner teclado = new Scanner(System.in);
    
		double lado1 = 0;
		double lado2 = 0;
		double lado3 = 0;
		double total = 0;
		double perimetro
		double area
		
		System.out.printf("insira o valor do lado1:");
		lado1 = teclado.nextDouble ();
		
		System.out.printf("insira o valor do lado2:");
		lado2 = teclado.nextDouble ();
		 
		System.out.printf("insira o valor do lado3:");
		lado3 = teclado.nextDouble ();
		
		if(lado1 == lado2 && lado1 == lado3){
			System.out.printf("equilatero");
		}
		
		if(lado1 != lado2 && lado1 != lado3){
		System.out.printf("escaleno");
		} 
		
		if(lado1 == lado2 && lado1 != lado3){
		System.out.printf("isosceles");
		}
		 
		 perimetro = 
		
    	System.exit(0);
		
	}

}
