import java.util.Locale;
import java.util.Scanner;

public class User {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Vestuario comprador = new Vestuario();

        System.out.println("Qual tamanho da roupa que deseja escolher ? ");
        String TamSelecionado = scanner.next().toUpperCase();
        comprador.TamanhodoUser(TamSelecionado);

        scanner.close();
    }
}
