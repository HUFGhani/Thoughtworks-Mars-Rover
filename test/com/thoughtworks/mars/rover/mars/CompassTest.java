package com.thoughtworks.mars.rover.mars;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hamzaghani on 30/01/2017.
 */
public class CompassTest {

    @Test
    public void North2East(){
        Compass north = Compass.N;
        Compass east = north.turnRight();
        Assert.assertEquals(Compass.E,east);
    }

    @Test
    public void North2West(){
        Compass north = Compass.N;
        Compass west = north.turnLeft();
        Assert.assertEquals(Compass.W,west);
    }


    @Test
    public void East2South(){
        Compass east = Compass.E;
        Compass south = east.turnRight();
        Assert.assertEquals(Compass.S,south);
    }

    @Test
    public void East2North(){
        Compass east = Compass.E;
        Compass north = east.turnLeft();
        Assert.assertEquals(Compass.N,north);
    }

    @Test
    public void South2East(){
        Compass south = Compass.S;
        Compass east = south.turnLeft();
        Assert.assertEquals(Compass.E,east);
    }

    @Test
    public void South2West(){
        Compass south = Compass.S;
        Compass west = south.turnRight();
        Assert.assertEquals(Compass.W,west);
    }

    @Test
    public void West2North(){
        Compass west = Compass.W;
        Compass north = west.turnRight();
        Assert.assertEquals(Compass.N,north);
    }

    @Test
    public void West2South(){
        Compass west = Compass.W;
        Compass south = west.turnLeft();
        Assert.assertEquals(Compass.S,south);
    }
}