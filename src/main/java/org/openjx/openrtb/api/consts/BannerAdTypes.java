package org.openjx.openrtb.api.consts;

/**
 * OpenRTB - 6.2
 * 
 * List indicates the types of ads that can be accepted by the exchange unless
 * restricted by publisher site settings.
 * 
 * @author nabib
 * 
 */
public class BannerAdTypes {

	// 1 XHTML text ad. (usually mobile)
	public static final int XHTML_TEXT_AD = 1;

	// 2 XHTML banner ad. (usually mobile)
	public static final int XHTML_BANNER_AD = 2;

	// 3 JavaScript ad; must be valid XHTML (i.e., script tags included).
	public static final int XHTML_JAVASCRIPT = 3;

	// 4 Iframe
	public static final int IFRAME = 4;
}
