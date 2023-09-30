/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


import controller.SloveEquation;
import model.EquationModel;
import view.Menu;

/**
 *
 * @author A
 */
public class Main {
    public static void main(String[] args) {
        EquationModel equationModel = new EquationModel();
        
        new SloveEquation(equationModel).run();
    }
    
}