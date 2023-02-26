package com.example.demo1.funcional;

@FunctionalInterface
public interface IPersonaSupplier<T> {

	public T getNombre();
}
