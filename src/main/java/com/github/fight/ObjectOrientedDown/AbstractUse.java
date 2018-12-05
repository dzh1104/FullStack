package com.github.fight.ObjectOrientedDown;

abstract class SpeedMeter {

    private double turnRate;

    public SpeedMeter() {

    }

//    public double getRadius() {
//        return 0.0;
//    }

    public abstract double getRadius();

    public void setTurnRate(double turnRate) {

        this.turnRate = turnRate;
    }

    public double getSpeed() {

        return Math.PI * 2 * this.getRadius() * this.turnRate;
    }

}

class CarSpeedMeter extends SpeedMeter {

    public double getRadius() {

        return 0.28;
    }

}

public class AbstractUse {

    public static void main(String[] args) {

        CarSpeedMeter csm = new CarSpeedMeter();
        csm.setTurnRate(15);
        System.out.println(csm.getSpeed());
    }

}
