import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VraagLevel4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VraagLevel4 extends World
{

    /**
     * Constructor for objects of class VraagLevel4.
     * 
     */
    public VraagLevel4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false);
    }
    
    public void act(){
    if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new level4());
        }
    else if (Greenfoot.mouseClicked(this))
    {
        Greenfoot.setWorld(new level4());
    }
    }
}
