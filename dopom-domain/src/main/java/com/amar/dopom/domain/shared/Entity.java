package com.amar.dopom.domain.shared;

public interface Entity<T> {
	boolean sameIdentityAs(T other);

}
