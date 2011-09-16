package com.nativelibs4java.ffmpeg.avformat;
import com.nativelibs4java.ffmpeg.avcodec.AVPacket;
import com.nativelibs4java.ffmpeg.avcodec.AvcodecLibrary.CodecID;
import com.nativelibs4java.ffmpeg.avformat.AvformatLibrary.AVMetadata;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ValuedEnum;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : libavformat/avformat.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avformat") 
public class AVFormatContext extends StructObject {
	public AVFormatContext() {
		super();
	}
	public AVFormatContext(Pointer pointer) {
		super(pointer);
	}
	/**
	 * < Set by avformat_alloc_context.<br>
	 * C type : const AVClass*
	 */
	@Field(0) 
	public Pointer<? > av_class() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * < Set by avformat_alloc_context.<br>
	 * C type : const AVClass*
	 */
	@Field(0) 
	public AVFormatContext av_class(Pointer<? > av_class) {
		this.io.setPointerField(this, 0, av_class);
		return this;
	}
	/// C type : const AVClass*
	public final Pointer<? > av_class_$eq(Pointer<? > av_class) {
		av_class(av_class);
		return av_class;
	}
	/**
	 * Can only be iformat or oformat, not both at the same time.<br>
	 * C type : AVInputFormat*
	 */
	@Field(1) 
	public Pointer<AVInputFormat > iformat() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * Can only be iformat or oformat, not both at the same time.<br>
	 * C type : AVInputFormat*
	 */
	@Field(1) 
	public AVFormatContext iformat(Pointer<AVInputFormat > iformat) {
		this.io.setPointerField(this, 1, iformat);
		return this;
	}
	/// C type : AVInputFormat*
	public final Pointer<AVInputFormat > iformat_$eq(Pointer<AVInputFormat > iformat) {
		iformat(iformat);
		return iformat;
	}
	/// C type : AVOutputFormat*
	@Field(2) 
	public Pointer<AVOutputFormat > oformat() {
		return this.io.getPointerField(this, 2);
	}
	/// C type : AVOutputFormat*
	@Field(2) 
	public AVFormatContext oformat(Pointer<AVOutputFormat > oformat) {
		this.io.setPointerField(this, 2, oformat);
		return this;
	}
	/// C type : AVOutputFormat*
	public final Pointer<AVOutputFormat > oformat_$eq(Pointer<AVOutputFormat > oformat) {
		oformat(oformat);
		return oformat;
	}
	/// C type : void*
	@Field(3) 
	public Pointer<? > priv_data() {
		return this.io.getPointerField(this, 3);
	}
	/// C type : void*
	@Field(3) 
	public AVFormatContext priv_data(Pointer<? > priv_data) {
		this.io.setPointerField(this, 3, priv_data);
		return this;
	}
	/// C type : void*
	public final Pointer<? > priv_data_$eq(Pointer<? > priv_data) {
		priv_data(priv_data);
		return priv_data;
	}
	/// C type : ByteIOContext*
	@Field(4) 
	public Pointer<? > pb() {
		return this.io.getPointerField(this, 4);
	}
	/// C type : ByteIOContext*
	@Field(4) 
	public AVFormatContext pb(Pointer<? > pb) {
		this.io.setPointerField(this, 4, pb);
		return this;
	}
	/// C type : ByteIOContext*
	public final Pointer<? > pb_$eq(Pointer<? > pb) {
		pb(pb);
		return pb;
	}
	@Field(5) 
	public int nb_streams() {
		return this.io.getIntField(this, 5);
	}
	@Field(5) 
	public AVFormatContext nb_streams(int nb_streams) {
		this.io.setIntField(this, 5, nb_streams);
		return this;
	}
	public final int nb_streams_$eq(int nb_streams) {
		nb_streams(nb_streams);
		return nb_streams;
	}
	/// C type : AVStream*[20]
	@Array({20}) 
	@Field(6) 
	public Pointer<Pointer<AVStream > > streams() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * < input or output filename<br>
	 * C type : char[1024]
	 */
	@Array({1024}) 
	@Field(7) 
	public Pointer<Byte > filename() {
		return this.io.getPointerField(this, 7);
	}
	/// stream info
	@Field(8) 
	public long timestamp() {
		return this.io.getLongField(this, 8);
	}
	/// stream info
	@Field(8) 
	public AVFormatContext timestamp(long timestamp) {
		this.io.setLongField(this, 8, timestamp);
		return this;
	}
	public final long timestamp_$eq(long timestamp) {
		timestamp(timestamp);
		return timestamp;
	}
	/// C type : char[512]
	@Array({512}) 
	@Field(9) 
	public Pointer<Byte > title() {
		return this.io.getPointerField(this, 9);
	}
	/// C type : char[512]
	@Array({512}) 
	@Field(10) 
	public Pointer<Byte > author() {
		return this.io.getPointerField(this, 10);
	}
	/// C type : char[512]
	@Array({512}) 
	@Field(11) 
	public Pointer<Byte > copyright() {
		return this.io.getPointerField(this, 11);
	}
	/// C type : char[512]
	@Array({512}) 
	@Field(12) 
	public Pointer<Byte > comment() {
		return this.io.getPointerField(this, 12);
	}
	/// C type : char[512]
	@Array({512}) 
	@Field(13) 
	public Pointer<Byte > album() {
		return this.io.getPointerField(this, 13);
	}
	/// < ID3 year, 0 if none
	@Field(14) 
	public int year() {
		return this.io.getIntField(this, 14);
	}
	/// < ID3 year, 0 if none
	@Field(14) 
	public AVFormatContext year(int year) {
		this.io.setIntField(this, 14, year);
		return this;
	}
	public final int year_$eq(int year) {
		year(year);
		return year;
	}
	/// < track number, 0 if none
	@Field(15) 
	public int track() {
		return this.io.getIntField(this, 15);
	}
	/// < track number, 0 if none
	@Field(15) 
	public AVFormatContext track(int track) {
		this.io.setIntField(this, 15, track);
		return this;
	}
	public final int track_$eq(int track) {
		track(track);
		return track;
	}
	/**
	 * < ID3 genre<br>
	 * C type : char[32]
	 */
	@Array({32}) 
	@Field(16) 
	public Pointer<Byte > genre() {
		return this.io.getPointerField(this, 16);
	}
	/// < Format-specific flags, see AVFMTCTX_xx
	@Field(17) 
	public int ctx_flags() {
		return this.io.getIntField(this, 17);
	}
	/// < Format-specific flags, see AVFMTCTX_xx
	@Field(17) 
	public AVFormatContext ctx_flags(int ctx_flags) {
		this.io.setIntField(this, 17, ctx_flags);
		return this;
	}
	public final int ctx_flags_$eq(int ctx_flags) {
		ctx_flags(ctx_flags);
		return ctx_flags;
	}
	/**
	 * This buffer is only needed when packets were already buffered but<br>
	 * not decoded, for example to get the codec parameters in MPEG<br>
	 * streams.<br>
	 * C type : AVPacketList*
	 */
	@Field(18) 
	public Pointer<AVPacketList > packet_buffer() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * This buffer is only needed when packets were already buffered but<br>
	 * not decoded, for example to get the codec parameters in MPEG<br>
	 * streams.<br>
	 * C type : AVPacketList*
	 */
	@Field(18) 
	public AVFormatContext packet_buffer(Pointer<AVPacketList > packet_buffer) {
		this.io.setPointerField(this, 18, packet_buffer);
		return this;
	}
	/// C type : AVPacketList*
	public final Pointer<AVPacketList > packet_buffer_$eq(Pointer<AVPacketList > packet_buffer) {
		packet_buffer(packet_buffer);
		return packet_buffer;
	}
	/**
	 * Decoding: position of the first frame of the component, in<br>
	 * AV_TIME_BASE fractional seconds. NEVER set this value directly:<br>
	 * It is deduced from the AVStream values.
	 */
	@Field(19) 
	public long start_time() {
		return this.io.getLongField(this, 19);
	}
	/**
	 * Decoding: position of the first frame of the component, in<br>
	 * AV_TIME_BASE fractional seconds. NEVER set this value directly:<br>
	 * It is deduced from the AVStream values.
	 */
	@Field(19) 
	public AVFormatContext start_time(long start_time) {
		this.io.setLongField(this, 19, start_time);
		return this;
	}
	public final long start_time_$eq(long start_time) {
		start_time(start_time);
		return start_time;
	}
	/**
	 * Decoding: duration of the stream, in AV_TIME_BASE fractional<br>
	 * seconds. Only set this value if you know none of the individual stream<br>
	 * durations and also dont set any of them. This is deduced from the<br>
	 * AVStream values if not set.
	 */
	@Field(20) 
	public long duration() {
		return this.io.getLongField(this, 20);
	}
	/**
	 * Decoding: duration of the stream, in AV_TIME_BASE fractional<br>
	 * seconds. Only set this value if you know none of the individual stream<br>
	 * durations and also dont set any of them. This is deduced from the<br>
	 * AVStream values if not set.
	 */
	@Field(20) 
	public AVFormatContext duration(long duration) {
		this.io.setLongField(this, 20, duration);
		return this;
	}
	public final long duration_$eq(long duration) {
		duration(duration);
		return duration;
	}
	/// decoding: total file size, 0 if unknown
	@Field(21) 
	public long file_size() {
		return this.io.getLongField(this, 21);
	}
	/// decoding: total file size, 0 if unknown
	@Field(21) 
	public AVFormatContext file_size(long file_size) {
		this.io.setLongField(this, 21, file_size);
		return this;
	}
	public final long file_size_$eq(long file_size) {
		file_size(file_size);
		return file_size;
	}
	/**
	 * Decoding: total stream bitrate in bit/s, 0 if not<br>
	 * available. Never set it directly if the file_size and the<br>
	 * duration are known as FFmpeg can compute it automatically.
	 */
	@Field(22) 
	public int bit_rate() {
		return this.io.getIntField(this, 22);
	}
	/**
	 * Decoding: total stream bitrate in bit/s, 0 if not<br>
	 * available. Never set it directly if the file_size and the<br>
	 * duration are known as FFmpeg can compute it automatically.
	 */
	@Field(22) 
	public AVFormatContext bit_rate(int bit_rate) {
		this.io.setIntField(this, 22, bit_rate);
		return this;
	}
	public final int bit_rate_$eq(int bit_rate) {
		bit_rate(bit_rate);
		return bit_rate;
	}
	/**
	 * av_read_frame() support<br>
	 * C type : AVStream*
	 */
	@Field(23) 
	public Pointer<AVStream > cur_st() {
		return this.io.getPointerField(this, 23);
	}
	/**
	 * av_read_frame() support<br>
	 * C type : AVStream*
	 */
	@Field(23) 
	public AVFormatContext cur_st(Pointer<AVStream > cur_st) {
		this.io.setPointerField(this, 23, cur_st);
		return this;
	}
	/// C type : AVStream*
	public final Pointer<AVStream > cur_st_$eq(Pointer<AVStream > cur_st) {
		cur_st(cur_st);
		return cur_st;
	}
	/// C type : const uint8_t*
	@Field(24) 
	public Pointer<Byte > cur_ptr_deprecated() {
		return this.io.getPointerField(this, 24);
	}
	/// C type : const uint8_t*
	@Field(24) 
	public AVFormatContext cur_ptr_deprecated(Pointer<Byte > cur_ptr_deprecated) {
		this.io.setPointerField(this, 24, cur_ptr_deprecated);
		return this;
	}
	/// C type : const uint8_t*
	public final Pointer<Byte > cur_ptr_deprecated_$eq(Pointer<Byte > cur_ptr_deprecated) {
		cur_ptr_deprecated(cur_ptr_deprecated);
		return cur_ptr_deprecated;
	}
	@Field(25) 
	public int cur_len_deprecated() {
		return this.io.getIntField(this, 25);
	}
	@Field(25) 
	public AVFormatContext cur_len_deprecated(int cur_len_deprecated) {
		this.io.setIntField(this, 25, cur_len_deprecated);
		return this;
	}
	public final int cur_len_deprecated_$eq(int cur_len_deprecated) {
		cur_len_deprecated(cur_len_deprecated);
		return cur_len_deprecated;
	}
	/// C type : AVPacket
	@Field(26) 
	public AVPacket cur_pkt_deprecated() {
		return this.io.getNativeObjectField(this, 26);
	}
	/**
	 * av_seek_frame() support<br>
	 * < offset of the first packet
	 */
	@Field(27) 
	public long data_offset() {
		return this.io.getLongField(this, 27);
	}
	/**
	 * av_seek_frame() support<br>
	 * < offset of the first packet
	 */
	@Field(27) 
	public AVFormatContext data_offset(long data_offset) {
		this.io.setLongField(this, 27, data_offset);
		return this;
	}
	public final long data_offset_$eq(long data_offset) {
		data_offset(data_offset);
		return data_offset;
	}
	@Field(28) 
	public int index_built() {
		return this.io.getIntField(this, 28);
	}
	@Field(28) 
	public AVFormatContext index_built(int index_built) {
		this.io.setIntField(this, 28, index_built);
		return this;
	}
	public final int index_built_$eq(int index_built) {
		index_built(index_built);
		return index_built;
	}
	@Field(29) 
	public int mux_rate() {
		return this.io.getIntField(this, 29);
	}
	@Field(29) 
	public AVFormatContext mux_rate(int mux_rate) {
		this.io.setIntField(this, 29, mux_rate);
		return this;
	}
	public final int mux_rate_$eq(int mux_rate) {
		mux_rate(mux_rate);
		return mux_rate;
	}
	@Field(30) 
	public int packet_size() {
		return this.io.getIntField(this, 30);
	}
	@Field(30) 
	public AVFormatContext packet_size(int packet_size) {
		this.io.setIntField(this, 30, packet_size);
		return this;
	}
	public final int packet_size_$eq(int packet_size) {
		packet_size(packet_size);
		return packet_size;
	}
	@Field(31) 
	public int preload() {
		return this.io.getIntField(this, 31);
	}
	@Field(31) 
	public AVFormatContext preload(int preload) {
		this.io.setIntField(this, 31, preload);
		return this;
	}
	public final int preload_$eq(int preload) {
		preload(preload);
		return preload;
	}
	@Field(32) 
	public int max_delay() {
		return this.io.getIntField(this, 32);
	}
	@Field(32) 
	public AVFormatContext max_delay(int max_delay) {
		this.io.setIntField(this, 32, max_delay);
		return this;
	}
	public final int max_delay_$eq(int max_delay) {
		max_delay(max_delay);
		return max_delay;
	}
	/// number of times to loop output in formats that support it
	@Field(33) 
	public int loop_output() {
		return this.io.getIntField(this, 33);
	}
	/// number of times to loop output in formats that support it
	@Field(33) 
	public AVFormatContext loop_output(int loop_output) {
		this.io.setIntField(this, 33, loop_output);
		return this;
	}
	public final int loop_output_$eq(int loop_output) {
		loop_output(loop_output);
		return loop_output;
	}
	@Field(34) 
	public int flags() {
		return this.io.getIntField(this, 34);
	}
	@Field(34) 
	public AVFormatContext flags(int flags) {
		this.io.setIntField(this, 34, flags);
		return this;
	}
	public final int flags_$eq(int flags) {
		flags(flags);
		return flags;
	}
	@Field(35) 
	public int loop_input() {
		return this.io.getIntField(this, 35);
	}
	@Field(35) 
	public AVFormatContext loop_input(int loop_input) {
		this.io.setIntField(this, 35, loop_input);
		return this;
	}
	public final int loop_input_$eq(int loop_input) {
		loop_input(loop_input);
		return loop_input;
	}
	/// decoding: size of data to probe; encoding: unused.
	@Field(36) 
	public int probesize() {
		return this.io.getIntField(this, 36);
	}
	/// decoding: size of data to probe; encoding: unused.
	@Field(36) 
	public AVFormatContext probesize(int probesize) {
		this.io.setIntField(this, 36, probesize);
		return this;
	}
	public final int probesize_$eq(int probesize) {
		probesize(probesize);
		return probesize;
	}
	/**
	 * Maximum time (in AV_TIME_BASE units) during which the input should<br>
	 * be analyzed in av_find_stream_info().
	 */
	@Field(37) 
	public int max_analyze_duration() {
		return this.io.getIntField(this, 37);
	}
	/**
	 * Maximum time (in AV_TIME_BASE units) during which the input should<br>
	 * be analyzed in av_find_stream_info().
	 */
	@Field(37) 
	public AVFormatContext max_analyze_duration(int max_analyze_duration) {
		this.io.setIntField(this, 37, max_analyze_duration);
		return this;
	}
	public final int max_analyze_duration_$eq(int max_analyze_duration) {
		max_analyze_duration(max_analyze_duration);
		return max_analyze_duration;
	}
	/// C type : const uint8_t*
	@Field(38) 
	public Pointer<Byte > key() {
		return this.io.getPointerField(this, 38);
	}
	/// C type : const uint8_t*
	@Field(38) 
	public AVFormatContext key(Pointer<Byte > key) {
		this.io.setPointerField(this, 38, key);
		return this;
	}
	/// C type : const uint8_t*
	public final Pointer<Byte > key_$eq(Pointer<Byte > key) {
		key(key);
		return key;
	}
	@Field(39) 
	public int keylen() {
		return this.io.getIntField(this, 39);
	}
	@Field(39) 
	public AVFormatContext keylen(int keylen) {
		this.io.setIntField(this, 39, keylen);
		return this;
	}
	public final int keylen_$eq(int keylen) {
		keylen(keylen);
		return keylen;
	}
	@Field(40) 
	public int nb_programs() {
		return this.io.getIntField(this, 40);
	}
	@Field(40) 
	public AVFormatContext nb_programs(int nb_programs) {
		this.io.setIntField(this, 40, nb_programs);
		return this;
	}
	public final int nb_programs_$eq(int nb_programs) {
		nb_programs(nb_programs);
		return nb_programs;
	}
	/// C type : AVProgram**
	@Field(41) 
	public Pointer<Pointer<AVProgram > > programs() {
		return this.io.getPointerField(this, 41);
	}
	/// C type : AVProgram**
	@Field(41) 
	public AVFormatContext programs(Pointer<Pointer<AVProgram > > programs) {
		this.io.setPointerField(this, 41, programs);
		return this;
	}
	/// C type : AVProgram**
	public final Pointer<Pointer<AVProgram > > programs_$eq(Pointer<Pointer<AVProgram > > programs) {
		programs(programs);
		return programs;
	}
	/**
	 * Forced video codec_id.<br>
	 * Demuxing: Set by user.<br>
	 * C type : CodecID
	 */
	@Field(42) 
	public ValuedEnum<CodecID > video_codec_id() {
		return this.io.getEnumField(this, 42);
	}
	/**
	 * Forced video codec_id.<br>
	 * Demuxing: Set by user.<br>
	 * C type : CodecID
	 */
	@Field(42) 
	public AVFormatContext video_codec_id(ValuedEnum<CodecID > video_codec_id) {
		this.io.setEnumField(this, 42, video_codec_id);
		return this;
	}
	/// C type : CodecID
	public final ValuedEnum<CodecID > video_codec_id_$eq(ValuedEnum<CodecID > video_codec_id) {
		video_codec_id(video_codec_id);
		return video_codec_id;
	}
	/**
	 * Forced audio codec_id.<br>
	 * Demuxing: Set by user.<br>
	 * C type : CodecID
	 */
	@Field(43) 
	public ValuedEnum<CodecID > audio_codec_id() {
		return this.io.getEnumField(this, 43);
	}
	/**
	 * Forced audio codec_id.<br>
	 * Demuxing: Set by user.<br>
	 * C type : CodecID
	 */
	@Field(43) 
	public AVFormatContext audio_codec_id(ValuedEnum<CodecID > audio_codec_id) {
		this.io.setEnumField(this, 43, audio_codec_id);
		return this;
	}
	/// C type : CodecID
	public final ValuedEnum<CodecID > audio_codec_id_$eq(ValuedEnum<CodecID > audio_codec_id) {
		audio_codec_id(audio_codec_id);
		return audio_codec_id;
	}
	/**
	 * Forced subtitle codec_id.<br>
	 * Demuxing: Set by user.<br>
	 * C type : CodecID
	 */
	@Field(44) 
	public ValuedEnum<CodecID > subtitle_codec_id() {
		return this.io.getEnumField(this, 44);
	}
	/**
	 * Forced subtitle codec_id.<br>
	 * Demuxing: Set by user.<br>
	 * C type : CodecID
	 */
	@Field(44) 
	public AVFormatContext subtitle_codec_id(ValuedEnum<CodecID > subtitle_codec_id) {
		this.io.setEnumField(this, 44, subtitle_codec_id);
		return this;
	}
	/// C type : CodecID
	public final ValuedEnum<CodecID > subtitle_codec_id_$eq(ValuedEnum<CodecID > subtitle_codec_id) {
		subtitle_codec_id(subtitle_codec_id);
		return subtitle_codec_id;
	}
	/**
	 * Maximum amount of memory in bytes to use for the index of each stream.<br>
	 * If the index exceeds this size, entries will be discarded as<br>
	 * needed to maintain a smaller size. This can lead to slower or less<br>
	 * accurate seeking (depends on demuxer).<br>
	 * Demuxers for which a full in-memory index is mandatory will ignore<br>
	 * this.<br>
	 * muxing  : unused<br>
	 * demuxing: set by user
	 */
	@Field(45) 
	public int max_index_size() {
		return this.io.getIntField(this, 45);
	}
	/**
	 * Maximum amount of memory in bytes to use for the index of each stream.<br>
	 * If the index exceeds this size, entries will be discarded as<br>
	 * needed to maintain a smaller size. This can lead to slower or less<br>
	 * accurate seeking (depends on demuxer).<br>
	 * Demuxers for which a full in-memory index is mandatory will ignore<br>
	 * this.<br>
	 * muxing  : unused<br>
	 * demuxing: set by user
	 */
	@Field(45) 
	public AVFormatContext max_index_size(int max_index_size) {
		this.io.setIntField(this, 45, max_index_size);
		return this;
	}
	public final int max_index_size_$eq(int max_index_size) {
		max_index_size(max_index_size);
		return max_index_size;
	}
	/**
	 * Maximum amount of memory in bytes to use for buffering frames<br>
	 * obtained from realtime capture devices.
	 */
	@Field(46) 
	public int max_picture_buffer() {
		return this.io.getIntField(this, 46);
	}
	/**
	 * Maximum amount of memory in bytes to use for buffering frames<br>
	 * obtained from realtime capture devices.
	 */
	@Field(46) 
	public AVFormatContext max_picture_buffer(int max_picture_buffer) {
		this.io.setIntField(this, 46, max_picture_buffer);
		return this;
	}
	public final int max_picture_buffer_$eq(int max_picture_buffer) {
		max_picture_buffer(max_picture_buffer);
		return max_picture_buffer;
	}
	@Field(47) 
	public int nb_chapters() {
		return this.io.getIntField(this, 47);
	}
	@Field(47) 
	public AVFormatContext nb_chapters(int nb_chapters) {
		this.io.setIntField(this, 47, nb_chapters);
		return this;
	}
	public final int nb_chapters_$eq(int nb_chapters) {
		nb_chapters(nb_chapters);
		return nb_chapters;
	}
	/// C type : AVChapter**
	@Field(48) 
	public Pointer<Pointer<AVChapter > > chapters() {
		return this.io.getPointerField(this, 48);
	}
	/// C type : AVChapter**
	@Field(48) 
	public AVFormatContext chapters(Pointer<Pointer<AVChapter > > chapters) {
		this.io.setPointerField(this, 48, chapters);
		return this;
	}
	/// C type : AVChapter**
	public final Pointer<Pointer<AVChapter > > chapters_$eq(Pointer<Pointer<AVChapter > > chapters) {
		chapters(chapters);
		return chapters;
	}
	/// Flags to enable debugging.
	@Field(49) 
	public int debug() {
		return this.io.getIntField(this, 49);
	}
	/// Flags to enable debugging.
	@Field(49) 
	public AVFormatContext debug(int debug) {
		this.io.setIntField(this, 49, debug);
		return this;
	}
	public final int debug_$eq(int debug) {
		debug(debug);
		return debug;
	}
	/**
	 * Raw packets from the demuxer, prior to parsing and decoding.<br>
	 * This buffer is used for buffering packets until the codec can<br>
	 * be identified, as parsing cannot be done without knowing the<br>
	 * codec.<br>
	 * C type : AVPacketList*
	 */
	@Field(50) 
	public Pointer<AVPacketList > raw_packet_buffer() {
		return this.io.getPointerField(this, 50);
	}
	/**
	 * Raw packets from the demuxer, prior to parsing and decoding.<br>
	 * This buffer is used for buffering packets until the codec can<br>
	 * be identified, as parsing cannot be done without knowing the<br>
	 * codec.<br>
	 * C type : AVPacketList*
	 */
	@Field(50) 
	public AVFormatContext raw_packet_buffer(Pointer<AVPacketList > raw_packet_buffer) {
		this.io.setPointerField(this, 50, raw_packet_buffer);
		return this;
	}
	/// C type : AVPacketList*
	public final Pointer<AVPacketList > raw_packet_buffer_$eq(Pointer<AVPacketList > raw_packet_buffer) {
		raw_packet_buffer(raw_packet_buffer);
		return raw_packet_buffer;
	}
	/// C type : AVPacketList*
	@Field(51) 
	public Pointer<AVPacketList > raw_packet_buffer_end() {
		return this.io.getPointerField(this, 51);
	}
	/// C type : AVPacketList*
	@Field(51) 
	public AVFormatContext raw_packet_buffer_end(Pointer<AVPacketList > raw_packet_buffer_end) {
		this.io.setPointerField(this, 51, raw_packet_buffer_end);
		return this;
	}
	/// C type : AVPacketList*
	public final Pointer<AVPacketList > raw_packet_buffer_end_$eq(Pointer<AVPacketList > raw_packet_buffer_end) {
		raw_packet_buffer_end(raw_packet_buffer_end);
		return raw_packet_buffer_end;
	}
	/// C type : AVPacketList*
	@Field(52) 
	public Pointer<AVPacketList > packet_buffer_end() {
		return this.io.getPointerField(this, 52);
	}
	/// C type : AVPacketList*
	@Field(52) 
	public AVFormatContext packet_buffer_end(Pointer<AVPacketList > packet_buffer_end) {
		this.io.setPointerField(this, 52, packet_buffer_end);
		return this;
	}
	/// C type : AVPacketList*
	public final Pointer<AVPacketList > packet_buffer_end_$eq(Pointer<AVPacketList > packet_buffer_end) {
		packet_buffer_end(packet_buffer_end);
		return packet_buffer_end;
	}
	/// C type : AVMetadata*
	@Field(53) 
	public Pointer<AVMetadata > metadata() {
		return this.io.getPointerField(this, 53);
	}
	/// C type : AVMetadata*
	@Field(53) 
	public AVFormatContext metadata(Pointer<AVMetadata > metadata) {
		this.io.setPointerField(this, 53, metadata);
		return this;
	}
	/// C type : AVMetadata*
	public final Pointer<AVMetadata > metadata_$eq(Pointer<AVMetadata > metadata) {
		metadata(metadata);
		return metadata;
	}
	@Field(54) 
	public int raw_packet_buffer_remaining_size() {
		return this.io.getIntField(this, 54);
	}
	@Field(54) 
	public AVFormatContext raw_packet_buffer_remaining_size(int raw_packet_buffer_remaining_size) {
		this.io.setIntField(this, 54, raw_packet_buffer_remaining_size);
		return this;
	}
	public final int raw_packet_buffer_remaining_size_$eq(int raw_packet_buffer_remaining_size) {
		raw_packet_buffer_remaining_size(raw_packet_buffer_remaining_size);
		return raw_packet_buffer_remaining_size;
	}
	/**
	 * Start time of the stream in real world time, in microseconds<br>
	 * since the unix epoch (00:00 1st January 1970). That is, pts=0<br>
	 * in the stream was captured at this real world time.<br>
	 * - encoding: Set by user.<br>
	 * - decoding: Unused.
	 */
	@Field(55) 
	public long start_time_realtime() {
		return this.io.getLongField(this, 55);
	}
	/**
	 * Start time of the stream in real world time, in microseconds<br>
	 * since the unix epoch (00:00 1st January 1970). That is, pts=0<br>
	 * in the stream was captured at this real world time.<br>
	 * - encoding: Set by user.<br>
	 * - decoding: Unused.
	 */
	@Field(55) 
	public AVFormatContext start_time_realtime(long start_time_realtime) {
		this.io.setLongField(this, 55, start_time_realtime);
		return this;
	}
	public final long start_time_realtime_$eq(long start_time_realtime) {
		start_time_realtime(start_time_realtime);
		return start_time_realtime;
	}
}
