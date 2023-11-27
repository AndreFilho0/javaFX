package com.example.javafxaprendendo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

import java.util.ArrayList;
import java.util.List;

public class ComboBoxController {

    @FXML
    private ComboBox<Categorias> cbCategoria;


    private List<Categorias> categoria = new ArrayList<>();
    private ObservableList<Categorias> obsCategoria;
    public  void carregarCategorias(){

        Categorias cat1= new Categorias(1,"SAPATO");
        Categorias cat2= new Categorias(2,"CAMISA");

        categoria.add(cat1);
        categoria.add(cat2);

        obsCategoria= FXCollections.observableArrayList(categoria);

        cbCategoria.setItems(obsCategoria);

    }
    @FXML
    public void pegarObjeto(){
        Categorias categorias = cbCategoria.getSelectionModel().getSelectedItem();
        try {
            System.out.println("ID " + categorias.getId() + " nome: " + categorias.getNome());
        }catch (NullPointerException e){
            System.out.println("nem um valor foi selecionado");
        }


    }



}
