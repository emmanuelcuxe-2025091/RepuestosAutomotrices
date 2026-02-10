package com.emmanuelcuxe.RepuestosAutomotrices.controller;


import com.emmanuelcuxe.RepuestosAutomotrices.service.EmpleadoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("api/proveedores")
public class ProveedoresController {
    private final ProveedorService empleadoService;
}
