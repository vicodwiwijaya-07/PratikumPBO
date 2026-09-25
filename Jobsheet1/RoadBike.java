public class RoadBike extends Bike {
    
        private int trieWidth;

        public void setTireWidth(int width) {
            trieWidth = width;
        }

        @Override
        public void printInfo(){
            super.printInfo();
            System.out.println("True Width : " + trieWidth + " mm");
            System.out.println("Bike Type : Road Bike ");
        }

        
    }

