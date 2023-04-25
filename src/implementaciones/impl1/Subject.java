package implementaciones.impl1;

public interface Subject {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers(Object value);
}
