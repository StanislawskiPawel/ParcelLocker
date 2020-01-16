package pioKolos;

abstract class Paczka {
    private String code;
    private double weight;

    public Paczka(String code, double weight)
    {
        if((code!=null && code.matches(("^[a-zA-Z]{3}[0-9]{5}$"))))
        {
            setCode(code);
        }
        else
        {
            throw new IllegalArgumentException("Podaj poprawny kod!");
        }
        setWeight(weight);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static Paczka choice(String code, double weight)
    {
        if(weight>=40)
        {
            return new PaczkaA(code, weight);
        }
        else{
            return new PaczkaB(code, weight);
        }
    }


}




