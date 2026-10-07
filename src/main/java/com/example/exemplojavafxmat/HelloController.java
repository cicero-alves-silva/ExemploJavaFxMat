package com.example.exemplojavafxmat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button btOk;

    @FXML
    private TextField tfNome;

    @FXML
    void cliqueOk(ActionEvent event) {
        String nome = tfNome.getText();
        String titulo, cabecalho, conteudo;
        Alert.AlertType tipoDeAlerta;
        if (nome.isBlank()) {
            titulo = "Alerta de erro";
            cabecalho = "Erro!";
            conteudo = "O campo de texto está vazio.";
            tipoDeAlerta = Alert.AlertType.ERROR;
        } else {
            titulo = "Alerta de informação";
            cabecalho = "Boas vindas!!!";
            conteudo = "Bem-vindo(a) " + nome;
            tipoDeAlerta = Alert.AlertType.INFORMATION;
        }
        Alert alerta = new Alert(tipoDeAlerta, conteudo);
        alerta.setTitle(titulo);
        alerta.setHeaderText(cabecalho);
        alerta.show();
    }

}
