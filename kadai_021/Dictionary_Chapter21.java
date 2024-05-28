package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

    public static void dictionary(String fruits1, String fruits2, String fruits3, String fruits4) {
        HashMap<String,String> dictionaryMap = new HashMap<String,String>();
        // ハッシュマップに単語とその意味を追加
        dictionaryMap.put("apple","りんご");
        dictionaryMap.put("peach","桃");
        dictionaryMap.put("banana","バナナ");
        dictionaryMap.put("lemon","レモン");
        dictionaryMap.put("pear","梨");
        dictionaryMap.put("kiwi","キウィ");
        dictionaryMap.put("strawberry","イチゴ");
        dictionaryMap.put("grape","ぶどう");
        dictionaryMap.put("muscat","マスカット");
        dictionaryMap.put("cherry","さくらんぼ");
        
        String[] test = {fruits1, fruits2, fruits3, fruits4};
        String test2 = "";
        
        for(int i = 0; i < test.length; i++) {
            
            for (int j = 0; j < dictionaryMap.size(); j++) {
                
               String key = (String) dictionaryMap.keySet().toArray()[j];
               String value = dictionaryMap.get(key);
               
               if(!test[i].equals(key)) {
                    test2 = test[i];

               }else{
                  System.out.println(key +"の意味は"+value);
                  test2 = "";
                   break;
               }
                   
                  
            }
            if(test2.length() > 0) {
                System.out.println(test2 +"は辞書に存在しません");
            }
            
       }
    }
}




