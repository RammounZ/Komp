package komp;

public class Processor {
        private boolean statusProc;
        
        public Processor(boolean statusProc)
        {
            this.statusProc = statusProc;
        }
        
        public void checkProc()
        {
            if (statusProc == true)
            {
                System.out.println("Комьпьютер включён.");
            }
            else
            {
                System.out.println("Компьютер выключен.");
            }
        }
    }
