/**
 * ************************************************************************** *
 * The Contents of this file are made available subject to * the terms of GNU
 * Lesser General Public License Version 2.1. * * GNU Lesser General Public
 * License Version 2.1 *
 * ======================================================================== *
 * Copyright 2003-2005 by IOn AG * * This library is free software; you can
 * redistribute it and/or * modify it under the terms of the GNU Lesser General
 * Public * License version 2.1, as published by the Free Software Foundation. *
 * * This library is distributed in the hope that it will be useful, * but
 * WITHOUT ANY WARRANTY; without even the implied warranty of * MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU * Lesser General Public
 * License for more details. * * You should have received a copy of the GNU
 * Lesser General Public * License along with this library; if not, write to the
 * Free Software * Foundation, Inc., 59 Temple Place, Suite 330, Boston, * MA
 * 02111-1307 USA * * *
 ***************************************************************************
 */
package ag.ion.bion.officelayer.internal.application;

import ag.ion.bion.officelayer.application.IApplicationProperties;
import ag.ion.bion.officelayer.application.ILazyApplicationInfo;

/**
 * Information provider of an OpenOffice (formerly OpenOffice.org) application.
 */
public class LazyOpenOfficeApplicationInfo extends AbstractLazyApplicationInfo implements ILazyApplicationInfo {

    private static final String PRODUCT_NAME = "OpenOffice";

    public LazyOpenOfficeApplicationInfo(String home,
            IApplicationProperties applicationProperties)
            throws IllegalArgumentException {
        super(home, applicationProperties, PRODUCT_NAME);
    }
}