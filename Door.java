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
        int x = getX();
        int y = getY();
        
        applyVelocity();
        for(Actor enemy : getIntersectingObjects(Hero.class))
        {
            if (enemy != null)
            {
              if(getWorld() instanceof MyWorld) Greenfoot.setWorld(new levelSelector());
              if(getWorld() instanceof level1) Greenfoot.setWorld(new levelSelector());
              if(getWorld() instanceof level2) Greenfoot.setWorld(new levelSelector());
              return;
            }
        
        }
    }    
}
