package com.thoughtworks.mars.rover.mars;

/**
 * Created by hamzaghani on 30/01/2017.
 */
public class Coordinates {

    private int xAxis, yAxis;

    public Coordinates(int xAxis, int yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }


    public Coordinates newCoordinates(int xAxisValue, int yAxisValue) {
        return new Coordinates(xAxis + xAxisValue, yAxis + yAxisValue);
    }

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        output.append(xAxis + " " + yAxis);
        return output.toString();
    }

    public boolean outBounds(Coordinates coordinates) {
        boolean outBoundsXY;
        if (xOutBounds(coordinates.xAxis) && yOutBounds(coordinates.yAxis)){
            outBoundsXY = true;
        }else {
            outBoundsXY = false;
        }
        return outBoundsXY;
    }

    public boolean inBounds(Coordinates coordinates) {
        boolean inBoundsXY;
        if (xInBounds(coordinates.xAxis) && yInBounds(coordinates.yAxis)){
            inBoundsXY = true;
        }else {
            inBoundsXY = false;
        }
        return inBoundsXY;
    }

    public Coordinates newCoordinatesMove(int coordinatesXAxis, int coordinatesYAxis) {
        return new Coordinates(xAxis+coordinatesXAxis,yAxis+coordinatesYAxis);
    }

    private boolean xOutBounds(final int xCoordinate) {
        boolean x;
        if (xCoordinate >= xAxis){
            x= true;
        }else{
            x= false;
        }
        return x;
    }

    private boolean yOutBounds(final int yCoordinate) {
        boolean y;
        if (yCoordinate >= yAxis){
            y= true;
        }else{
            y= false;
        }
        return y;
    }

    private boolean xInBounds(final int xCoordinate) {
        boolean x;
        if (xCoordinate <= xAxis){
            x= true;
        }else{
            x= false;
        }
        return x;
    }

    private boolean yInBounds(final int yCoordinate) {
        boolean y;
        if (yCoordinate <= yAxis){
            y= true;
        }else{
            y= false;
        }
        return y;
    }


}
