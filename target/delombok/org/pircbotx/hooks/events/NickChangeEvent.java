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
import org.pircbotx.User;
import lombok.NonNull;
import org.pircbotx.hooks.Event;
import org.pircbotx.PircBotX;
import org.pircbotx.UserHostmask;
import org.pircbotx.hooks.types.GenericUserEvent;

/**
 * This event is dispatched whenever someone (possibly us) changes nick on any
 * of the channels that we are on.
 *
 * @author Leon Blakey
 */
public class NickChangeEvent extends Event implements GenericUserEvent {
	
	/**
	 * The users old nick.
	 */
	protected final String oldNick;
	
	/**
	 * The users new nick.
	 */
	protected final String newNick;
	
	/**
	 * The user that changed their nick.
	 */
	protected final UserHostmask userHostmask;
	
	/**
	 * The user that changed their nick.
	 */
	protected final User user;

	public NickChangeEvent(PircBotX bot, @NonNull String oldNick, @NonNull String newNick, @NonNull UserHostmask userHostmask, User user) {
		super(bot);
		if (oldNick == null) {
			throw new java.lang.NullPointerException("oldNick");
		}
		if (newNick == null) {
			throw new java.lang.NullPointerException("newNick");
		}
		if (userHostmask == null) {
			throw new java.lang.NullPointerException("userHostmask");
		}
		this.oldNick = oldNick;
		this.newNick = newNick;
		this.userHostmask = userHostmask;
		this.user = user;
	}

	/**
	 * Respond by sending a <i>private message</i> to the user's new nick
	 *
	 * @param response The response to send
	 */
	@Override
	public void respond(String response) {
		getUser().send().message(response);
	}

	/**
	 * The users old nick.
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getOldNick() {
		return this.oldNick;
	}

	/**
	 * The users new nick.
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getNewNick() {
		return this.newNick;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public java.lang.String toString() {
		return "NickChangeEvent(oldNick=" + this.getOldNick() + ", newNick=" + this.getNewNick() + ", userHostmask=" + this.getUserHostmask() + ", user=" + this.getUser() + ")";
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof NickChangeEvent)) return false;
		final NickChangeEvent other = (NickChangeEvent)o;
		if (!other.canEqual((java.lang.Object)this)) return false;
		if (!super.equals(o)) return false;
		final java.lang.Object this$oldNick = this.getOldNick();
		final java.lang.Object other$oldNick = other.getOldNick();
		if (this$oldNick == null ? other$oldNick != null : !this$oldNick.equals(other$oldNick)) return false;
		final java.lang.Object this$newNick = this.getNewNick();
		final java.lang.Object other$newNick = other.getNewNick();
		if (this$newNick == null ? other$newNick != null : !this$newNick.equals(other$newNick)) return false;
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
		return other instanceof NickChangeEvent;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + super.hashCode();
		final java.lang.Object $oldNick = this.getOldNick();
		result = result * PRIME + ($oldNick == null ? 0 : $oldNick.hashCode());
		final java.lang.Object $newNick = this.getNewNick();
		result = result * PRIME + ($newNick == null ? 0 : $newNick.hashCode());
		final java.lang.Object $userHostmask = this.getUserHostmask();
		result = result * PRIME + ($userHostmask == null ? 0 : $userHostmask.hashCode());
		final java.lang.Object $user = this.getUser();
		result = result * PRIME + ($user == null ? 0 : $user.hashCode());
		return result;
	}

	/**
	 * The user that changed their nick.
	 */
	@Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public UserHostmask getUserHostmask() {
		return this.userHostmask;
	}

	/**
	 * The user that changed their nick.
	 */
	@Override
	@Nullable
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public User getUser() {
		return this.user;
	}
}