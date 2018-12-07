import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VraagLevel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VraagLevel2 extends World
{

    /**
     * Constructor for objects of class VraagLevel2.
     * 
     */
    public VraagLevel2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false);
    }
    
    public void act(){
    if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new level2());
        }
    else if (Greenfoot.mouseClicked(this))
    {
        Greenfoot.setWorld(new level2());
    }
    }
}
