public class Runner
{
    public static void main(String[] args)
    {
        String[] test1 = {"Hey", "this", "is", "pretty"};
        WordPairList test1List = new WordPairList(test1);
        System.out.println(test1List);

        System.out.println("Matches: " + test1List.numMatches());

        String[] test2 = {"Hey", "this", "is", "not", "this"};
        WordPairList test2List = new WordPairList(test2);
        System.out.println(test2List);

        System.out.println("Matches: " + test2List.numMatches());

        String[] test3 = {"Hey", "You-", "Hey", "listen", "Hey"};
        WordPairList test3List = new WordPairList(test3);
        System.out.println(test3List);

        System.out.println("Matches: " + test3List.numMatches());
    }
}
