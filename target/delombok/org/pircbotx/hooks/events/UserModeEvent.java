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
import org.pircbotx.PircBotX;
import org.pircbotx.UserHostmask;
import org.pircbotx.hooks.Event;
import org.pircbotx.hooks.types.GenericUserModeEvent;

/**
 * Called when the mode of a user is set.
 *
 * @author Leon Blakey
 */
public class UserModeEvent extends Event implements GenericUserModeEvent {
	
	/**
	 * The user hostmask that set the mode.
	 */
	protected final User userHostmask;
	
	/**
	 * The user that set the mode.
	 */
	protected final User user;
	
	/**
	 * The user hostmask that the mode operation applies to.
	 */
	protected final UserHostmask recipientHostmask;
	
	/**
	 * The user that the mode operation applies to.
	 */
	protected final User recipient;
	
	/**
	 * The mode that has been set.
	 */
	protected final String mode;

	public UserModeEvent(PircBotX bot, @NonNull UserHostmask userHostmask, User user, @NonNull UserHostmask recipientHostmask, User recipient, @NonNull String mode) {
		super(bot);
		if (userHostmask == null) {
			throw new java.lang.NullPointerException("userHostmask");
		}
		if (recipientHostmask == null) {
			throw new java.lang.NullPointerException("recipientHostmask");
		}
		if (mode == null) {
			throw new java.lang.NullPointerException("mode");
		}
		this.userHostmask = user;
		this.user = user;
		this.recipientHostmask = recipientHostmask;
		this.recipient = recipient;
		this.mode = mode;
	}

	/**
	 * Respond with a private message to the source user
	 *
	 * @param response The response to send
	 */
	@Override
	public void respond(String response) {
		getUserHostmask().send().message(response);
	}

	/**
	 * The user hostmask that the mode operation applies to.
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public UserHostmask getRecipientHostmask() {
		return this.recipientHostmask;
	}

	/**
	 * The mode that has been set.
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getMode() {
		return this.mode;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public java.lang.String toString() {
		return "UserModeEvent(userHostmask=" + this.getUserHostmask() + ", user=" + this.getUser() + ", recipientHostmask=" + this.getRecipientHostmask() + ", recipient=" + this.getRecipient() + ", mode=" + this.getMode() + ")";
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof UserModeEvent)) return false;
		final UserModeEvent other = (UserModeEvent)o;
		if (!other.canEqual((java.lang.Object)this)) return false;
		if (!super.equals(o)) return false;
		final java.lang.Object this$userHostmask = this.getUserHostmask();
		final java.lang.Object other$userHostmask = other.getUserHostmask();
		if (this$userHostmask == null ? other$userHostmask != null : !this$userHostmask.equals(other$userHostmask)) return false;
		final java.lang.Object this$user = this.getUser();
		final java.lang.Object other$user = other.getUser();
		if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
		final java.lang.Object this$recipientHostmask = this.getRecipientHostmask();
		final java.lang.Object other$recipientHostmask = other.getRecipientHostmask();
		if (this$recipientHostmask == null ? other$recipientHostmask != null : !this$recipientHostmask.equals(other$recipientHostmask)) return false;
		final java.lang.Object this$recipient = this.getRecipient();
		final java.lang.Object other$recipient = other.getRecipient();
		if (this$recipient == null ? other$recipient != null : !this$recipient.equals(other$recipient)) return false;
		final java.lang.Object this$mode = this.getMode();
		final java.lang.Object other$mode = other.getMode();
		if (this$mode == null ? other$mode != null : !this$mode.equals(other$mode)) return false;
		return true;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof UserModeEvent;
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
		final java.lang.Object $recipientHostmask = this.getRecipientHostmask();
		result = result * PRIME + ($recipientHostmask == null ? 0 : $recipientHostmask.hashCode());
		final java.lang.Object $recipient = this.getRecipient();
		result = result * PRIME + ($recipient == null ? 0 : $recipient.hashCode());
		final java.lang.Object $mode = this.getMode();
		result = result * PRIME + ($mode == null ? 0 : $mode.hashCode());
		return result;
	}

	/**
	 * The user hostmask that set the mode.
	 */
	@Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public User getUserHostmask() {
		return this.userHostmask;
	}

	/**
	 * The user that set the mode.
	 */
	@Override
	@Nullable
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public User getUser() {
		return this.user;
	}

	/**
	 * The user that the mode operation applies to.
	 */
	@Override
	@Nullable
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public User getRecipient() {
		return this.recipient;
	}
}