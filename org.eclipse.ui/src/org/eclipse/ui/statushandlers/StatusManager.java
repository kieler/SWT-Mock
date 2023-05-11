/*******************************************************************************
 * Copyright (c) 2006, 2016 IBM Corporation and others.
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
 *     Gorkem Ercan (Red Hat) - Fix for Bug 427142
 *******************************************************************************/

package org.eclipse.ui.statushandlers;

import java.awt.Dialog;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;

/**
 * <p>
 * StatusManager is the entry point for all statuses to be reported in the user
 * interface.
 * </p>
 *
 * <p>
 * Handlers shoudn't be used directly but through the StatusManager singleton
 * which keeps the status handling policy and chooses handlers.
 * <code>StatusManager.getManager().handle(IStatus)</code> and
 * <code>handle(IStatus status, int style)</code> are the methods are the
 * primary access points to the StatusManager.
 * </p>
 *
 * <p>
 * Acceptable styles (can be combined with logical OR)
 * </p>
 * <ul>
 * <li>NONE - a style indicating that the status should not be acted on. This is
 * used by objects such as log listeners that do not want to report a status
 * twice</li>
 * <li>LOG - a style indicating that the status should be logged only</li>
 * <li>SHOW - a style indicating that handlers should show a problem to an user
 * without blocking the calling method while awaiting user response. This is
 * generally done using a non modal {@link Dialog}</li>
 * <li>BLOCK - a style indicating that the handling should block the UI until
 * the user has responded. This is generally done using a modal window such as a
 * {@link Dialog}</li>
 * </ul>
 *
 * <p>
 * Handlers are intended to be accessed via the status manager. The
 * StatusManager chooses which handler should be used for a particular error.
 * There are two ways for adding handlers to the handling flow. First using
 * extension point <code>org.eclipse.ui.statusHandlers</code>, second by the
 * workbench advisor and its method
 * WorkbenchAdvisor#getWorkbenchErrorHandler(). If a handler is
 * associated with a product, it is used instead of this defined in advisor.
 * </p>
 *
 * @since 3.3
 */
public class StatusManager {
	/**
	 * A style indicating that the status should not be acted on. This is used by
	 * objects such as log listeners that do not want to report a status twice.
	 */
	public static final int NONE = 0;

	/**
	 * A style indicating that the status should be logged only.
	 */
	public static final int LOG = 0x01;

	/**
	 * A style indicating that handlers should show a problem to an user without
	 * blocking the calling method while awaiting user response. This is generally
	 * done using a non modal {@link Dialog}.
	 */
	public static final int SHOW = 0x02;

    public static final int BLOCK = 0x04;

	private static volatile StatusManager MANAGER;

	/**
	 * Returns StatusManager singleton instance.
	 *
	 * @return the manager instance
	 */
	public static StatusManager getManager() {
		if (MANAGER != null) {
			return MANAGER;
		}
		synchronized (StatusManager.class) {
			if (MANAGER == null) {
				MANAGER = new StatusManager();
			}
		}
		return MANAGER;
	}

	/**
	 * Handles the given status due to the style. Because the facility depends on
	 * Workbench, this method will log the status, if Workbench isn't initialized
	 * and the style isn't {@link #NONE}. If Workbench isn't initialized and the
	 * style is {@link #NONE}, the manager will do nothing.
	 *
	 * @param status the status to handle
	 * @param style  the style. Value can be combined with logical OR. One of
	 *               {@link #NONE}, {@link #LOG}, {@link #SHOW} and {@link #BLOCK}.
	 */
	public void handle(IStatus status, int style) {
	}

	/**
	 * Handles given CoreException. This method has been introduced to prevent
	 * anti-pattern:
	 *
	 * <pre>
	 * <code>
	 * StatusManager.getManager().handle(coreException.getStatus());
	 * </code>
	 * </pre>
	 *
	 * that does not print the stack trace to the log.
	 *
	 * @param coreException a CoreException to be handled.
	 * @param pluginId      the unique identifier of the relevant plug-in
	 * @since 3.4
	 *
	 */
	public void handle(CoreException coreException, String pluginId) {
		
	}
}
