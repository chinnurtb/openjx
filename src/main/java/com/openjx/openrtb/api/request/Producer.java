package com.openjx.openrtb.api.request;

import com.openjx.openrtb.api.Extensions;

/**
 * This object describes the producer of content object, which might be
 * different from the publisher of the content of the page. This object is
 * useful in the case of syndicated content, such as embedded videos, for
 * example.
 * 
 * @scope optional
 * @author nabib
 * 
 */
public interface Producer {
	/**
	 * Content producer or originator ID. Useful if content is syndicated, and
	 * may be posted on a site using embed tags.
	 * 
	 * 
	 * @scope recommended
	 * @return
	 */
	public String getId();

	/**
	 * Content producer or originator name (e.g., "Warner Bros").
	 * 
	 * 
	 * @scope optional
	 * @return
	 */
	public String getName();

	/**
	 * Array of IAB content categories for the content producer. See Table 6.1
	 * Content Categories
	 * 
	 * @scope optional
	 * @return
	 */
	public String getCat();

	/**
	 * URL of the content producer.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getDomain();

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
