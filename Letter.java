import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Letter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letter extends Mover
{
    char letter;
    public String verzamel = "";
    public static int coin;
    
    public Letter(char karakter){
        System.out.println(karakter + ".png");
        letter = karakter;
        setImage("letter_" + karakter + ".png");
    }
    /**
     * Act - do whatever the Letter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        applyVelocity();
        addLetter();
    }    
    
    public void addLetter()
    {
       for (Actor hero : getObjectsInRange(100 ,Hero.class)) 
       {
           if(Greenfoot.mouseClicked(this))
           {
           Hero h = (Hero)hero;
           h.verzamel += letter;
            //removeTouching(G.class);
           // verzamel +="G";
            //getWorld().showText(verzamel,70,170);
           //coin++;
           
           getWorld().removeObject(this);
           }
       }
       
    }
}
