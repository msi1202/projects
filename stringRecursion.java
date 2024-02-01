package gr11;
class stringRecursion
{
    public static int countVowel(String s)
    {
        s=s.toLowerCase();
        if (s.length()==0)
            return 0;

        if (s.charAt(0)=='a' || s.charAt(0)=='e' || s.charAt(0)=='i' ||
        s.charAt(0)=='o' || s.charAt(0)=='u')
        {
            return 1+countVowel(s.substring(1));
        }
        else
            return countVowel(s.substring(1));
    }

    public static int countWord(String s)
    {
        s=s.toLowerCase().trim();
        if (s.length()==1)
            return 1;

        if ((Character.isLetter(s.charAt(0)) || s.charAt(0)=='!'||s.charAt(0)=='.'||s.charAt(0)=='?') && Character.isWhitespace(s.charAt(1)))
        {
            return 1+countWord(s.substring(1));
        }
        else 
            return countWord(s.substring(1));
    }

    public static int countSentence(String s)
    {
        s=s.toLowerCase();
        if (s.length()==0)
            return 0;

        if (s.charAt(0)=='?' || s.charAt(0)=='.' || s.charAt(0)=='!')
        {
            return 1+countSentence(s.substring(1));
        }
        else
            return countSentence(s.substring(1));   
    }

    public static boolean palin(String s,int strt, int end)
    {
        if (strt==end)
            return true;
        if (s.charAt(strt)==s.charAt(end))
        {
            palin(s,++strt,--end);
            return true;
        }
        else
            return false;
    }

    public static void revwrd(String s)
    {
        if (s.length()==0)
            System.exit(0);
        System.out.print(s.charAt(s.length()-1));
        revwrd(s.substring(0,s.length()-1));
    }

    public static String revwrd_1(String s)
    {
        if (s.length()==0)
            return "";
        return s.charAt(s.length()-1)+revwrd_1(s.substring(0,s.length()-1));
    }

    public static void pattern1(String s)
    {
        System.out.println(s);
        if (s.length()==1)
            System.exit(0);
        pattern1(s.substring(1));
    }

    public static void pattern2(String s)
    {
        System.out.println(s.charAt(0));
        if (s.length()==1)
            System.exit(0);
        pattern2(s.substring(1));
    }

    public static void pattern3(String s)
    {
        if (s.length()==1)
            System.out.println(s);
        else
        {
            pattern3(s.substring(1));
            System.out.println(s.substring(0,s.length()));
        }
    }

    public static void pattern4(String s)
    {
        if (s.length()==1)
            System.out.println(s);
        else
        {
            pattern4(s.substring(0,s.length()-1));
            System.out.println(s);
        }
    }
}