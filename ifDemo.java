/*
  Demonstra a instrução if.
  Chame este arquivo de ifDemo.java.
*/
class ifDemo {
  public static void main (String args[]) {
    int a, b, c;
	
	a = 2;
	b = 3;
	
	if (a < b) System.out.println ("a is less than b");
	
	// esta instrução não exibirá nada 
	
	if (a == b) System.out.println("you wont't see this");
	
	System.out.println();
	
	c = a - b; // c contém 1
	
	System.out.println ("c contains -1");
	if (c >= 0) System.out.println ("c is non-negative");
	if (c < 0) System.out.println ("c is negative");
	
	System.out.println();
	
	c = b - a; // agora c contém 1
	
	System.out.println ("c contains 1");
	if (c >= 0) System.out.println ("c is non-negative");
	if (c < 0) System.out.println ("c is negative");
 }
}