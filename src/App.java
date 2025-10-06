import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner tb = new Scanner(System.in);
    String namn = "";
    int personnummer = 0;
    String email = "";
    int mobilnummer = 0;
    String klass = "";
    String program ="";

    Elev[] elever = new Elev[99];

    for (int index = 0; index < 99; index++) {
        
    
    System.out.println("namn");
    namn = tryString(namn,tb);
    

    System.out.println("personnummer");
    personnummer = tryInt(personnummer, tb);
    String personnummerString = String.valueOf(personnummer);

    tb.nextLine();

    System.out.println("email");
    email = tryString(email, tb);

    System.out.println("mobilnummer");
    mobilnummer = tryInt(mobilnummer, tb);
    String mobilnummerString = String.valueOf(mobilnummer);

    tb.nextLine();

    System.out.println("klass");
    klass = tryString(klass, tb);
    
    System.out.println("program");
    program = tryString(program, tb);


    Elev elev = new Elev(namn, personnummerString,email,mobilnummerString,klass,program);

    elever[index] = elev;

    System.out.println("Elev " + elev.namn + " adderad");
    
    String [] elevDelar = new String[] {elev.namn,elev.personnummer, elev.email, elev.mobilnummer, elev.klass, elev.program  };


    try 
    {
        System.out.print("Vill du forsätta?");
        String svar = tb.nextLine(); 

        if(svar.equalsIgnoreCase(Yes))
        break;

    } 
    catch (Exception e) 
    {
        System.out.println("Inte siffror");
        continue;
    }
    
    }




    
    
    Thread.sleep(3000);

    /*System.out.println("""
            




            """);

    System.out.println("information om eleven " + elev.namn + " .");

    for (int index = 0; index < elevDelar.length; index++) {
        
        System.out.println(elevDelar[index]);

    }
*/
        

   tb.close();

}
   
    static public String tryString(String invärde, Scanner tb){
    while (true) 
    {
        try 
            {
                System.out.print("Ange:");
                invärde = tb.nextLine();
                Integer.parseInt(invärde);               
                System.out.println("Inte siffror, Skriv igen.");
                continue;
            } 
        catch (NumberFormatException e ) 
            {
                break;
            } 
    }
   return invärde;
    }
    
    static public int tryInt(int invärde, Scanner tb){
    while (true) 
    {  
        try 
        {
            System.out.print("Ange:");
            invärde = tb.nextInt();
            break;
        } 
        catch (Exception e) 
        {
            System.out.println("Inte bokstäver, skriv igen");
            tb.nextLine();
            continue;
        }
    }
    return invärde;
    }
}
