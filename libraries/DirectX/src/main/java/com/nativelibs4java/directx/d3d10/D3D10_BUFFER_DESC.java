package com.nativelibs4java.directx.d3d10;
import com.nativelibs4java.directx.d3d10.D3d10Library.D3D10_USAGE;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ValuedEnum;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : d3d10.h:314</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("d3d10") 
public class D3D10_BUFFER_DESC extends StructObject {
	public D3D10_BUFFER_DESC() {
		super();
	}
	public D3D10_BUFFER_DESC(Pointer pointer) {
		super(pointer);
	}
	@Field(0) 
	public int ByteWidth() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public D3D10_BUFFER_DESC ByteWidth(int ByteWidth) {
		this.io.setIntField(this, 0, ByteWidth);
		return this;
	}
	/// C type : D3D10_USAGE
	@Field(1) 
	public ValuedEnum<D3D10_USAGE > Usage() {
		return this.io.getEnumField(this, 1);
	}
	/// C type : D3D10_USAGE
	@Field(1) 
	public D3D10_BUFFER_DESC Usage(ValuedEnum<D3D10_USAGE > Usage) {
		this.io.setEnumField(this, 1, Usage);
		return this;
	}
	@Field(2) 
	public int BindFlags() {
		return this.io.getIntField(this, 2);
	}
	@Field(2) 
	public D3D10_BUFFER_DESC BindFlags(int BindFlags) {
		this.io.setIntField(this, 2, BindFlags);
		return this;
	}
	@Field(3) 
	public int CPUAccessFlags() {
		return this.io.getIntField(this, 3);
	}
	@Field(3) 
	public D3D10_BUFFER_DESC CPUAccessFlags(int CPUAccessFlags) {
		this.io.setIntField(this, 3, CPUAccessFlags);
		return this;
	}
	@Field(4) 
	public int MiscFlags() {
		return this.io.getIntField(this, 4);
	}
	@Field(4) 
	public D3D10_BUFFER_DESC MiscFlags(int MiscFlags) {
		this.io.setIntField(this, 4, MiscFlags);
		return this;
	}
}
