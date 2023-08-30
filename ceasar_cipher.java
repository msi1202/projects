package gr12;
import java.util.*;
class ceasar_cipher
{
    public static void main() 
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter text that has to be encoded");
        String input=sc.nextLine();
        if (input.length()>3 && input.length()<100)
        {
            StringTokenizer st=new StringTokenizer(input);
            int words=st.countTokens();
            String output="";
            for (int i=0;i<words;++i)
            {
                String temp1=st.nextToken();
                String special_char="";
                for (int j=temp1.length()-1;j>=0;--j)
                {
                    char ch=temp1.charAt(j);
                    if (Character.isLetter(ch)==false && Character.isDigit(ch)==false)
                    {
                        special_char+=ch; 
                        continue;
                    }
                    if (ch>=65 && ch<=90)
                    {
                        ch+=13;
                        if (ch>90)
                        ch=(char)((ch-90)+65-1);                        
                    }
                    else if(ch>=90 && ch<=122)
                    {
                        ch+=13;
                        if (ch>122)
                        ch=(char)((ch-122)+97-1);
                    }
                    output+=ch;
                    if (j==0)
                    output+=special_char;
                }
                output+=" ";
            }
            System.out.println("The cipher text is:-");
            System.out.println(output.trim());
        }
        else
            System.out.println("INVALID LENGTH");
    }
}