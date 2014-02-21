package com.openjx.openrtb.api.consts;

/**
 * OpenRTB - 6.9
 * 
 * Lists the various options for the video start delay. If the start delay value
 * is greater than 0 then the position is mid-roll, and the value represents the
 * number of seconds into the content that the ad will be displayed. If the
 * start delay time is not available, the exchange can report the position of
 * the ad in general terms using this table of negative numbers.
 * 
 * @author nabib
 * 
 */
public class VideoStartDelays {

	// 0 Pre-roll
	public static final int PRE_ROLL = 0;

	// -1 Generic mid-roll
	public static final int GENERIC_MID_ROLL = -1;

	// -2 Generic Post-roll
	public static final int GENERIC_POST_ROLL = -2;

}
