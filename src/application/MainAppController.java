package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import method.BisectionMethod;
import method.BisectionMethodImpl;
import method.Converter;

public class MainAppController implements Initializable{
	
	@FXML 
	private JFXButton btnSolve;
	@FXML 
	private JFXButton btnClear;
	@FXML 
	private TableView<Equation> tblSummary;
	@FXML 
	private TableColumn<Equation, Integer> colIteration;
	@FXML 
	private TableColumn<Equation, Double> colXL;
	@FXML 
	private TableColumn<Equation, Double> colXU;
	@FXML 
	private TableColumn<Equation, Double> colXR;
	@FXML 
	private TableColumn<Equation, Double> colEA;
	@FXML 
	private TableColumn<Equation, Double> colET;
	
	private ObservableList<Equation> list = FXCollections.observableArrayList();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//Bind the columns with the object properties
		colIteration.setCellValueFactory(cellData -> cellData.getValue().iProperty().asObject());
		colXL.setCellValueFactory(cellData -> cellData.getValue().xlProperty().asObject());
		colXU.setCellValueFactory(cellData -> cellData.getValue().xuProperty().asObject());
		colXR.setCellValueFactory(cellData -> cellData.getValue().xrProperty().asObject());
		colEA.setCellValueFactory(cellData -> cellData.getValue().eaProperty().asObject());
		colET.setCellValueFactory(cellData -> cellData.getValue().etProperty().asObject());
		
		btnSolve.setOnAction(e->{
			BisectionMethod bisectionMethod = new BisectionMethodImpl();
		    Converter c = new Converter();

		    list = c.convert(bisectionMethod.solve());
		    tblSummary.setItems(list);
		});
		
		btnClear.setOnAction(e->{
			int size = list.size();
			while(size-->0) {
				list.remove(size);
			}
		});
		
	}

}
