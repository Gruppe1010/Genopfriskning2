import java.io.*;
import java.util.*;

public class Genopfrisning2
{
    //Throws, da der altid er en chance for at filen ikke findes
    public static void main(String[] args) throws FileNotFoundException
    {
        //Opgave 2
        Scanner sc = new Scanner(new File("resources/data.txt"));

        int counter = 0;
        for (int i=0; sc.hasNextLine(); i++)
        {
            sc.nextLine();
            counter++;
        }
        System.out.println("Der er " + counter + " linjer i filen.");

        //Lav tekstlinje tilføjer til filen

        //Opgave 3
        Person p = new Person("Vibe", 1.78, 25);
        Person p1 = new Person("Tobias", 1.80, 33);
        Person p2 = new Person("Rasmus", 1.80, 33);

        ArrayList<Person> personList = new ArrayList<>(
                Arrays.asList(p,p1,p2)
        );

        System.out.println(personList);
        Collections.sort(personList);
        System.out.println(personList);
    }
}
