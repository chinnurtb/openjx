package com.openjx.openrtb.api.request;

import com.openjx.openrtb.api.Extensions;

/**
 * Either a site or app object may be included ??? not both. Neither is
 * required.
 * 
 * @scope recommended for websites
 * @author nabib
 * 
 */
public interface Site {

	/**
	 * Site ID on the exchange.
	 * 
	 * @scope recommended
	 * @return
	 */
	public String getId();

	/**
	 * Site name (may be masked at publisher's request).
	 * 
	 * @scope optional
	 * @return
	 */
	public String getName();

	/**
	 * Domain of the site, used for advertiser side blocking. For example,
	 * foo.com.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getDomain();

	/**
	 * Array of IAB content categories for the overall site. See Table 6.1
	 * Content Categories.
	 * 
	 * @scope recommended
	 * @return
	 */
	public String[] getCat();

	/**
	 * Array of IAB content categories for the current subsection of the site.
	 * See Table 6.1 Content Categories.
	 * 
	 * @scope optional
	 * @return
	 */
	public String[] getSectioncat();

	/**
	 * Array of IAB content categories for the current page. See Table 6.1
	 * Content Categories.
	 * 
	 * @scope optional
	 * @return
	 */
	public String[] getPagecat();

	/**
	 * URL of the page where the impression will be shown.
	 * 
	 * @return
	 */
	public String getPage();

	/**
	 * Specifies whether the site has a privacy policy. "1" means there is a
	 * policy. "0" means there is not.
	 * 
	 * @scope optional
	 * @return
	 */
	public int getPrivacypolicy();

	/**
	 * Referrer URL that caused navigation to the current page.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getRef();

	/**
	 * Search string that caused navigation to the current page.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getSearch();

	/**
	 * @see {@link Content} Object.
	 * 
	 * @scope optional
	 * @return
	 */
	public Content getContent();

	/**
	 * @see {@link Publisher} Object.
	 * 
	 * @scope optional
	 * @return
	 */
	public Publisher getPublisher();

	/**
	 * List of keywords describing this site in a comma separated string.
	 *
	 * @scope optional
	 * @return
	 */
	public String getKeywords();

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
