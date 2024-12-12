
public class Triangle {

    public static void main(String[] args) {
        int a = 8;
        int b = 4;
        int c = 5;

        if(a == b&&a == c&&b ==c) {
            System.out.println("正三角形です");
        }
        else if(a ==b||a ==c||b ==c) {
            System.out.println("二等辺三角形です");
        }
        else {
            System.out.println("不等辺三角形です");
        }
    }

}
