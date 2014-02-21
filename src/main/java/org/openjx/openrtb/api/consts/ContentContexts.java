package org.openjx.openrtb.api.consts;

/**
 * OpenRTB 6.13
 * 
 * Lists the various options for the content context; what type of content is
 * it.
 * 
 * @author nabib
 * 
 */
public class ContentContexts {

	// 1 Video (a video file or stream that is being watched by the user,
	// including (Internet) television broadcasts)
	public static final int VIDEO = 1;

	// 2 Game (an interactive software game that is being played by the user)
	public static final int GAME = 2;

	// 3 Music (an audio file or stream that is being listened to by the user,
	// including (Internet) radio broadcasts)
	public static final int MUSIC = 3;

	// 4 Application (an interactive software application that is being used by
	// the user)
	public static final int APPLICATION = 4;

	// 5 Text (a document that is primarily textual in nature that is being read
	// or viewed by the user, including web page, ebook, or news article)
	public static final int TEXT = 5;

	// 6 Other (content type unknown or the user is consuming content which does
	// not fit into one of the categories above)
	public static final int OTHER = 6;

	// 7 Unknown
	public static final int UNKNOWN = 7;

}
