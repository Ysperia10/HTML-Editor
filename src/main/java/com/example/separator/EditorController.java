package com.example.separator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class EditorController {

    @FXML
    private TextArea editorArea;

    @FXML
    private Label outputLabel;

    @FXML
    public void mostrarContenido() {
        // Obtener el texto escrito en el TextArea
        String contenido = editorArea.getText();

        // Mostrar el contenido en la etiqueta
        outputLabel.setText("Contenido del editor: " + contenido);
    }
}