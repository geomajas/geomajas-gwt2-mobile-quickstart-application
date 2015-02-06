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

package org.geomajas.quickstart.mobile.client.widget.slidenav;

import com.google.gwt.user.client.ui.IsWidget;

/**
 * Sliding navigation Layout interface.
 * 
 * @author Dosi Bingov
 */
public interface SlideNavLayout extends IsWidget {

	void setMenuTitle(String title);

	void setMainContent(IsWidget content);

	void setNavContent(IsWidget navContent);

	void setNavbarContent(IsWidget navbarContent);

}