/*
 * Java
 *
 * Copyright 2015 IS2T. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found at http://www.is2t.com/open-source-bsd-license/.
 */

package ej.examples.arabicfont;

import ej.microui.MicroUI;
import ej.microui.display.Colors;
import ej.microui.display.Display;
import ej.microui.display.Displayable;
import ej.microui.display.ExplicitFlush;
import ej.microui.display.GraphicsContext;

public final class HowToUseArabicFont {

	// Prevents initialization.
	private HowToUseArabicFont() {
	}

	public static void main(String[] args) {
		// initialize the drawing system
		initialize();
		Display display = Display.getDefaultDisplay();
		Displayable displayable = new HowToUseArabicFontDisplayable(display);
		displayable.show();
	}

	private static void initialize() {
		// initialize graphics
		MicroUI.start();
		Display display = Display.getDefaultDisplay();
		if (display != null) {
			int displayWidth = display.getWidth();
			int displayHeight = display.getHeight();

			// Draw background
			ExplicitFlush explicitFlush = display.getNewExplicitFlush();
			explicitFlush.setColor(Colors.WHITE);
			explicitFlush.fillRect(0, 0, displayWidth, displayHeight);
			explicitFlush.flush();

			// Set
			GraphicsContext g = display.getNewGraphicsContext();
			g.setColor(Colors.BLACK);
		}
	}
}
