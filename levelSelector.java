import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class levelSelector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class levelSelector extends World
{

    /**
     * Constructor for objects of class levelSelector.
     * 
     */
    public levelSelector()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false);
        prepare();
    }

    public void act()
    {
        click();

    }

    public void click()
    {
        if(Greenfoot.isKeyDown("0"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
        if(Greenfoot.isKeyDown("1"))
        {
            Greenfoot.setWorld(new level1());
        }
        
        if(Greenfoot.isKeyDown("2"))
        {
            Greenfoot.setWorld(new level2());
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        one one = new one();
        addObject(one,62,142);
        Two two = new Two();
        addObject(two,321,141);
        two.setLocation(579,142);
        one.setLocation(317,143);
        Zero zero = new Zero();
        addObject(zero,65,142);
    }
}
