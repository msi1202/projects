package curtin_project;
import java.util.*;
public class dice
{
    public static int generate()
    {
        return (int)(Math.random()*10.0);   
        //the assumed range is 0 to 9(inclusive) 
        /*this functiongenerates a random
        between 0 and 9 since the Math.random() function generates numbers
        from 0.0 to 0.9(inclusive) and when multiplied with 10.0
        we will get whole numbers from 0 to 9
        Thus, it is not required to manually check if the number is within
        range.
         */
    }
    public static void image(int num)
    {
        if (num==0)
        {
            System.out.println("|  *****  |");
            System.out.println("|  *   *  |");
            System.out.println("|  *   *  |");
            System.out.println("|  *   *  |");
            System.out.println("|  *****  |");
        }
        else if (num==1)
        {
            System.out.println("|    *    |");
            System.out.println("|  * *    |");
            System.out.println("|    *    |");
            System.out.println("|    *    |");
            System.out.println("|  *****  |");
        }
        else if (num==2)
        {
            System.out.println("|  *****  |");
            System.out.println("|      *  |");
            System.out.println("|    *    |");
            System.out.println("|  *      |");
            System.out.println("|  *****  |");
        }
        else if (num==3)
        {
            System.out.println("|  *****  |");
            System.out.println("|      *  |");
            System.out.println("|  *****  |");
            System.out.println("|      *  |");
            System.out.println("|  *****  |");
        }
        else if (num==4)
        {
            System.out.println("|  *  *   |");
            System.out.println("|  *  *   |");
            System.out.println("|  *****  |");
            System.out.println("|     *   |");
            System.out.println("|     *   |");
        }
        else if (num==5)
        {
            System.out.println("|  *****  |");
            System.out.println("|  *      |");
            System.out.println("|  *****  |");
            System.out.println("|      *  |");
            System.out.println("|  *****  |");
        }
        else if (num==6)
        {
            System.out.println("|  *****  |");
            System.out.println("|  *      |");
            System.out.println("|  *****  |");
            System.out.println("|  *   *  |");
            System.out.println("|  *****  |");
        }
        else if (num==7)
        {
            System.out.println("|  *****  |");
            System.out.println("|     *   |");
            System.out.println("|    *    |");
            System.out.println("|   *     |");
            System.out.println("|         |");
        }
        else if (num==8)
        {
            System.out.println("|  *****  |");
            System.out.println("|  *   *  |");
            System.out.println("|  *****  |");
            System.out.println("|  *   *  |");
            System.out.println("|  *****  |");
        }
        else if (num==9)
        {
            System.out.println("|  *****  |");
            System.out.println("|  *   *  |");
            System.out.println("|  *****  |");
            System.out.println("|      *  |");
            System.out.println("|  *****  |");
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String choice="";
        int number=0;
        System.out.println("====================================");
        System.out.println("\tDice-Rolling Simulator");
        System.out.println("====================================");
        do
        {
            number=generate();
            System.out.println("Number Generated: "+number);
            image(number);
            System.out.println("Do you wish to continue(Enter yes/no)");
            choice=sc.nextLine().trim().toLowerCase();
        }
        while(choice.equals("yes"));
    }
}