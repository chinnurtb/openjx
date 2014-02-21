package org.openjx.openrtb.api.request;

public class InvalidBidRequestException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2396058454474640469L;

	public InvalidBidRequestException(String message) {
		super(message);
	}
	
	public InvalidBidRequestException(String message, Exception e) {
		super(message, e);
	}
}
