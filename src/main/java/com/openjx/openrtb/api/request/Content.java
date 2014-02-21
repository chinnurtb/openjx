package com.openjx.openrtb.api.request;

import com.openjx.openrtb.api.Extensions;
import com.openjx.openrtb.api.consts.BannerAdTypes;

/**
 * @see {@link BannerAdTypes} Object for values.
 * 
 * @author nabib
 * 
 */
public interface Content {

	/**
	 * ID uniquely identifying the content
	 * 
	 * @scope optional
	 * @return
	 */
	public String getId();

	/**
	 * Content episode number (typically applies to video content).
	 * 
	 * @scope optional
	 * @return
	 */
	public int getEpisode();

	/**
	 * Content title. Video examples: "Search Committee" (television) or "A New
	 * Hope" (movie) or "Endgame" (made for web) Non-video example: "Why an
	 * Antarctic Glacier Is Melting So Quickly" (Time magazine article)
	 * 
	 * @scope optional
	 * @return
	 */
	public String getTitle();

	/**
	 * Content series. Video examples: "The Office" (television) or "Star Wars"
	 * (movie) or "Arby 'n The Chief" (made for web) Non-video example:
	 * "Ecocentric" (Time magazine blog)
	 * 
	 * @scope optional
	 * @return
	 */
	public String getSeries();

	/**
	 * Content season. E.g., "Season 3" (typically applies to video content).
	 * 
	 * @scope optional
	 * @return
	 */
	public String getSeason();

	/**
	 * Original URL of the content, for buy-side contextualization or review
	 * 
	 * @scope optional
	 * @return
	 */
	public String getUrl();

	/**
	 * Array of IAB content categories for the content. See Table 6.1 Content
	 * Categories.
	 * 
	 * @scope optional
	 * @return
	 */
	public String[] getCat();

	/**
	 * Video quality per the IAB's classification. See Table 6.14 Video Quality.
	 * 
	 * @scope optional
	 * @return
	 */
	public int getVideoquality();

	/**
	 * Comma separated list of keywords describing the content
	 * 
	 * @scope optional
	 * @return
	 */
	public String getKeywords();

	/**
	 * Content rating (e.g., MPAA)
	 * 
	 * @scope optional
	 * @return
	 */
	public String getContentrating();

	/**
	 * User rating of the content (e.g., number of stars, likes, etc.).
	 * 
	 * @scope optional
	 * @return
	 */
	public String getUserrating();

	/**
	 * Specifies the type of content (game, video, text, etc.). See Table 6.13
	 * Content Context.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getContext();

	/**
	 * Is content live? E.g., live video stream, live blog. "1" means content is
	 * live. "0" means it is not live.
	 * 
	 * @scope optional
	 * @return
	 */
	public int getLivestream();

	/**
	 * 1 for "direct"; 0 for "indirect"
	 * 
	 * @scope optional
	 * @return
	 */
	public int getSourcerelationship();

	/**
	 * @see {@link Producer} Object.
	 * 
	 * @scope optional
	 * @return
	 */
	public Producer getProducer();

	/**
	 * Length of content (appropriate for video or audio) in seconds.
	 * 
	 * @scope optional
	 * @return
	 */
	public int getLen();

	/**
	 * Media rating of the content, per QAG guidelines. See Table 0 QAG Media
	 * Ratings for list of possible values
	 * 
	 * @scope optional
	 * @return
	 */
	public int getQagmediarating();

	/**
	 * From QAG Video Addendum. If content can be embedded (such as an
	 * embeddable video player) this value should be set to "1". If content
	 * cannot be embedded, then this should be set to "0".
	 * 
	 * @scope optional
	 * @return
	 */
	public int getEmbeddable();

	/**
	 * Language of the content. Use alpha-2/ISO 639-1 codes.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getLanguage();

	/**
	 * This object is a placeholder that may contain custom JSON agreed to by
	 * the parties in an OpenRTB transaction to support flexibility beyond the
	 * standard defined in this specification.
	 * 
	 * @see {@link Extensions} Object.
	 * 
	 * @scope optional
	 * @return
	 */
	public Extensions getExt();

}
