package be.intecbrussel;

import java.util.Objects;

public class Bear extends MightMonster {

    private int holeNr;

    public Bear() {
        this(0);
    }

    public Bear(int hitpoints) {
        this(hitpoints, 0);
    }

    public Bear(int hitpoints, int ragePoints) {
        super(hitpoints, ragePoints);
    }

   // public Bear(Bear bear) {
       // this(bear.getRagePoints(), bear.getHitPoints());
   // }

   // public Bear(int hitpoints, int ragePoints, int holeNr) {super(hitpoints,ragePoints);}

    public void bearClawAttack() {
        System.out.println(" rooaar!!");
    }

    public int getHitpoint() {
        return getHitPoints();
    }


    @Override
    public int getRagePoints() {
        return holeNr;
    }

    @Override
    public void setRagePoints(int ragePoints) {
        this.holeNr = ragePoints;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bear bear = (Bear) o;
        return holeNr == bear.holeNr;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), holeNr);
    }

    @Override
    public String toString() {
        return "Bear{" +
                "holeNr=" + holeNr +
                '}';
    }
}
