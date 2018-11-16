import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    private int totalCount = 0;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Counter() 
    {
        setImage(new GreenfootImage("0",20, greenfoot.Color.BLACK, greenfoot.Color.RED));
    }    
    
    public void bumpCount(int amount)
    {
        totalCount += amount;
        setImage(new GreenfootImage("" + totalCount,20, greenfoot.Color.BLACK, greenfoot.Color.RED));
    }
}
