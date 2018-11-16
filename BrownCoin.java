import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrownCoin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BrownCoin extends Mover
{
    /**
     * Act - do whatever the BrownCoin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         int x = getX();
        int y = getY();
        Counter counter = new Counter();
        for (Actor enemy : getIntersectingObjects(Hero.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                break;
            }
        }
        applyVelocity();
    }    
}
