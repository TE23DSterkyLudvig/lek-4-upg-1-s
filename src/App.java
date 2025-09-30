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

    


    System.out.println("namn");
    namn = tryString(namn,tb);

    System.out.println("personnummer");
    personnummer = tryInt(personnummer, tb);

    tb.nextLine();

    System.out.println("email");
    email = tryString(email, tb);

    System.out.println("mobilnummer");
    mobilnummer = tryInt(mobilnummer, tb);

    tb.nextLine();

    System.out.println("klass");
    klass = tryString(klass, tb);
    
    System.out.println("program");
    program = tryString(program, tb);


    elever elev = new elever(namn, personnummer,email,mobilnummer,klass,program);
    System.out.println("Elev " + elev.namn + " adderad");
    
    
        

   

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
