package com.nativelibs4java.mono.bridj;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : /Library/Frameworks/Mono.framework/Headers/mono-2.0/mono/utils/mono-error.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("mono") 
public class MonoError extends StructObject {
	public MonoError() {
		super();
	}
	public MonoError(Pointer pointer) {
		super(pointer);
	}
	@Field(0) 
	public short error_code() {
		return this.io.getShortField(this, 0);
	}
	@Field(0) 
	public MonoError error_code(short error_code) {
		this.io.setShortField(this, 0, error_code);
		return this;
	}
	/// DON'T TOUCH
	@Field(1) 
	public short hidden_0() {
		return this.io.getShortField(this, 1);
	}
	/// DON'T TOUCH
	@Field(1) 
	public MonoError hidden_0(short hidden_0) {
		this.io.setShortField(this, 1, hidden_0);
		return this;
	}
	/**
	 * DON'T TOUCH<br>
	 * C type : void*[12]
	 */
	@Array({12}) 
	@Field(2) 
	public Pointer<Pointer<? > > hidden_1() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * DON'T TOUCH<br>
	 * C type : char[128]
	 */
	@Array({128}) 
	@Field(3) 
	public Pointer<Byte > hidden_2() {
		return this.io.getPointerField(this, 3);
	}
}
