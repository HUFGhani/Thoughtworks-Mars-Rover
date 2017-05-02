package com.thoughtworks.mars.rover;

import com.thoughtworks.mars.rover.mars.Compass;
import com.thoughtworks.mars.rover.mars.Coordinates;
import com.thoughtworks.mars.rover.mars.Plateau;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hamzaghani on 30/01/2017.
 */
public class RoverTest {

@Test
    public void Test_Input1(){
    Plateau plateau = new Plateau(5,5 );
    Coordinates startpoint = new Coordinates(1,2);
    Rover rover = new Rover(plateau, Compass.N,startpoint);
    rover.movingRover();
    Assert.assertEquals("1 3 N",rover.currentLocation());
}
    @Test
    public void Test_Input2(){
        Plateau plateau = new Plateau(5,5 );
        Coordinates startpoint = new Coordinates(1,2);
        Rover rover = new Rover(plateau, Compass.N,startpoint);
        rover.run("LMLMLMLMM");
        Assert.assertEquals("1 3 N",rover.currentLocation());
    }

    @Test
    public void Test_Input3(){
        Plateau plateau = new Plateau(5,5 );
        Coordinates startpoint = new Coordinates(3,3);
        Rover rover = new Rover(plateau, Compass.E,startpoint);
        rover.run("MMRMMRMRRM");
        Assert.assertEquals("5 1 E",rover.currentLocation());
    }

    @Test
    public  void  Test_input4(){
        Plateau plateau = new Plateau(5,5 );
        Coordinates startpoint = new Coordinates(3,3);
        Rover rover = new Rover(plateau, Compass.E,startpoint);
        rover.run("MMRMMLMRRM");
        Assert.assertEquals("5 1 E RIP",rover.currentLocation());
    }


}