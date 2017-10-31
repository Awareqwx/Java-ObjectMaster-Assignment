
public class Human
{

    protected int strength, intelligence, stealth, health;
    
    public Human()
    {
        strength = intelligence = stealth = 3;
        health = 100;
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public void attack(Human h)
    {
        h.health -= strength;
    }

}   