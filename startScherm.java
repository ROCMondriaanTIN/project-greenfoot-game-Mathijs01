import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startScherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startScherm extends World
{
    //GreenfootSound backgroundMusic = new GreenfootSound("ncMusic.mp3");
    /**
     * Constructor for objects of class startScherm.
     * 
     */
    public startScherm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         super(1000, 800, 1, false);
        // backgroundMusic.playLoop();

         prepare();
    }
    
    private void prepare()
    {

        EnterButton enterButton = new EnterButton();
        addObject(enterButton,916,710);
        Personage personage = new Personage();
        addObject(personage,31,754);
        enterButton.setLocation(929,739);
    }

    public void act()
    {
        /*if(Greenfoot.isKeyDown("enter"))
        Greenfoot.setWorld(new levelSelector());
        
        if(Greenfoot.isKeyDown(""))
        Greenfoot.setWorld(new level1());
        
        if(Greenfoot.isKeyDown(""))
        Greenfoot.setWorld(new level2());
        
        if(Greenfoot.isKeyDown(""))
        Greenfoot.setWorld(new levelSelector());*/
    }
}
