package com.thoughtworks.mars.rover.util;

import com.thoughtworks.mars.rover.commands.Command;
import com.thoughtworks.mars.rover.commands.MoveCommand;
import com.thoughtworks.mars.rover.commands.RotateLCommand;
import com.thoughtworks.mars.rover.commands.RotateRCommand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by hamzaghani on 30/01/2017.
 */
public class CommandParser{
    private static HashMap <String, Command> stringCommandHashMap = new HashMap<String, Command>();

    private String command;

    public CommandParser() {
        stringCommandHashMap.put("L",new RotateLCommand());
        stringCommandHashMap.put("R",new RotateRCommand());
        stringCommandHashMap.put("M", new MoveCommand());
    }

    public CommandParser(String command) {
        this.command = command;
        new CommandParser();
    }

    public ArrayList<Command> toCommands() {
        if(nullEmptyCheck(command) == true){
             new ArrayList<Command>();
        }
        return buildCommandsList(command);
    }

    private ArrayList<Command> buildCommandsList(String command) {
        ArrayList<Command> commands = new ArrayList<Command>();

        for (String charCommand : commandCharFrom(command)) {
            if (charCommand != null){
                Command mappedCommand = findEquivalentCommand(charCommand.toUpperCase());
                commands.add(mappedCommand);
            }
        }
        return commands;
    }

    private Command findEquivalentCommand(String s) {
        return stringCommandHashMap.get(s);
    }

    private String[] commandCharFrom(String command) {
        return Arrays.copyOfRange(command.split(""), 0, command.length() + 1);
    }

    public boolean nullEmptyCheck(final String command) {

         if (null != command || !command.isEmpty() && command!="" && command.length()!= 0){
             return true;
         }else{
             return false;
         }
    }

}
