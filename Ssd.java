package komp;

public class Ssd {
        private int gb;
        
        public Ssd(int gb)
        {
            this.gb = gb;
        }
        
        public void checkSsd()
        {
            System.out.println("Объём жёсткого диска: " + gb);
        }
}
