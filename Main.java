import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int type;

        System.out.println("Seu imposto é sobre produtos ou serviços?");
        System.out.println("Digite 1 para produtos ou 2 para serviços");
        Scanner read = new Scanner(System.in);
        type = read.nextInt();
        if (type == 1){
            TaxesProducts x = new TaxesProducts();
            x.calculateTax();
        }
        if (type == 2){
            TaxesServices y = new TaxesServices();
            y.calculateTax();


        }
    }
}