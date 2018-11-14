

import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    int oldY;
    boolean canJump = true;
    
    GreenfootImage p1_walk01 = new GreenfootImage("p1_walk01.png"); 
    GreenfootImage p1_walk02 = new GreenfootImage("p1_walk02.png"); 
    GreenfootImage p1_walk03 = new GreenfootImage("p1_walk03.png"); 
    GreenfootImage p1_walk04 = new GreenfootImage("p1_walk04.png"); 
    GreenfootImage p1_walk05 = new GreenfootImage("p1_walk05.png"); 
    GreenfootImage p1_walk06 = new GreenfootImage("p1_walk06.png"); 
    GreenfootImage p1_walk07 = new GreenfootImage("p1_walk07.png"); 
    GreenfootImage p1_walk08 = new GreenfootImage("p1_walk08.png"); 
    GreenfootImage p1_walk12 = new GreenfootImage("p1_walk12.png");
    GreenfootImage p1_walk13 = new GreenfootImage("p1_walk13.png");
    GreenfootImage p1_walk14 = new GreenfootImage("p1_walk14.png");
    GreenfootImage p1_walk15 = new GreenfootImage("p1_walk15.png");
    GreenfootImage p1_walk16 = new GreenfootImage("p1_walk16.png");
    GreenfootImage p1_walk17 = new GreenfootImage("p1_walk17.png");
    GreenfootImage p1_walk18 = new GreenfootImage("p1_walk18.png");
    
    public int frame = 1;
    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        
        handleInput();
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                break;
            }
        }
        
        if(oldY < getY() || oldY > getY()) {
            canJump = false;
        }
        else
        {
            canJump = true;
        }
        if(Greenfoot.isKeyDown("up") == false)  oldY = getY();
    }
    
    public void animate()
    
    {   
        if(frame == 1)
        {
            setImage(p1_walk01);
            frame = 2;
        }
        else if (frame == 2)
        {
            setImage(p1_walk02);
            frame = 3;
        }
         else if (frame == 3)
        {
            setImage(p1_walk03);
            frame = 4;
        }
         else if (frame == 4)
        {
            setImage(p1_walk04);
            frame = 5;
        }
         else if (frame == 5)
        {
            setImage(p1_walk05);
            frame = 6;
        }
         else if (frame == 6)
        {
            setImage(p1_walk06);
            frame = 7;
        }
         else if (frame == 7)
        {
            setImage(p1_walk07);
            frame = 8;
        }
         else if (frame == 8)
        {
            setImage(p1_walk08);
            frame = 1;
        }
    }
    public void animation()
    {
        if(frame == 1)
        {
            setImage(p1_walk12);
            frame = 2;
        }
         else if (frame == 2)
        {
            setImage(p1_walk13);
            frame = 3;
        }
         else if (frame == 3)
        {
            setImage(p1_walk14);
            frame = 4;
        }
         else if (frame == 4)
        {
            setImage(p1_walk15);
            frame = 5;
        }
         else if (frame == 5)
        {
            setImage(p1_walk16);
            frame = 6;
        }
         else if (frame == 6)
        {
            setImage(p1_walk17);
            frame = 7;
        }
         else if (frame == 7)
        {
            setImage(p1_walk18);
            frame = 1;
        }
    }
    
    public void handleInput() {
        if (Greenfoot.isKeyDown("up") && canJump == true) {
            velocityY = -15;
        }

        if (Greenfoot.isKeyDown("left")) {
            velocityX = -5;
            animation();
        } else if (Greenfoot.isKeyDown("right")) {
            velocityX = 5;
            animate();
        }
        else 
        {
            
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setImage("p1_duck.png");
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
