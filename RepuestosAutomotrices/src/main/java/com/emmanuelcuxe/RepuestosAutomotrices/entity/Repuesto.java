package com.emmanuelcuxe.RepuestosAutomotrices.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Repuestos")

public class Repuesto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_repuesto")
    private Integer idRepuesto;

    @Column(name = "nombre_repuesto")
    private String nombreRepuesto;

    @Column(name = "categoria_repuesto")
    private String categoriaRepuesto;

    @Column(name = "precio_compra")
    private String precioCompra;

    @Column(name = "precio_venta")
    private String precioVenta;

    @Column(name = "id_proveedor")
    private String idProveedor;

    public Integer getIdRepuesto() { return idRepuesto; }

    public void setIdRepuesto(Integer idRepuesto) { this.idRepuesto = idRepuesto; }

    public String getNombreRepuesto() { return nombreRepuesto; }

    public void setNombreRepuesto(String nombreRepuesto) { this.nombreRepuesto = nombreRepuesto; }

    public String getCategoriaRepuesto() { return categoriaRepuesto; }

    public void setCategoriaRepuesto(String categoriaRepuesto) { this.categoriaRepuesto = categoriaRepuesto; }

    public String getPrecioCompra() { return precioCompra; }

    public void setPrecioCompra(String precioCompra) { this.precioCompra = precioCompra; }

    public String getPrecioVenta() { return precioVenta; }

    public void setPrecioVenta(String precioVenta) { this.precioVenta = precioVenta; }

    public String getIdProveedor() { return idProveedor; }

    public void setIdProveedor(String idProveedor) { this.idProveedor = idProveedor; }
}
