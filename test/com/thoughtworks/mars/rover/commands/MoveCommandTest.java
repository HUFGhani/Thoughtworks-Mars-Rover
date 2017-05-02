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
public class MoveCommandTest {

    @Test
    public void TestLeftRotateCommand() {
        MoveCommand moveCommand = new MoveCommand();
        Plateau plateau = new Plateau(5, 5);
        Coordinates startPostion = new Coordinates(1, 2);
        Rover rover = new Rover(plateau, Compass.N, startPostion);

        moveCommand.execute(rover);

        Assert.assertEquals("1 3 N", rover.currentLocation());

    }

}