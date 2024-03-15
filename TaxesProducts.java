import java.util.Scanner;

public class TaxesProducts {
    double price;

    public double applyTaxes(double price) {
        return (price * 1.25 * 1.17);
    }
    public void calculateTax(){
        Scanner read = new Scanner(System.in);
        System.out.println("Ok. Qual o valor do produto?");
        price = read.nextDouble();
        System.out.println("O valor total com impostos é: ");
        TaxesProducts finalPrice = new TaxesProducts();
        System.out.println(finalPrice.applyTaxes(price));
    }
}
