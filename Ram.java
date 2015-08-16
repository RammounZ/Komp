package komp;

public class Ram {
    private int mb;
    
    public Ram(int mb)
    {
        this.mb = mb;
    }
    
    public void checkMb()
    {
        System.out.println("Объём оперативной памяти: " + mb);
    }
    
}
