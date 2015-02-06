/*
 * This is part of Geomajas, a GIS framework, http://www.geomajas.org/.
 *
 * Copyright 2008-2015 Geosparc nv, http://www.geosparc.com/, Belgium.
 *
 * The program is available in open source according to the GNU Affero
 * General Public License. All contributions in this program are covered
 * by the Geomajas Contributors License Agreement. For full licensing
 * details, see LICENSE.txt in the project root.
 */
package org.geomajas.quickstart.mobile.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

/**
 * TODO.
 *
 * @author Dosi Bingov
 */
public class LegendPlace extends Place {

	/**
	 * TODO.
	 *
	 * @author Dosi Bingov
	 */
	public static class Tokenizer implements PlaceTokenizer<LegendPlace> {

		@Override
		public LegendPlace getPlace(String token) {
			return new LegendPlace();
		}

		@Override
		public String getToken(LegendPlace place) {
			return "";
		}

	}
}
