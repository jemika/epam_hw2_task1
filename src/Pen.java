import java.util.Objects;

public class Pen {

    private String color;
    private String label;
    private int cost;

    public Pen(String color, String label, int cost) {
        this.color = color;
        this.label = label;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Pen other = (Pen) obj;
        return Objects.equals(color, other.color)
                && cost == other.cost
                && Objects.equals(label, other.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color,label,cost);
    }

    @Override
    public String toString() {
        return getClass().getName() + "[color=" + color + "label=" + label + "cost=" + cost + "]";
    }

    public String getColor() {
        return color;
    }

    public String getLabel() {
        return label;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
