
public class HumanTest
{

    public static void main(String[] args)
    {
        Human fred = new Human();
        Human george = new Human();
        
        fred.attack(george);
        
        System.out.println(george.getHealth());
        
        System.out.println();
        System.out.println();
        
        Wizard gandalf = new Wizard();
        gandalf.fireball(fred);
        gandalf.heal(george);
        
        Ninja naruto = new Ninja();
        naruto.steal(gandalf);
        naruto.runAway();
        
        Samurai jack = new Samurai();
        jack.medidate();
        Samurai shigeru = new Samurai();
        Samurai yamada = new Samurai();
        shigeru.deathBlow(yamada);
        System.out.println(shigeru.howMany());
    }

}
