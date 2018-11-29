
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Enemy extends Mover {

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;
    

    public Enemy() {
        super();
        setImage("pokerMad.png");
        getImage().mirrorHorizontally();
        walkRange = 100;
        firstAct = true;
        speed = 1;
    }

    @Override
    public void act() {
        collisionDetection();
        
        int x = getX();
        int y = getY();

        if (firstAct) {
            firstAct = false;
            xMin = x - walkRange / 2;
            xMax = x + walkRange / 2;
        }

        velocityX = speed;
        applyVelocity();
        if (getX() >= xMax) {
            speed *= -1;
            x = xMax;
            getImage().mirrorHorizontally();
        } else if (getX() <= xMin) {
            speed *= -1;
            x = xMin;
            getImage().mirrorHorizontally();
        }
        
    }
    private void collisionDetection()
    {
        if(getOneObjectAtOffset(-19, -50, Hero.class) !=null || getOneObjectAtOffset(-19, -50,
        Hero.class) !=null)
        {
            getWorld().removeObject(this);
        }
        else if(getOneObjectAtOffset(-19, 10, Hero.class) !=null || getOneObjectAtOffset(-19, 10,
        Hero.class) !=null)
        {
            Hero.isDead = true;
        }
    }
  
}
