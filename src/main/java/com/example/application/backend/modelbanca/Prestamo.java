package com.example.application.backend.modelbanca;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="prestamo")
public class Prestamo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name="cantidad")
    private Double cantidad;

    @Column (name="duracion")
    private Double duracion; // en meses

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="id_cuenta_ingreso")
    private Cuenta cuentaIngreso;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="id_cuenta_cobro")
    private Cuenta cuentaCobro;

    @Column(name="tipo_interes")
    private Double tipoInteres;

    public Prestamo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public Cuenta getCuentaIngreso() {
        return cuentaIngreso;
    }

    public void setCuentaIngreso(Cuenta cuentaIngreso) {
        this.cuentaIngreso = cuentaIngreso;
    }

    public Cuenta getCuentaCobro() {
        return cuentaCobro;
    }

    public void setCuentaCobro(Cuenta cuentaCobro) {
        this.cuentaCobro = cuentaCobro;
    }

    public Double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(Double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
