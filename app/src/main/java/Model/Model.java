package Model;

import java.util.Observable;

public class Model extends Observable {
    private String data = "Hello";


    public void setData(String data) {
        this.data = data;


        super.setChanged();
        super.notifyObservers();

    }

}

