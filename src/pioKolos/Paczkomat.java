package pioKolos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Paczkomat {

    private List<Paczka> p=new ArrayList<>();

    Paczka paczka;

    public void addPack(Paczka paczka)
    {
        p.add(paczka);
    }

    public void removePack(String code)
    {
        for(Iterator<Paczka> iterator= p.iterator(); iterator.hasNext();)
        {
           Paczka paczka= iterator.next();
            if(paczka.getCode().equals(code))
            {
                iterator.remove();
            }
        }
    }

    public Paczka returnPack(String code)
    {
        for(Iterator<Paczka> iterator= p.iterator(); iterator.hasNext();)
        {
            Paczka paczka= iterator.next();
            if(paczka.getCode().equals(code))
            {
                iterator.remove();
            }
        }
        return paczka;
    }

    public void showPacks()
    {
        for (Paczka paczka: p) {
            System.out.println("Kod paczki: " + paczka.getCode()+ " Waga paczki: "+paczka.getWeight());
        }
    }



}
