package com.nativelibs4java.ffmpeg.avformat;
import com.nativelibs4java.ffmpeg.avcodec.AvcodecLibrary.AVDiscard;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ValuedEnum;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : libavformat/avformat.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avformat") 
public class AVProgram extends StructObject {
	public AVProgram() {
		super();
	}
	public AVProgram(Pointer pointer) {
		super(pointer);
	}
	@Field(0) 
	public int id() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public AVProgram id(int id) {
		this.io.setIntField(this, 0, id);
		return this;
	}
	public final int id_$eq(int id) {
		id(id);
		return id;
	}
	/**
	 * < network name for DVB streams<br>
	 * C type : char*
	 */
	@Field(1) 
	public Pointer<Byte > provider_name() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * < network name for DVB streams<br>
	 * C type : char*
	 */
	@Field(1) 
	public AVProgram provider_name(Pointer<Byte > provider_name) {
		this.io.setPointerField(this, 1, provider_name);
		return this;
	}
	/// C type : char*
	public final Pointer<Byte > provider_name_$eq(Pointer<Byte > provider_name) {
		provider_name(provider_name);
		return provider_name;
	}
	/**
	 * < service name for DVB streams<br>
	 * C type : char*
	 */
	@Field(2) 
	public Pointer<Byte > name() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * < service name for DVB streams<br>
	 * C type : char*
	 */
	@Field(2) 
	public AVProgram name(Pointer<Byte > name) {
		this.io.setPointerField(this, 2, name);
		return this;
	}
	/// C type : char*
	public final Pointer<Byte > name_$eq(Pointer<Byte > name) {
		name(name);
		return name;
	}
	@Field(3) 
	public int flags() {
		return this.io.getIntField(this, 3);
	}
	@Field(3) 
	public AVProgram flags(int flags) {
		this.io.setIntField(this, 3, flags);
		return this;
	}
	public final int flags_$eq(int flags) {
		flags(flags);
		return flags;
	}
	/**
	 * < selects which program to discard and which to feed to the caller<br>
	 * C type : AVDiscard
	 */
	@Field(4) 
	public ValuedEnum<AVDiscard > discard() {
		return this.io.getEnumField(this, 4);
	}
	/**
	 * < selects which program to discard and which to feed to the caller<br>
	 * C type : AVDiscard
	 */
	@Field(4) 
	public AVProgram discard(ValuedEnum<AVDiscard > discard) {
		this.io.setEnumField(this, 4, discard);
		return this;
	}
	/// C type : AVDiscard
	public final ValuedEnum<AVDiscard > discard_$eq(ValuedEnum<AVDiscard > discard) {
		discard(discard);
		return discard;
	}
	/// C type : unsigned int*
	@Field(5) 
	public Pointer<Integer > stream_index() {
		return this.io.getPointerField(this, 5);
	}
	/// C type : unsigned int*
	@Field(5) 
	public AVProgram stream_index(Pointer<Integer > stream_index) {
		this.io.setPointerField(this, 5, stream_index);
		return this;
	}
	/// C type : unsigned int*
	public final Pointer<Integer > stream_index_$eq(Pointer<Integer > stream_index) {
		stream_index(stream_index);
		return stream_index;
	}
	@Field(6) 
	public int nb_stream_indexes() {
		return this.io.getIntField(this, 6);
	}
	@Field(6) 
	public AVProgram nb_stream_indexes(int nb_stream_indexes) {
		this.io.setIntField(this, 6, nb_stream_indexes);
		return this;
	}
	public final int nb_stream_indexes_$eq(int nb_stream_indexes) {
		nb_stream_indexes(nb_stream_indexes);
		return nb_stream_indexes;
	}
	/// C type : AVMetadata*
	@Field(7) 
	public Pointer<AVMetadata > metadata() {
		return this.io.getPointerField(this, 7);
	}
	/// C type : AVMetadata*
	@Field(7) 
	public AVProgram metadata(Pointer<AVMetadata > metadata) {
		this.io.setPointerField(this, 7, metadata);
		return this;
	}
	/// C type : AVMetadata*
	public final Pointer<AVMetadata > metadata_$eq(Pointer<AVMetadata > metadata) {
		metadata(metadata);
		return metadata;
	}
}
