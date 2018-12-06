import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class G here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class G extends Mover
{
    public String verzamel = "";
    public static int coin;
    /**
     * Act - do whatever the G wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        applyVelocity();
        addLetter();
    }    
    public void addLetter()
    {
       for (Actor G : getObjectsInRange(100 ,Hero.class)) 
       {
           if(Greenfoot.mouseClicked(this))
           {
           //removeTouching(G.class);
           verzamel +="G";
           getWorld().showText(verzamel,70,170);
           coin++;
           getWorld().removeObject(this);
           }
       }
    }
}