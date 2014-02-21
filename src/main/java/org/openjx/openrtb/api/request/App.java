package org.openjx.openrtb.api.request;

import org.openjx.openrtb.api.Extensions;


/**
 * Either a site or app object may be included ??? not both. Neither is
 * required.
 * 
 * @scope recommended for native apps
 * @author nabib
 * 
 */
public interface App {

	/**
	 * Application ID on the exchange.
	 * 
	 * @scope recommended
	 * @return
	 */
	public String getId();

	/**
	 * Application name (may be masked at publisher's request).
	 * 
	 * 
	 * @scope optional
	 * @return
	 */
	public String getName();

	/**
	 * Domain of the application (e.g.,mygame.foo.com).
	 * 
	 * @scope optional
	 * @return
	 */
	public String getDomain();

	/**
	 * Array of IAB content categories for the overall application. See Table
	 * 6.1 Content Categories.
	 * 
	 * 
	 * @scope recommended
	 * @return
	 */
	public String[] getCat();

	/**
	 * Array of IAB content categories for the current subsection of the app.
	 * See Table 6.1 Content Categories.
	 * 
	 * 
	 * @scope optional
	 * @return
	 */
	public String[] getSectioncat();

	/**
	 * Array of IAB content categories for the current page/view of the app. See
	 * Table 6.1 Content Categories.
	 * 
	 * 
	 * @scope optional
	 * @return
	 */
	public String[] getPagecat();

	/**
	 * Application version.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getVer();

	/**
	 * Application bundle or package name (e.g., com.foo.mygame). This is
	 * intended to be a unique ID across multiple exchanges
	 * 
	 * @scope optional
	 * @return
	 */
	public String getBundle();

	/**
	 * Specifies whether the app has a privacy policy."1" means there is a
	 * policy and "0" means there is not.
	 * 
	 * @scope optional
	 * @return
	 */
	public int getPrivacypolicy();

	/**
	 * "1" if the application is a paid version; else "0" (i.e., free).
	 * 
	 * @scope optional
	 * @return
	 */
	public int getPaid();

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
	 * List of keywords describing this app in a comma separated string
	 * 
	 * @scope optional
	 * @return
	 */
	public String getKeywords();

	/**
	 * For QAG 1.5 compliance, an app store URL for an installed app should be
	 * passed in the bid request.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getStoreurl();

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
