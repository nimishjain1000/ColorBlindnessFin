package lakshmisaraf.colorblindnessfin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by Lakshmi Saraf on 12/6/2016.
 */

public class CreateHashMap {

    private static final int MIN_NUM_ANAGRAMS = 5;
    private static final int DEFAULT_WORD_LENGTH = 3;
    private static final int MAX_WORD_LENGTH = 6;
    private Random random = new Random();
    private HashMap lettersToWord;
    private String key;
    private String result;
    String word;
    String end;

    public CreateHashMap(InputStream wordListStream) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(wordListStream));
        String line;
        lettersToWord = new HashMap();
        while((line = in.readLine()) != null) {
            word = line.trim();
            result = word.substring(0, word.indexOf(','));
            key=word.substring(word.indexOf(',')+1);
            if(!lettersToWord.containsKey(key)){
                lettersToWord.put(key,result);
            }
        }
    }

    public String returnColor(String key)
    {
        if (lettersToWord.containsKey(key)) {
            end = (String) lettersToWord.get(key);
            return end;
        }
        else
        return null;
    }
}
