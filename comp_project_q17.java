/*
  Write a program to create a quiz on any topic.
  The system should choose 5 random questions from a question bank 
  of 20 questions and display them one at a time.  
  The options for the multiple choice can also be displayed.
  For a correct choice, 4 points can be given 
  and for an incorrect choice, 1 point can be deducted. 

Hint.: The questions and the corresponding answers must 
be stored in two String arrays. 

17. Create a Quiz with more features 

Create the above quiz with more features.  

The following help lines (only one of them at a time) can be provided 
in case the user chooses to have additional support. 

Double chance: The user is given another chance, 
in case the wrong choice is made. 

Probable answers:  Two most probable options are displayed. 

The above help lines should be made available only once. 
 */
import java.util.*;
class comp_project_q17
{
    public static void drawline1()
    {
        for (int i =0;i<80;++i)//7
        {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static boolean p(String u_list[],String p_list[],String username,String password)
    {
        boolean chk_pass=false;
        for (int i=0;i<=2;++i)
        {
            if (username.equals(u_list[i])==true && password.equals(p_list[i])==true)
            {
                chk_pass=true;
                break;
            }
            else 
            {
                System.out.println("Incorrect username or password");
                System.exit(0);
            }
        }
        return chk_pass;
    }

    public static void questions(String q_bank[],int r[],String q[])
    {

        for(int i = 0;i<5;i++)
        {
            q[i] = "Question " + (i+1) + ":" + q_bank[r[i]];
        }
        // q1="Question 1: " + q_bank[r[0]];
        // q2="Question 2: " + q_bank[r[1]];
        // q3="Question 3: " + q_bank[r[2]];
        // q4="Question 4: " + q_bank[r[3]];
        // q5="Question 5: " + q_bank[r[4]];

    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String u_list[]={"sameer12","romit34","varun56"};
        String p_list[]={"abcdefg","hijklmn","opqrstu"};
        String no_exit;
        String q_bank[]={"What is the first letter of the english alphabet? Options: a)a  b)b  c)c  d)d",
                "What is the capital city of India? Options: a)Goa  b)Hyderabad  c)New Delhi  d)Mumbai",
                "Which country is the largest country in the world? Options: a)USA  b)Russia  c)China  d)Canada",
                "Who is the president of UAE? Options: a)Sheikh Mohammed Bin Rashid  b)Sheikh Mohammed bin Zayed  c)Sheikh Khalifa Bin Zayed  d)Donald Trump ",
                "How many emirates does UAE have? Options: a)1  b)6  c)7  d)8",
                "What  is the name of the tallest building in the world? Options: a)Emirates Towers  b)Burj Khalifa  c)Empire State Building  d)One World Trade Centre",
                "How many continents are located on earth? Options: a)5  b)7  c)8  d)6",
                "how many countries are their in the world? Options: a)200  b)194  c)196  d)150",
                "Which ocean is the  largest ocean? Options: a)Pacific Ocean  b)Atlantic ocean  c)Arabian Sea  d)Bay of Bengal",
                "What is the capital city of USA? Options: a)San Francisco  b)Washington D.C.  c)Texas  d)Seattle",
                "Name the school that Harry Potter attended?  Options: a)Hogwarts  b)Bogwarts  c)Logwarts  d)Dogwarts",
                "1+1=? Options: a)5  b)4  c)2  d)11",
                "What number comes right after 10? Options: a)9  b)11  c)12  d)13",
                "What is the last letter of the english alphabet? Options: a)x  b)y  c)z  d)f",
                "Who is the Prime Minister of India? Options: a)Narendra Modi  b)Hillary Clinton  c)Ivanka Trump  d)The Queen",
                "Which of these countries is not in Europe? Options: a)France  b)UK  c)Poland  d)Saudi Arabia",
                "Who was the first human ancestors to use fire? Options: a)Homo sapiens  b)Homo erectus  c)Neanderthal  d)Homo habilis",
                "Who was the first human to step on the Moon? Options: a)Buzz Aldrin  b)Neil Armstrong  c)Sultan bin Saud  d)Kalpana Chawla",
                "(2+2)*0=? Options: a)6  b)0  c)3  d)4",
                "10x10=? Options: a)1000  b)1  c)100  d)345"};
        String user_answer1,user_answer2,user_answer3,user_answer4,user_answer5;
        String ans[]={"A","C","B","C","C","B","B","C","A","B","A","C","B","C","A","D","B","B","B","C"};
        String pa_list[]={"a & b","c & d","b & c","c & b","b & c","b & c","b & d","b & c","a & b","a & b","a & c","b & c","b & c","b & c","a & d","c & d","b & d","a & b","b & d","a & c"};

        System.out.println("Enter username");
        String username=sc.next();
        System.out.println("Enter password");
        String password=sc.next();
        boolean chk_pass=false;
        chk_pass=p(u_list,p_list,username,password);

        while (chk_pass==true)
        {
            do
            {

                int points=0;
                boolean b1=false,b2=false,b3=false,b4=false,b5=false;
                int pa_count=0,dc_count=0;
                System.out.println("Do you wish to play a quiz? Answer saying yes or no");
                no_exit=sc.next().toUpperCase().trim();
                if (no_exit.equals("YES"))
                {

                    drawline1();
                    System.out.println("                          THE WEEKLY QUIZ");
                    drawline1();
                    System.out.println("RULES TO BE FOLLOWED THROUGHOUT THE QUIZ:-");
                    System.out.println("You have to answer by entering the letter of the option you have chosen");
                    System.out.println("4 points for a correct answer and 1 point will be deducted if the answer is incorrect");
                    System.out.println("If you require help, you can choose between two help options");
                    System.out.println("The options can be used only once");
                    System.out.println("Once you have used a help option, you cannot use either of them again");
                    System.out.println("If you wish to use a help option");
                    System.out.println("Enter P for 'probable answers' ");
                    System.out.println("There is another help option  which is available which is called as 'double chance'");
                    System.out.println("This option will can be availed only once throughout the quiz.It can be used when you have entered a wrong answer");
                    System.out.println("If you get an answer incorrect on your first try");
                    System.out.println("Lets's Begin!");
                    int c1= 0,c2 = 0;
                    int r[] = new int [5];
                    while(true)
                    {
                        for(int i = 0;i<5;++i)
                        {
                            r[i]=(int)(20.0 *Math.random());
                            for(int j = 0;j<c1;++j)
                            {
                                if(j == i)
                                    continue;
                                if(r[j]==r[i]) // This checks if the question numbers are same or not
                                    c2++;
                            }
                            c1++;
                        }
                        if(c2 == 0)
                            break;
                    }
                    String q[] = new String [5];
                    questions(q_bank,r,q);
                    System.out.println(q[0]);
                    user_answer1=sc.next().toUpperCase();

                    while (b1==false)
                    {
                        user_answer1=user_answer1.substring(0,1); /*This line of code extracts the letter entered by the user
                        ignoring the rest of the string which may contain special 
                        characters such as ),.,_,-*/
                        if (user_answer1.equals(ans[r[0]]))
                        {
                            System.out.println("That's correct");
                            points+=4;
                            b1=true;
                        }

                        else if (user_answer1.equals("P"))
                        {
                            if (pa_count==0)
                            {
                                System.out.println("The TWO MOST probable answers are: " + pa_list[r[0]]);

                                ++pa_count;
                                user_answer1=sc.next().toUpperCase();
                            }
                            else
                            {
                                System.out.println("Sorry,This lifeline cannot be used again");
                                user_answer1=sc.next().toUpperCase();
                            }
                        }
                        else{
                            System.out.println("Sorry, that's incorrect");
                            if (dc_count==0)
                            {
                                if (dc_count==0){
                                    System.out.println("Do you wish to use Double Chance?(Enter yes or no)");
                                    user_answer1=sc.next().toUpperCase();
                                    if (user_answer1.equals("YES")){
                                        System.out.println("You get one more chance");
                                        user_answer1=sc.next().toUpperCase();
                                        ++dc_count;

                                        if (user_answer1.equals(ans[r[0]])){
                                            points+=4;
                                            System.out.println("That's correct");
                                            b1=true;
                                            break;}
                                        else
                                        {
                                            System.out.println("Sorry, that's incorrect");
                                        }

                                    }
                                }
                                else
                                {
                                    System.out.println("Sorry,This lifeline cannot be used again");
                                    user_answer1=sc.next().toUpperCase();
                                    break;
                                }
                            }
                            points-=1;
                            b1=true;
                        }

                    }
                    System.out.println(q[1]);
                    user_answer2=sc.next().toUpperCase();
                    while (b2==false)
                    {
                        user_answer2=user_answer2.substring(0,1); /*This line of code extracts the letter entered by the user
                        ignoring the rest of the string which may contain special 
                        characters such as ),.,_,-*/
                        if (user_answer2.equals(ans[r[1]])){
                            points+=4;
                            System.out.println("That's correct");
                            b2=true;}

                        else if (user_answer2.equals("P")){
                            if (pa_count==0){
                                System.out.println("The TWO MOST probable answers are: " + pa_list[r[1]]);

                                ++pa_count;
                                user_answer2=sc.next().toUpperCase();}
                            else
                            {
                                System.out.println("Sorry,This lifeline cannot be used again");
                                user_answer2=sc.next().toUpperCase();
                            }
                        }

                        else{
                            System.out.println("Sorry, that's incorrect");
                            if (dc_count==0)
                            {
                                if (dc_count==0){
                                    System.out.println("Do you wish to use Double Chance(Enter yes or no)");
                                    user_answer2=sc.next().toUpperCase();
                                    if (user_answer2.equals("YES")){
                                        System.out.println("You get one more chance");
                                        user_answer2=sc.next().toUpperCase();
                                        ++dc_count;

                                        if (user_answer2.equals(ans[r[1]])){
                                            points+=4;
                                            System.out.println("That's correct");
                                            b2=true;
                                            break;}
                                        else
                                        {
                                            System.out.println("Sorry, that's incorrect");
                                        }

                                    }
                                }
                                else
                                {
                                    System.out.println("Sorry,This lifeline cannot be used again");
                                    user_answer2=sc.next().toUpperCase();
                                    break;
                                }
                            }
                            points-=1;
                            b2=true;
                        }
                    }
                    System.out.println(q[2]);
                    user_answer3=sc.next().toUpperCase();
                    while (b3==false)
                    {
                        user_answer3=user_answer3.substring(0,1); /*This line of code extracts the letter entered by the user
                        ignoring the rest of the string which may contain special 
                        characters such as ),.,_,-*/
                        if (user_answer3.equals(ans[r[2]])){
                            points+=4;
                            System.out.println("That's correct");
                            b3=true;}

                        else if (user_answer3.equals("P")){
                            if (pa_count==0){
                                System.out.println("The TWO MOST probable answers are: " + pa_list[r[2]]);

                                ++pa_count;
                                user_answer3=sc.next().toUpperCase();}
                            else
                            {
                                System.out.println("Sorry,This lifeline cannot be used again");
                                user_answer3=sc.next().toUpperCase();
                            }
                        }

                        else{
                            System.out.println("Sorry, that's incorrect");
                            if (dc_count==0)
                            {
                                if (dc_count==0){
                                    System.out.println("Do you wish to use Double Chance(Enter yes or no)");
                                    user_answer3=sc.next().toUpperCase();
                                    if (user_answer3.equals("YES")){
                                        System.out.println("You get one more chance");
                                        user_answer3=sc.next().toUpperCase();
                                        ++dc_count;
                                        if (user_answer3.equals(ans[r[2]])){
                                            points+=4;
                                            System.out.println("That's correct");
                                            b3=true;
                                            break;}
                                        else
                                        {
                                            System.out.println("Sorry, that's incorrect");
                                        }

                                    }
                                }
                                else
                                {
                                    System.out.println("Sorry,This lifeline cannot be used again");
                                    user_answer3=sc.next().toUpperCase();
                                    break;
                                }
                            }
                            points-=1;
                            b3=true;
                        }
                    }
                    System.out.println(q[3]);
                    user_answer4=sc.next().toUpperCase();
                    while (b4==false)
                    {
                        user_answer4=user_answer4.substring(0,1); /*This line of code extracts the letter entered by the user
                        ignoring the rest of the string which may contain special 
                        characters such as ),.,_,-*/
                        if (user_answer4.equals(ans[r[3]])){
                            points+=4;
                            System.out.println("That's correct");
                            b4=true;}

                        else if (user_answer4.equals("P")){
                            if (pa_count==0){
                                System.out.println("The TWO MOST probable answers are: " + pa_list[r[3]]);

                                ++pa_count;
                                user_answer4=sc.next().toUpperCase();}
                            else
                            {
                                System.out.println("Sorry,This lifeline cannot be used again");
                                user_answer4=sc.next().toUpperCase();
                                break;
                            }
                        }

                        else{
                            System.out.println("Sorry, that's incorrect");
                            while(dc_count==0)
                            {
                                if (dc_count==0){
                                    System.out.println("Do you wish to use Double Chance(Enter yes or no)");
                                    user_answer4=sc.next().toUpperCase();
                                    if (user_answer4.equals("YES")){
                                        System.out.println("You get one more chance");
                                        user_answer4=sc.next().toUpperCase();
                                        ++dc_count;

                                        if (user_answer4.equals(ans[r[3]])){
                                            points+=4;
                                            System.out.println("That's correct");
                                            b4=true;
                                            break;}
                                        else
                                        {
                                            System.out.println("Sorry, that's incorrect");
                                        }

                                    }

                                }
                                else
                                {
                                    System.out.println("Sorry,This lifeline cannot be used again");
                                    user_answer4=sc.next().toUpperCase();
                                }
                            }
                            points-=1;
                            b4=true;
                        }
                    }
                    System.out.println(q[4]);
                    user_answer5=sc.next().toUpperCase();
                    while (b5==false)
                    {
                        user_answer5=user_answer5.substring(0,1); /*This line of code extracts the letter entered by the user
                        ignoring the rest of the string which may contain special 
                        characters such as ),.,_,-*/
                        if (user_answer5.equals(ans[r[4]])){
                            points+=4;
                            System.out.println("That's correct");
                            b5=true;}

                        else if (user_answer5.equals("P")){
                            if (pa_count==0){
                                System.out.println("The TWO MOST probable answers are: " + pa_list[r[4]]);

                                ++pa_count;
                                user_answer5=sc.next().toUpperCase();}
                            else
                            {
                                System.out.println("Sorry,This lifeline cannot be used again");
                                user_answer5=sc.next().toUpperCase();
                                break;
                            }
                        }

                        else{
                            System.out.println("Sorry, that's incorrect");
                            while(dc_count==0)
                            {
                                if (dc_count==0){
                                    System.out.println("Do you wish to use Double Chance(Enter yes or no)");
                                    user_answer5=sc.next().toUpperCase();
                                    if (user_answer5.equals("YES")){
                                        System.out.println("You get one more chance");
                                        user_answer5=sc.next().toUpperCase();
                                        ++dc_count;

                                        if (user_answer5.equals(ans[r[4]])){
                                            points+=4;
                                            System.out.println("That's correct");
                                            b5=true;
                                            break;}
                                        else
                                        {
                                            System.out.println("Sorry, that's incorrect");
                                        }

                                    }

                                }
                                else
                                {
                                    System.out.println("Sorry,This lifeline cannot be used again");
                                    user_answer5=sc.next().toUpperCase();
                                }
                            }
                            points-=1;
                            b5=true;
                        }
                    }
                    drawline1();
                    System.out.println("Your final score is: " + points);

                }
                else
                    chk_pass=false;
            }
            while(no_exit.equals("YES"));
        }
    }

}
/*VARIABLE DESCRIPTION TABLE:
 * NAME          DATA TYPE PURPOSE
 * u_list[]      String    An array to store the usernames
 * p_list[]      String    An array to store the passwords
 * no_exit       String    To check whether the user wants to play the quiz or not
 * q_bank[]      String    To store the 20 questions
 * user_answer1  String    To accept the input of the user after displaying question 1
 * user_answer2  String    To accept the input of the user after displaying question 2
 * user_answer3  String    To accept the input of the user after displaying question 3
 * user_answer4  String    To accept the input of the user after displaying question 4
 * user_answer5  String    To accept the input of the user after displaying question 5
 * ans[]         String    To store the naswers of the 20 questions
 * pa_list       String    To store the probable answers of the 20 questions
 * username      String    To accept and store the username entered by the user
 * password      String    To accept and store the password entered by the user
 * chk_pass      boolean   To check whether username and password is valid or not
 * points        int       To store the points earned by the ussr
 * b1            boolean   To check if the output of the result of question 1 is given 
 * b2            boolean   To check if the output of the result of question 2 is given 
 * b3            boolean   To check if the output of the result of question 3 is given 
 * b4            boolean   To check if the output of the result of question 4 is given
 * b5            boolean   To check if the output of the result of question 5 is given
 * pa_count      int       To check whether 'Probable Answers' has already been used before
 * dc_count      int       To check whether 'Double Chance' has already been used beforequeet9o
 * c1            int       Serves as the upper limoit for the inner loop that checks whether the question numbers are the same 
 * c2            int       To check whether the questions are dme or not
 * r[]           int       TO store the index 
 * q[]           String    To store 5 random questions
 * i             int       To store the index number
 * p()           boolean   A function to check whether the username and passwords match with the corresponding ones in u_list & p_list;
 * questions()   String    A function to choose 5 random questions and store them in an array
 * drawline1()   void      A function to diplay a line that consists of asteriks
 */

