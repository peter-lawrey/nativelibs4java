package com.nativelibs4java.mono.library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a>, <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class MonoProfileCoverageEntry extends com.ochafik.lang.jnaerator.runtime.Structure<MonoProfileCoverageEntry, MonoProfileCoverageEntry.ByValue, MonoProfileCoverageEntry.ByReference> {
	/// C type : MonoMethod*
	public com.nativelibs4java.mono.library.MonoLibrary.MonoMethod method;
	public int iloffset;
	public int counter;
	/// C type : const char*
	public com.sun.jna.Pointer filename;
	public int line;
	public int col;
	public MonoProfileCoverageEntry() {
		super();
	}
	/**
	 * @param method C type : MonoMethod*<br>
	 * @param filename C type : const char*
	 */
	public MonoProfileCoverageEntry(com.nativelibs4java.mono.library.MonoLibrary.MonoMethod method, int iloffset, int counter, com.sun.jna.Pointer filename, int line, int col) {
		super();
		this.method = method;
		this.iloffset = iloffset;
		this.counter = counter;
		this.filename = filename;
		this.line = line;
		this.col = col;
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected MonoProfileCoverageEntry newInstance() { return new MonoProfileCoverageEntry(); }
	public static MonoProfileCoverageEntry[] newArray(int arrayLength) {
		return com.ochafik.lang.jnaerator.runtime.Structure.newArray(MonoProfileCoverageEntry.class, arrayLength);
	}
	public static class ByReference extends MonoProfileCoverageEntry implements com.sun.jna.Structure.ByReference {}
	public static class ByValue extends MonoProfileCoverageEntry implements com.sun.jna.Structure.ByValue {}
}
