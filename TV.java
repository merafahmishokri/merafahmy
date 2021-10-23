package tv;

public class TV {
    static int channel;
    static int volumeLevel;
    boolean on;
    
    public TV()
    {
        channel=1;
        volumeLevel=1;
        on=true;
    }
    public void turnOn(){
        on=true;
    }
    public void turnOff(){
        on=false;
    }
    public void setChannel(int newChannel){
        if (newChannel<=120&&newChannel>=1)
            channel=newChannel;
            
    }
    public void setVolume(int newVolumeLevel){
        if (newVolumeLevel<=7&&newVolumeLevel>=1)
            volumeLevel=newVolumeLevel;
            
    }
    public void channelUp(){
        channel++;
    }
    public void channelDown(){
        channel--;
    }
    public void volumeUp(){
        volumeLevel++;
    }
    public void volumeDown(){
        volumeLevel--;
    }
    public static void main(String[] args) {
        
    }
    
}
