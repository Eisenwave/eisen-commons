package eisenwave.commons.util;

public final class PrimParse {
    
    private PrimParse() {}
    
    // LONG
    
    public static long parseLong(String s, long d, int radix) {
        try {
            return Long.parseLong(s, radix);
        } catch (NumberFormatException ex) {
            return d;
        }
    }
    
    public static long parseLong(String s, long d) {
        return parseLong(s, d, 10);
    }
    
    public static long parseLong(String s) {
        return parseLong(s, 0, 10);
    }
    
    public static int parseInt(String s, int d, int radix) {
        try {
            return Integer.parseInt(s, radix);
        } catch (NumberFormatException ex) {
            return d;
        }
    }
    
    public static int parseInt(String s, int d) {
        return parseInt(s, d, 10);
    }
    
    public static int parseInt(String s) {
        return parseInt(s, 0, 10);
    }
    
    public static short parseShort(String s, short d, int radix) {
        try {
            return Short.parseShort(s, radix);
        } catch (NumberFormatException ex) {
            return d;
        }
    }
    
    public static short parseShort(String s, short d) {
        return parseShort(s, d, 10);
    }
    
    public static char parseChar(String s, char d, int radix) {
        try {
            return (char) Integer.parseInt(s, radix);
        } catch (NumberFormatException ex) {
            return d;
        }
    }
    
    public static char parseChar(String s, char d) {
        return parseChar(s, d, 10);
    }
    
    public static byte parseByte(String s, byte d, int radix) {
        try {
            return Byte.parseByte(s, radix);
        } catch (NumberFormatException ex) {
            return d;
        }
    }
    
    public static byte parseByte(String s, byte d) {
        return parseByte(s, d, 10);
    }
    
    public static byte parseByte(String s) {
        return parseByte(s, (byte) 0, 10);
    }
    
    public static float parseFloat(String s, float d) {
        try {
            return Float.parseFloat(s);
        } catch (NumberFormatException ex) {
            return d;
        }
    }
    
    public static double parseDouble(String s, double d) {
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException ex) {
            return d;
        }
    }
    
    /**
     * Returns true if the string equals "true" or "yes" ignoring case.
     *
     * @param s the String
     */
    public static boolean parseBoolean(String s) {
        return s.equalsIgnoreCase("true") || s.equalsIgnoreCase("yes");
    }
    
    /**
     * Returns null if the string equals "null" ignoring case, else return the string.
     *
     * @param s the string
     */
    public static String parseNull(String s) {
        return s.equalsIgnoreCase("null")? null : s;
    }
    
}
