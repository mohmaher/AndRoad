// Created by plusminus on 22:57:57 - 03.02.2008
package org.androad.util.constants;

public interface Constants {
	public static final int LAT_INDEX = 0;
	public static final int LON_INDEX = 1;

	public static boolean DEBUGMODE = true;

	public static final int NOT_SET = Integer.MIN_VALUE;

	public static final String ANDROAD_NAV_ACTION = "org.androad.intent.ACTION_NAV_TO";
	public static final String ANDROAD_VIEW_ACTION = "org.androad.intent.ACTION_VIEW";

	/** Overall DebugTag for whole AndRoad. */
	public static final String DEBUGTAG = "ANDROAD_DEBUGTAG";

	/** Shall be used if only one SubActivity is closed.*/
	public static final int SUBACTIVITY_RESULTCODE_UP_ONE_LEVEL = 0;
	/** Shall be used if a chain of SubActivities is to be closed and anything was aborted.*/
	public static final int SUBACTIVITY_RESULTCODE_CHAINCLOSE_QUITTED = SUBACTIVITY_RESULTCODE_UP_ONE_LEVEL + 1;
	/** Shall be used to go back one level in the dialog-process. */
	public static final int SUBACTIVITY_RESULTCODE_SUCCESS = SUBACTIVITY_RESULTCODE_CHAINCLOSE_QUITTED + 1;
	/** Shall be used if a chain of SubActivities is to be closed but the process itself was successful.*/
	public static final int SUBACTIVITY_RESULTCODE_CHAINCLOSE_SUCCESS = SUBACTIVITY_RESULTCODE_SUCCESS + 1;

	/* ########## EXTRAS IDENTIFIERS ########## */

	/** IDentifier for SubActivities to extract the Mode
	 * out of the Intents Extras the SubActivity was launched with. */
	public static final String EXTRAS_MODE = "org.androad.EXTRAS_MODE";

	public static final int EXTRAS_MODE_DIRECT_LATLNG = 0;
	public static final int EXTRAS_MODE_ZIPSEARCH = EXTRAS_MODE_DIRECT_LATLNG + 1;
	public static final int EXTRAS_MODE_CITYNAMESEARCH = EXTRAS_MODE_ZIPSEARCH + 1;
	public static final int EXTRAS_MODE_STREETNAMESEARCH = EXTRAS_MODE_CITYNAMESEARCH + 1;
	public static final int EXTRAS_MODE_LOAD_SAVED_ROUTE = EXTRAS_MODE_STREETNAMESEARCH + 1;
	public static final int EXTRAS_MODE_FREEFORMSEARCH = EXTRAS_MODE_LOAD_SAVED_ROUTE + 1;
	public static final int EXTRAS_MODE_LOAD_ROUTE_BY_ROUTEHANDLEID = EXTRAS_MODE_FREEFORMSEARCH + 1;

	/** IDentifier for SubActivities to extract the filename
	 * of a saved route, to be loaded from the SD-Card. */
	public static final String EXTRAS_SAVED_ROUTE_FILENAME_ID = "org.androad.EXTRAS_SAVED_ROUTE_FILENAME_ID";


	/** IDentifier for SubActivities to extract theLatitude
	 * out of the Intents Extras the SubActivity was launched with. */
	public static final String EXTRAS_START_LATITUDE_ID = "org.androad.EXTRAS_START_LATITUDE_ID";

	/** IDentifier for SubActivities to extract the Longitude.
	 * out of the Intents Extras the SubActivity was launched with. */
	public static final String EXTRAS_START_LONGITUDE_ID = "org.androad.EXTRAS_START_LONGITUDE_ID";

	/** IDentifier for SubActivities to extract theLatitude
	 * out of the Intents Extras the SubActivity was launched with. */
	public static final String EXTRAS_DESTINATION_LATITUDE_ID = "org.androad.EXTRAS_DESTINATION_LATITUDE_ID";

	/** IDentifier for SubActivities to extract the Longitude.
	 * out of the Intents Extras the SubActivity was launched with. */
	public static final String EXTRAS_DESTINATION_LONGITUDE_ID = "org.androad.EXTRAS_DESTINATION_LONGITUDE_ID";

	/** IDentifier for SubActivities to extract title name
	 * out of the Intents Extras the SubActivity was launched with. */
	public static final String EXTRAS_DESTINATION_TITLE = "org.androad.EXTRAS_DESTINATION_TITLE";


	/** IDentifier for SubActivities to extract the count of VIAS.
	 * out of the Intents Extras the SubActivity was launched with. */
	public static final String EXTRAS_VIAS_ID = "org.androad.EXTRAS_VIAS_ID";
	public static final String EXTRAS_VIAS_SPLITTER = ";";

	/** IDentifier for SubActivities to extract the Country-Code
	 * out of the Intents Extras the SubActivity was launched with. */
	public static final String EXTRAS_COUNTRY_ID = "org.androad.EXTRAS_COUNTRYCODE_ID";

	/** IDentifier for SubActivities to extract the CountrySubdivision-Code
	 * out of the Intents Extras the SubActivity was launched with. */
	public static final String EXTRAS_COUNTRYSUBDIVISIONCODE_ID = "org.androad.EXTRAS_COUNTRYSUBDIVISIONCODE_ID";

	/** IDentifier for SubActivities to extract the City-Name
	 * out of the Intents Extras the SubActivity was launched with. */
	public static final String EXTRAS_CITYNAME_ID = "org.androad.EXTRAS_CITYNAME_ID";

	/** IDentifier for SubActivities to extract the StreetName
	 * out of the Intents Extras the SubActivity was launched with. */
	public static final String EXTRAS_STREET_ID = "org.androad.EXTRAS_STREET_ID";

	/** IDentifier for SubActivities to extract the StreetNumber
	 * out of the Intents Extras the SubActivity was launched with. */
	public static final String EXTRAS_STREETNUMBER_ID = "org.androad.EXTRAS_STREETNUMBER_ID";

	/** IDentifier for SubActivities to extract the ZipCode
	 * out of the Intents Extras the SubActivity was launched with. */
	public static final String EXTRAS_ZIPCODE_ID = "org.androad.EXTRAS_ZIPCODE_ID";

	public static final String EXTRAS_FREEFORM_ID = "org.androad.EXTRAS_FREEFORM_ID";

	public static final String EXTRAS_ROUTEHANDLEID_ID = "org.androad.EXTRAS_ROUTEHANDLEID_ID";
}
