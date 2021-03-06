import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {
    private final double gravity;
    private final double acc;
    private final double drag;
    public boolean BrownCoin;
    public String verzamel = "";
    public static int coin;
    public String word = "GAME";
    public boolean deurOpen = false;
    public static boolean isDead;
    int oldY;
    boolean canJump = true;
    //boolean BrownCoin = true;
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
    
    boolean lever = false;
    
    Button button; 
    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        deurOpen();
        switchLever();
        ///MouseInfo mouse =  Greenfoot.getMouseInfo();  
        // if(button ==null) {
            // button = new Button();
            // getWorld().addObject(button, -100, -100);
        // }
        
        handleInput();
        //addLetter();
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                setLocation(500,300);
                break;
            }
        }
        
         for (Actor enemy : getIntersectingObjects(Enemy2.class)) {
            if (enemy != null) {
                setLocation(500,300);
                break;
            }
        }
        /*
        if(oldY < getY() || oldY > getY()) {
            canJump = false;
        }
        else
        {
            canJump = true;
        }
        if(Greenfoot.isKeyDown("up") == false)  oldY = getY();
        */
       
      TouchingLava();
      TouchingWater();
       getWorld().showText(verzamel,70,170);
    }
    
    /*public void aMethod(){
        System.out.println("ok leuk");
    }*/
    
    public void TouchingLava() {
        if(isTouching(LavaTile.class)) {
            Greenfoot.setWorld(new levelSelector());
        }
    }
     public void TouchingWater() {
        if(isTouching(WaterTile.class)) {
            Greenfoot.setWorld(new levelSelector());
        }
    }
    
    public boolean onGround()
    {
         Actor underLeft = getOneObjectAtOffset(-getImage().getWidth() / 2, getImage().getHeight() / 2, Tile.class);
        Tile tile1 = (Tile) underLeft;
        Actor underRight = getOneObjectAtOffset(getImage().getWidth() / 2, getImage().getHeight() / 2, Tile.class);
        Tile tile2 = (Tile) underRight;

        return (tile1 != null && tile1.isSolid) || (tile2 != null && tile2.isSolid);
        
        /*Actor under = getOneObjectAtOffset(0, getHeight()/2, Tile.class);
        Tile tile = (Tile) under;
        return tile != null && tile.isSolid == true;*/
    }
    public void switchLever() {
        if(isTouching(Button.class)) {
            lever = true;
        }
    }
    
    public void deurOpen() {
        if(isTouching(Door.class) && lever == true) {
            Greenfoot.setWorld(new levelSelector());
        }
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
        if (Greenfoot.isKeyDown("w") && onGround()) {
            velocityY = -15;
            setImage("p1_jump.png");
        }

        if (Greenfoot.isKeyDown("a")) {
            velocityX = -5;
            animation();
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 5;
            animate();
            
        }
        else 
        {
            
        }
        if(Greenfoot.isKeyDown("s"))
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
