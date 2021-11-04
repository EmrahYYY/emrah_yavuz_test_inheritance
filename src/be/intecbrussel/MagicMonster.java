package be.intecbrussel;

import java.util.Objects;

public abstract class MagicMonster extends Monster {
    private int magicPoints;
    private int maxMp;

    public MagicMonster(int maxMp) {
        super(maxMp);
    }

    public int getMagicPoints() {
        return magicPoints;
    }

    public void setMagicPoints(int magicPoints) {
        this.magicPoints = magicPoints;
    }

    public void restoreMp(int h) {
    }

    public boolean useRp(int d) {
        if (magicPoints < 0) {
            System.out.println("eliminated");
            return false;
        } else {
            System.out.println("the Witch continues");
            return true;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MagicMonster that = (MagicMonster) o;
        return magicPoints == that.magicPoints && maxMp == that.maxMp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(magicPoints, maxMp);
    }

    @Override
    public String toString() {
        return "MagicMonster{" +
                "magicPoints=" + magicPoints +
                ", maxMp=" + maxMp +
                '}';
    }
}
