package com.openjx.openrtb.api.response;

import com.openjx.openrtb.api.Extensions;

public interface Bid {

	/**
	 * ID for the bid object chosen by the bidder for tracking and debugging
	 * purposes. Useful when multiple bids are submitted for a single impression
	 * for a given seat.
	 * 
	 * @scope required
	 * @return
	 */
	public String getId();

	/**
	 * ID of the impression object to which this bid applies.
	 * 
	 * @scope required
	 * @return
	 */
	public String getImpid();

	/**
	 * Bid price in CPM. WARNING/Best Practice Note: Although this value is a
	 * float, OpenRTB strongly suggests using integer math for accounting to
	 * avoid rounding errors.
	 * 
	 * @scope required
	 * @return
	 */
	public double getPrice();

	/**
	 * ID that references the ad to be served if the bid wins.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getAdid();

	/**
	 * Win notice URL. Note that ad markup is also typically, but not
	 * necessarily, returned via this URL.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getNurl();

	/**
	 * Actual ad markup. XHTML if a response to a banner object, or VAST XML if
	 * a response to a video object.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getAdm();

	/**
	 * Advertiser's primary or top-level domain for advertiser checking. This
	 * can be a list of domains if there is a rotating creative. However,
	 * exchanges may mandate that only one landing domain is allowed.
	 * 
	 * @scope optional
	 * @return
	 */
	public String[] getAdomain();

	/**
	 * Sample image URL (without cache busting) for content checking
	 * 
	 * @scope optional
	 * @return
	 */
	public String getIurl();

	/**
	 * Campaign ID or similar that appears within the ad markup
	 * 
	 * @scope optional
	 * @return
	 */
	public String getCid();

	/**
	 * Creative ID for reporting content issues or defects. This could also be
	 * used as a reference to a creative ID that is posted with an exchange.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getCrid();

	/**
	 * Array of creative attributes. See Table 6.3 Creative Attributes.
	 * 
	 * @scope optional
	 * @return
	 */
	public int[] getAttr();

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
