package net.typhonmc.typhfun.helpers;

import java.util.HashMap;

public class Color {
    byte red,green,blue;

    public Color() {
        setColor( (byte)0, (byte)0, (byte)0 );
    }
    public Color(String color) {
        setColor( color.toCharArray() );
    }
    public Color(byte red, byte green, byte blue) {
        setColor(red, green, blue);
    }

    public void setColor(byte red, byte green, byte blue) {
        this.red = red; this.green = green; this.blue = blue;
    }
    public void setColor(char[] hexidecimal) {
        System.out.println( new String(hexidecimal) );
        setColor( (byte)0, (byte)0, (byte)0 );
        if(hexidecimal.length != 7) { return; }

        boolean isValid = true;
        char[] hex_digits = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        for(int i = 1; i < 7; i++) {
            if(  !Formatter.includes(hex_digits, Character.toUpperCase( hexidecimal[i] ) )  ) {
                isValid = false;
            }
        }
        if(!isValid) {
            setColor( (byte)0, (byte)0, (byte)0 );
        } else {
            HashMap<Character,Byte> value = new HashMap<>(); {
                value.put('0', (byte)0  ); value.put('1', (byte)1  ); value.put('2', (byte)2  ); value.put('3', (byte)3  );
                value.put('4', (byte)4  ); value.put('5', (byte)5  ); value.put('6', (byte)6  ); value.put('7', (byte)7  );
                value.put('8', (byte)8  ); value.put('9', (byte)9  ); value.put('A', (byte)10 ); value.put('B', (byte)11 );
                value.put('C', (byte)12 ); value.put('D', (byte)13 ); value.put('E', (byte)14 ); value.put('F', (byte)15 );
            }

            red += value.get( hexidecimal[1] ); red <<= 4; //*= 16
            red += value.get( hexidecimal[2] );

            green += value.get( hexidecimal[3] ); green <<= 4; //*= 16
            green += value.get( hexidecimal[4] );

            blue += value.get( hexidecimal[5] ); blue <<= 4; //*= 16
            blue += value.get( hexidecimal[6] );
        }
    }

    public String toString() {
        return Colors.toString(this, "");
    }
    public String toString(String intersplice) {
        return Colors.toString(this, intersplice);
    }

}
