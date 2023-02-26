package com.example.demo1.funcional;

@FunctionalInterface
public interface IPersonaPredicate<T> {

	public boolean evaluar(T arg1);
}
