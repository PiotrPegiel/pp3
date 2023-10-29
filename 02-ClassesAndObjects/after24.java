public class after24 {
    public static void main(String[] args) {
        float buy_price = 4.5940f;
        float sell_price = 4.6250f;
        float spread = sell_price - buy_price;

        System.out.printf("""
                Bank buys EUR: %.4f
                Bank sells EUR: %.4f
                Spread: %.4f
                """,buy_price,sell_price, spread);
    }
}
