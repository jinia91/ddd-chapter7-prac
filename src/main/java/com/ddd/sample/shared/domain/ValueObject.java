package com.ddd.sample.shared.domain;

import java.io.Serializable;

public interface ValueObject<T> extends Serializable {
	boolean sameValueAs(T other);
}

