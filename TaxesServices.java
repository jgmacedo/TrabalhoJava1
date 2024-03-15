import java.util.Scanner;

public class TaxesServices {
    double price;

    public double applyTaxes(double price) {
        return (price * 1.046 * 1.17);
    }
    public void calculateTax(){
        Scanner read = new Scanner(System.in);
        System.out.println("Ok. Qual o valor do serviço?");
        price = read.nextDouble();
        System.out.println("O valor total com impostos é: ");
        TaxesServices finalPrice = new TaxesServices();
        System.out.println(finalPrice.applyTaxes(price));
    }
}
