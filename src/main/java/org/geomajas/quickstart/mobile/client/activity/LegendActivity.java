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
package org.geomajas.quickstart.mobile.client.activity;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.event.shared.EventBus;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.dom.client.event.tap.TapHandler;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;
import org.geomajas.gwt2.client.map.MapPresenter;
import org.geomajas.quickstart.mobile.client.MobileAppFactory;
import org.geomajas.quickstart.mobile.client.animation.ActionNames;
import org.geomajas.quickstart.mobile.client.event.ActionEvent;
import org.geomajas.quickstart.mobile.client.presenter.LegendPresenter;
import org.geomajas.quickstart.mobile.client.view.LegendView;
import org.geomajas.quickstart.mobile.client.widget.layerlist.LayerListPresenter;
import org.geomajas.quickstart.mobile.client.widget.layerlist.LayerListPresenterImpl;

/**
 * Legend activity and presenter.
 *
 * @author Dosi Bingov
 */
public class LegendActivity extends MGWTAbstractActivity implements LegendPresenter {

  private final LegendView legendView;
  private final String eventId;
  private LayerListPresenter layerListPresenter;


	public LegendActivity(MobileAppFactory mobileAppFactory) {
		this.legendView = mobileAppFactory.getLegendView();
		MapPresenter mapPresenter = mobileAppFactory.getMapView().getMap().getMapPresenter();

		this.layerListPresenter =
				new LayerListPresenterImpl(mapPresenter.getEventBus(), mobileAppFactory.getlayerListView());
		this.eventId = "nav";

		layerListPresenter.renderLayerRecords(mapPresenter.getLayersModel());
	}

  @Override
  public void start(AcceptsOneWidget panel, final EventBus eventBus) {

	  addHandlerRegistration(legendView.getBackbutton().addTapHandler(new TapHandler() {

		@Override
		  public void onTap(TapEvent event) {
			  ActionEvent.fire(eventBus, ActionNames.BACK);
	//		  eventBus.fireEvent(new ShowMasterEvent(eventId));
		  }
		}));

	/*  addHandlerRegistration(legendView.getTestButton().addTapHandler(new TapHandler() {

		  @Override
		  public void onTap(TapEvent event) {
			  ViewChangeEvent.fire(eventBus, ViewChangeEvent.VIEW.TEST_VIEW);
			  // eventBus.fireEvent(new ShowMasterEvent(eventId));

		 }
	  }));*/

	  /*records = getLegendRecords();
	  legendView.renderRecords(records);*/
/*

	  addHandlerRegistration(legendView.getRecordsList().addCellSelectedHandler(new CellSelectedHandler() {

		  @Override
		  public void onCellSelected(CellSelectedEvent event) {
			  int index = event.getIndex();

			  legendView.setSelectedIndex(oldIndex, false);
			  legendView.setSelectedIndex(index, true);
			  oldIndex = index;

			  //TODO: fire event to navigate to record details
			  // UIEntrySelectedEvent.fire(eventBus, items.get(index).getEntry());

		  }
	  }));
*/

	  legendView.getHeader().setText("Layers");
	  legendView.getBackbuttonText().setText("Map");
	  legendView.setLayerListView(layerListPresenter.getLayerList());

	  panel.setWidget(legendView);

  }
}
