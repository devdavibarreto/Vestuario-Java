
public class Vestuario {

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
    }
}
