package kadai_026;

import java.util.Scanner;

public class Jyanken_Chapter26 {
    String[] jyanken = {"グー", "チョキ", "パー"};

    // ユーザーからの入力を取得するメソッド
    public String getMyChoice(Scanner scanner) {
        String myHand = scanner.next();
        return myHand;
    }

    // ランダムな手を生成するメソッド
    public String getRandom() {
        int index = (int) (Math.random() * jyanken.length);
        String randomHand = jyanken[index];
        return randomHand;
    }

    // ゲームを実行するメソッド
    public void playGame(Scanner scanner) {
        System.out.println("自分のの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");
        
        String myHand = getMyChoice(scanner);
        String randomHand = getRandom();
        
            if (myHand.equals("r")) {
                System.out.println("自分の手はグー,"+"対戦相手の手は " + randomHand);
            } else if (myHand.equals("s")) {
                System.out.println("自分の手はチョキ,"+"対戦相手の手は " + randomHand);
            } else if (myHand.equals("p")) {
                System.out.println("自分の手はパー,"+"対戦相手の手は " + randomHand);
            } else {
            	 System.out.println("無効な入力です。再度、r（グー）、s（チョキ）、p（パー）のいずれかを入力してください:");
            	 return;
            } 
            

        if (myHand.equals(randomHand)) {
            System.out.println("引き分け");
        } else if ((myHand.equals("r") && randomHand.equals("チョキ"))
                || (myHand.equals("s") && randomHand.equals("パー"))
                || (myHand.equals("p") && randomHand.equals("グー"))) {
            System.out.println("自分の勝ち");
        } else {
            System.out.println("負け");
        }
    }
}
