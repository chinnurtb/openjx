package org.openjx.openrtb.api.request;

import org.openjx.openrtb.api.Extensions;


/**
 * The top-level bid request object contains a globally unique bid request or
 * auction ID. This ???id??? attribute is required as is at least one ???imp??? (i.e.,
 * impression) object. Other attributes are optional since an exchange may
 * establish default values.
 * 
 *
 * @scope required
 * @author nabib
 * 
 */
public interface BidRequest {

	/**
	 * Unique ID of the bid request, provided by the exchange.
	 * 
	 * @scope required
	 * @return
	 */
	public String getId();

	/**
	 * Array of impression objects. Multiple impression auctions may be
	 * specified in a single bid request. At least one impression is required
	 * for a valid bid request.
	 * 
	 * @scope required
	 * @return
	 */
	public Impression[] getImp();

	/**
	 * @see {@link Site} Object.
	 * 
	 * @scope recommended for websites.
	 * @return
	 * 
	 */
	public Site getSite();

	/**
	 * @see {@link Site} Object.
	 * 
	 * @scope recommended for native apps
	 * 
	 * @return
	 */
	public App getApp();

	/**
	 * @see {@link Device} Object.
	 * 
	 * @scope recommended
	 * @return
	 */
	public Device getDevice();

	/**
	 * @see {@link User} Object.
	 * 
	 * @scope recommended
	 * @return
	 */
	public User getUser();

	/**
	 * Auction Type. If ???1???, then first price auction. If ???2???, then second price
	 * auction. Additional auction types can be defined as per the exchange???s
	 * business rules. Exchange specific rules should be numbered over 500.
	 * 
	 * @default 2
	 * @scope optional
	 * @return
	 */
	public int getAt();

	/**
	 * Maximum amount of time in milliseconds to submit a bid (e.g., 120 means
	 * the bidder has 120ms to submit a bid before the auction is complete). If
	 * this value never changes across an exchange, then the exchange can supply
	 * this information offline.
	 * 
	 * @scope optional
	 * @return
	 */
	public int getTmax();

	/**
	 * Array of buyer seats allowed to bid on this auction. Seats are an
	 * optional feature of exchange. For example, [???4???,???34???,???82???,???A45???]
	 * indicates that only advertisers using these exchange seats are allowed to
	 * bid on the impressions in this auction.
	 * 
	 * @scope optional
	 * @return
	 */
	public String[] getWseat();

	/**
	 * Flag to indicate whether Exchange can verify that all impressions offered
	 * represent all of the impressions available in context (e.g., all
	 * impressions available on the web page; all impressions available for a
	 * video [pre, mid and postroll spots], etc.) to support road-blocking. A
	 * true value should only be passed if the exchange is aware of all
	 * impressions in context for the publisher. ???0??? means the exchange cannot
	 * verify, and ???1??? means that all impressions represent all impressions
	 * available.
	 * 
	 * @default 0
	 * @scope optional
	 * @return
	 */
	public int getAllimps();

	/**
	 * Array of allowed currencies for bids on this bid request using ISO-4217
	 * alphabetic codes. If only one currency is used by the exchange, this
	 * parameter is not required.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getCur();

	/**
	 * Blocked Advertiser Categories. Note that there is no existing
	 * categorization / taxonomy of advertiser industries. However, as a
	 * substitute exchanges may decide to use IAB categories as an approximation
	 * (See Table 6.1 Content Categories)
	 * 
	 * @scope optional
	 * @return
	 */
	public String[] getBcat();

	/**
	 * as a substitute exchanges may decide to use IAB categories as an
	 * approximation (See Table 6.1 Content Categories)
	 * 
	 * @scope optional
	 * @return
	 */
	public String[] getBadv();

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
