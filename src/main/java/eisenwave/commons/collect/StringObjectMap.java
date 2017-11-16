package eisenwave.commons.collect;

import org.jetbrains.annotations.NotNull;

public interface StringObjectMap {
    
    // ABSTRACT
    
    abstract Object get(@NotNull String key);
	
    abstract boolean containsKey(@NotNull String key);
    
    abstract void put(String key, Object value);
    
    // DEFAULT
    
	/**
     * <p>
     *     Tries to return an object in this map.
     * </p>
     * <p>
     *     If the object can not by found by the specified key, the fallback value is returned. If the specified class
     *     can not be assigned from the object's class, the fallback value is also returned.
     *     (using {@code Object.class}) effectively eliminates this check.)
     * </p>
	 * 
	 * @param <T> the type parameter of the fallback value and the class
	 * @param key the key
	 * @param fallback the fallback value
	 * @param clazz the class of the object (nonnull)
	 * @return the object found in the map or the fallback value
	 */
	@SuppressWarnings("unchecked")
	public default <T> T get(String key, T fallback, @NotNull Class<? super T> clazz) {
		if (!containsKey(key)) return fallback;
		Object value = get(key);
		if (value == null) return fallback;
		if (!clazz.isAssignableFrom(value.getClass())) return fallback;
		return (T) value;
	}
	
	/**
	 * Tries to return an object in this map. This method is identical to
	 * <blockquote>
     *     {@code getObject(key, null, clazz);}
	 * </blockquote>
	 * @param <T> the type parameter of the fallback value and the class
	 * @param key the key
	 * @param clazz the class of the object (nonnull)
	 * @return the object found in the map or null
	 */
	@SuppressWarnings("unchecked")
    public default <T> T get(String key, Class<? super T> clazz) {
		return (T) get(key, null, clazz);
	}
	
	/**
	 * Tries to return an object in this map. This method is identical to
	 * <blockquote>
     *     {@code getObject(key, fallback, Object.class);}
	 * </blockquote>
	 * @param key the key
	 * @param fallback the fallback value in case the value can not be found
	 * @return the object found in the map or the fallback value
	 */
    default Object get(String key, Object fallback) {
		return get(key, fallback, Object.class);
	}
	
    default long getLong(String key, long fallback) {
		return get(key, fallback, Number.class);
	}
	
    default int getInt(String key, int fallback) {
        return get(key, fallback, Number.class);
	}
	
    default short getShort(String key, short fallback) {
        return get(key, fallback, Number.class);	}
	
    default byte getByte(String key, byte fallback) {
        return get(key, fallback, Number.class);	}
	
    default double getDouble(String key, double fallback) {
        return get(key, fallback, Number.class);	}
	
    default float getFloat(String key, float fallback) {
        return get(key, fallback, Number.class);	}
	
    default boolean getBoolean(String key, boolean fallback) {
        return get(key, fallback, Boolean.class);	}
	
	//DEFAULT FALLBACK VALUES
	
    default long getLong(String key) {
		return getLong(key, 0);
	}
	
    default int getInt(String key) {
		return getInt(key, 0);
	}
	
    default short getShort(String key) {
		return getShort(key, (short) 0);
	}
	
    default byte getByte(String key) {
		return getByte(key, (byte) 0);
	}
	
    default double getDouble(String key) {
		return getDouble(key, 0);
	}
	
    default float getFloat(String key) {
		return getFloat(key, 0);
	}
	
    default boolean getBoolean(String key) {
		return get(key, Boolean.class);
	}

}
