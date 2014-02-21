package org.openjx.openrtb.api.request;

import org.openjx.openrtb.api.Extensions;
import org.openjx.openrtb.api.consts.ConnectionTypes;

/**
 * This object describes the device the ad impression will be delivered to
 * (e.g., mobile phone, computer, set top box, etc.) and its capabilities (e.g.,
 * flash support).
 * 
 * @scope recommended
 * @author nabib
 * 
 */
public interface Device {

	/**
	 * If "0", then do not track Is set to false, if "1", then do no track is
	 * set to true in browser.
	 * 
	 * @scope recommended
	 * @return
	 */
	public int getDnt();

	/**
	 * Browser user agent string.
	 * 
	 * @scope recommended
	 * @return
	 */
	public String getUa();

	/**
	 * IPv4 address closest to device.
	 * 
	 * @scope recommended if geo object is not supplied
	 * @return
	 */
	public String getIp();

	/**
	 * Geography as derived from the device's location services (e.g., cell
	 * tower triangulation, GPS) or IP address. See Error! Reference source ot
	 * found..
	 * 
	 * @scope recommended if IP is not supplied
	 * @return
	 */
	public Geo getGeo();

	/**
	 * SHA1 hashed device ID; IMEI when available, else MEID or ESN. OpenRTB's
	 * preferred method for device ID hashing is SHA1.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getDidsha1();

	/**
	 * MD5 hashed device ID; IMEI when available, else MEID or ESN. Should be
	 * interpreted as case insensitive.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getDidmd5();

	/**
	 * SHA1 hashed platform-specific ID (e.g., Android ID or UDID for iOS).
	 * OpenRTB's preferred method for device ID hash is SHA1.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getDpidsha1();

	/**
	 * MD5 hashed platform-specific ID (e.g., Android ID or UDID for iOS).
	 * Should be interpreted as case insensitive.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getDpidmd5();

	/**
	 * IP address in IPv6.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getIpv6();

	/**
	 * Carrier or ISP derived from the IP address. Should be specified using
	 * Mobile Network Code (MNC) http://en.wikipedia.org/wiki/Mobile_Network_
	 * Code
	 * 
	 * @scope optional
	 * @return
	 */
	public String getCarrier();

	/**
	 * Browser language; use alpha-2/ISO 639-1 codes.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getLanguage();

	/**
	 * Device make (e.g., "Apple").
	 * 
	 * @scope optional
	 * @return
	 */
	public String getMake();

	/**
	 * Device model (e.g., "iPhone").
	 * 
	 * @scope optional
	 * @return
	 */
	public String getModel();

	/**
	 * Device operating system (e.g., "iOS").
	 * 
	 * @scope optional
	 * @return
	 */
	public String getOs();

	/**
	 * Device operating system version (e.g., "3.1.2")
	 * 
	 * @scope optional
	 * @return
	 */
	public String getOsv();

	/**
	 * "1" if the device supports JavaScript; else "0".
	 * 
	 * @scope optional
	 * @return
	 */
	public int getJs();

	/**
	 * @see {@link ConnectionTypes} Object for values.
	 *  
	 * Return the detected data connection type for the device. See Table 6.10
	 * Connection Type.
	 * 
	 * @scope optional
	 * @return
	 */
	public int getConnectiontype();

	/**
	 * Return the device type being used. See Table 6.16 Device Type.
	 * 
	 * @return
	 */
	public int getDevicetype();

	/**
	 * Return the Flash version detected.
	 * 
	 * @return
	 */
	public String getFlashver();

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
