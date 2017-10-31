
public class Wizard extends Human
{

    public Wizard()
    {
        super();
        intelligence = 8;
        health = 50;
    }
    
    public void heal(Human h)
    {
        h.health += intelligence;
    }
    
    public void fireball(Human h)
    {
        h.health -= intelligence * 3;
    }

}
