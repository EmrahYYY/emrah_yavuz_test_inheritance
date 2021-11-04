package be.intecbrussel;

abstract class Monster {
    private int hitPoints ;
    private int maxHp;

    public Monster(int maxHp) {
        this.maxHp = maxHp;
    }


    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void heal() {
    }

    public boolean takeDamage(int d) {
        if (hitPoints < 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "hitPoints=" + hitPoints +
                ", maxHp=" + maxHp +
                '}';
    }
}