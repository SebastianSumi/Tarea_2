package pe.edu.upeu.asistencia.control;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.util.Callback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pe.edu.upeu.asistencia.enums.Carrera;
import pe.edu.upeu.asistencia.enums.TipoParticipante;
import pe.edu.upeu.asistencia.modelo.Participante;
import pe.edu.upeu.asistencia.servicio.ParticipanteServicioI;

@Controller
public class ParticipanteController {

    @FXML
    private ComboBox<Carrera> cbxCarrera;

    @FXML
    private ComboBox<TipoParticipante> cbxTipoParticipante;

    @FXML
    private TextField txtdni;

    @FXML
    private TextField txtnombres;

    @FXML
    private TextField txtapellidos;

    @FXML
    private TableView<Participante> tableRegPart;
    ObservableList<Participante> participantes;

    @Autowired
    ParticipanteServicioI ps;

    TableColumn<Participante, String> dniCol, nombreCol, apellidoCol, carreraCol, tipoParticipanteCol;
    TableColumn<Participante, Void> accionesCol;

    int indexEdit = -1;

    @FXML
    public void initialize(){
        cbxCarrera.getItems().addAll(Carrera.values());
        cbxTipoParticipante.getItems().addAll(TipoParticipante.values());
        cbxCarrera.getSelectionModel().select(6);
        cbxTipoParticipante.getSelectionModel().select(0);
        Carrera carrera = cbxCarrera.getSelectionModel().getSelectedItem();
        System.out.println(carrera.name());
        definirColumnas();
        listarPartipantes();
    }

    @FXML
    public void limpiarFormulario(){
        txtdni.setText("");
        txtnombres.setText("");
        txtapellidos.setText("");
        cbxCarrera.getSelectionModel().clearSelection();
        cbxTipoParticipante.getSelectionModel().clearSelection();
    }

    @FXML
    public void registrarParticipante (){
        Participante p = new Participante();
        p.setDni(new SimpleStringProperty(txtdni.getText()));
        p.setNombre(new SimpleStringProperty(txtnombres.getText()));
        p.setApellidos(new SimpleStringProperty(txtapellidos.getText()));
        p.setCarrera(cbxCarrera.getSelectionModel().getSelectedItem());
        p.setTipoParticipante(cbxTipoParticipante.getSelectionModel().getSelectedItem());
        if(indexEdit == -1){
            ps.save(p);
        }
        else{
            ps.update(p, indexEdit);
            indexEdit = -1;
        }
        limpiarFormulario();
        listarPartipantes();
    }

    public void definirColumnas (){
        dniCol = new TableColumn<>("DNI");
        nombreCol = new TableColumn<>("Nombre");
        apellidoCol = new TableColumn<>("Apellido");
        carreraCol = new TableColumn<>("Carrera");
        tipoParticipanteCol = new TableColumn<>("Tipo Participante");
        accionesCol = new TableColumn<>("Acciones");
        accionesCol.setPrefWidth(200);
        tableRegPart.getColumns().addAll(dniCol, nombreCol, apellidoCol, carreraCol, tipoParticipanteCol, accionesCol);
    }

    public void listarPartipantes(){
        dniCol.setCellValueFactory(cellData -> cellData.getValue().getDni());
        nombreCol.setCellValueFactory(cellData -> cellData.getValue().getNombre());
        apellidoCol.setCellValueFactory(cellData -> cellData.getValue().getApellidos());
        carreraCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCarrera().toString()));
        tipoParticipanteCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTipoParticipante().name()));
        agregarAcionesBoton();
        participantes = FXCollections.observableList(ps.findAll());
        tableRegPart.setItems(participantes);
    }

    public void eliminarParticipante(int index){
        ps.delete(index);
        listarPartipantes();
    }

    public void editarParticipante (Participante p, int index){
        txtdni.setText(p.getDni().getValue());
        txtnombres.setText(p.getNombre().getValue());
        txtapellidos.setText(p.getApellidos().getValue());
        cbxCarrera.getSelectionModel().select(p.getCarrera());
        cbxTipoParticipante.getSelectionModel().select(p.getTipoParticipante());
        indexEdit = index;
    }

    public void agregarAcionesBoton (){
        Callback<TableColumn<Participante, Void>, TableCell<Participante, Void>> cellFactory =
                param -> new TableCell<>() {
        private final Button btnEdit = new Button("Editar");
        private final Button btnDelete = new Button("Eliminar");
            {
                btnEdit.setOnAction(event -> {
                    Participante p = getTableView().getItems().get(getIndex());
                    editarParticipante(p,getIndex());
                });
                btnDelete.setOnAction(event -> {
                    eliminarParticipante(getIndex());
                });
            }
        @Override
        public void updateItem(Void item, boolean empty){
            super.updateItem(item, empty);
            if(empty){
                setGraphic(null);
            }
            else{
                HBox hbox = new HBox(btnEdit, btnDelete);
                hbox.setSpacing(10);
                setGraphic(hbox);
            }
        }
        };
        accionesCol.setCellFactory(cellFactory);
    }
}
