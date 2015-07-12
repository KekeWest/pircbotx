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

import com.google.common.collect.ImmutableMap;
import java.net.InetSocketAddress;
import javax.annotation.Nullable;
import lombok.NonNull;
import org.pircbotx.PircBotX;
import org.pircbotx.hooks.Event;

/**
 * @author Leon Blakey
 */
public class ConnectAttemptFailedEvent extends Event {
	protected final int remainingAttempts;
	protected final ImmutableMap<InetSocketAddress, Exception> connectExceptions;

	public ConnectAttemptFailedEvent(PircBotX bot, int remainingAttempts, @NonNull ImmutableMap<InetSocketAddress, Exception> connectExceptions) {
		super(bot);
		if (connectExceptions == null) {
			throw new java.lang.NullPointerException("connectExceptions");
		}
		this.remainingAttempts = remainingAttempts;
		this.connectExceptions = connectExceptions;
	}

	/**
	 * Does NOT respond to the server! This will throw an
	 * {@link UnsupportedOperationException} since we can't respond to a server
	 * we didn't even connect to
	 *
	 * @param response The response to send
	 */
	@Override
	@Deprecated
	public void respond(String response) {
		throw new UnsupportedOperationException("Attepting to respond to a disconnected server");
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int getRemainingAttempts() {
		return this.remainingAttempts;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public ImmutableMap<InetSocketAddress, Exception> getConnectExceptions() {
		return this.connectExceptions;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public java.lang.String toString() {
		return "ConnectAttemptFailedEvent(remainingAttempts=" + this.getRemainingAttempts() + ", connectExceptions=" + this.getConnectExceptions() + ")";
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof ConnectAttemptFailedEvent)) return false;
		final ConnectAttemptFailedEvent other = (ConnectAttemptFailedEvent)o;
		if (!other.canEqual((java.lang.Object)this)) return false;
		if (!super.equals(o)) return false;
		if (this.getRemainingAttempts() != other.getRemainingAttempts()) return false;
		final java.lang.Object this$connectExceptions = this.getConnectExceptions();
		final java.lang.Object other$connectExceptions = other.getConnectExceptions();
		if (this$connectExceptions == null ? other$connectExceptions != null : !this$connectExceptions.equals(other$connectExceptions)) return false;
		return true;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof ConnectAttemptFailedEvent;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + super.hashCode();
		result = result * PRIME + this.getRemainingAttempts();
		final java.lang.Object $connectExceptions = this.getConnectExceptions();
		result = result * PRIME + ($connectExceptions == null ? 0 : $connectExceptions.hashCode());
		return result;
	}
}