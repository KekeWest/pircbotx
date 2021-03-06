package org.pircbotx.hooks.events;

import org.pircbotx.PircBotX;
import org.pircbotx.hooks.Event;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * A command receive to the IRC server from PircBotX
 *
 * @author KekeWest
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InputEvent extends Event {
	private final String rawLine;

	public InputEvent(PircBotX bot, String rawLine) {
		super(bot);
		this.rawLine = rawLine;
	}

	/**
	 * @param response
	 * @deprecated Cannot respond to input
	 */
	@Override
	@Deprecated
	public void respond(String response) {
		throw new UnsupportedOperationException("Not supported");
	}
}
