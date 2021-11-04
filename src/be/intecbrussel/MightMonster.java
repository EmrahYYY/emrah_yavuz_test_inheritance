package be.intecbrussel;

import java.util.Objects;

public abstract class MightMonster extends Monster {

    private int ragePoints ;
    private int maxRp;

    public MightMonster(int maxRp, int maxHp) {
        super(maxHp);
        super.setMaxHp(maxHp);
    }

    public int getRagePoints() {
        return ragePoints;
    }

    public void setRagePoints(int ragePoints) {
        this.ragePoints = ragePoints;
    }

    public boolean useRp(int d) {
        if (ragePoints < 0) {
            System.out.println("eliminated");
            return false;
        } else {
            System.out.println("the Bear continues");
            return true;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MightMonster that = (MightMonster) o;
        return ragePoints == that.ragePoints && maxRp == that.maxRp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ragePoints, maxRp);
    }

    @Override
    public String toString() {
        return "MightMonster{" +
                "ragePoints=" + ragePoints +
                ", maxRp=" + maxRp +
                '}';
    }
}
