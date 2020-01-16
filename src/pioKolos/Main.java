package pioKolos;

import static pioKolos.Paczka.choice;

public class Main {
    public static void main(String[] args) {
        Paczka p1 =new PaczkaA("sad23223", 32);
        Paczka p2 =new PaczkaA("eww22323", 32);
        Paczka p3 =new PaczkaB("ele22323", 11);
        Paczkomat p=new Paczkomat();


    p.addPack(choice("sdd32243", 32222));
    p.addPack(p2);
    p.addPack(p3);
    p.showPacks();
        System.out.println("---------------------------------");
    p.returnPack("eww22323");
    p.showPacks();
//        System.out.println("--------------------------------------");
//    p.removePack("sad23223");
//    p.showPacks();
    }
}
