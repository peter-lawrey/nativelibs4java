package com.nativelibs4java.mono.library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a>, <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class MonoArray extends com.ochafik.lang.jnaerator.runtime.Structure<MonoArray, MonoArray.ByValue, MonoArray.ByReference> {
	/// C type : MonoObject
	public com.nativelibs4java.mono.library.MonoObject obj;
	/**
	 * bounds is NULL for szarrays<br>
	 * C type : MonoArrayBounds*
	 */
	public com.nativelibs4java.mono.library.MonoArrayBounds.ByReference bounds;
	/**
	 * total number of elements of the array<br>
	 * C type : mono_array_size_t
	 */
	public int max_length;
	/**
	 * we use double to ensure proper alignment on platforms that need it<br>
	 * C type : double[1]
	 */
	public double[] vector = new double[(1)];
	public MonoArray() {
		super();
	}
	/**
	 * @param obj C type : MonoObject<br>
	 * @param bounds bounds is NULL for szarrays<br>
	 * C type : MonoArrayBounds*<br>
	 * @param max_length total number of elements of the array<br>
	 * C type : mono_array_size_t<br>
	 * @param vector we use double to ensure proper alignment on platforms that need it<br>
	 * C type : double[1]
	 */
	public MonoArray(com.nativelibs4java.mono.library.MonoObject obj, com.nativelibs4java.mono.library.MonoArrayBounds.ByReference bounds, int max_length, double vector[]) {
		super();
		this.obj = obj;
		this.bounds = bounds;
		this.max_length = max_length;
		if (vector.length != this.vector.length) 
			throw new java.lang.IllegalArgumentException("Wrong array size !");
		this.vector = vector;
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected MonoArray newInstance() { return new MonoArray(); }
	public static MonoArray[] newArray(int arrayLength) {
		return com.ochafik.lang.jnaerator.runtime.Structure.newArray(MonoArray.class, arrayLength);
	}
	public static class ByReference extends MonoArray implements com.sun.jna.Structure.ByReference {}
	public static class ByValue extends MonoArray implements com.sun.jna.Structure.ByValue {}
}
