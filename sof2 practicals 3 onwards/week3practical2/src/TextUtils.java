import java.util.ArrayList;

public class TextUtils {

    public static String[] split(String text) {
        ArrayList<String> tokens = new ArrayList<String>();
        String word = "";
        for(int i = 0; i < text.length(); i ++){
            if (text.charAt(i) == ' '){
                if(!word.isEmpty()){
                    tokens.add(word);
                    word = "";
                }
            } else{
                word += text.charAt(i);
            }
        }if (!word.isEmpty()){
            tokens.add(word);
        }
        String[] output = new String[tokens.size()];
        output = tokens.toArray(output);
        return output;
    }

    public static void main(String[] args) {
        String text = "Hello my name is Poppo.";
        String[] words = TextUtils.split(text);
        for (String word: words){
            System.out.println(word);
        }
    }
    
}
