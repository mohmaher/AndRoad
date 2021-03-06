package org.androad.sys.ors.lus;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

import org.osmdroid.util.GeoPoint;

import org.androad.sys.ors.adt.GeocodedAddress;
import org.androad.sys.ors.adt.lus.Country;
import org.androad.sys.ors.adt.lus.ICountrySubdivision;
import org.androad.sys.ors.adt.lus.ReverseGeocodePreferenceType;
import org.androad.sys.ors.exceptions.ORSException;

import org.xml.sax.SAXException;

import android.content.Context;

public interface LUSRequester {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	public ArrayList<GeocodedAddress> requestReverseGeocode(final Context ctx, final GeoPoint aGeoPoint, final ReverseGeocodePreferenceType aPreferenceType) throws MalformedURLException, IOException, SAXException, ORSException;

	public ArrayList<GeocodedAddress> requestFreeformAddress(final Context ctx, final Country nat, final String freeFormAddress) throws MalformedURLException, IOException, SAXException, ORSException;

	public ArrayList<GeocodedAddress> requestStreetaddressCity(final Context ctx, final Country nat, final ICountrySubdivision pCountrySubdivision, final String pCity, final String pStreetName, final String pStreetNumber) throws MalformedURLException, IOException, SAXException, ORSException;

	public ArrayList<GeocodedAddress> requestStreetaddressPostalcode(final Context ctx, final Country nat, final ICountrySubdivision pCountrySubdivision, final String pPostalCode, final String pStreetName, final String pStreetNumber) throws MalformedURLException, IOException, SAXException, ORSException;

	// ===========================================================
	// Methods from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
