package method;

import java.text.DecimalFormat;
import java.util.ArrayList;

import application.Equation;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Converter {
	public Converter() {
    }

    public ObservableList<Equation> convert(ArrayList<Equation> list) {
        ObservableList<Equation> output = FXCollections.observableArrayList();

        for(Equation temp: list) {
            Equation container = new Equation();
            DecimalFormat f = new DecimalFormat("###.#####");
            container.setI(temp.getI());
            container.setXL(Double.parseDouble(f.format(temp.getXL())));
            container.setXU(Double.parseDouble(f.format(temp.getXU())));
            container.setXR(Double.parseDouble(f.format(temp.getXR())));
            container.setEA(Double.parseDouble(f.format(temp.getEA())));
            container.setET(Double.parseDouble(f.format(temp.getET())));
            output.add(container);
        }


        return output;
    }
}
