package com.example.demo1.collector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo1.modelo.Producto;
import com.example.demo1.servi.IProductoServi;

@Controller
@RequestMapping("/producrtos")
public class ProductoCollector {
 @Autowired
 private IProductoServi producServi;
 
// @GetMapping("/nuevoProducto")

}
