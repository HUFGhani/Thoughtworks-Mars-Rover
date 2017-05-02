package com.thoughtworks.mars.rover.mars;

/**
 * Created by hamzaghani on 30/01/2017.
 */
public enum  Compass {

    N(0,1){
        @Override
        public Compass turnLeft() {
            return W;
        }

        @Override
        public Compass turnRight() {
            return E;
        }
    },

    E(1,0){
        @Override
        public Compass turnLeft() {
            return N;
        }

        @Override
        public Compass turnRight() {
            return S;
        }
    },
    S(0,-1){
        @Override
        public Compass turnLeft() {
            return E;
        }

        @Override
        public Compass turnRight() {
            return W;
        }
    },
    W(-1,0){
        @Override
        public Compass turnLeft() {
            return S;
        }

        @Override
        public Compass turnRight() {
            return N;
        }
    };


    public abstract Compass turnRight();
    public abstract Compass turnLeft();

    private int coordinatesXAxis;
    private int coordinatesYAxis;

    Compass(int coordinatesXAxis, int coordinatesYAxis) {
        this.coordinatesXAxis = coordinatesXAxis;
        this.coordinatesYAxis = coordinatesYAxis;
    }

    public int getCoordinatesXAxis() {
        return coordinatesXAxis;
    }

    public int getCoordinatesYAxis() {
        return coordinatesYAxis;
    }
}
