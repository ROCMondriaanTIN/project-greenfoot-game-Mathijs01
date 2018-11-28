import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level4 extends World
{
    private CollisionEngine ce;
    Counter counter = new Counter();
    /**
     * Constructor for objects of class level4.
     * 
     */
    
       
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        public level4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
            
    // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
     super(1000, 800, 1, false);
    this.setBackground("bg.png");
    //theCounter = new Counter();
   // addObject(theCounter, 0, 0);
    //prepare();
    int[][] map = {
        
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {150,150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,150,150,150,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,-1,-1,150,150,-1,-1,150,150,-1,-1,-1,-1,-1,-1,150,-1,-1},
        {-1,-1,-1,-1,150,150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,150,150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,-1,-1,150,-1,-1},
        {150,150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,-1,-1},
        {-1,-1,-1,-1,-1,-1,150,150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,-1,-1,-1,-1,-1,-1,150,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,150,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,-1,-1,-1,-1,-1,150,150,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,-1,-1},
        {-1,-1,150,150,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,-1,-1,-1,-1,-1,-1,-1,-1,150,150,-1,-1,150,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,150,-1,-1},
        {-1,-1,-1,-1,150,150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,150,150,150,150,150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,150,150,150,150,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1},
        {-1,-1,-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1},
        {-1,-1,-1,-1,150,150,150,150,150,150,150,150,150,150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,150,150,150,150,150,150,150,150,150,150,150,150,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150,150},


        };

        // Declareren en initialiseren van de TileEngine klasse om de map aan de world toe te voegen
        TileEngine te = new TileEngine(this, 60, 60, map);
        // Declarenre en initialiseren van de camera klasse met de TileEngine klasse 
        // zodat de camera weet welke tiles allemaal moeten meebewegen met de camera
        Camera camera = new Camera(te);
        // Declareren en initialiseren van een main karakter van het spel mijne heet Hero. Deze klasse 
        // moet de klasse Mover extenden voor de camera om te werken
        Hero hero = new Hero();

        // Laat de camera een object volgen. Die moet een Mover instatie zijn of een extentie hiervan.
        camera.follow(hero);

        // Alle objecten toevoegen aan de wereld: camera, main karakter en mogelijke enemies
        addObject(camera, 0, 0);
        addObject(hero, 28, 1693);
        addObject(new ResetButton(), 50,50);
        addObject(counter,70,120);
        addObject(new A(),5,373);
        addObject(new Button(),0,73);
        addObject(new BrownCoin(),1716,550);
        addObject(new BrownCoin(),1716,780);
        addObject(new BrownCoin(),1716,320);
       // addObject(new Enemy(), 1250, 770);
        //addObject(new enemy2(), 500, 1370);
        // Initialiseren van de CollisionEngine zodat de speler niet door de tile heen kan lopen.
        // De collision engine kijkt alleen naar de tiles die de variabele solid op true hebben staan.
        ce = new CollisionEngine(te, camera);
        // Toevoegen van de mover instantie of een extentie hiervan
        ce.addCollidingMover(hero);
    }
    
     public Counter getCounter()
        {
            return counter;
        }
       public void prepare()
       {
         addObject(counter,70, 120);
       }
       @Override
    public void act() 
    {
        ce.update();
     
    }
    }

