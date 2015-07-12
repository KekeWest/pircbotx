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
import org.pircbotx.hooks.types.GenericChannelModeEvent;

/**
 * Called when a channel has moderated mode removed.
 * <p>
 * This is a type of mode change and therefor is also dispatched in a
 * {@link org.pircbotx.hooks.events.ModeEvent}
 *
 * @author Leon Blakey
 */
public class RemoveModeratedEvent extends Event implements GenericChannelModeEvent {
	protected final Channel channel;
	protected final UserHostmask userHostmask;
	protected final User user;

	public RemoveModeratedEvent(PircBotX bot, @NonNull Channel channel, @NonNull UserHostmask userHostmask, User user) {
		super(bot);
		if (channel == null) {
			throw new java.lang.NullPointerException("channel");
		}
		if (userHostmask == null) {
			throw new java.lang.NullPointerException("userHostmask");
		}
		this.channel = channel;
		this.userHostmask = userHostmask;
		this.user = user;
	}

	/**
	 * Respond by send a message in the channel to the user that removed the
	 * mode in <code>user: message</code> format
	 *
	 * @param response The response to send
	 */
	@Override
	public void respond(String response) {
		getChannel().send().message(getUser(), response);
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public java.lang.String toString() {
		return "RemoveModeratedEvent(channel=" + this.getChannel() + ", userHostmask=" + this.getUserHostmask() + ", user=" + this.getUser() + ")";
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof RemoveModeratedEvent)) return false;
		final RemoveModeratedEvent other = (RemoveModeratedEvent)o;
		if (!other.canEqual((java.lang.Object)this)) return false;
		if (!super.equals(o)) return false;
		final java.lang.Object this$channel = this.getChannel();
		final java.lang.Object other$channel = other.getChannel();
		if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) return false;
		final java.lang.Object this$userHostmask = this.getUserHostmask();
		final java.lang.Object other$userHostmask = other.getUserHostmask();
		if (this$userHostmask == null ? other$userHostmask != null : !this$userHostmask.equals(other$userHostmask)) return false;
		final java.lang.Object this$user = this.getUser();
		final java.lang.Object other$user = other.getUser();
		if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
		return true;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof RemoveModeratedEvent;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + super.hashCode();
		final java.lang.Object $channel = this.getChannel();
		result = result * PRIME + ($channel == null ? 0 : $channel.hashCode());
		final java.lang.Object $userHostmask = this.getUserHostmask();
		result = result * PRIME + ($userHostmask == null ? 0 : $userHostmask.hashCode());
		final java.lang.Object $user = this.getUser();
		result = result * PRIME + ($user == null ? 0 : $user.hashCode());
		return result;
	}

	@Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public Channel getChannel() {
		return this.channel;
	}

	@Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public UserHostmask getUserHostmask() {
		return this.userHostmask;
	}

	@Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public User getUser() {
		return this.user;
	}
}