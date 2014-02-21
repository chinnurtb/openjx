package com.openjx.openrtb.api.request;

import com.openjx.openrtb.api.Extensions;
import com.openjx.openrtb.api.consts.APIFrameworks;
import com.openjx.openrtb.api.consts.AdPositions;
import com.openjx.openrtb.api.consts.BannerAdTypes;

/**
 * The "banner" object must be included directly in the impression object if the
 * impression offered for auction is display or rich media, or it may be
 * optionally embedded in the video object to describe the companion banners
 * available for the linear or non-linear video ad. The banner object may
 * include a unique identifier; this can be useful if these IDs can be leveraged
 * in the VAST response to dictate placement of the companion creatives when
 * multiple companion ad opportunities of the same size are available on a page.
 * 
 * @scope required for banner impressions
 * @author nabib
 * 
 */
public interface Banner {

	/**
	 * Unique identifier for this banner object. Useful for tracking multiple
	 * banner objects (e.g., in companion banner array). Usually starts with 1,
	 * increasing with each object. Combination of impression id banner object
	 * should be unique.
	 * 
	 * @scope recommended when subordinate to a video object
	 * @return
	 */
	public String getId();

	/**
	 * Width of the impression in pixels. Since some ad types are not restricted
	 * by size this field is not required, but it???s highly recommended that this
	 * information be included when possible.
	 * 
	 * @scope recommended
	 * @return
	 */
	public int getW();

	/**
	 * Height of the impression in pixels. Since some ad types are not
	 * restricted by size this field is not required, but it???s highly
	 * recommended that this information be included when possible.
	 * 
	 * @scope recommended
	 * @return
	 */
	public int getH();

	/**
	 * Ad Position. @see {@link AdPositions} Object for values.
	 * 
	 * @scope optional
	 * @return
	 */
	public int getPos();

	/**
	 * @see {@link BannerAdTypes} Object for values.
	 * 
	 * Blocked creative types. See Table 6.2 Banner Ad Types. If blank, assume
	 * all types are allowed.
	 * 
	 * @default Null - Allows all creative types.
	 * @scope optional
	 * @return
	 */
	public int[] getBtype();

	/**
	 * Blocked creative attributes. See Table 6.3 Creative Attributes. If blank
	 * assume all types are allowed.
	 * 
	 * @default Null - Allows all creative attributes
	 * @scope optional
	 * @return
	 */
	public int[] getBattr();

	/**
	 * Whitelist of content MIME types supported. Popular MIME types include,
	 * but are not limited to ???image/jpg???, ???image/gif??? and
	 * ???application/x-shockwave-flash???.
	 * 
	 * @default Null - Allows all mime types
	 * @scope optional
	 * @return
	 */
	public String[] getMimes();

	/**
	 * Specify if the banner is delivered in the top frame or in an iframe. ???0???
	 * means it is not in the top frame, and ???1??? means that it is.
	 * 
	 * @default 0
	 * @scope optional
	 * @return
	 */
	public int getTopframe();

	/**
	 * Specify properties for an expandable ad. See Table 6.11 Expandable
	 * Direction for possible values.
	 * 
	 * @default Not expandable
	 * @scope optional
	 * @return
	 */
	public int[] getExpdir();

	/**
	 * @see {@link APIFrameworks} Object for values.
	 * 
	 * List of supported API frameworks for this banner. (See Table 6.4 API
	 * Frameworks). If an API is not explicitly listed it is assumed not to be
	 * supported.
	 * 
	 * @default None
	 * @scope optional
	 * @return
	 */
	public int[] getApi();
	
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
