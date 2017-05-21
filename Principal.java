public class Principal{

  public static void main(String[]args){
     int n = ocorrencia("paralelepipedo", n);
	 
	 System.out.println("número de ocorrência" + n);
	 
	 }
	 private static int ocorrencia(String s, cha c){
	    if (s.equals(""))
		    return 0;
		else 
            if (s.charAt:(0) == c)
                return ocorrencia(s.substring(1), c) +1;
            else return ocorrencia(s.substring(1), c);
     }
}	 