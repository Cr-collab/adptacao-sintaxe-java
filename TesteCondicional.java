
public class TesteCondicional {
	public static void main(String[] args) {
		System.out.println("testando codicionais");
		int idade = 17;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Seja bem vindo!!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("voc� n�o tem 18 anos , mais esta acompanhado"
						+ " entao voce pode entar");
			}else {
			System.out.println("Infelizmente voc� n�o pode entrar");
			}
		}

	}
}
