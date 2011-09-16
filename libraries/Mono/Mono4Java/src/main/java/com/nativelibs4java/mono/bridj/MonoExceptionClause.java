package com.nativelibs4java.mono.bridj;
import com.nativelibs4java.mono.bridj.MonoLibrary.MonoClass;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Union;
/**
 * <i>native declaration : /Library/Frameworks/Mono.framework/Headers/mono-2.0/mono/metadata/metadata.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("mono") 
public class MonoExceptionClause extends StructObject {
	public MonoExceptionClause() {
		super();
	}
	public MonoExceptionClause(Pointer pointer) {
		super(pointer);
	}
	@Field(0) 
	public int flags() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public MonoExceptionClause flags(int flags) {
		this.io.setIntField(this, 0, flags);
		return this;
	}
	@Field(1) 
	public int try_offset() {
		return this.io.getIntField(this, 1);
	}
	@Field(1) 
	public MonoExceptionClause try_offset(int try_offset) {
		this.io.setIntField(this, 1, try_offset);
		return this;
	}
	@Field(2) 
	public int try_len() {
		return this.io.getIntField(this, 2);
	}
	@Field(2) 
	public MonoExceptionClause try_len(int try_len) {
		this.io.setIntField(this, 2, try_len);
		return this;
	}
	@Field(3) 
	public int handler_offset() {
		return this.io.getIntField(this, 3);
	}
	@Field(3) 
	public MonoExceptionClause handler_offset(int handler_offset) {
		this.io.setIntField(this, 3, handler_offset);
		return this;
	}
	@Field(4) 
	public int handler_len() {
		return this.io.getIntField(this, 4);
	}
	@Field(4) 
	public MonoExceptionClause handler_len(int handler_len) {
		this.io.setIntField(this, 4, handler_len);
		return this;
	}
	/// C type : data_union
	@Field(5) 
	public com.nativelibs4java.mono.bridj.MonoMarshalSpec.data_union data() {
		return this.io.getNativeObjectField(this, 5);
	}
	/// <i>native declaration : /Library/Frameworks/Mono.framework/Headers/mono-2.0/mono/metadata/metadata.h:287</i>
	@Union 
	public static class data_union extends StructObject {
		public data_union() {
			super();
		}
		public data_union(Pointer pointer) {
			super(pointer);
		}
		@Field(0) 
		public int filter_offset() {
			return this.io.getIntField(this, 0);
		}
		@Field(0) 
		public data_union filter_offset(int filter_offset) {
			this.io.setIntField(this, 0, filter_offset);
			return this;
		}
		/// C type : MonoClass*
		@Field(1) 
		public Pointer<MonoClass > catch_class() {
			return this.io.getPointerField(this, 1);
		}
		/// C type : MonoClass*
		@Field(1) 
		public data_union catch_class(Pointer<MonoClass > catch_class) {
			this.io.setPointerField(this, 1, catch_class);
			return this;
		}
	};
}
