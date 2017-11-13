/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AngryBirds_datos;

/**
 *
 * @author nicol
 */
public class Resortera {
    private EstadoResortera[] posiciones;
    private EstadoResortera estado;
    private Pajaro pajaro;

    public Resortera() {
        this.posiciones = new EstadoResortera[10];
        this.posiciones[0] = new EstadoResortera(50,300,(0.087),(0.996),"1.png","11.png");
        this.posiciones[1] = new EstadoResortera(53,310,(0.225),(0.974),"2.png","12.png");
        this.posiciones[2] = new EstadoResortera(53,320,(0.358),(0.933),"3.png","13.png");
        this.posiciones[3] = new EstadoResortera(53,330,(0.485),(0.874),"4.png","14.png");
        this.posiciones[4] = new EstadoResortera(58,340,(0.601),(0.798),"5.png","15.png");
        this.posiciones[5] = new EstadoResortera(62,350,(0.707),(0.707),"6.png","16.png");
        this.posiciones[6] = new EstadoResortera(68,360,(0.798),(0.601),"7.png","17.png");
        this.posiciones[7] = new EstadoResortera(76,364,(0.874),(0.485),"8.png","18.png");
        this.posiciones[8] = new EstadoResortera(85,373,(0.933),(0.358),"9.png","19.png");
        this.posiciones[9] = new EstadoResortera(97,377,(0.974),(0.225),"10.png","20.png");
        this.estado = this.posiciones[0];
    }

    public Pajaro getPajaro() {
        return pajaro;
    }

    public void setPajaro(Pajaro pajaro) {
        this.pajaro = pajaro;
    }
    
    public void cambiarEstado(String sentido){
        if (sentido.equals("derecha")){
            for (int i = 0;i<10;i++){
                if(this.estado.equals(this.posiciones[i])){
                    this.estado = this.posiciones[i+1];
                    break;
                }
            }
        }else if (sentido.equals("izquierda")){
            for (int i = 0;i<10;i++){
                if(this.estado.equals(this.posiciones[i])){
                    this.estado = this.posiciones[i-1];
                    break;
                }
            }
        }
    }

    public EstadoResortera getEstado() {
        return estado;
    }

    public void setEstado(EstadoResortera estado) {
        this.estado = estado;
    }
    
    public int lanzar(int tiempo){
        System.out.println("TIEMPO: " + tiempo);
        int x = (int) (this.pajaro.getX() + 20*(this.estado.getCosAngulo()*tiempo));
        this.pajaro.setX(x);
        System.out.println(this.pajaro.getX());
        int y = (int) (-(this.pajaro.getY() + (20*(this.estado.getSinAngulo()*tiempo))-(4.9*(tiempo*tiempo))));
        this.pajaro.setY(y);
        System.out.println(this.pajaro.getY());
        tiempo++;
        return tiempo;
    }
    
}
