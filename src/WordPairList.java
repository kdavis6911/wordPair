import java.util.ArrayList;

public class WordPairList
{
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words)
    {
        allPairs = new ArrayList <WordPair>();
        for(int i = 0;i<words.length-1;i++)
        {
            for(int j = i+1;j<words.length;j++)
            {
                allPairs.add(new WordPair(words[i],words[j]));
            }
        }
    }

    public int numMatches()
    {
        int count = 0;

        for(WordPair pair: allPairs)
        {
            if(pair.getFirst().equals(pair.getSecond()))
            {
                count++;
            }
        }

        return count;
    }
    public String toString()
    {
        String out = "";
        for(int i = 0; i < allPairs.size(); i++)
        {
            out += "{" + allPairs.get(i).getFirst() + "," + allPairs.get(i).getSecond() + "}\n";
        }
        return out;
    }
}