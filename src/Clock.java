
public class Clock {

    public static void main(String[] args) {
        //各変数の宣言・初期化（任意の時間を入力）
        int hour = 18;
        int minute = 32;
        int second = 47;
        //getSecondsメソッドを呼び出し、処理結果をint型変数に代入
        int result = getSeconds(hour, minute, second);
        //演算結果を表示する
        System.out.println("経過秒数は" + result + "秒");
     }

    //int型変数3つを受け取るgetSecondsメソッドの定義（戻り値あり）
    public static int getSeconds(int hour, int minute, int second) {
      //int型変数passedSecondsを宣言し、経過秒数を代入
      int passedSeconds = hour*60*60 + minute*60 + second;
      return passedSeconds;
    }
}
