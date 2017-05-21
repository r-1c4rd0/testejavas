/*
   Tente isto 1-2
   
   Este programa exibe a tabela de 
   conversões de galões em litros.
   
   Chame-o de "InchToMetTable.java".
   
 */
class InchToMetTable1{
 public static void main (String args[]){ 
    double inch, meters, pes, centimentros;
     int counter;
    
     counter = 0; 
	 for (inch = 1; inch <= 101; inch++){ 
     meters = inch * 0.254; // converte para metros	 
     System.out.println(inch + " inch is " + meters + " meters " );
	 
	 counter++; //incrementa o contador de linhas a cada interação do loop.
    //a cada décima linha, exibe uma linha em branco
    if ( counter == 10) {
     System.out.println();
     counter = 0; // zera o contador de linhas

	 
   counter = 0;
     counter = 0;
	 for (pes = 1; pes <= 100; pes++){ 
     centimentros = pes * 0.3098; // converte para pes	 
     System.out.println(pes  + " pes * " + centimentros  + " valor " );
    
    counter++; //incrementa o contador de linhas a cada interação do loop.
    //a cada décima linha, exibe uma linha em branco
    if ( counter == 12) {
     System.out.println();
     counter = 0; // zera o contador de linhas 
    
	}
	}
	}
   }
  }
}  
 