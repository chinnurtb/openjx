package com.openjx.openrtb.api.request;

import com.openjx.openrtb.api.Extensions;

/**
 * The segment object is a child of the data object, and describes data segments
 * applicable to the user for the given data provider.
 * 
 * @scope optional
 * @author nabib
 * 
 */
public interface Segment {

	/**
	 * ID of a data provider's segment applicable to the user
	 * 
	 * @scope optional
	 * @return
	 */
	public String getId();

	/**
	 * Name of a data provider's segment applicable to the user
	 * 
	 * @scope optional
	 * @return
	 */
	public String getName();

	/**
	 * String representing the value of the segment. The method for transmitting
	 * this data should be negotiated offline with the data provider. For
	 * example for gender, "male", or "female", for age, "30-40")
	 * 
	 * @scope optional
	 * @return
	 */
	public String getValue();

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
