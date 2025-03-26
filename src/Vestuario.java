import java.util.Locale;
import java.util.Scanner;

public class Vestuario {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    Estoque estoque = new Estoque();

    public void TamanhodoUser(String Tam) {
        SelecaoDeTamanho(Tam);
    }

    private void SelecaoDeTamanho(String Tamanho) {

        switch (Tamanho) {
            case "G": {
                for (int G = 0; G <= estoque.EstoqueTG().length; G++) {
                    System.out.println("O estoque de G é " + estoque.EstoqueTG()[G]);

                }

                System.out.println("Qual roupa deseja ?");
                String roupaSelecionada = scanner.next();

                roupaSelecionada(roupaSelecionada);
                break;
            }
            case "M": {
                for (int M = 0; M <= estoque.EstoqueTM().length; M++) {
                    System.out.println("O estoque de M é " + estoque.EstoqueTM()[M]);
                }

                break;
            }
            case "P": {
                for (int P = 0; P <= estoque.EstoqueTP().length; P++) {
                    System.out.println("O estoque para essa roupa é " + estoque.EstoqueTP()[P]);
                }

                break;
            }
            default: {
                System.out.println("Escolha entre P M G ");
                break;
            }

        }
        scanner.close();
    }

    private void roupaSelecionada(String roupa) {

        for (int G = 0; G < estoque.EstoqueTG().length; G++) {

            if (roupa.equals(estoque.EstoqueTG()[G])) {

                System.out.println("A roupa selecionada  é ? " + estoque.EstoqueTG()[G]);
            }
        }
    }

}
