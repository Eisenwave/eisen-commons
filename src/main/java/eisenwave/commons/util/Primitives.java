package eisenwave.commons.util;

import org.jetbrains.annotations.Contract;

public final class Primitives {
    
    private Primitives() {}
    
    @Contract(pure = true)
    public static Class<?> primitiveByName(String str) throws ClassNotFoundException {
        switch (str) {
            case "int": return Integer.TYPE;
            case "long": return Long.TYPE;
            case "double": return Double.TYPE;
            case "float": return Float.TYPE;
            case "bool": return Boolean.TYPE;
            case "char": return Character.TYPE;
            case "byte": return Byte.TYPE;
            case "void": return Void.TYPE;
            case "short": return Short.TYPE;
            default: throw new ClassNotFoundException(str+" is not a primitive");
        }
    }
    
}
