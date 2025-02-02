package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	public void dicList(String[] searchWord) {	
		
	HashMap<String,String> dictionary = new HashMap<String,String>();
	    dictionary.put("apple", "りんご") ;
		dictionary.put("peach", "桃") ;
		dictionary.put("banana", "バナナ") ;
		dictionary.put("lemon", "レモン") ;
		dictionary.put("pear", "梨") ;
		dictionary.put("kiwi", "キウイ") ;
		dictionary.put("strawberry", "いちご") ;
		dictionary.put("grape", "ぶどう") ;
		dictionary.put("muscat", "マスカット") ;
		dictionary.put("cherry", "さくらんぼ") ;
		
		
       for (String word : searchWord) {
    	   if (dictionary.containsKey(word)) {
    	 //辞書の中にある時は
			System.out.println(word+"の意味は"+dictionary.get(word));
    	   }
    	   else {
    		 //辞書の中にない場合は
   			System.out.println(word+"は辞書に存在しません");
			
	        }
		}
	}
	
}
