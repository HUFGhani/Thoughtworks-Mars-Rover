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
public class RotateLCommandTest {

    @Test
    public void TestLeftRotateCommand() {
        RotateLCommand lCommand = new RotateLCommand();
        Plateau plateau = new Plateau(5, 5);
        Coordinates startPostion = new Coordinates(1, 2);
        Rover rover = new Rover(plateau, Compass.N, startPostion);

        lCommand.execute(rover);

        Assert.assertEquals("1 2 W", rover.currentLocation());

    }
}