import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Gumball extends Actor
{

    public Gumball()
    {
        GreenfootImage image = getImage() ;
        image.scale( 50, 50 ) ; 
    }

    public void act() 
    {
        move(20);
        turn(270);
    }    
    
    public boolean inWorldRange()
    {
        if(getX() > getWorld().getWidth() - 10)
            return true;
        else
            return false;
    }
}
