package pl.tableview;

import javafx.beans.property.SimpleStringProperty;

public class TableItem {
    private SimpleStringProperty lp;
    private SimpleStringProperty randomValue;

    public TableItem(Integer lp, Integer randomValue) {
        this.lp = new SimpleStringProperty(lp.toString());
        this.randomValue = new SimpleStringProperty(randomValue.toString());
    }

    public String getLp() {
        return lp.get();
    }

    public SimpleStringProperty lpProperty() {
        return lp;
    }

    public void setLp(String lp) {
        this.lp.set(lp);
    }

    public String getRandomValue() {
        return randomValue.get();
    }

    public SimpleStringProperty randomValueProperty() {
        return randomValue;
    }

    public void setRandomValue(String randomValue) {
        this.randomValue.set(randomValue);
    }
}
