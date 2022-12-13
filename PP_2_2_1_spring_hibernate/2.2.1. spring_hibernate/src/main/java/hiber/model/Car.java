package hiber.model;

import jakarta.persistence.*;
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "series")
    private int series;

    @Column(name = "model")
    private String model;

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public int getId() {
        return id;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
