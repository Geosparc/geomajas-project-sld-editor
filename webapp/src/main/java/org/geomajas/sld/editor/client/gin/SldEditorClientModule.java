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

package org.geomajas.sld.editor.client.gin;

import org.geomajas.sld.editor.client.presenter.SmartGwtRootPresenter;

/**
 * @author An Buyle
 */

public class SldEditorClientModule extends ClientModule {
	@Override
	protected void configure() {
		super.configure();
		
		bind(SmartGwtRootPresenter.class).asEagerSingleton();
	}
}
