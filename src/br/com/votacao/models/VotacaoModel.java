/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.votacao.models;


/**
 *
 * @author Paulo Cesar
 */
public class VotacaoModel {
    private int candidato1;
    private int candidato2;
    private int candidato3;

    public VotacaoModel() {
        this.candidato1 = 0;
        this.candidato2 = 0;
        this.candidato3 = 0;
    }
    
    public int addVoto(int id){
        if(id == 1){
            this.candidato1++;
            return this.candidato1;
        }else if(id == 2){
            this.candidato2++;
            return this.candidato2;
        }else if(id == 3){
            this.candidato3++;
            return this.candidato3;
        }
        return 0;
    }
    
    public int getResultado(){
        if(this.candidato1 > this.candidato2 && this.candidato1 > this.candidato3){
            return 1;
        }else if(this.candidato2 > this.candidato1 && this.candidato2 > this.candidato3){
            return 2;
        }else if(this.candidato3 > this.candidato1 && this.candidato3 > this.candidato2){
            return 3;
        }
        return 0;
    }
}
