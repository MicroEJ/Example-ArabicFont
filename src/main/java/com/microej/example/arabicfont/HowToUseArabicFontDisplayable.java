/*
 * Java
 *
 * Copyright 2015 IS2T. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found at http://www.is2t.com/open-source-bsd-license/.
 */

package com.microej.example.arabicfont;

import ej.microui.display.Colors;
import ej.microui.display.Display;
import ej.microui.display.Displayable;
import ej.microui.display.Font;
import ej.microui.display.GraphicsContext;
import ej.microui.util.EventHandler;

/**
 * This displayable shows how to use the arabic fonts.
 */
public class HowToUseArabicFontDisplayable extends Displayable {

	/**
	 * The following strings are formed with characters of the unicode block called 'Arabic Presentation Forms-B' i.e.
	 * the range 0xFE70-0xFEFF. Their order is also reversed.
	 */

	// طريقة استعمال الخط العربي

	private static final String[] TITLE = {
			"\ufec2\ufea8\ufedf\ufe8d\ufedd\ufe8e\ufee4\ufecc\ufe98\ufeb3\ufe8d\u0020\ufe94\ufed8\ufef3\ufeae\ufec3",
	"\ufef2\ufe91\ufeae\ufecc\ufedf\ufe8d" };

	// مرحبا بكم
	// الطقس جميل
	// الطفل ياكل الحلوى
	private static final String[] AVAILABLE_TEXTS = new String[] {
			"\ufee2\ufedc\ufe91\u0020\ufe8e\ufe92\ufea3\ufeae\ufee3",
			"\ufede\ufef4\ufee4\ufe9f\u0020\ufeb2\ufed8\ufec4\ufedf\ufe8d",
	"\ufeef\ufeee\ufee0\ufea4\ufedf\ufe8d\u0020\ufede\ufedb\ufe8e\ufef3\u0020\ufede\ufed4\ufec4\ufedf\ufe8d" };

	private static final int BACKGROUND_COLOR = Colors.WHITE;
	private static final int TEXT_COLOR = Colors.BLACK;
	private static final int FONT_SIZE = 40;
	private static final int HORIZONTAL_MARGIN = 5;
	private static final int VERTICAL_MARGIN = 5;
	private static final int HORIZONTAL_TITLE_MARGIN = 4 * VERTICAL_MARGIN;

	private final int displayWidth;
	private final int displayHeight;

	public HowToUseArabicFontDisplayable(Display display) {
		super(display);
		this.displayWidth = display.getWidth();
		this.displayHeight = display.getHeight();
	}

	@Override
	public void paint(GraphicsContext g) {
		// Draws the background.
		g.setColor(BACKGROUND_COLOR);
		g.fillRect(0, 0, this.displayWidth, this.displayHeight);

		g.setColor(TEXT_COLOR);
		Font font = getFont();
		int fontHeight = font.getHeight();
		g.setFont(font);

		// Draws the title centered on two lines.
		int y = VERTICAL_MARGIN;
		int x = this.displayWidth / 2;

		for (String line : TITLE) {
			g.drawString(line, x, y, GraphicsContext.HCENTER | GraphicsContext.TOP);
			y += fontHeight + VERTICAL_MARGIN;
		}

		// Draws each available text right aligned.
		y += HORIZONTAL_TITLE_MARGIN;
		x = this.displayWidth - HORIZONTAL_MARGIN;

		for (String text : AVAILABLE_TEXTS) {
			g.drawString(text, x, y, GraphicsContext.RIGHT | GraphicsContext.TOP);
			y += fontHeight + VERTICAL_MARGIN;
		}
	}

	// This font has to contain the characters of the unicode block called 'Arabic Presentation Forms-B' i.e. the range
	// 0xFE70-0xFEFF.
	private Font getFont() {
		return Font.getFont(Font.ARABIC, FONT_SIZE, Font.STYLE_PLAIN);
	};

	@Override
	public EventHandler getController() {
		return null;
	}
}
