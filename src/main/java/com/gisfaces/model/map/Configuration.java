/*
 * The MIT License
 *
 * Copyright (c) 2013-2023 Chris Duncan (cduncan@gisfaces.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.gisfaces.model.map;

import com.gisfaces.component.Constants;
import java.io.Serializable;

/**
 * Map configuration class.
 * 
 * @author Chris Duncan (cduncan@gisfaces.com)
 */
public class Configuration implements Serializable {
	/** Serial Version UID. */
	private static final long serialVersionUID = 4106942894342098444L;

	/** Esri JavaScript API URL. */
	private String jsApiUrl = Constants.DEFAULT_JSAPI;

	/** Local geometry service URL. */
	private String geometryServiceUrl;

	/** Local geoRSS service URL. */
	private String geoRssServiceUrl;

	/** Local KML service URL. */
	private String kmlServiceUrl;

	/** Local portal URL. */
	private String portalUrl;

	/** Local proxy URL to override included proxy. */
	private String proxyUrl;

	/** Proxy enabled indicator. Included proxy used by default. */
	private boolean proxyEnabled;

	/**
	 * Constructor.
	 */
	public Configuration() {
		super();
	}

	/**
	 * Method to get the ESRI JavaScript API URL.
	 * 
	 * @return
	 */
	public String getJsApiUrl() {
		return jsApiUrl;
	}

	/**
	 * Method to set the ESRI JavaScript API URL.
	 * 
	 * @param jsApiUrl
	 */
	public void setJsApiUrl(String jsApiUrl) {
		this.jsApiUrl = jsApiUrl;
	}

	/**
	 * Method to get the local geometry service URL.
	 * 
	 * @return
	 */
	public String getGeometryServiceUrl() {
		return geometryServiceUrl;
	}

	/**
	 * Method to set the local geometry service URL.
	 * 
	 * @param geometryServiceUrl
	 */
	public void setGeometryServiceUrl(String geometryServiceUrl) {
		this.geometryServiceUrl = geometryServiceUrl;
	}

	/**
	 * Method to get the local geoRSS service URL.
	 * 
	 * @return
	 */
	public String getGeoRssServiceUrl() {
		return geoRssServiceUrl;
	}

	/**
	 * Method to set the local geoRSS service URL.
	 * 
	 * @param geoRssServiceUrl
	 */
	public void setGeoRssServiceUrl(String geoRssServiceUrl) {
		this.geoRssServiceUrl = geoRssServiceUrl;
	}

	/**
	 * Method to get the local KML service URL.
	 * 
	 * @return
	 */
	public String getKmlServiceUrl() {
		return kmlServiceUrl;
	}

	/**
	 * Method to set the local KML service URL.
	 * 
	 * @param kmlServiceUrl
	 */
	public void setKmlServiceUrl(String kmlServiceUrl) {
		this.kmlServiceUrl = kmlServiceUrl;
	}

	/**
	 * Method to get the local portal URL.
	 * 
	 * @return
	 */
	public String getPortalUrl() {
		return portalUrl;
	}

	/**
	 * Method to set the local portal URL.
	 * 
	 * @param portalUrl
	 */
	public void setPortalUrl(String portalUrl) {
		this.portalUrl = portalUrl;
	}

	/**
	 * Method to get the local proxy URL.
	 * 
	 * @return
	 */
	public String getProxyUrl() {
		return proxyUrl;
	}

	/**
	 * Method to set the local proxy URL.
	 * 
	 * @param proxyUrl
	 */
	public void setProxyUrl(String proxyUrl) {
		this.proxyUrl = proxyUrl;
	}

	/**
	 * Method to get the proxy enabled indicator.
	 * 
	 * @return
	 */
	public boolean isProxyEnabled() {
		return proxyEnabled;
	}

	/**
	 * Method to set the proxy enabled indicator.
	 * 
	 * @param proxyEnabled
	 */
	public void setProxyEnabled(boolean proxyEnabled) {
		this.proxyEnabled = proxyEnabled;
	}
}
