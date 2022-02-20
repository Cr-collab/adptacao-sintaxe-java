
public class TestaLacosEncadeados {
   public static void main(String[] args) {
	 for(int contador = 1; contador <= 3; contador++) {
		 for(int contador1 = 1;contador1 <= 10; contador1++) {
			 System.out.println( "o resultado de " + contador + "x" + contador1 + ": " +   contador * contador1);
			 
		 }
		 System.out.println("--------------------");
	 }
   }
}
