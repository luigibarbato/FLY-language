/*
 * generated by Xtext 2.16.0
 */
package org.xtext.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.FLY.ui.internal.FLYActivator;

public class FLYUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return FLYActivator.getInstance().getInjector("org.xtext.FLY");
	}

}