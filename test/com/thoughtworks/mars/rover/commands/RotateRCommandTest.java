package com.thoughtworks.mars.rover.commands;

import com.thoughtworks.mars.rover.mars.Compass;
import com.thoughtworks.mars.rover.mars.Coordinates;
import com.thoughtworks.mars.rover.mars.Plateau;
import com.thoughtworks.mars.rover.Rover;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hamzaghani on 30/01/2017.
 */
public class RotateRCommandTest {


    @Test
    public void TestRightRotateCommand() {
        RotateRCommand rCommand = new RotateRCommand();
        Plateau plateau = new Plateau(5,5);
        Coordinates startPostion = new Coordinates(1,2);
        Rover rover = new Rover(plateau, Compass.N,startPostion);

        rCommand.execute(rover);

        Assert.assertEquals("1 2 E", rover.currentLocation());

        //just this my test actual works
        //Assert.assertEquals("1 3 E", rover.currentLocation());

    }


}