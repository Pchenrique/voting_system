/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.votacao.controllers;

import br.com.votacao.models.VotacaoModel;
import br.com.votacao.views.VotacaoView;
/**
 *
 * @author Paulo Cesar
 */
public class VotacaoController {
    
    private VotacaoModel model;

    public VotacaoController() {
        
        this.model = new VotacaoModel();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VotacaoView(VotacaoController.this).setVisible(true);
            }
        });
    }
    
    public int addVoto(int id){
        return this.model.addVoto(id);
    }
    
    public int getTotal(){
        return this.model.getResultado();
    }
}
