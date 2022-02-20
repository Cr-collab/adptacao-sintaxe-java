
public class TerstaEscopo {
   public static void main(String[] args) {
	System.out.println("Testando condiconais");
	
	int idade = 16;
	int quantidadePessoas =  3;
	
	//boolean acompanhado =  quantidadePessoas >= 2;
	boolean acompanhado ;
	
	if(quantidadePessoas  >= 2) {
		 acompanhado = true;
	} else {
		 acompanhado = false;
	}
	// escopo restrito 
	
	System.out.println(" Valor de acompanahdo : "  + acompanhado);
	
	if(idade >= 18 && acompanhado) {
		System.out.println("Seja bem vindo");
	} else {
		System.out.println("Você não pode entrar ");
	}
	
   }
}
