package com.nativelibs4java.directx.d3d10;
import org.bridj.Pointer;
import org.bridj.ann.Library;
/**
 * <i>native declaration : d3d10.h:380</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("d3d10") 
public class CD3D10_TEXTURE1D_DESC extends D3D10_TEXTURE1D_DESC {
	public CD3D10_TEXTURE1D_DESC() {
		super();
	}
	public CD3D10_TEXTURE1D_DESC(Pointer pointer) {
		super(pointer);
	}
	public native Pointer<D3D10_TEXTURE1D_DESC > operator();
}
