public class Phone {
        private String brand;
        private String model;
        private double price;
        private int year;
        private boolean isOn;
        private boolean isLoked;
        private boolean isSmart;
        private char size;
        private  String[] features;

        public Phone(String brand, String model, double price , int year,boolean isOn, boolean isLoked, boolean isSmart,char size,String[] features){
            this.brand = brand;
            this.model = model;
            this.price = price;
            this.year = year;
            this.isOn = isOn;
            this.isLoked = isLoked;
            this.size = size;
            this.features = features;
        }

        public void setBrand(String brand){
            if(brand != null){
            this.brand = brand;
        }}
        public String getBrand(){
            return brand;
        }
        public void setModel(String model){
            if(model != null){
            this.model = model;
        }}
        public String getModel(){
            return model;
        }
        public void setPrice(int price){
            if(price > 0){
            this.price = price;
        }}
        public double getPrice(){
            return price;
        }
        public void setYear(int year){
            if(year>=2000){
                this.year = year;
        }}
        public int getYear(){
            return year;
        }
        public void setOn(boolean isOn){

            this.isOn = isOn;
        }
        public boolean getOn(){
            return isOn;
        }
        public void setLoked(boolean isLoked){
            this.isLoked = isLoked;
        }
        public boolean getLoked(){
            return isLoked;
        }
        public void setSmart(boolean isSmart){
            this.isSmart = isSmart;
        }
        public boolean getSmart(){
            return isSmart;
        }
        public void setSize(char size){
            if(size=='S' || size =='M' || size=='L' || size=='s' || size=='m' || size=='l') {
                this.size = size;
            }
        }
        public char getSize(){
            return size;
        }
        public void setFeatures(String [] features){
            this.features = features;
        }
        public String[] getFeatures(){
            return features;
        }



        public void PowerOn(){
            isOn = true;
        }
        public void PowerOff(){
            isOn =false;
        }
        public void lock(){
            isLoked = true;
        }
        public void unlock(){
            isLoked = false;
        }
        public String makeCall(String number){
            if(isOn ==true && isLoked == true ){
                number = "Calling "+ number;
            }else{
                number = "Can't make call!! ";
            }
            return number;
        }


        public String toString(){
             return "The Brand: " + getBrand() +
                "\nThe Model: " + getModel() +
                "\nPrice: " + getPrice() +
                "\nYear: " + getYear() +
                "\nThe Light is " + getOn() +
                "\nThe Door is " + getLoked() +
                "\nThe person is " + getSmart() +
                "\nThe Size is " + getSize() +
                "\nThe Features " + getFeatures()+ makeCall("0549186655");
    }




}
