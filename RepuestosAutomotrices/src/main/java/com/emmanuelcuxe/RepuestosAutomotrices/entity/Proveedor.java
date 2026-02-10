package com.emmanuelcuxe.RepuestosAutomotrices.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "Proveedores")

public class Proveedor {
    @Id
    @Column (name = "id_proveedor")
    private Integer idProveedor;

    
}
