package com.ochafik.lang.jnaerator.nativesupport.dllexport;
/**
 * <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a>, <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class IMAGE_OPTIONAL_HEADER extends com.ochafik.lang.jnaerator.runtime.Structure<IMAGE_OPTIONAL_HEADER, IMAGE_OPTIONAL_HEADER.ByValue, IMAGE_OPTIONAL_HEADER.ByReference> {
	public short Magic;
	public byte MajorLinkerVersion;
	public byte MinorLinkerVersion;
	public int SizeOfCode;
	public int SizeOfInitializedData;
	public int SizeOfUninitializedData;
	public int AddressOfEntryPoint;
	public int BaseOfCode;
	public int BaseOfData;
	public int ImageBase;
	public int SectionAlignment;
	public int FileAlignment;
	public short MajorOperatingSystemVersion;
	public short MinorOperatingSystemVersion;
	public short MajorImageVersion;
	public short MinorImageVersion;
	public short MajorSubsystemVersion;
	public short MinorSubsystemVersion;
	public int Reserved1;
	public int SizeOfImage;
	public int SizeOfHeaders;
	public int CheckSum;
	public short Subsystem;
	public short DllCharacteristics;
	public int SizeOfStackReserve;
	public int SizeOfStackCommit;
	public int SizeOfHeapReserve;
	public int SizeOfHeapCommit;
	public int LoaderFlags;
	public int NumberOfRvaAndSizes;
	public com.ochafik.lang.jnaerator.nativesupport.dllexport.IMAGE_DATA_DIRECTORY[] DataDirectory = new com.ochafik.lang.jnaerator.nativesupport.dllexport.IMAGE_DATA_DIRECTORY[(16)];
	public IMAGE_OPTIONAL_HEADER() {
		super();
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected IMAGE_OPTIONAL_HEADER newInstance() { return new IMAGE_OPTIONAL_HEADER(); }
	public static class ByReference extends IMAGE_OPTIONAL_HEADER implements com.sun.jna.Structure.ByReference {}
	public static class ByValue extends IMAGE_OPTIONAL_HEADER implements com.sun.jna.Structure.ByValue {}
}
