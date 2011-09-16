package com.nativelibs4java.mono.library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a>, <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class MonoDebugMethodJitInfo extends com.ochafik.lang.jnaerator.runtime.Structure<MonoDebugMethodJitInfo, MonoDebugMethodJitInfo.ByValue, MonoDebugMethodJitInfo.ByReference> {
	/// C type : const char*
	public com.sun.jna.Pointer code_start;
	public int code_size;
	public int prologue_end;
	public int epilogue_begin;
	/// C type : const char*
	public com.sun.jna.Pointer wrapper_addr;
	public int num_line_numbers;
	/// C type : MonoDebugLineNumberEntry*
	public com.nativelibs4java.mono.library.MonoDebugLineNumberEntry.ByReference line_numbers;
	public int num_params;
	/// C type : MonoDebugVarInfo*
	public com.nativelibs4java.mono.library.MonoDebugVarInfo.ByReference this_var;
	/// C type : MonoDebugVarInfo*
	public com.nativelibs4java.mono.library.MonoDebugVarInfo.ByReference params;
	public int num_locals;
	/// C type : MonoDebugVarInfo*
	public com.nativelibs4java.mono.library.MonoDebugVarInfo.ByReference locals;
	public MonoDebugMethodJitInfo() {
		super();
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected MonoDebugMethodJitInfo newInstance() { return new MonoDebugMethodJitInfo(); }
	public static MonoDebugMethodJitInfo[] newArray(int arrayLength) {
		return com.ochafik.lang.jnaerator.runtime.Structure.newArray(MonoDebugMethodJitInfo.class, arrayLength);
	}
	public static class ByReference extends MonoDebugMethodJitInfo implements com.sun.jna.Structure.ByReference {}
	public static class ByValue extends MonoDebugMethodJitInfo implements com.sun.jna.Structure.ByValue {}
}
