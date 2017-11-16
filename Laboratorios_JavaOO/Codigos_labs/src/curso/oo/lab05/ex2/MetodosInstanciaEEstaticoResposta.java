package curso.oo.lab05.ex2;

public class MetodosInstanciaEEstaticoResposta {

	public static void main(String[] args) {

		// Cria duas instancias da classe String
		String strInst1 = new String("Sou uma inst‚ncia de objeto da classe String");
		String strInst2 = "Viva com paix„o!";

		// Invoca o mÈtodo de inst‚ncia charAt()
		// atravÈs das inst‚ncias da classe String
        // todo 1 - altere para n‚o utilizar mÈtodo est·tico e utilizar mÈtodo da inst‚ncia da String
		char x = strInst1.charAt(2);
		char y = strInst2.charAt(1);
		char z = strInst2.charAt(0);

		System.out.println("O 3.o caracter da strInst1 = " + x);
		System.out.println("O 2.o caracter da strInst2 = " + y);
		System.out.println("O 1.o caracter da strInst2 = " + z);

		// Invoca o m√©todo de inst√¢ncia equalsIgnoreCase(...)
		boolean b = strInst1.equalsIgnoreCase(strInst2);
		String strInst3 = b ? "Sim" : "N„o";

		System.out.println("As vari·veis strInst1 " + " e strInst2 tem o mesmo" + " conjunto de caracteres? " + strInst3);
		// Invoca um mÈtodo est√°tico, valueOf (int i), da classe String
		int i = 23;
		String strInst4 = String.valueOf(i);
		System.out.println("valor de strInst4 = " + strInst4);

		// Voc√™ j√° usou o m√©todo est√°tico parseInt() da classe
		// Integer no exerc√≠¬¨cio anterior
		// Agora cria uma inst√¢ncia de objeto da classe String
		String strInst5 = new String("34");
		int ii = Integer.parseInt(strInst5);
		System.out.println("valor de ii = " + ii);

		// m√©todo endsWith()
		String str = "Hello";
		// todo 2 - Analise o que √© chamada por metodo de instancia ou est√°tico

        // Est√°tico ?
		System.out.println( str.endsWith( "slo" ) );

		// m√©todo floor()
        // Inst√¢ncia ?
		System.out.println( Math.floor(3.14));

		// m√©todo isDigit()
        // Est√°tico ?
		System.out.println( "0=" + Character.isDigit('0'));
		// Inst√¢ncia ?
		System.out.println( "A=" +Character.isDigit('A'));

	}

}
