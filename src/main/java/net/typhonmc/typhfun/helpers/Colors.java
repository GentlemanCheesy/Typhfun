package net.typhonmc.typhfun.helpers;

import java.util.HashMap;

import static net.typhonmc.typhfun.helpers.Formatter.true_prefix;

public class Colors {

    public static String toString(Color color, String intersplice) {
        StringBuilder buffer = new StringBuilder();
        buffer.append(intersplice); if( !intersplice.isEmpty() ) { buffer.append(true_prefix); }

        HashMap<Byte,Character> value = new HashMap<>(); {
            value.put( (byte)0 , '0' );

                                         value.put( (byte)-13, '3' ); value.put( (byte)-14, '2' ); value.put( (byte)-15, '1' );
            value.put( (byte)-9 , '7' ); value.put( (byte)-10, '6' ); value.put( (byte)-11, '5' ); value.put( (byte)-12, '4' );
            value.put( (byte)-5 , 'B' ); value.put( (byte)-6 , 'A' ); value.put( (byte)-7 , '9' ); value.put( (byte)-8 , '8' );
            value.put( (byte)-1 , 'F' ); value.put( (byte)-2 , 'E' ); value.put( (byte)-3 , 'D' ); value.put( (byte)-4 , 'C' );

                                        value.put( (byte)1 , '1' ); value.put( (byte)2 , '2' ); value.put( (byte)3 , '3' );
            value.put( (byte)4 , '4' ); value.put( (byte)5 , '5' ); value.put( (byte)6 , '6' ); value.put( (byte)7 , '7' );
            value.put( (byte)8 , '8' ); value.put( (byte)9 , '9' ); value.put( (byte)10, 'A' ); value.put( (byte)11, 'B' );
            value.put( (byte)12, 'C' ); value.put( (byte)13, 'D' ); value.put( (byte)14, 'E' ); value.put( (byte)15, 'F' );
        }

        buffer.append(intersplice).append(  value.get( (byte)(color.red/16) )  );
        buffer.append(intersplice).append(  value.get( (byte)(color.red%16) )  );

        buffer.append(intersplice).append(  value.get( (byte)(color.green/16) )  );
        buffer.append(intersplice).append(  value.get( (byte)(color.green%16) )  );

        buffer.append(intersplice).append(  value.get( (byte)(color.blue/16) )  );
        buffer.append(intersplice).append(  value.get( (byte)(color.blue%16) )  );

        return buffer.toString();
    }

    private static short unsignedByteToSignedShort(byte signed_byte) {
        boolean was_negative = false;
        if(signed_byte < 0) {
            signed_byte &= 0b01111111;
            was_negative = true;
        }

        if(was_negative) {
            return (short)( (short)(signed_byte) + (short)0b10000000 );
        } else {
            return signed_byte;
        }
    }
    public static Color[] linear_interpolation(Color from, Color to, int count) {
        Color[] colors = new Color[count]; {
            for(int i = 0; i < count; i++) {
                colors[i] = new Color(
                        (byte)( i*( unsignedByteToSignedShort(from.red  ) )/count + (count-i)*( unsignedByteToSignedShort(to.red  ) )/count ),
                        (byte)( i*( unsignedByteToSignedShort(from.green) )/count + (count-i)*( unsignedByteToSignedShort(to.green) )/count ),
                        (byte)( i*( unsignedByteToSignedShort(from.blue ) )/count + (count-i)*( unsignedByteToSignedShort(to.blue ) )/count )
                );
            }
        }

        return colors;
    }

}
