package dev.Interfaces;

class Phone{
    void callNumber(String phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }

    void receiveCall(String phoneNumber){
        System.out.println("Receiving call from " + phoneNumber);
    }
}

interface Camera{
    void takePhoto();
    void recordVideo();
}

interface MusicPlayer{
    void playMusic();
    void pauseMusic();
}

class SmartPhone extends Phone implements Camera, MusicPlayer{

    @Override
    public void takePhoto(){
        System.out.println("Taking photo...");
    }

    @Override
    public void recordVideo(){
        System.out.println("Recording video...");
    }

    @Override
    public void playMusic(){
        System.out.println("Playing music...");
    }

    @Override
    public void pauseMusic(){
        System.out.println("Pausing music...");
    }
}

public class InterfaceMethodSmartPhone {

    public static void main(String[] args){
        SmartPhone sp = new SmartPhone();

        sp.callNumber("1234");
        sp.receiveCall("0987");

        sp.takePhoto();
        sp.recordVideo();
        sp.playMusic();
        sp.pauseMusic();

        Phone phoneRef = sp;
        phoneRef.callNumber("5678");

        Camera c = sp;
        c.takePhoto();

        MusicPlayer mp = sp;
        mp.playMusic();
    }
}
