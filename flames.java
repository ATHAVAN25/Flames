import java.util.*;

public class flames
{
    public static void main(String[] args)
    {
        int count=0, total=0, temTot=0;
        Scanner sc = new Scanner(System.in);

        // Get two names from user:

        System.out.print("Enter a Boy Name : ");
        String boy = sc.nextLine();

        System.out.print("Enter a Girl Name : ");
        String girl = sc.nextLine();

        boy = boy.toLowerCase();
        girl = girl.toLowerCase();

        // Finding  length of two names
 
        int boyLen = boy.length();
        int girlLen = girl.length();

        StringBuilder boyString = new StringBuilder(boy);
        StringBuilder girlString = new StringBuilder(girl);

        char ch = ' ';
        char finall;
        char f = ' ';

        temTot = boyLen+girlLen;

        for(int i=0; i<boyLen; i++)
        {
            for(int j=0; j<girlLen; j++)
            {
                if(boyString.charAt(i) == girlString.charAt(j))
                {
                   boyString.setCharAt(i, ch);
                   girlString.setCharAt(j, ch);
                }
            }
        }

        String totString = (boyString.append(girlString)).toString();
        int totlen = totString.length();

        // calculate the final length

        for(int i=0; i<totlen; i++)
        {
            if(totString.charAt(i)>96)
            {
                count++;
            }
        }
        
        //System.out.println(count);


        /****************************************************************************************************************************
         * **********************************************************************************************************************/
         // Now calculation


         int len = count, c=1;
         String flam = new String("flames");
         
         String big = flam;

         int bigTotlen = boyLen*girlLen;

         while(c < bigTotlen)
         {
            big = big.concat(flam);
            c++;
         }
         
         String tempString = big;

        int counter=1;

        // finding letter from FLAMES

         while(counter<6)
         {
            for(int i=0; i<len; i++)
            {
                if(i==(len-1))
                {
                    char change = big.charAt(i);
                    tempString = big.substring(i+1, big.length());
                    tempString = tempString.replace(change, f);
                    tempString = tempString.replaceAll(" ", "");    
                }
            }
           
            big = tempString;
            counter++;
            
        }

        System.out.println();
        // Printing final output

        finall = tempString.charAt(0);
        if(finall == 'f')
        {
            System.out.print("FRIENDS");
        }
        else if(finall == 'l')
        {
            System.out.print("LOVE");
        }   
        else if(finall == 'a')
        {
            System.out.print("AFFECTION");
        }
        else if(finall == 'm')
        {
            System.out.print("MARRIAGE");
        }
        else if(finall == 'e')
        {
            System.out.print("ENEMY");
        }
        else if(finall == 's')
        {
            System.out.print("SISTER");
        }
    }
}