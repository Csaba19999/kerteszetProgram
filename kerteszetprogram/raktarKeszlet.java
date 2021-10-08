/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kerteszetprogram;

/**
 *
 * @author Csabi
 */
public class raktarKeszlet extends Fa{
    int novenyek,specialisNovenyek,fak;

    public raktarKeszlet (int novenyek, int specialisNovenyek, int fak,String faNeve, int faKora) {
        this.novenyek = novenyek;
        this.specialisNovenyek = specialisNovenyek;
        this.fak = fak;
        super.faNeve = faNeve;
        super.faKora = faKora;
    }
    
    
    public void keszletLista(){
        //Listázza a teljes készletet a hozzájuk tartozó kategóriákkal
    }
    
    public void biztositasiPenz(){
        //Felgyújtja a teljes készletet és mindent nulláz. Az eladasok class-t nem érinti, onnan továbbra is lekérdezhető az eddigi eladások.
    }
    
}
