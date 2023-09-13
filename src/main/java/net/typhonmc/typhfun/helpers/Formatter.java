package net.typhonmc.typhfun.helpers;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import static net.typhonmc.typhfun.helpers.Colors.linear_interpolation;

public class Formatter {
    public static final String RIGHT = "&e&lRight Click&7 &r";
    public static final String SHIFT_RIGHT = "&e&lShift-Right Click&7 &r";
    public static final String LEFT = "&e&lLeft Click&7 &r";
    public static final String RIGHT_OR_LEFT = "&e&lRight/Left Click&7 &r";

    public static boolean includes(char[] list, char potential_element) {
        //list is not assumed to be sorted
        for(char element : list) {
            if(element == potential_element) { return true; }
        }
        return false;
    }
    private static int encodedLength(String colored_sentence, char[]... codes) {
        int i;

        //construct list of all special characters available
        List<Character> special_list = new ArrayList<>();
        for(char[] code : codes) {
            for(char element : code) {
                if( !special_list.contains(element) ) {
                    special_list.add(element);
                }
            }
        }
        //char[] special_characters = special_list.toArray(new char[0]);
        char[] special_characters = new char[special_list.size()];
        for(i = 0; i < special_characters.length; i++) {
            special_characters[i] = special_list.get(i);
        }

        StringBuilder uncolored_sentence = new StringBuilder();
        char[] sentence = colored_sentence.toCharArray(); char current_character, previous_character = ' ';
        for(i = 0; i < sentence.length; i++) {
            current_character = sentence[i];

            if(  !( (previous_character == '&' || previous_character == '§') && includes(special_characters, current_character) )  ) {
                uncolored_sentence.append(current_character);
            } else {
                uncolored_sentence.delete( uncolored_sentence.length()-1, uncolored_sentence.length() ); //remove last character, '&'
            }

            previous_character = current_character;
        }

        return uncolored_sentence.length();
    }
    private static String getLastCode(String sentence, char[] code_identifiers) {
        if(sentence.length() < 3) { return ""; }

        char[] quantized_sentence = sentence.toCharArray();
        for(int i = quantized_sentence.length-2; 0 <= i; i--) {
            if(quantized_sentence[i] == '&' && includes(code_identifiers, quantized_sentence[i+1]) ) {
                return new String( new char[]{'&',quantized_sentence[i+1]} );
            }
        }

        return "";
    }

    private static final int MAX_LENGTH = 35;
    public static String[] fixLore(boolean seperate, String... lores) {
        final char[] modifiers = new char[]{'k','l','m','n','o','r'};
        final char[] colors = new char[]{'x','0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

        List<String> lore = new ArrayList<>();
        if(seperate && 0 < lores.length) { lore.add(""); }

        //go through lore, ensuring that it never goes too far off the screen (horizontally)
        StringBuilder line = new StringBuilder();
        String last_modifier = "", last_color = "", previous_sentence = "";
        for(int i = 0; i < lores.length; i++) {
            for(String sentence : lores[i].split("\n") ) {
                last_modifier = getLastCode( previous_sentence.toLowerCase(), modifiers );
                last_color = getLastCode( previous_sentence.toLowerCase(), colors );

                for(String word : sentence.split(" ") ) {
                    if(line.length() < 1) {
                        line.append(last_modifier).append(last_color).append(word);
                        continue;
                    }

                    if(MAX_LENGTH < encodedLength(line.toString(), modifiers,colors)+encodedLength(word, modifiers,colors) ) {
                        lore.add( line.toString() );
                        last_modifier = getLastCode( line.toString().toLowerCase(), modifiers );
                        last_color = getLastCode( line.toString().toLowerCase(), colors );
                        line.setLength(0);
                        line.append(last_modifier).append(last_color).append(word);
                    } else {
                        line.append(" ").append(word);
                    }
                }
                if(!sentence.isEmpty() ) {
                    lore.add(  last_modifier+last_color+( line.toString() )  );
                    line.setLength(0);
                }
                previous_sentence = sentence;
            }
            if(i < lores.length-1) { lore.add(""); }
        }

        return lore.toArray(new String[0]);
    }
    public static String ability(String name, String description) {
        return "&6Ability&7: "+name +"\n" +description;
    }

    private static final char[] hidden_aliases = new char[]{'&'}; public static final char true_name = '§';
    private static final char[] modifier_codes = new char[]{'k','l','m','n','o','r','K','L','M','N','O','R'};
    private static final char[] hex_digits = new char[]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','A','B','C','D','E','F'};
    private static final char[] hexidecimal_aliases = new char[]{'x','X'}; public static final char true_prefix = 'x';


    public static String simple(String uncolored) {
        StringBuilder buffer = new StringBuilder();

        //correct aliases
        boolean isCode;
        char previous = ' ';
        for( char current : uncolored.toCharArray() ) {
            isCode = false;
            if(  includes(hidden_aliases,previous) && ( includes(modifier_codes, current) || includes(hex_digits, current) )  ) {
                isCode = true;
                buffer.setLength( buffer.length()-1 );
                buffer.append(true_name);
            }
            if(isCode) {
                buffer.append( Character.toLowerCase(current) );
            } else {
                buffer.append(current);
            }

            previous = current;
        }

        char[] first_pass = buffer.toString().toCharArray();
        buffer.setLength(0);

        final int HEX_LENGTH = 12; int i, j;
        char current; previous = ' ';
        for(i = 0; i < first_pass.length; i++) {
            current = first_pass[i];
            if( includes(hidden_aliases,previous) && includes(hexidecimal_aliases,current) ) {
                if(first_pass.length-i+1 < HEX_LENGTH) {
                    buffer.append(current);
                    previous = current;
                    continue;
                }

                isCode = true;
                for(j = i+1; j < i+HEX_LENGTH+1; j+=2) {
                    if(first_pass[j] != true_name) { isCode = false; }
                }
                for(j = i+2; j < i+HEX_LENGTH+1; j+=2) {
                    if(  !includes( hex_digits, first_pass[j] )  ) { isCode = false; }
                }
                if(!isCode) {
                    buffer.append(current);
                    previous = current;
                    continue;
                }

                buffer.setLength( buffer.length()-1 );
                buffer.append(true_name);
            }
            if(buffer.charAt( buffer.length()-1 ) == true_name) {
                buffer.append(true_prefix);
            } else {
                buffer.append(current);
            }

            previous = current;
        }

        return buffer.toString();
    }
    /*public static String simplify(String overcolored) {
        List<String> tokens = new ArrayList<>();
        StringBuilder buffer = new StringBuilder();

        char previous = ' ';
        for(char current : overcolored.toCharArray() ) {

        }

        return "";
    }*/

    public static String gradient(String value, Color from, Color to) {
        if( value.isEmpty() ) { return ""; }

        if(from == null) { from = new Color(); }
        if(to == null) { to = new Color(); }
        if(value.length() == 1) { return from.toString(  new String(new char[]{true_name} )  )+value; }

        int i, count = value.length();
        char[] quantized_value = value.toCharArray();
        Color[] colors = linear_interpolation(from, to, count);

        StringBuilder buffer = new StringBuilder();
        for(i = 0; i < count; i++) {
            buffer.append(   colors[i].toString(  new String(new char[]{true_name} )  )   ).append( quantized_value[i] );
        }

        return buffer.toString();
    }
    public static String gradient(String value, String hexidecimal_from, String hexidecimal_to) {
        Color from = new Color(hexidecimal_from);
        Color to = new Color(hexidecimal_to);

        return gradient(value, from, to);
    }
    //public static String gradient(String value, String... hexidecimal) {}

    //rainbow()
    //rainbow(hex start)
    //rainbow(color alpha)
    //rainbow(hex start, color alpha)

}
