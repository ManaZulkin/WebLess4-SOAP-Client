package entety;

public class Orders {
    int id;
    int client_id;
    int car_id;

    public Orders() {
    }

    public Orders(int id, int client_id, int car_id) {
        this.id = id;
        this.client_id = client_id;
        this.car_id = car_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", client_id=" + client_id +
                ", car_id=" + car_id +
                '}';
    }
}
