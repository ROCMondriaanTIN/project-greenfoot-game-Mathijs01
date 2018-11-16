import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A extends Mover
{
    /**
     * Act - do whatever the A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act() 
    {
        int x = getX();
        int y = getY();
        for (Actor enemy : getIntersectingObjects(Hero.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                break;
            }
        }
        applyVelocity();
    }    
}
