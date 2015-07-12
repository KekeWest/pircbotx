// Generated by delombok at Sun Jul 12 21:25:30 UTC 2015
/**
 * Copyright (C) 2010-2014 Leon Blakey <lord.quackstar at gmail.com>
 *
 * This file is part of PircBotX.
 *
 * PircBotX is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * PircBotX is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * PircBotX. If not, see <http://www.gnu.org/licenses/>.
 */
package org.pircbotx.hooks.events;

import javax.annotation.Nullable;
import org.pircbotx.Channel;
import org.pircbotx.User;
import lombok.NonNull;
import org.pircbotx.hooks.Event;
import org.pircbotx.PircBotX;
import org.pircbotx.UserHostmask;
import org.pircbotx.hooks.CoreHooks;
import org.pircbotx.hooks.types.GenericCTCPEvent;

/**
 * This event is dispatched whenever we receive a PING request from another
 * user.
 * <p>
 * {@link CoreHooks} automatically responds correctly. Unless {@link CoreHooks}
 * is removed from the
 * {@link org.pircbotx.Configuration#getListenerManager() bot's ListenerManager},
 * Listeners of this event should <b>not</b> send a response as the user will
 * get two responses
 *
 * @author Leon Blakey
 */
public class PingEvent extends Event implements GenericCTCPEvent {
	
	/**
	 * The user that sent the PING request.
	 */
	protected final UserHostmask userHostmask;
	
	/**
	 * The user that sent the PING request.
	 */
	protected final User user;
	
	/**
	 * The channel that received the ping request. A value of <code>null</code>
	 * means the target was us.
	 */
	protected final Channel channel;
	
	/**
	 * The value that was supplied as an argument to the PING command.
	 */
	protected final String pingValue;

	public PingEvent(PircBotX bot, @NonNull UserHostmask userHostmask, User user, Channel channel, @NonNull String pingValue) {
		super(bot);
		if (userHostmask == null) {
			throw new java.lang.NullPointerException("userHostmask");
		}
		if (pingValue == null) {
			throw new java.lang.NullPointerException("pingValue");
		}
		this.userHostmask = userHostmask;
		this.user = user;
		this.channel = channel;
		this.pingValue = pingValue;
	}

	/**
	 * Respond with a CTCP response to the user
	 *
	 * @param response The response to send
	 */
	@Override
	public void respond(String response) {
		getUser().send().ctcpResponse(response);
	}

	/**
	 * The value that was supplied as an argument to the PING command.
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getPingValue() {
		return this.pingValue;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public java.lang.String toString() {
		return "PingEvent(userHostmask=" + this.getUserHostmask() + ", user=" + this.getUser() + ", channel=" + this.getChannel() + ", pingValue=" + this.getPingValue() + ")";
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof PingEvent)) return false;
		final PingEvent other = (PingEvent)o;
		if (!other.canEqual((java.lang.Object)this)) return false;
		if (!super.equals(o)) return false;
		final java.lang.Object this$userHostmask = this.getUserHostmask();
		final java.lang.Object other$userHostmask = other.getUserHostmask();
		if (this$userHostmask == null ? other$userHostmask != null : !this$userHostmask.equals(other$userHostmask)) return false;
		final java.lang.Object this$user = this.getUser();
		final java.lang.Object other$user = other.getUser();
		if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
		final java.lang.Object this$channel = this.getChannel();
		final java.lang.Object other$channel = other.getChannel();
		if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
		final java.lang.Object this$pingValue = this.getPingValue();
		final java.lang.Object other$pingValue = other.getPingValue();
		if (this$pingValue == null ? other$pingValue != null : !this$pingValue.equals(other$pingValue)) return false;
		return true;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof PingEvent;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + super.hashCode();
		final java.lang.Object $userHostmask = this.getUserHostmask();
		result = result * PRIME + ($userHostmask == null ? 0 : $userHostmask.hashCode());
		final java.lang.Object $user = this.getUser();
		result = result * PRIME + ($user == null ? 0 : $user.hashCode());
		final java.lang.Object $channel = this.getChannel();
		result = result * PRIME + ($channel == null ? 0 : $channel.hashCode());
		final java.lang.Object $pingValue = this.getPingValue();
		result = result * PRIME + ($pingValue == null ? 0 : $pingValue.hashCode());
		return result;
	}

	/**
	 * The user that sent the PING request.
	 */
	@Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public UserHostmask getUserHostmask() {
		return this.userHostmask;
	}

	/**
	 * The user that sent the PING request.
	 */
	@Override
	@Nullable
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public User getUser() {
		return this.user;
	}

	/**
	 * The channel that received the ping request. A value of <code>null</code>
	 * means the target was us.
	 */
	@Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public Channel getChannel() {
		return this.channel;
	}
}