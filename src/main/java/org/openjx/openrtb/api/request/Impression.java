package org.openjx.openrtb.api.request;

import org.openjx.openrtb.api.Extensions;

/**
 * The ???imp??? object describes the ad position or impression being auctioned. A
 * single bid request can include multiple ???imp??? objects, a use case for which
 * might be an exchange that supports selling all ad positions on a given page
 * as a bundle. Each ???imp??? object has a required ID so that bids can reference
 * them individually. An exchange can also conduct private auctions by
 * restricting involvement to specific subsets of seats within bidders.
 * 
 * 
 * @scope required
 * @author nabib
 * 
 */
public interface Impression {

	/**
	 * A unique identifier for this impression within the context of the bid
	 * request (typically, value starts with 1, and increments up to n for n
	 * impressions).
	 * 
	 * @scope required
	 * @return
	 */
	public String getId();

	/**
	 * A reference to a banner object. Either a banner or video object (or both
	 * if the impression could be either) must be included in an impression
	 * object.
	 * 
	 * @see {@link Banner} Object.
	 * 
	 * @scope required for banner impression
	 * @return
	 */
	public Banner getBanner();

	/**
	 * A reference to a video object. Either a banner or video object (or both
	 * if the impression could be either) must be included in an impression
	 * object.
	 * 
	 * 
	 * @see {@link Video} Object.
	 * 
	 * @scope required for video impression
	 * @return
	 */
	public Video getVideo();

	/**
	 * Name of ad mediation partner, SDK technology, or native player
	 * responsible for rendering ad (typically video or mobile). Used by some ad
	 * servers to customize ad code by partner.
	 * 
	 * @scope recommended for video and native apps s
	 * @return
	 */
	public String getDisplaymanager();

	/**
	 * Version of ad mediation partner, SDK technology, or native player
	 * responsible for rendering ad (typically video or mobile). Used by some ad
	 * servers to customize ad code by partner
	 * 
	 * @scope recommended for video and native apps
	 * @return
	 */
	public String getDisplaymanagerver();

	/**
	 * 1 if the ad is interstitial or full screen; else 0 (i.e., no).
	 * 
	 * @default 0
	 * @scope optional
	 * @return
	 */
	public int getInstl();

	/**
	 * Identifier for specific ad placement or ad tag that was used to initiate
	 * the auction. This can be useful for debugging of any issues, or for
	 * optimization by the buyer.
	 * 
	 * @scope optional
	 * @return
	 */
	public String getTagid();

	/**
	 * Bid floor for this impression (in CPM of bidfloorcur).
	 * 
	 * @default 0d
	 * @scope optional
	 * @return
	 */
	public double getBidfloor();

	/**
	 * If bid floor is specified and multiple currencies supported per bid
	 * request, then currency should be specified here using ISO-4217 alphabetic
	 * codes. Note, this may be different from bid currency returned by bidder,
	 * if this is allowed on an exchange.
	 * 
	 * @default "USD"
	 * @scope optional
	 * @return
	 */
	public String getBidfloorcur();

	/**
	 * Array of names for supported iframe busters. Exchange specific.
	 * 
	 * @default Null
	 * @scope optional
	 * @return
	 */
	public String[] getIframebuster();

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
