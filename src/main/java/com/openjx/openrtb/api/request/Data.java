package com.openjx.openrtb.api.request;

import com.openjx.openrtb.api.Extensions;

/**
 * The data object is a child of the user object and describes a data source.
 * Once segment objects are embedded, data about the user may be passed to
 * bidders.
 * 
 * @scope optional
 * @author nabib
 * 
 */
public interface Data {

	/**
	 * Exchange specific ID for the data provider
	 * 
	 * @scope optional
	 * @return
	 */
	public String getId();

	/**
	 * Data provider name
	 * 
	 * @scope optional
	 * @return
	 */
	public String getName();

	/**
	 * Array of segment objects
	 * 
	 * @scope optional
	 * @return
	 */
	public Segment[] getSegment();

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
