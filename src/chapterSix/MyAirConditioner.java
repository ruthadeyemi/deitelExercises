package chapterSix;

public class MyAirConditioner {

    public int currentTemperature;
    private boolean isOn;
    private int temperature;

    public  MyAirConditioner(String acName){
        }

        public boolean isOn(){

        return isOn;
        }

        public void turnOn(){
            isOn = true;
        }
        public void turnOff(){
            isOn = false;
        }

        public int getTemperature(){
            if(isOn) return temperature;
            return 0;
        }

        public void increaseTemperature(){
            if(isOn){
                if(temperature < 30){
                    temperature++;
                }
            }
        }
        public void decreaseTemperature(){
        if(isOn) {
            if (temperature > 16) {
                temperature--;
            }
        }
        }


}
