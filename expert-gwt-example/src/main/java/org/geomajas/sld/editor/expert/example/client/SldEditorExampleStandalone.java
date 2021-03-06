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
package org.geomajas.sld.editor.expert.example.client;

import org.geomajas.gwt.example.base.ExampleLayout;

import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point for Expert SLD Editor example.
 *
 * @author Jan De Moerloose
 */
public class SldEditorExampleStandalone implements EntryPoint {

	@Override
	public void onModuleLoad() {
		ExampleLayout exampleLayout = new ExampleLayout();
		exampleLayout.buildUi();
	}

}
