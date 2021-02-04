package org.horizoncolumbus.hs;

import java.awt.*;
import java.net.URI;

public class Main {

    public static void main(String[] args) {

        String[] newArray = new String[3];

        newArray[0] = "https://classroom.google.com/u/0/h";
        newArray[1] = "https://zoom.us/signin";
        newArray[2] = "https://www.youtube.com/watch?v=s49CT4DTAkw";

        for (int i = 0; i < newArray.length; i++){
            try {
                Desktop desktop = java.awt.Desktop.getDesktop();
                URI oURL = new URI(newArray[i]);
                desktop.browse(oURL);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
