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
package org.eclipse.ui;
public interface IWorkbenchPage {
    void bringToTop(IWorkbenchPart part);
    void addPartListener(IPartListener2 listener);
    void removePartListener(IPartListener2 listener);
    IEditorPart[] getEditors();
    IEditorPart openEditor(IEditorInput input, String editorId) throws PartInitException;

}