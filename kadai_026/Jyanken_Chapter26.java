package kadai_026;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter26 {
    String[] jyanken = {"r", "s", "p"};
    Map<String, String> handMap = new HashMap<>();

    // コンストラクタで HashMap を初期化
    public Jyanken_Chapter26() {
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");
    }

    // ユーザーからの入力を取得するメソッド
    public String getMyChoice(Scanner scanner) {
        String myHand;
        while (true) {
            myHand = scanner.next();
            if (handMap.containsKey(myHand)) {
                break;
            } else {
                System.out.println("無効な入力です。再度、r（グー）、s（チョキ）、p（パー）のいずれかを入力してください:");
            }
        }
        return myHand;
    }

    // ランダムな手を生成するメソッド
    public String getRandom() {
        int index = (int) (Math.random() * jyanken.length);
        return jyanken[index];
    }

    // ゲームを実行するメソッド
    public void playGame(Scanner scanner) {
        System.out.println("自分のの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");
        
        String myHand = getMyChoice(scanner);
        String randomHand = getRandom();
        
        System.out.println("自分の手は" + handMap.get(myHand) + "," + "対戦相手の手は " + handMap.get(randomHand));
        
        if (myHand.equals(randomHand)) {
            System.out.println("引き分け");
        } else if ((myHand.equals("r") && randomHand.equals("s"))
                || (myHand.equals("s") && randomHand.equals("p"))
                || (myHand.equals("p") && randomHand.equals("r"))) {
            System.out.println("自分の勝ち");
        } else {
            System.out.println("負け");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jyanken_Chapter26 game = new Jyanken_Chapter26();
        game.playGame(scanner);
    }
}

