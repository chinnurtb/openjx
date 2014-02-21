package com.openjx.openrtb.api.response;

import com.openjx.openrtb.api.Extensions;

public interface SeatBid {

	/**
	 * Array of bid objects; each bid object relates to an imp object in the bid
	 * request. Note that, if supported by an exchange, one imp object can have
	 * many bid objects.
	 * 
	 * @scope required
	 * @return
	 */
	public Bid[] getBid();

	/**
	 * ID of the bidder seat on whose behalf this bid is made.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getSeat();
	
	/**
	 * "1" means impressions must be won-lost as a group; default is "0".
	 * 
	 * @scope optional
	 * @return
	 */
	public int getGroup();
	
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
