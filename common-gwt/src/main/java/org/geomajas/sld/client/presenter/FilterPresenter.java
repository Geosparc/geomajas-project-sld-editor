package org.geomajas.sld.client.presenter;

import org.geomajas.sld.client.model.RuleData;
import org.geomajas.sld.client.model.event.RuleSelectedEvent;
import org.geomajas.sld.client.model.event.RuleSelectedEvent.RuleSelectedHandler;
import org.geomajas.sld.client.presenter.event.SldContentChangedEvent.HasSldContentChangedHandlers;
import org.geomajas.sld.client.view.ViewUtil;
import org.geomajas.sld.filter.FilterTypeInfo;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyEvent;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;

public class FilterPresenter extends Presenter<FilterPresenter.MyView, FilterPresenter.MyProxy> implements
		RuleSelectedHandler {

	private final ViewUtil viewUtil;

	@Inject
	public FilterPresenter(final EventBus eventBus, final MyView view, final MyProxy proxy, final ViewUtil viewUtil) {
		super(eventBus, view, proxy);
		this.viewUtil = viewUtil;
	}

	@ProxyStandard
	public interface MyProxy extends Proxy<FilterPresenter> {
	}

	/**
	 * {@link RuleSelectorPresenter}'s view.
	 */
	public interface MyView extends View, HasSldContentChangedHandlers {

		boolean isValid(FilterTypeInfo filterTypeInfo);

		void modelToView(FilterTypeInfo filterTypeInfo);
		
		void clear();

	}

	@Override
	protected void onBind() {
		super.onBind();
		addRegisteredHandler(RuleSelectedEvent.getType(), this);
	}

	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this, RulePresenter.TYPE_FILTER_CONTENT, this);
	}

	@ProxyEvent
	public void onRuleSelected(RuleSelectedEvent event) {
		if (event.getRuleData().getFilter() != null) {
			FilterTypeInfo filter = event.getRuleData().getFilter();
			if (getView().isValid(filter)) {
				getView().modelToView(filter);
				forceReveal();
			} else {
				viewUtil.showWarning("Het filter voor deze regel wordt niet ondersteund en kan dus niet getoond worden.");
			}
		}
	}

}
