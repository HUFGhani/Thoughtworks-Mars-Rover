package com.thoughtworks.mars.rover;

import com.thoughtworks.mars.rover.commands.Command;
import com.thoughtworks.mars.rover.mars.Compass;
import com.thoughtworks.mars.rover.mars.Coordinates;
import com.thoughtworks.mars.rover.mars.Plateau;
import com.thoughtworks.mars.rover.util.CommandParser;

import java.util.ArrayList;

/**
 * Created by hamzaghani on 30/01/2017.
 */
public class Rover {

    private Plateau plateau;
    private Compass currentDirection;
    private Coordinates currentCoordinates;
    private boolean hasCrashed;


    public Rover(Plateau plateau, Compass currentDirection, Coordinates currentCoordinates) {
        this.plateau = plateau;
        this.currentDirection = currentDirection;
        this.currentCoordinates = currentCoordinates;
    }

    public void run(String command) {

        ArrayList<Command> commands = new CommandParser(command).toCommands();
        for (Command c : commands) {
            c.execute(this);
        }
    }

    public String currentLocation() {
        String coord= "";
        if(hasCrashed == true) {
            coord= currentCoordinates.toString() + " " + currentDirection.toString() + " RIP";
        }else {
            coord= currentCoordinates.toString() + " " + currentDirection.toString();
        }
        return coord;
    }

    public void leftTurn() {
        currentDirection = currentDirection.turnLeft();
    }

    public void rightTurn() {
        currentDirection = currentDirection.turnRight();
    }

    public void movingRover() {
        Coordinates afterPostion = currentCoordinates.newCoordinatesMove(currentDirection.getCoordinatesXAxis(),
                currentDirection.getCoordinatesYAxis());
                System.out.println(afterPostion);
        if (plateau.bounds(afterPostion)) {
            currentCoordinates = currentCoordinates.newCoordinates(currentDirection.getCoordinatesXAxis(),
                    currentDirection.getCoordinatesYAxis());

            System.out.println(currentCoordinates);

        }else{
            hasCrashed = true;
        }
    }
}
