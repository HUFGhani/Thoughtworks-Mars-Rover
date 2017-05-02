package com.thoughtworks.mars.rover.mars;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hamzaghani on 30/01/2017.
 */
public class PlateauTest {

  @Test
    public void coordinateInBounds(){
      Plateau rover  = new Plateau(5,5);
      Coordinates coordinates = new Coordinates(5,0);
      Assert.assertTrue(rover.bounds(coordinates));
  }

    @Test
    public void coordinateOutBounds(){
        Plateau rover  = new Plateau(5,5);
        Coordinates coordinates = new Coordinates(6,0);
        Assert.assertFalse(rover.bounds(coordinates));
    }


}