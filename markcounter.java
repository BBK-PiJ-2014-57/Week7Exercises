/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhilenotunderstood;
import java.util.Scanner;


/**
 *
 * @author lewispalmer
 */
public class markcounter {
    public static int marks = 0;
    public static int distinctions = 0;
    public static int passes = 0;
    public static int failure = 0;
    public static int invalid = 0;
    
    public void inputMarks()
    {
        String input;
        int mark;
        Scanner rdr = new Scanner(System.in);
        System.out.println("Please start entering marks to be counted"
                + ". Finish with a -1");
        do
        {
            
            mark = rdr.nextInt();
            ProcessMark(mark);
            marks++;
            
        }while(mark != -1);
        System.out.println("Marks: "+ (marks -1));
        System.out.println("Distinctions: " + distinctions);
        System.out.println("Passes: " + passes);
        System.out.println("Failures: " + failure);
        System.out.println("Invalides: " + (invalid -1));
    }
    
    public void ProcessMark(int mrk)
    {
        if(mrk>100)
        {
            invalid++;
        }
        else if(mrk>69)
        {
            distinctions++;
        }
        else if(mrk>49)
        {
            passes++;
        }
        else if(mrk>-1)
        {
            failure++;
        }
        else
        {
            invalid++;
        }
    }
}
