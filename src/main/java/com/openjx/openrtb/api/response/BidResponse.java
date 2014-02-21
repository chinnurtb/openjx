package com.openjx.openrtb.api.response;

import com.openjx.openrtb.api.Extensions;

public interface BidResponse {

	/**
	 * ID of the bid request.
	 * 
	 * @scope required
	 * @return
	 */
	public String getId();

	/**
	 * Array of seatbid objects.
	 * 
	 * @scope required
	 * @return
	 */
	public SeatBid[] getSeatbid();

	/**
	 * Bid response ID to assist tracking for bidders. This value is chosen by
	 * the bidder for cross-reference.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getBidid();

	/**
	 * Bid currency using ISO-4217 alphabetic codes; default is "USD"
	 * 
	 * @scope optional
	 * @return
	 */
	public String getCur();

	/**
	 * This is an optional feature, which allows a bidder to set data in the
	 * exchange's cookie. The string may be in base85 cookie safe characters,
	 * and be in any format. This may be useful for storing user features. Note:
	 * Proper JSON encoding must be used to include "escaped" quotation marks
	 * 
	 * @scope optional
	 * @return
	 */
	public String getCustomdata();

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
