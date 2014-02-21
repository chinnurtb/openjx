package com.openjx.openrtb.api.request;

import com.openjx.openrtb.api.Extensions;

/**
 * The geo object itself and all of its parameters are optional, so default
 * values are not provided. If an optional parameter is not specified, it should
 * be considered unknown. Note that the Geo Object may appear in one or both the
 * Device Object and the User Object. This is intentional, since the information
 * may be derived from either a device-oriented source (such as IP geo lookup),
 * or by user registration information (for example provided to a publisher
 * through a user registration). If the information is in conflict, it's up to
 * the bidder to determine which information to use.
 * 
 * @scope optional
 * @author nabib
 * 
 */
public interface Geo {

	/**
	 * Latitude from -90 to 90. South is negative. This should only be passed if
	 * known to be accurate (For example, not the centroid of a postal code).
	 * 
	 * @scope optional
	 * @return
	 */
	public double getLat();

	/**
	 * Longitude from -180 to 180. West is negative. This should only be passed
	 * if known to be accurate.
	 * 
	 * @scope optional
	 * @return
	 */
	public double getLon();

	/**
	 * Country using ISO-3166-1 Alpha-3.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getCountry();

	/**
	 * Region using ISO 3166-2
	 * 
	 * @scope optional
	 * @return
	 */
	public String getRegion();

	/**
	 * Region of a country using fips 10-4 notation (alternative to ISO 3166-2)
	 * 
	 * @scope optional
	 * @return
	 */
	public String getRegionfips104();

	/**
	 * Pass the metro code (see http://code.google.com/apis/adwords/do
	 * cs/appendix/metrocodes.html). Metro codes are similar to but not exactly
	 * the same as Nielsen DMAs.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getMetro();

	/**
	 * City using United Nations Code for Trade and Transport Locations
	 * (http://www.unece.org/cefact/locode/ser vice/location.htm)
	 * 
	 * @scope optional
	 * @return
	 */
	public String getCity();

	/**
	 * Zip/postal code
	 * 
	 * @scope optional
	 * @return
	 */
	public String getZip();

	/**
	 * Indicate the source of the geo data (GPS, IP address, user provided). See
	 * Table 6.15 Location Type for a list of potential values. Type should be
	 * provided when lat/lon is provided.
	 * 
	 * @scope recommended
	 * @return
	 */
	public String getType();

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
