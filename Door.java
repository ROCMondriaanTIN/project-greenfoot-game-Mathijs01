import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends Mover
{
    /**
     * Act - do whatever the Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        if(getOneIntersectingObject(Hero.class)!= null && getWorld().getObjects(Key.class).isEmpty())
        {
            
              Greenfoot.setWorld(new levelSelector());
              /*if(getWorld() instanceof level1) Greenfoot.setWorld(new levelSelector());
              if(getWorld() instanceof level2) Greenfoot.setWorld(new levelSelector());
              if(getWorld() instanceof level3) Greenfoot.setWorld(new levelSelector());*/
              
        }
        applyVelocity();
    }    
}
