
package kadai_026;

import java.util.Scanner;

public class JyankenExec_Chapter26 {
    public static void main(String[] args) {
        Jyanken_Chapter26 jyankenGame = new Jyanken_Chapter26();
        Scanner scanner = new Scanner(System.in);

        // playGameメソッドを呼び出してゲームを実行する
        jyankenGame.playGame(scanner);

        // Scannerを閉じる
        scanner.close();
    }
}