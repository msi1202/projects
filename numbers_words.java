package gr11;
import java.util.*;
class numbers_words
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String ans="";
        String units_arr[]={"One", "Two", "Three", "Four", "Five", "Six", 
                "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
                "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", 
                "Eighteen", "Nineteen"};
        System.out.println("Enter number");
        int n=sc.nextInt();
        String temp=String.valueOf(n);
        temp=" "+temp;  
        boolean chk=false,chk2=false;
        for (int i=temp.length()-1;i>=0 && n>0 && n<100000;--i)
        {
            if (i==temp.length()-1)
            {   
                if (temp.charAt(i)=='0' && i==0)
                {
                    ans="Zero";
                    break;
                }
                if (temp.charAt(i)=='1' && temp.charAt(i-1)!='1')
                {
                    ans=units_arr[0]+ans;
                    chk=true;
                }
                else if (temp.charAt(i)=='2' && temp.charAt(i-1)!='1')
                {
                    ans=units_arr[1]+ans;
                    chk=true;
                }
                else if (temp.charAt(i)=='3' && temp.charAt(i-1)!='1')
                {
                    ans=units_arr[2]+ans;
                    chk=true;
                }
                else if (temp.charAt(i)=='4'  && temp.charAt(i-1)!='1')
                {
                    ans=units_arr[3]+ans;
                    chk=true;
                }
                else if (temp.charAt(i)=='5' && temp.charAt(i-1)!='1')
                {
                    ans=units_arr[4]+ans;
                    chk=true;
                }
                else if (temp.charAt(i)=='6' && temp.charAt(i-1)!='1')
                {
                    ans=units_arr[5]+ans;
                    chk=true;
                }
                else if (temp.charAt(i)=='7' && temp.charAt(i-1)!='1')
                {
                    ans=units_arr[6]+ans;
                    chk=true;
                }
                else if (temp.charAt(i)=='8' && temp.charAt(i-1)!='1')
                {
                    ans=units_arr[7]+ans;
                    chk=true;
                }
                else if (temp.charAt(i)=='9' && temp.charAt(i-1)!='1')
                {
                    ans=units_arr[8]+ans;
                    chk=true;
                }
                else if (temp.charAt(i)=='0' && temp.charAt(i-1)!='1')
                {
                    chk=true;
                }
            }
            else if(i==temp.length()-2)
            {
                if(temp.charAt(i)=='1' && chk==false)
                {
                    if (temp.charAt(i+1)=='0')
                        ans=units_arr[9]+ans;
                    else if (temp.charAt(i+1)=='1')
                        ans=units_arr[10]+ans;
                    else if (temp.charAt(i+1)=='2')
                        ans=units_arr[11]+ans;
                    else if (temp.charAt(i+1)=='3')
                        ans=units_arr[12]+ans;
                    else if (temp.charAt(i+1)=='4')
                        ans=units_arr[13]+ans;
                    else if (temp.charAt(i+1)=='5')
                        ans=units_arr[14]+ans;
                    else if (temp.charAt(i+1)=='6')
                        ans=units_arr[15]+ans;
                    else if (temp.charAt(i+1)=='7')
                        ans=units_arr[16]+ans;
                    else if (temp.charAt(i+1)=='8')
                        ans=units_arr[17]+ans;
                    else if (temp.charAt(i+1)=='9')
                        ans=units_arr[18]+ans;
                }
                else if(temp.charAt(i)=='2' && chk==true)
                {
                    ans="Twenty-"+ans;
                }
                else if(temp.charAt(i)=='3' && chk==true)
                {
                    ans="Thirty-"+ans;
                }
                else if(temp.charAt(i)=='4' && chk==true)
                {
                    ans="Forty-"+ans;
                }
                else if(temp.charAt(i)=='5' && chk==true)
                {
                    ans="Fifty-"+ans;
                }
                else if(temp.charAt(i)=='6' && chk==true)
                {
                    ans="Sixty-"+ans;
                }
                else if(temp.charAt(i)=='7' && chk==true)
                {
                    ans="Seventy-"+ans;
                }
                else if(temp.charAt(i)=='8' && chk==true)
                {
                    ans="Eighty-"+ans;
                }
                else if(temp.charAt(i)=='9' && chk==true)
                {
                    ans="Ninety-"+ans;
                }
            }
            else if(i==temp.length()-3)
            {
                if(temp.charAt(i)=='1')
                {
                    ans="One Hundred "+ans;
                }
                else if(temp.charAt(i)=='2')
                {
                    ans="Two Hundred "+ans;
                }
                else if(temp.charAt(i)=='3')
                {
                    ans="Three Hundred "+ans;
                }
                else if(temp.charAt(i)=='4')
                {
                    ans="Four Hundred "+ans;
                }
                else if(temp.charAt(i)=='5')
                {
                    ans="Five Hundred "+ans;
                }
                else if(temp.charAt(i)=='6')
                {
                    ans="Six Hundred "+ans;
                }
                else if(temp.charAt(i)=='7')
                {
                    ans="Seven Hundred "+ans;
                }
                else if(temp.charAt(i)=='8')
                {
                    ans="Eight Hundred "+ans;
                }
                else if(temp.charAt(i)=='9')
                {
                    ans="Nine Hundred "+ans;
                }
            }
            else if(i==temp.length()-4)
            {
                if(temp.charAt(i)=='1' && temp.charAt(i-1)!='1')
                {
                    ans="One Thousand "+ans;
                    chk2=true;
                }
                else if(temp.charAt(i)=='2' && temp.charAt(i-1)!='1')
                {
                    ans="Two Thousand "+ans;
                    chk2=true;
                }
                else if(temp.charAt(i)=='3' && temp.charAt(i-1)!='1')
                {
                    ans="Three Thousand "+ans;
                    chk2=true;
                }
                else if(temp.charAt(i)=='4' && temp.charAt(i-1)!='1')
                {
                    ans="Four Thousand "+ans;
                    chk2=true;
                }
                else if(temp.charAt(i)=='5' && temp.charAt(i-1)!='1')
                {
                    ans="Five Thousand "+ans;
                    chk2=true;
                }
                else if(temp.charAt(i)=='6' && temp.charAt(i-1)!='1')
                {
                    ans="Six Thousand "+ans;
                    chk2=true;
                }
                else if(temp.charAt(i)=='7' && temp.charAt(i-1)!='1')
                {
                    ans="Seven Thousand "+ans;
                    chk2=true;
                }
                else if(temp.charAt(i)=='8' && temp.charAt(i-1)!='1')
                {
                    ans="Eight Thousand "+ans;
                    chk2=true;
                }
                else if(temp.charAt(i)=='9' && temp.charAt(i-1)!='1')
                {
                    ans="Nine Thousand "+ans;
                    chk2=true;
                }
                else if (temp.charAt(i)=='0' && temp.charAt(i-1)!='1')
                {
                    ans="Thousand "+ans;
                    chk2=true;
                }
            }
            else if(i==temp.length()-5)
            {
                if(temp.charAt(i)=='1' && chk2==false)
                {
                    ans=" Thousand "+ans;
                    if (temp.charAt(i+1)=='0')
                        ans=units_arr[9]+ans;
                    else if (temp.charAt(i+1)=='1')
                        ans=units_arr[10]+ans;
                    else if (temp.charAt(i+1)=='2')
                        ans=units_arr[11]+ans;
                    else if (temp.charAt(i+1)=='3')
                        ans=units_arr[12]+ans;
                    else if (temp.charAt(i+1)=='4')
                        ans=units_arr[13]+ans;
                    else if (temp.charAt(i+1)=='5')
                        ans=units_arr[14]+ans;
                    else if (temp.charAt(i+1)=='6')
                        ans=units_arr[15]+ans;
                    else if (temp.charAt(i+1)=='7')
                        ans=units_arr[16]+ans;
                    else if (temp.charAt(i+1)=='8')
                        ans=units_arr[17]+ans;
                    else if (temp.charAt(i+1)=='9')
                        ans=units_arr[18]+ans; 
                }
                else if(temp.charAt(i)=='2' && chk2==true)
                {
                    ans="Twenty-"+ans;
                }
                else if(temp.charAt(i)=='3'&& chk2==true)
                {
                    ans="Thirty-"+ans;
                }
                else if(temp.charAt(i)=='4' && chk2==true)
                {
                    ans="Forty-"+ans;
                }
                else if(temp.charAt(i)=='5' && chk2==true)
                {
                    ans="Fifty-"+ans;
                }
                else if(temp.charAt(i)=='6' && chk2==true)
                {
                    ans="Sixty-"+ans;
                }
                else if(temp.charAt(i)=='7' && chk2==true)
                {
                    ans="Seventy-"+ans;
                }
                else if(temp.charAt(i)=='8' && chk2==true)
                {
                    ans="Eighty-"+ans;
                }
                else if(temp.charAt(i)=='9' && chk2==true)
                {
                    ans="Ninety-"+ans;
                }
            }
        }
        System.out.println(ans);
    }
}
