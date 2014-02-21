package com.openjx.openrtb.api.consts;

/**
 * OpenRTB - 4.6
 * 
 * The win notice URL and its format are defined by the bidder. In order for the
 * exchange to convey certain information to the winning bidder (e.g., the
 * settlement price), a number of substitution macros can be inserted into the
 * win notice URL definition. Prior to calling a win notice URL, the exchange
 * will search the specified URL for any of the defined macros and replace them
 * with the appropriate data. Note that the substitution is simple in the sense
 * that wherever a legal macro is found, it will be replaced without regard for
 * syntax correctness. Furthermore, if the source value is an optional parameter
 * that was not specified, the macro will simply be removed (i.e., replaced with
 * a zero-length string). These same substitution macros can also be placed in
 * the ad markup. The exchange will perform the same data substitutions as in
 * the win notice URL. This occurs irrespective of whether the markup is
 * returned on the win notice or passed in the "adm" attribute of the bid
 * response. A use case for macros in the ad markup might be when a bidder
 * prefers to receive its win notice from the device itself. To accomplish this,
 * the bidder would include a tracking pixel in the ad markup the URL for which
 * would include any of the available macros.
 * 
 * @author nabib
 * 
 */
public class SubstitutionMacros {

	// ID of the bid request; from "id" attribute.

	public static final String AUCTION_ID = "${AUCTION_ID}";

	// ID of the bid; from "bidid" attribute.
	public static final String AUCTION_BID_ID = "${AUCTION_BID_ID}";

	// ID of the impression just won; from "impid" attribute.
	public static final String AUCTION_IMP_ID = "${AUCTION_IMP_ID}";

	// ID of the bidder's seat for whom the bid was made.
	public static final String AUCTION_SEAT_ID = "${AUCTION_SEAT_ID}";

	// ID of the ad markup the bidder wishes to serve; from "adid" attribute.
	public static final String AUCTION_AD_ID = "${AUCTION_AD_ID}";

	// Settlement price using the same currency and units as the bid.
	public static final String AUCTION_PRICE = "${AUCTION_PRICE}";

	// The currency used in the bid (explicit or implied); for confirmation only
	public static final String AUCTION_CURRENCY = "${AUCTION_CURRENCY}";

}
