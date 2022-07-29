/*******************************************************************************
 * Copyright (c) 2000, 2020 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Lars Vogel <Lars.Vogel@vogella.com> - Bug 455263
 *******************************************************************************/
package org.eclipse.swt;
public class SWT {

    public static final int PAUSED = 1 << 2;
    public static final int NORMAL = 0;
    public static final int ITALIC = 1 << 1;
    public static final int BOLD = 1 << 0;
    
    public static boolean OFF = false;
    public static final int NONE = 0;

    public static final int COLOR_LIST_SELECTION = 26;
    public static final int NO_BACKGROUND = 1 << 18;
    public static final int DROP_DOWN = 1 << 2;
    public static final int READ_ONLY = 1 << 3;
    public static final int BORDER = 1 << 11;
    public static final int WRAP = 1 << 6;

}
