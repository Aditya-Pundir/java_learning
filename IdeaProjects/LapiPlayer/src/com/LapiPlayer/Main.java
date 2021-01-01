package com.LapiPlayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;



class LapiPlayer{
    public void playMusic(String pathName) throws IOException, LineUnavailableException, UnsupportedAudioFileException {
        Scanner sc = new Scanner(System.in);
        File file = new File(pathName);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";

        while (!response.equals("Q")){
            System.out.print("Enter your choice here: ");
            response = sc.next();
            response = response.toUpperCase();

            switch (response) {
                case ("P") -> clip.start();
                case ("S") -> clip.stop();
                case ("R") -> clip.setMicrosecondPosition(0);
                case ("Q") -> {
                    clip.close();
                    System.out.println("Bye!");
                }
                default -> System.out.println("Not a valid response!");
            }
        }
    }
}
public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        LapiPlayer myLapiPlayer = new LapiPlayer();
        System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
        String[] arr = new String[7];
        arr[0] = "C:\\Users\\HP-PC\\Downloads\\wav_folder\\Cartoon - On  On (feat. Daniel Levi) [NCS Release].wav";
        arr[1] = "C:\\Users\\HP-PC\\Downloads\\wav_folder\\Alan Walker - Fade [NCS Release].wav";
        arr[2] = "C:\\Users\\HP-PC\\Downloads\\wav_folder\\Disfigure - Blank [NCS Release].wav";
        arr[3] = "C:\\Users\\HP-PC\\Downloads\\wav_folder\\DJ Snake, Selena Gomez, Cardi B, Ozuna - Taki Taki.wav";
        arr[4] = "C:\\Users\\HP-PC\\Downloads\\wav_folder\\DJ Snake - Magenta Riddim.wav";
        arr[5] = "C:\\Users\\HP-PC\\Downloads\\wav_folder\\Dwayne DJ Bravo - Champion (Official Song).wav";
        arr[6] = "C:\\Users\\HP-PC\\Downloads\\wav_folder\\DJ Snake ft. Justin Bieber - Let Me Love You.wav";
        Random r = new Random();
        int myInt = r.nextInt(arr.length);
        myLapiPlayer.playMusic(arr[myInt]);


    }
}
