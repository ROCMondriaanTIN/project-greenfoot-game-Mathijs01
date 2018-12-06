import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A extends Mover
{
    public String verzamel = "";
    public static int coin;
    /**
     * Act - do whatever the A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act() 
    {
        applyVelocity();
        addLetter();
    }    
    public void addLetter()
    {
       for (Actor A : getObjectsInRange(100 ,Hero.class)) 
       {
           if(Greenfoot.mouseClicked(this))
           {
           //removeTouching(G.class);
           verzamel +="A";
           getWorld().showText(verzamel,85,170);
           coin++;
           getWorld().removeObject(this);
           }
       }
    }
}
