package me.livesplitmobile;

/**
 * Created by MidKnight on 5/14/2017.
 */

public class Colors {
    public static int colorFromString(String colorName) {
        switch (colorName) {
            case "AheadGainingTime": return 0xFF00CC4B;
            case "AheadLosingTime": return 0xFF5CD689;
            case "BehindGainingTime": return 0xFFD65C5C;
            case "BehindLosingTime": return 0xFFCC0000;
            case "BestSegment": return 0xFFFFD500;
            case "NotRunning": return 0xFF999999;
            case "Paused": return 0xFF666666;
            case "PersonalBest": return 0xFF4DA6FF;
            default: return 0xFFEEEEEE;     }
    }
}
