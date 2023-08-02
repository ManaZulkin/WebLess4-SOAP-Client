package entety;

public class Cars {
    int id;
    int mark_id;
    String model;
    int price;

    public Cars() {
    }

    public Cars(int id, int mark_id, String model, int price) {
        this.id = id;
        this.mark_id = mark_id;
        this.model = model;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMark_id() {
        return mark_id;
    }

    public void setMark_id(int mark_id) {
        this.mark_id = mark_id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", mark_id=" + mark_id +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
