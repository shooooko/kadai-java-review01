
public class Review01 {

    public static void main(String[] args) {
        int num1 = 1500;
        int result = num1 + tax(num1);
        System.out.println(num1 + "円の商品の税込価格は" + result + "円（消費税は" + tax(num1) + "円）です。");
    }

        public static int tax(int num1) {
            int num = num1 * 10 / 100;
            return num;
        }
}
