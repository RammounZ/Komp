package komp;

public class Cdrom {
    private boolean status;
    
    public Cdrom(boolean status)
    {
        this.status = status;
    }
    public void checkCd()
    {
        if (status == true)
        {
            System.out.println("Вирусов нет.");
        }
        else
        {
            System.out.println("Обнаружен вирус.");
        }
    }
}
