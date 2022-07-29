/*******************************************************************************
 * Copyright (c) 2000, 2018 IBM Corporation and others.
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
 *******************************************************************************/
package org.eclipse.swt.graphics;

public final class FontData {
    public String name;
    public float height;
    public int style;
    public byte[] string;
    
    public FontData(String name, int height, int style) {
        setName(name);
        setHeight(height);
        setStyle(style);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getStyle() {
        return this.style;
    }
    
    public void setStyle(int style) {
        this.style = style;
    }
    
    public int getHeight() {
        return (int)(0.5f + height);
    }
    
    public void setHeight(int height) {
        this.height = height;
    }

}
