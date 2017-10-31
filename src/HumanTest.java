
public class HumanTest
{

    public static void main(String[] args)
    {
        Human fred = new Human();
        Human george = new Human();
        
        fred.attack(george);
        
        System.out.println(george.getHealth());
    }

}
