import java.lang.ProcessBuilder.Redirect.Type;
import java.util.jar.Attributes.Name;

import javax.net.ssl.SSLSessionBindingListener;

import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args)


    {

        ArrayList<Song> songlist = new ArrayList<Song>();
        System.out.println("Dime's CW1 submission");

        Song whatIveDone = new Song("What I've done", "Linkin Park", 44512512);

        whatIveDone.print();
        
        Song soul = new Song ("Sell Your Soul", "Hollywood Undead", 125152);

        soul.print();
        

        Song both = new Song ("Both", "Headie One", 142345);

         both.print();

       Song streatham = new Song ( "Streatham", "Dave", 13456);

         streatham.print();

         Song funkyfriday = new Song ("Funky Friday","Fredo", 23455);

         funkyfriday.print();

         Song gutenTag = new Song ("Guten Tag","Hardy Caprio,DigDat", 134124);

         gutenTag.print();

         Song Waiting = new Song ("Waiting","Skrapz,B Anca",15336); 

         Waiting.print();

         Song ProfessorX = new Song ("Professor X", "Dave",15336);
         
         ProfessorX.print();

         Song BeforeIForget = new Song ("Before I Forget", "Slipknot", 654322);

         BeforeIForget.print();

         Song MockingIt = new Song ("Mokiing It","JAY1", 435211); 

         MockingIt.print();

    


    songlist.add(whatIveDone);
    songlist.add(soul);
    songlist.add(streatham);
    songlist.add(funkyfriday);
    songlist.add(gutenTag);
    songlist.add(Waiting);
    songlist.add(ProfessorX);
    songlist.add(BeforeIForget);
    songlist.add(MockingIt);



    }





}