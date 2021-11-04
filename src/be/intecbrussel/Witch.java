package be.intecbrussel;

import java.util.Objects;

public class Witch extends MagicMonster{

String name;


    public Witch (){this(0);}

    public Witch (int hitpoints ){this(hitpoints,0);}


    public Witch  ( int hitpoints, int magicPoints ){  super(hitpoints);}

    //public Witch  ( Witch witch ){ this(witch.getMagicPoints(), witch.getHitPoints());}

    //public int getMagicPoints() {
       // return getMagicPoints();
    //}

    public void  firebalAttack(){
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Witch witch = (Witch) o;
        return Objects.equals(name, witch.name);
    }



    @Override
    public int hashCode() {
        return Objects.hash(name);


    }

    @Override
    public String toString() {
        return "Witch{" +
                "name='" + name + '\'' +
                '}';
    }
}
