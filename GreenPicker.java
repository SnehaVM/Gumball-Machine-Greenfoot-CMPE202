import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class GreenPicker extends Picker
{
    public void greenPick()
    {   
        GreenGumball greenball=new GreenGumball();    
        getWorld().addObject(greenball, 368,463);
        Greenfoot.delay(500);
        getWorld().removeObject(greenball);
    }
    
    public void act() 
    {
        int mouseX, mouseY ;
        
        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY);
        }
    }
}

