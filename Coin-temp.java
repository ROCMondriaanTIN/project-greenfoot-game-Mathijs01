import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Mover
{
    GreenfootImage coin1 = new GreenfootImage("coin1.png");
    GreenfootImage coin2 = new GreenfootImage("coin2.png");
    GreenfootImage coin3 = new GreenfootImage("coin3.png");
    GreenfootImage coin4 = new GreenfootImage("coin4.png");
    GreenfootImage coin5 = new GreenfootImage("coin5.png");
    GreenfootImage coin6 = new GreenfootImage("coin6.png");
    
      
    public int frame = 1;
    public int waktu = 0;
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        animasi();
    }    
    
    public void animasi() 
    { if (frame == 1) {
        if (waktu == 10)
        { setImage(coin1); 
            frame = 2;
            waktu = 0; } } 
            else if (frame == 2) 
            { if (waktu == 10) 
                { setImage(coin2);
                    frame = 3; 
                    waktu = 0; } } 
                    else if (frame == 3)
                    { if (waktu == 10)
                        { setImage(coin3);
                            frame = 1; 
                            waktu = 0; } }
                             else if (frame == 3)
                    { if (waktu == 10)
                        { setImage(coin4);
                            frame = 1; 
                            waktu = 0; } }
                             else if (frame == 3)
                    { if (waktu == 10)
                        { setImage(coin5);
                            frame = 1; 
                            waktu = 0; } }
                             else if (frame == 3)
                    { if (waktu == 10)
                        { setImage(coin6);
                            frame = 1; 
                            waktu = 0; } }
}
}