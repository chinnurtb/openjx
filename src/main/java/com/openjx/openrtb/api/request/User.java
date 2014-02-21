package com.openjx.openrtb.api.request;

import com.openjx.openrtb.api.Extensions;

/**
 * The "user" object contains information known or derived about the human user
 * of the device. Note that the user ID is an exchange artifact (refer to the
 * "device" object for hardware or platform derived IDs) and may be subject to
 * rotation policies. However, this user ID must be stable long enough to serve
 * reasonably as the basis for frequency capping. The user object itself and all
 * of its parameters are optional, so default values are not provided. If an
 * optional parameter is not specified, it should be considered unknown. If
 * device ID is used as a proxy for unique user ID, use the device object.
 * 
 * @scope recommended
 * @author nabib
 * 
 */
public interface User {

	/**
	 * Unique consumer ID of this user on the exchange.
	 * 
	 * @scope recommended (or buyeruid)
	 * @return
	 */
	public String getId();

	/**
	 * Buyer's user ID for this user as mapped by exchange for the buyer.
	 * 
	 * @scope recommended ( or id)
	 * @return
	 */
	public String getBuyeruid();

	/**
	 * Year of birth as a 4-digit integer
	 * 
	 * @scope optional
	 * @return
	 */
	public int getYob();

	/**
	 * Gender as "M" male, "F" female, "O" Other. (Null indicates unknown)
	 * 
	 * @scope optional
	 * @return
	 */
	public String getGender();

	/**
	 * Comma separated list of keywords of consumer interests or intent.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getKeywords();

	/**
	 * If supported by the exchange, this is custom data that the bidder had
	 * stored in the exchange's cookie. The string may be in base85 cookie safe
	 * characters, and be in any format. This may useful for storing user
	 * features. Note: Proper JSON encoding must be used to include "escaped"
	 * quotation marks.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getCustomdata();

	/**
	 * Home geo for the user (e.g., based off of registration data); this is
	 * different from the current location of the access device (that is defined
	 * by the geo object embedded in the Device Object); see Error! Reference
	 * source ot found.
	 * 
	 * @scope optional
	 * @return
	 */
	public Geo getGeo();

	/**
	 * @see {@link Data} Object.
	 * 
	 * @scope optional
	 * @return
	 */
	public Data[] getData();

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
