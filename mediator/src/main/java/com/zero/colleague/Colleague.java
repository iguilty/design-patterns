package com.zero.colleague;

import com.zero.mediator.Mediator;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public abstract class Colleague {
    protected String name;
    protected Mediator mediator;
    public abstract void constact(String message);
    public abstract void getMessage(String message);
}
