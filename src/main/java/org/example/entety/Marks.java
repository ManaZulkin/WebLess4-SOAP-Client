package entety;

public class Marks {
    int id;
    String mark;

    public Marks() {
    }

    public Marks(int id, String mark) {
        this.id = id;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                '}';
    }
}
