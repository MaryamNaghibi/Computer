public class Camputer
{
    private String hersteller; //lenovo
    private String modell;  //L-14
    private boolean laptop; //true
    private int preis;      //899
    private int mhz;        //2000
    //constructor
    public Camputer (String hersteller, String modell, boolean laptop, int preis, int mhz)
    {
        setHersteller(hersteller);
        setModell(modell);
        setLaptop(laptop);
        setPreis(preis);
        setMhz(mhz);
        
        
    }
    public Camputer(String hersteller, boolean laptop, int preis, int mhz)
    {
        setHersteller(hersteller);
        setModell("l-14");
        setLaptop(laptop);
        setPreis(preis);
        setMhz(mhz);
        
    }
    public Camputer( String hersteller, boolean laptop, int preis)
    {
        setHersteller(hersteller);
        setLaptop(laptop);
        setPreis(preis);
        setMhz(2000);
    }
    public Camputer(String hersteller, boolean laptop)
    {
        setHersteller(hersteller);
        setLaptop(laptop);
        setPreis(899);
        setMhz(2000);
        
    }
    public Camputer(String hersteller, int preis)
    {
        setHersteller(hersteller);
        setLaptop(true);
        setPreis(preis);
        setMhz(2000);
    }
    public Camputer()
    {
        setHersteller("Lenovo");
        setLaptop(true);
        setPreis(899);
        setMhz(2000);
    }
        
    
    public String getHersteller()
    {
        return hersteller;
    }
    public String getModell()
    {
        return modell;
    }
    public boolean getLaptop()
    {
        return laptop;
    }
    public int getPreis()
    {
        return preis;
    }
    public int getMhz()
    {
        return mhz;
    }
   
    

    public void setHersteller(String hersteller)
    {
        this.hersteller = hersteller;
    }
    public void setModell(String modell)
    {
        this.modell = modell;
    }
    public void setLaptop( boolean laptop)
    {
        this.laptop = laptop;
    }
    public void setPreis(int preis)
    {
        this.preis = preis;
    }
    public void setMhz( int mhz)
    {
        if ((mhz >= 1000) && ( mhz <= 4000))
        {
            this.mhz = mhz;
        }
        else
        {
            System.out.println( "fehler: wert muss zwiechen 1000 und 4000 sein!");
            this.mhz = 2000;
        }
    }
    
    
    public String getKatergori() //modell: String = "L-14" >> L
    {
        String Kategorie;
        int pos;
        
        pos = modell.indexOf("-");
        Kategorie = modell.substring(0, pos); 
        
        return Kategorie;
    }
    public String getDisplay() // modell: String ="L_14" >> 14
    {
        String display;
        int pos;
        
        pos = modell.indexOf("-")+1;
        display = modell.substring(pos);
        
        return display;
    }
    
     
    
       public void printComputer()
    {
        System.out.println("hersteller" +" " + hersteller + " " + "laptop:" + " "+ laptop + "preis:" + preis + "mhz:" + mhz);
    }
}