package com.thoughtworks.mars.rover.mars;

/**
 * Created by hamzaghani on 30/01/2017.
 */
public class Plateau {
    private Coordinates topXY = new Coordinates(0,0);
    private Coordinates bottomXY = new Coordinates(0,0);


    public Plateau(int topX, int topY) {
    topXY = topXY.newCoordinates(topX,topY);
    }

    public boolean bounds(Coordinates coordinates){
        boolean bounds = false;
        if (bottomXY.outBounds(coordinates) && topXY.inBounds(coordinates)) {
            bounds = true;
//        }else{
//            bounds = false;
//        }
        }
        return bounds;

    }


}
