package com.example.demo1.funcional;

@FunctionalInterface
public interface IPersonaFunction<R, T> {

	public R aplicar(T arg1);
}
