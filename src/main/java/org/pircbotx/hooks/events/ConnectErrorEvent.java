package org.pircbotx.hooks.events;

import org.pircbotx.PircBotX;
import org.pircbotx.hooks.Event;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * connectError from PircBotX
 *
 * @author KekeWest
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ConnectErrorEvent extends Event {
	private final Exception ex;

	public ConnectErrorEvent(PircBotX bot, Exception e) {
		super(bot);
		this.ex = e;
	}

	public Exception getException() {
		return this.ex;
	}

	/**
	 * @param response
	 * @deprecated Cannot respond
	 */
	@Override
	@Deprecated
	public void respond(String response) {
		throw new UnsupportedOperationException("Not supported");
	}
}
