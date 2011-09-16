package com.nativelibs4java.mono.library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a>, <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class MonoArrayBounds extends com.ochafik.lang.jnaerator.runtime.Structure<MonoArrayBounds, MonoArrayBounds.ByValue, MonoArrayBounds.ByReference> {
	/// C type : mono_array_size_t
	public int length;
	/// C type : mono_array_lower_bound_t
	public int lower_bound;
	public MonoArrayBounds() {
		super();
	}
	/**
	 * @param length C type : mono_array_size_t<br>
	 * @param lower_bound C type : mono_array_lower_bound_t
	 */
	public MonoArrayBounds(int length, int lower_bound) {
		super();
		this.length = length;
		this.lower_bound = lower_bound;
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected MonoArrayBounds newInstance() { return new MonoArrayBounds(); }
	public static MonoArrayBounds[] newArray(int arrayLength) {
		return com.ochafik.lang.jnaerator.runtime.Structure.newArray(MonoArrayBounds.class, arrayLength);
	}
	public static class ByReference extends MonoArrayBounds implements com.sun.jna.Structure.ByReference {}
	public static class ByValue extends MonoArrayBounds implements com.sun.jna.Structure.ByValue {}
}
