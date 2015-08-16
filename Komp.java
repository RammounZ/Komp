package komp;

public class Komp {
    private Processor processor;
    private Ssd ssd;
    private Cdrom cdrom;
    private Ram ram;
    
    public Komp(Processor processor, Ssd ssd, Cdrom cdrom, Ram ram)
    {
        this.cdrom = cdrom;
        this.ram = ram;
        this.ssd = ssd;
        this.processor = processor;
    }

    public static void main(String[] args) {
        Komp newKomp = new Komp(new Processor(true), new Ssd(40), new Cdrom(true), new Ram(4096));
        newKomp.checkAll();
        
    }
    
    public void checkAll()
    {
        processor.checkProc();
        cdrom.checkCd();
        ram.checkMb();
        ssd.checkSsd();
    }
}
