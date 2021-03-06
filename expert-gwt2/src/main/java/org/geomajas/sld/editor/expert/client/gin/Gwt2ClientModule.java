/*
 * This is part of Geomajas, a GIS framework, http://www.geomajas.org/.
 *
 * Copyright 2008-2014 Geosparc nv, http://www.geosparc.com/, Belgium.
 *
 * The program is available in open source according to the Apache
 * License, Version 2.0. All contributions in this program are covered
 * by the Geomajas Contributors License Agreement. For full licensing
 * details, see LICENSE.txt in the project root.
 */

package org.geomajas.sld.editor.expert.client.gin;

import org.geomajas.sld.editor.expert.client.presenter.Gwt2RootPresenter;
import org.geomajas.sld.editor.expert.client.presenter.SldEditorExpertPresenter;
import org.geomajas.sld.editor.expert.client.view.SldEditorView;
import org.geomajas.sld.editor.expert.client.view.ViewUtil;
import org.geomajas.sld.editor.expert.client.view.ViewUtilImpl;

import com.google.inject.Singleton;

/**
 * @author Kristof Heirwegh
 */
public class Gwt2ClientModule extends ClientModule {

	@Override
	protected void configure() {
		super.configure();

		bind(Gwt2RootPresenter.class).asEagerSingleton();

		bind(ViewUtil.class).to(ViewUtilImpl.class).in(Singleton.class);

		bindPresenter(SldEditorExpertPresenter.class, SldEditorExpertPresenter.MyView.class, SldEditorView.class,
				SldEditorExpertPresenter.MyProxy.class);
	}
}
