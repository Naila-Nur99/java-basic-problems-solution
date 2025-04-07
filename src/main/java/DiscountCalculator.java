public class DiscountCalculator {
    public static void main(String[] args) {
        String paragraph = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";
        String[] numbers = paragraph.replaceAll("[^0-9]+", " ").trim().split(" ");
        int laptopPrice = Integer.parseInt(numbers[1]);
        int mousePrice = Integer.parseInt(numbers[2]);
        int discountPercent = Integer.parseInt(numbers[4]);
        int total = laptopPrice + mousePrice;
        double discount = total * discountPercent / 100.0;
        double finalPrice = total - discount;

        System.out.println("Total cost after 15% discount: " + finalPrice + " tk");
    }
}

