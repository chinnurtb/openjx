package org.openjx.openrtb.api.request;

public class BidRequestValidator {
	
	public static boolean validate(BidRequest request) throws InvalidBidRequestException {
		if (request.getApp() != null && request.getSite() != null) {
			throw new InvalidBidRequestException("Bid request may not have both the App and Site set.");
		}
		return true;
	}

}
