
public class Samurai extends Human
{
    
    private static int number;

    public Samurai()
    {
        super();
        health = 200;
        number ++;
    }
    
    public void deathBlow(Human h)
    {
        h.health = 0;
        health /= 2;
    }
    
    public void medidate()
    {
        health *= 1.5;
    }
    
    public int howMany()
    {
        return number;
    }
    
    

}
