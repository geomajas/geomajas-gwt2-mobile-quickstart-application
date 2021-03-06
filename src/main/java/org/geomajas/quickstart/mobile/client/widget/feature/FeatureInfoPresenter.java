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
package org.geomajas.quickstart.mobile.client.widget.feature;

import org.geomajas.gwt2.client.map.feature.Feature;
import org.geomajas.gwt2.client.map.layer.FeaturesSupported;

import java.util.List;
import java.util.Map;

/**
 * TODO.
 *
 * @author Dosi Bingov
 */
public interface FeatureInfoPresenter {
	boolean show();

	void hideView();

	void fetchData(Map<FeaturesSupported, List<Feature>> featureMap);

	void setView(FeatureInfoSlideUpView view);

	FeatureInfoSlideUpView getView();

	void setDragUpHandler(DragUpHandler dragUpHandler);

	void setDragDownHandler(DragDownHandler dragDownHandler);

	Feature getCurrentFeature();

	boolean shiftToPrevFeature();

	boolean shiftToNextFeature();

	List<Feature> getAllFeatures();

	/**
	 * TODO.
	 */
	public interface DragUpHandler {
		void onDragUp();
	}

	/**
	 * TODO.
	 */
	public interface DragDownHandler {
		void onDragDown();
	}

	/**
	 * TODO.
	 */
	public interface FeatureNumberTabHandler {
		void onFeatureNumberTap();
	}


	String getTitle();


}

