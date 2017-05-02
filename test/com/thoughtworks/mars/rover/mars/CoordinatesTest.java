package com.thoughtworks.mars.rover.mars;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hamzaghani on 30/01/2017.
 */
public class CoordinatesTest {

    @Test
    public void XPostionPlusOne(){
        Coordinates coordinates = new Coordinates(2,3);

        coordinates = coordinates.newCoordinates(1,0);

        Assert.assertEquals("3 3", coordinates.toString());
    }

    @Test
    public void YPostionPlusOne(){
        Coordinates coordinates = new Coordinates(2,3);

        coordinates = coordinates.newCoordinates(0,1);

        Assert.assertEquals("2 4", coordinates.toString());
    }

    @Test
    public void XPostionTakeAwayOne(){
        Coordinates coordinates = new Coordinates(2,3);

        coordinates = coordinates.newCoordinates(-1,0);

        Assert.assertEquals("1 3", coordinates.toString());
    }

    @Test
    public void YPostionTakeAwayOne(){
        Coordinates coordinates = new Coordinates(2,3);

        coordinates = coordinates.newCoordinates(0,-1);

        Assert.assertEquals("2 2", coordinates.toString());
    }

    @Test
    public void XInBound(){
        Coordinates boundaryCoordinates = new Coordinates(5,5);

        boundaryCoordinates.newCoordinates(4,5);

        Assert.assertTrue(boundaryCoordinates.inBounds(boundaryCoordinates));
    }

    @Test
    public void YInBound(){
        Coordinates boundaryCoordinates = new Coordinates(5,5);

        boundaryCoordinates.newCoordinates(5,4);

        Assert.assertTrue(boundaryCoordinates.inBounds(boundaryCoordinates));
    }

    @Test
    public void XOutBound(){
        Coordinates boundaryCoordinates = new Coordinates(5,5);

        boundaryCoordinates.newCoordinates(8,5);

        Assert.assertTrue(boundaryCoordinates.outBounds(boundaryCoordinates));
    }

    @Test
    public void YOutBound(){
        Coordinates boundaryCoordinates = new Coordinates(5,5);

        boundaryCoordinates.newCoordinates(5,8);

        Assert.assertTrue(boundaryCoordinates.outBounds(boundaryCoordinates));
    }

}