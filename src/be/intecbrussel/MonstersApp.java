package be.intecbrussel;

public class MonstersApp {

    public static void main(String[] args) {


        Witch myWitch = new Witch(30, 100);
        Bear myBear = new Bear(50, 5);


        System.out.println(myWitch.useRp(0));
        System.out.println(myBear.useRp(0));
        System.out.println("---------------------------------------------------------");



        if (myWitch.getHitPoints() + myWitch.getMagicPoints() > myBear.getHitPoints() + myBear.getRagePoints()) {
            System.out.println("the witch won" + "  fwooosh!!");
        } else {
            System.out.println("the bear won" + "   rooaar!!");
        }

        System.out.println("---------------------------------------------------------");


        System.out.println(myWitch.equals(myBear));

        System.out.println(myWitch.toString());
        System.out.println(myBear.toString());



    }
}
