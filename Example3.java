/*
  Esse programa ilustra a diferença
  entre int e double.
  
  Chame esse arquivo de Example3.java.
  
*/
class Example3 {
  public static void main ( String args[]) {
    int var; // essa variável declara uma variável int
	double x; // essa variável declara uma variável de ponto flutuante
	
	var = 10; // atribui o var o valor 10
	
	x = 10.0; // atribui a x o valor 10,0
	
	System.out.println ("Original value of var: " + var);
	System.out.println ("Original value of x: " + x);
	System.out.println (); // exibe uma linha em branco
	
	// agora divide a duas por 4 
	var = var / 4;
	x = x / 4;
	
	System.out.println ("var after division: " + var);
	System.out.println ("x after division: " + x);
 }
}