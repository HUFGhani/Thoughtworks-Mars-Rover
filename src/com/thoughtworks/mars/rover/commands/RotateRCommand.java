package com.thoughtworks.mars.rover.commands;

import com.thoughtworks.mars.rover.Rover;

/**
 * Created by hamzaghani on 30/01/2017.
 */
public class RotateRCommand implements Command {
    @Override
    public void execute(final Rover rover) {
        rover.rightTurn();
    }
}
