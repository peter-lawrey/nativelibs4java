package com.ochafik.lang.jnaerator.nativesupport.dllexport;
/**
 * JNA Wrapper for library <b>DbgHelp</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a>, <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public interface DbgHelpLibrary extends com.sun.jna.Library {
	public static final com.ochafik.lang.jnaerator.nativesupport.dllexport.DbgHelpLibrary INSTANCE = (com.ochafik.lang.jnaerator.nativesupport.dllexport.DbgHelpLibrary)com.sun.jna.Native.loadLibrary(com.ochafik.lang.jnaerator.runtime.LibraryExtractor.getLibraryPath("DbgHelp", true, com.ochafik.lang.jnaerator.nativesupport.dllexport.DbgHelpLibrary.class), com.ochafik.lang.jnaerator.nativesupport.dllexport.DbgHelpLibrary.class, com.ochafik.lang.jnaerator.runtime.MangledFunctionMapper.DEFAULT_OPTIONS);
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int UNDNAME_NO_ACCESS_SPECIFIERS = (128);
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int UNDNAME_NO_SPECIAL_SYMS = (16384);
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int IMAGE_DIRECTORY_ENTRY_GLOBALPTR = 8;
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int UNDNAME_NO_MS_THISTYPE = (32);
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int IMAGE_DIRECTORY_ENTRY_DELAY_IMPORT = 13;
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int IMAGE_DIRECTORY_ENTRY_BOUND_IMPORT = 11;
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int UNDNAME_NAME_ONLY = (4096);
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int IMAGE_DIRECTORY_ENTRY_IAT = 12;
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int UNDNAME_NO_THISTYPE = (96);
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int IMAGE_DIRECTORY_ENTRY_RESOURCE = 2;
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int IMAGE_DIRECTORY_ENTRY_BASERELOC = 5;
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int IMAGE_DIRECTORY_ENTRY_LOAD_CONFIG = 10;
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int IMAGE_NUMBEROF_DIRECTORY_ENTRIES = 16;
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int UNDNAME_NO_THROW_SIGNATURES = (256);
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int UNDNAME_NO_ARGUMENTS = (8192);
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int IMAGE_DIRECTORY_ENTRY_TLS = 9;
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int IMAGE_DIRECTORY_ENTRY_EXCEPTION = 3;
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int UNDNAME_32_BIT_DECODE = (2048);
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int IMAGE_DIRECTORY_ENTRY_IMPORT = 1;
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int UNDNAME_NO_ALLOCATION_MODEL = (8);
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int UNDNAME_NO_RETURN_UDT_MODEL = (1024);
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int UNDNAME_NO_LEADING_UNDERSCORES = (1);
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int IMAGE_SIZEOF_SHORT_NAME = 8;
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int UNDNAME_COMPLETE = (0);
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int IMAGE_DIRECTORY_ENTRY_COM_DESCRIPTOR = 14;
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int IMAGE_DIRECTORY_ENTRY_DEBUG = 6;
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int UNDNAME_NO_CV_THISTYPE = (64);
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int UNDNAME_NO_MS_KEYWORDS = (2);
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int IMAGE_DIRECTORY_ENTRY_ARCHITECTURE = 7;
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int IMAGE_DIRECTORY_ENTRY_EXPORT = 0;
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int IMAGE_DIRECTORY_ENTRY_SECURITY = 4;
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int UNDNAME_NO_FUNCTION_RETURNS = (4);
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int UNDNAME_NO_MEMBER_TYPE = (512);
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int UNDNAME_NO_ALLOCATION_LANGUAGE = (16);
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int IMAGE_NT_SIGNATURE = 17744;
	/// <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h</i>
	public static final int IMAGE_DOS_SIGNATURE = 23117;
	/**
	 * Original signature : <code>UnDecorateSymbolName(PCSTR, PSTR, DWORD, DWORD)</code><br>
	 * <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h:166</i><br>
	 * @deprecated use the safer methods {@link #UnDecorateSymbolName(java.lang.String, com.ochafik.lang.jnaerator.runtime.StringPointer.ByValue, int, int)} and {@link #UnDecorateSymbolName(java.lang.String, java.nio.ByteBuffer, int, int)} instead
	 */
	@com.ochafik.lang.jnaerator.runtime.Mangling({"_Z20UnDecorateSymbolName5PCSTR4PSTR5DWORD5DWORD", "?UnDecorateSymbolName@@YGX5PCSTR4PSTR5DWORD5DWORD@Z"})
	@java.lang.Deprecated
	int UnDecorateSymbolName(com.sun.jna.ptr.ByteByReference name, com.sun.jna.ptr.ByteByReference outputString, int maxStringLength, int flags);
	/**
	 * Original signature : <code>UnDecorateSymbolName(PCSTR, PSTR, DWORD, DWORD)</code><br>
	 * <i>native declaration : C:\Prog\jnaerator\sources\com\ochafik\lang\jnaerator\nativesupport\dllexport.h:166</i>
	 */
	@com.ochafik.lang.jnaerator.runtime.Mangling({"_Z20UnDecorateSymbolName5PCSTR4PSTR5DWORD5DWORD", "?UnDecorateSymbolName@@YGX5PCSTR4PSTR5DWORD5DWORD@Z"})
	int UnDecorateSymbolName(java.lang.String name, java.nio.ByteBuffer outputString, int maxStringLength, int flags);
}
