/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho2bimestre;

/**
 *
 * @author silva
 */
public class TesteMain {
    public static void main(String args[]) {
        GerenciamentoCliente c1 = new GerenciamentoCliente("Henrique", "123", "hof@emai.com");
        GerenciamentoTreino t1 = new GerenciamentoTreino();
        t1.setNome("Perna");
        t1.setDescricao("Treinar ate quase morrer");
        t1.setRepeticao("Ate nao aquentar mais");
        
        c1.addTreino(t1);
        
        System.out.println("Aluno: " + c1.getNome());
        System.out.println("Treino: " + t1.getNome() + ", Descricao: " + t1.getDescricao() + ", Repeticao: " + t1.getRepeticao());
    }
}
