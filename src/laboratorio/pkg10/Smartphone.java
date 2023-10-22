/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio.pkg10;

/**
 *
 * @author piero
 */
public class Smartphone implements camara,
                                   ReproductorDeMusica,
                                   NavegadorDeInternet{
    
    public String marca;
    public String modelo;

    public Smartphone(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    Smartphone() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    
    @Override
    public void grabarVideo() {
        System.out.println("Se inició la grabación");
    }

    @Override
    public void tomarFoto() {
        System.out.println("Se capturó la foto");
    }

    @Override
    public void reproducir() {
        System.out.println("En reproducción");
    }

    @Override
    public void detener() {
        System.out.println("En pausa");
    }

    @Override
    public void buscar() {
        System.out.println("Busqueda encontrada");
    }

    @Override
    public void actualizar() {
        System.out.println("Ventana actualizada");
    }
    
}
