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
package org.geomajas.sld.editor.common.client.model;

import org.geomajas.sld.StyledLayerDescriptorInfo;

/**
 * Factory of {@link SldModel} instances (auto-generated, see client module).
 * 
 * @author Jan De Moerloose
 * 
 */
public interface SldModelFactory {

	SldModel create(StyledLayerDescriptorInfo styledLayerDescriptorInfo);
}
