package com.openjx.openrtb.api.request;

import com.openjx.openrtb.api.consts.AdPositions;
import com.openjx.openrtb.api.consts.BannerAdTypes;

/**
 * The ???video??? object must be included directly in the impression object if
 * the impression offered for auction is an in-stream video ad opportunity. The
 * Default column indicates how optional parameters should be interpreted if
 * explicit values are not provided. Note that for the video object, many of the
 * fields are non-essential for a minimally viable exchange interfaces. These
 * parameters do not necessarily need to be specified to the bidder, if they are
 * always the same for all impression, of if the exchange chooses not to supply
 * the additional information to the bidder.
 * 
 * @scope required for video impressions
 * @author nabib
 * 
 */
public interface Video {

	public Banner[] getBanners();

	/**
	 * The ???video??? object must be included directly in the impression object
	 * if the impression offered for auction is an in-stream video ad
	 * opportunity. The Default column indicates how optional parameters should
	 * be interpreted if explicit values are not provided. Note that for the
	 * video object, many of the fields are non-essential for a minimally viable
	 * exchange interfaces. These parameters do not necessarily need to be
	 * specified to the bidder, if they are always the same for all impression,
	 * of if the exchange chooses not to supply the additional information to
	 * the bidder.
	 * 
	 * @scope required
	 * @return
	 */
	public String[] getMimes();

	/**
	 * Indicates whether the ad impression is linear or non-linear. See Table
	 * 6.6 Video Linearity for a list of the possible values.
	 * 
	 * @scope required
	 * @return
	 */
	public int getLinearity();

	/**
	 * Minimum video ad duration in seconds
	 * 
	 * @scope required
	 * @return
	 */
	public int getMinduration();

	/**
	 * Maximum video ad duration in seconds
	 * 
	 * @scope required
	 * @return
	 */
	public int getMaxduration();

	/**
	 * Video bid response protocols. See Table 6.7 Video Bid Response Protocols
	 * for a list of possible values.
	 * 
	 * @scope required
	 * @return
	 */
	public int getProtocol();

	/**
	 * Width of the player in pixels. This field is not required, but it???s
	 * highly recommended that this information be included.
	 * 
	 * @scope recommended
	 * @return
	 */
	public int getW();

	/**
	 * Height of the player in pixels. This field is not required, but it???s
	 * highly recommended that this information be included
	 * 
	 * @scope recommended
	 * @return
	 */
	public int getH();

	/**
	 * Indicates the start delay in seconds for preroll, midroll, or postroll ad
	 * placement. See Table 6.9 Video Start Delay for generic placement values.
	 * 
	 * @scope recommended
	 * @return
	 */
	public int getStartdelay();

	/**
	 * If multiple ad impressions are offered in the same bid request, the
	 * sequence number will allow for the coordinated delivery of multiple
	 * creatives.
	 * 
	 * @default 1
	 * @scope optional
	 * @return
	 */
	public int getSequence();

	/**
	 * @see {@link BannerAdTypes} Object for values.
	 * 
	 * Blocked creative types. See Table 6.2 Banner Ad Types. If blank,
	 * assume all types are allowed.
	 * 
	 * @default Null - Allows all creative types.
	 * @scope optional
	 * @return
	 */
	public int[] getBtype();

	/**
	 * Maximum extended video ad duration, if extension is allowed.If blank or
	 * 0, extension is not allowed. If -1, extension is allowed, and there is no
	 * time limit imposed. If greater than 0, then the value represents the
	 * number of seconds of extended play supported beyond the maxduration
	 * value.
	 * 
	 * @default Extension not allowed
	 * @scope optional
	 * @return
	 */
	public int getMaxextended();

	/**
	 * Minimum bit rate in Kbps. Exchange may set this dynamically, or
	 * universally across their set of publishers.
	 * 
	 * @scope optional
	 * @return
	 */
	public int getMinbitrate();

	/**
	 * Maximum bit rate in Kbps. Exchange may set this dynamically, or
	 * universally across their set of publishers.
	 * 
	 * @scope optional
	 * @return
	 */
	public int getMaxbitrate();

	/**
	 * If exchange publisher has rules preventing letter boxing of 4x3 content
	 * to play in a 16x9 window, then this should be set to false. Default
	 * setting is true, which assumes that boxing of content to fit into a
	 * window is allowed. ???1??? indicates boxing is allowed. ???0??? indicates
	 * it is not allowed.
	 * 
	 * @default 1
	 * @scope optional
	 * @return
	 */
	public int getBoxingallowed();

	/**
	 * List of allowed playback methods. If blank, assume that all are allowed.
	 * See Table 6.8 Video Playback Methods for a list of possible values.
	 * 
	 * @default All
	 * @scope optional
	 * @return
	 */
	public int[] getPlaybackmethod();

	/**
	 * List of supported delivery methods (streaming, progressive). If blank,
	 * assume all are supported. See Table 6.12 Content Delivery Methods for a
	 * list of possible values.
	 * 
	 * @default all
	 * @scope optional
	 * @return
	 */
	public int[] getDelivery();

	/**
	 * 
	 * @see {@link AdPositions} Object for values.
	 * 
	 *      List of supported API frameworks for this impression. (See Table 6.4
	 *      API Frameworks). If an API is not explicitly listed it is assumed
	 *      not to be supported.
	 * 
	 * @default None
	 * @scope optional
	 * @return
	 */
	public int[] getApi();

	/**
	 * Recommended if companion objects are included. See Table 6.17 VAST
	 * Companion Types for a list of possible values.
	 * 
	 * @scope optional
	 * @return
	 */
	public int[] getCompaniontype();

}
