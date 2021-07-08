import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Prețul de bază: ");
        BigDecimal basePrice = scanner.nextBigDecimal();
        System.out.println("Procentul de T.V.A.: ");
        BigDecimal vatPercentage = scanner.nextBigDecimal();

        System.out.println("Prețul final este: " + calculatePrice(basePrice, vatPercentage));
    }

    public static BigDecimal calculatePrice(BigDecimal basePrice, BigDecimal vatPercent) {
        return basePrice.add(basePrice.multiply(vatPercent).divide(new BigDecimal(100), RoundingMode.HALF_EVEN));
    }
}
