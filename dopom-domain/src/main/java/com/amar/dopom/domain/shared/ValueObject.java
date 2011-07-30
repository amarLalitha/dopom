package com.amar.dopom.domain.shared;

public interface ValueObject<T> {

	boolean sameValueAs(T other);
}
