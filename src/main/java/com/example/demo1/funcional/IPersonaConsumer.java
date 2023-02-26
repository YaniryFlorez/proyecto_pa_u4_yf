package com.example.demo1.funcional;

@FunctionalInterface
public interface IPersonaConsumer <T, R> {

	public void accept(T arg1, R agr2);
}
