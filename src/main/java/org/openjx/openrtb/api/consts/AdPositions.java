package org.openjx.openrtb.api.consts;

/**
 * OpenRTB - 6.5
 * 
 * The position of the ad as a relative measure of visibility or prominence.
 * Note to the reader: This OpenRTB table has values derived from the IAB
 * Quality Assurance Guidelines (QAG). Users of OpenRTB should keep in sync with
 * updates to the QAG values as published on IAB.net. Values 3-6 apply to native
 * apps per the mobile addendum to the version 1.5 of the QAG.
 * 
 * @author nabib
 * 
 */
public class AdPositions {

	// 0 Unknown
	public static final int UNKNOWN = 0;

	// 1 Above the fold
	public static final int ABOVE_THE_FOLD = 1;

	// 2 DEPRECATED - May or may not be immediately visible depending on screen
	// size and resolution.
	public static final int DEPRECATED = 2;

	// 3 Below the fold
	public static final int BELOW_THE_FOLD = 3;

	// 4 Header
	public static final int HEADER = 4;

	// 5 Footer
	public static final int FOOTER = 5;

	// 6 Sidebar
	public static final int SIDEBAR = 6;

	// 7 Fullscreen
	public static final int FULLSCREEN = 7;

}
