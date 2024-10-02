import java.util.Scanner;
public class JogoForca 
{
    public static void main(String[] args) 
	{
        Scanner ler = new Scanner(System.in);
		char tentativa;
        String[] palavras = {"cetico", "amistoso", "empatia", "eficiente", "generoso", "elegante", "sincero", "brilhante", "empolgante", "serenidade", "compreensao", "harmonia", "alegria",
                "integridade", "simplicidade", "pacifico", "respeito", "espontaneo", "encantador", "cooperativo", "compreensao", "harmonia", "alegria", "integridade",
                "simplicidade", "pacifico", "respeito", "espontaneo", "encantador", "cooperativo"};
		int aux;
		do
		{
			int numAleatorio = numAlea();
			aux = 1;
			String palavraEscolhida = palavras[numAleatorio];
			int tamanho = length(palavraEscolhida);
			char[] linha = new char[tamanho];
			char[] letrasSeparadas = toCharArray(palavraEscolhida);
			char[] tentativas;
			for (int i = 0; i < tamanho; i++) 
			{
				linha[i] = '_';
			}
			cls();
			System.out.print("Palavra secreta:   ");
			for(int i = 0; i < tamanho; i++) 
			{
				System.out.print(linha[i] + " ");
			}
			System.out.print("Palavra erradas:   ");
			for(int i = 0; i < tamanho; i++)
			{
				System.out.print(tentativas[i] + " ");
			}
			System.out.println("Insira tentativa com letra minuscula: ");
			tentativa = ler.next().charAt(0);
			for(int i = 0; i < tamanho; i++)
			{
				if(letrasSeparadas[i] == tentativa)
				{
					linha[i] = tentativa;
					tentativas[i] = tentativa;
				}
				else
				{
					mostrarBoneco(aux);
					aux++;
				}
			}
		}while (verificaVitoria(linha, tamanho, aux, palavraEscolhida) == 0);
    }
	
	public static void mostrarBoneco(int numDerrotas)
	{
		switch(numDerrotas)
		{
			case 1:
				System.out.println("    |");
				System.out.println("    |                    ");
				System.out.println("    |                    ");
				System.out.println("    |                    ");
				System.out.println("    |                    ");
				System.out.println("    |                    ");
				System.out.println("____________             ");
			break;
			case 2:
			    System.out.println("    _____________        ");
				System.out.println("    |            |       ");
				System.out.println("    |            |       ");
				System.out.println("    |                    ");
				System.out.println("    |                    ");
				System.out.println("    |                    ");
				System.out.println("    |                    ");
				System.out.println("____________             ");
			break;
			case 3:
				System.out.println("    _____________        ");
				System.out.println("    |            |       ");
				System.out.println("    |            |       ");
				System.out.println("    |          _____     ");
				System.out.println("    |         |     |    ");
				System.out.println("    |         |     |    ");
				System.out.println("    |          -----     ");
				System.out.println("    |                    ");
				System.out.println("    |                    ");
				System.out.println("    |                    ");
				System.out.println("    |                    ");
				System.out.println("    |                    ");
				System.out.println("    |                    ");
				System.out.println("    |                    ");
				System.out.println("    |                    ");
				System.out.println("    |                    ");
				System.out.println("    |                    ");
				System.out.println("____________             ");
			break;
			case 4:
				System.out.println("    ______________       ");
				System.out.println("    |             |      ");
				System.out.println("    |             |      ");
				System.out.println("    |           _____    ");
				System.out.println("    |          |     |   ");
				System.out.println("    |          |     |   ");
				System.out.println("    |           -----    ");
				System.out.println("    |             |      ");
				System.out.println("    |             |      ");
				System.out.println("    |             |      ");
				System.out.println("    |             |      ");
				System.out.println("    |             |      ");
				System.out.println("    |                    ");
				System.out.println("    |                    ");
				System.out.println("    |                    ");
				System.out.println("    |                    ");
				System.out.println("____________             ");
			break;
			case 5:
				System.out.println("    ______________       ");
				System.out.println("    |             |      ");
				System.out.println("    |             |      ");
				System.out.println("    |           _____    ");
				System.out.println("    |          |     |   ");
				System.out.println("    |          |     |   ");
				System.out.println("    |           -----    ");
				System.out.println("    |             |      ");
				System.out.println("    |             |      ");
				System.out.println("    |             |      ");
				System.out.println("    |             |      ");
				System.out.println("    |             |      ");
				System.out.println("    |            /       ");
				System.out.println("    |           /        ");
				System.out.println("    |                    ");
				System.out.println("    |                    ");
				System.out.println("____________             ");
			break;
			case 6:
				System.out.println("    ______________       ");
				System.out.println("    |             |      ");
				System.out.println("    |             |      ");
				System.out.println("    |           _____    ");
				System.out.println("    |          |     |   ");
				System.out.println("    |          |     |   ");
				System.out.println("    |           -----    ");
				System.out.println("    |             |      ");
				System.out.println("    |         ----|----  ");
				System.out.println("    |             |      ");
				System.out.println("    |             |      ");
				System.out.println("    |             |      ");
				System.out.println("    |            /       ");
				System.out.println("    |           /        ");
				System.out.println("    |                    ");
				System.out.println("    |                    ");
				System.out.println("____________             ");
			break;
			case 7:
				System.out.println("    ______________       ");
				System.out.println("    |             |      ");
				System.out.println("    |             |      ");
				System.out.println("    |           _____    ");
				System.out.println("    |          |     |   ");
				System.out.println("    |          |     |   ");
				System.out.println("    |           -----    ");
				System.out.println("    |             |      ");
				System.out.println("    |         ----|----  ");
				System.out.println("    |             |      ");
				System.out.println("    |             |      ");
				System.out.println("    |             |      ");
				System.out.println("    |            / \\    ");
				System.out.println("    |           /   \\   ");
				System.out.println("    |                    ");
				System.out.println("    |                    ");
				System.out.println("____________             ");
			break;
		}
	}
	
    public static int numAlea() {
        int numAleatorio = (int) (Math.random() * 29);
        return numAleatorio;
    }

    public static int length(String palavra) {
        int tamanho = palavra.length();
        return tamanho;
    }

    public static char[] toCharArray(String palavra) {
        char[] letras = palavra.toCharArray();
        return letras;
    }
	
	public static int verificaVitoria(char[] linha, int tamanho, int aux, String palavraEscolhida) 
	{
        boolean palavraCompleta = true;
        int aux2 = 0;
        for(int i = 0; i < tamanho; i++) 
		{
            if (linha[i] == '_')
			{
                palavraCompleta = false;
                break;
            }
        }
        if(palavraCompleta) 
		{
            System.out.println("Parabéns! Você adivinhou a palavra!");
            aux2++;
        }
        if(aux > 6) 
		{
            System.out.println("Você perdeu! A palavra era: " + palavraEscolhida);
            aux2++;
        }
        return aux2;
    }
	
    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
