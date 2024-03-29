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

import java.io.Serializable;

/**
 * Popup template class.
 * 
 * @author Chris Duncan (cduncan@gisfaces.com)
 */
public class PopupTemplate implements Serializable {
	/** Serial Version UID. */
	private static final long serialVersionUID = 6392705110200613598L;

	/** Popup title. */
	private String title;

	/** Popup content. */
	private String content;

	/**
	 * Constructor
	 */
	public PopupTemplate() {
		this("Feature");
	}

	/**
	 * Constructor.
	 * 
	 * @param title Popup title.
	 */
	public PopupTemplate(String title) {
		this(title, null);
	}

	/**
	 * Constructor.
	 * 
	 * @param title   Popup title.
	 * @param content Popup content.
	 */
	public PopupTemplate(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	/**
	 * Method to get the popup title.
	 * 
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Method to set the popup title.
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Method to get the popup content.
	 * 
	 * @return
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Method to set the popup content.
	 * 
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
	}
}
