import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        final String NOME = "Mamão com açucar";

        System.out.println("Digite um valor: ");
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();
        double valorParcelas = valor / 5;

        System.out.println("Loja: " + NOME);
        System.out.println("Valor: " + valor);
        System.out.println("Parcelas: " + valorParcelas);

    }
}