package com.nativelibs4java.mono.library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a>, <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class MonoOpcode extends com.ochafik.lang.jnaerator.runtime.Structure<MonoOpcode, MonoOpcode.ByValue, MonoOpcode.ByReference> {
	public byte argument;
	public byte flow_type;
	public short opval;
	public MonoOpcode() {
		super();
	}
	public MonoOpcode(byte argument, byte flow_type, short opval) {
		super();
		this.argument = argument;
		this.flow_type = flow_type;
		this.opval = opval;
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected MonoOpcode newInstance() { return new MonoOpcode(); }
	public static MonoOpcode[] newArray(int arrayLength) {
		return com.ochafik.lang.jnaerator.runtime.Structure.newArray(MonoOpcode.class, arrayLength);
	}
	public static class ByReference extends MonoOpcode implements com.sun.jna.Structure.ByReference {}
	public static class ByValue extends MonoOpcode implements com.sun.jna.Structure.ByValue {}
}
