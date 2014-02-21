package org.openjx.openrtb.api.request;

import org.openjx.openrtb.api.Extensions;

/**
 * This object describes the publisher of a site or app, depending on which
 * object it is embedded in.
 * 
 * @scope optional
 * @author nabib
 * 
 */
public interface Publisher {

	/**
	 * Publisher ID on the exchange.
	 * 
	 * @scope recommended
	 * @return
	 */
	public String getId();

	/**
	 * Publisher name (may be masked at publisher's request).
	 * 
	 * @scope optional
	 * @return
	 */
	public String getName();

	/**
	 * Array of IAB content categories for the publisher. See Table 6.1 Content
	 * Categories.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getCat();

	/**
	 * Publisher's highest level domain name, for example foopub.com.
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
