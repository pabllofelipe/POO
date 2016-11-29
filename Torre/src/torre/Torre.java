package torre;

import java.util.Scanner;

public class Torre {
    int n=0, O=0, D=0, T=0;
    public Torre(int n, int O, int D, int T){
        this.n=n;
        this.O=O;
        this.D=D;
        this.T=T;
    }
	// MÃ©todo que realiza (imprime) o movimento
	// de um disco entre dois pinos
	private static void mover(int O, int D) {
		System.out.println(O + " -> " + D);
	}

	// MÃ©todo que implementa a recursÃ£o
	// O = pino origem
	// D = pino destino
	// T = pino de trabalho
	static void hanoi(int n, int O, int D, int T) {
int c=0;
		if (n > 0) {
                    c=c+1;
			hanoi(n - 1, O, T, D);
			mover(O, D);
			hanoi(n - 1, T, D, O);
		}
	}

	// executando o hanoi
	public static void main(String[] args) {

		int n; // nÃºmero de discos

		// recebe o nÃºmero de discos digitado pelo usuÃ¡rio
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nÃºmero de discos: ");
		n = entrada.nextInt();

		// executa o hanoi!
		Torre.hanoi(n, 1, 3, 2);

	}
}