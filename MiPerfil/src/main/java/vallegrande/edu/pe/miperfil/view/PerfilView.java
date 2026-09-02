package vallegrande.edu.pe.miperfil.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class PerfilView {
    private VBox contenedor;
    private Label titulo;
    private TextField txtNombre;
    private TextField txtCarrera;
    private TextField txtSemestre;
    private TextField txtHobby;
    private Button btnMostrar;
    private Button btnLimpiar;
    private Label lblResultado;

    public PerfilView(){
        titulo = new Label("MI PERFIL");
        txtNombre = new TextField();
        txtNombre.setPromptText("Ingrese su nombre completo");
        txtCarrera = new TextField();
        txtCarrera.setPromptText("Ingrese su carrera profesional");
        txtSemestre = new TextField();
        txtSemestre.setPromptText("Ingrese su semestre academico");
        txtHobby = new TextField();
        txtHobby.setPromptText("Ingrese su hobby (videojuego, musica, ...");

        btnMostrar = new Button("Mostrar Perfil");
        btnMostrar.setStyle("-fx-background-color: #1F497D; -fx-text-fill: white; -fx-font-weight: bold; -fx-background-radius: 5px;");
        btnLimpiar = new Button("Limpiar");
        btnLimpiar.setStyle("-fx-background-color: #D9D9D9; -fx-text-fill: #333333; -fx-font-weight: bold; -fx-background-radius: 5px;");
        HBox panelBotones = new HBox(10, btnMostrar, btnLimpiar);
        panelBotones.setAlignment(Pos.CENTER);
        lblResultado = new Label();
        lblResultado.setStyle("-fx-font-size: 13px; -fx-text-fill: #333333;");
        contenedor = new VBox(10);
        contenedor.setPadding(new Insets(20));
        contenedor.setAlignment(Pos.CENTER);
        contenedor.setStyle("-fx-background-color: #F4F6F9;");
        contenedor.getChildren().addAll(
                titulo,
                txtNombre,
                txtCarrera,
                txtSemestre,
                txtHobby,
                btnMostrar,
                lblResultado
        );
    }
    public VBox getContenedor(){
        return contenedor;
    }
    public TextField getTxtNombre(){
        return txtNombre;
    }
    public TextField getTxtCarrera(){
        return txtCarrera;
    }
    public TextField getTxtSemestre(){
        return txtSemestre;
    }
    public TextField getTxtHobby(){
        return txtHobby;
    }
    public Button getBtnMostrar(){
        return btnMostrar;
    }
    public Button getBtnLimpiar() {
        return btnLimpiar;
    }
    public Label getLblResultado(){
        return lblResultado;
    }
}
