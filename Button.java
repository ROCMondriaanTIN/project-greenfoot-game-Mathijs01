import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Mover
{
    public boolean deurOpen = false;
    public void act() 
    {
        applyVelocity();
        deurOpen();
    }
    public boolean deurOpen() {
        if(isTouching(Hero.class)) {
            setImage("switchRight.png");
            deurOpen = true;
        }
        return deurOpen;
    }
}
