package implementaciones.impl1;

import java.util.ArrayList;
import java.util.List;

abstract class Observable implements Subject {
    private List<Observer> suscriptores;

    public Observable() {
        suscriptores = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer observer) {
        suscriptores.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        suscriptores.remove(observer);
    }

    @Override
    public void notifyObservers(Object value) {
        suscriptores.forEach(observer -> observer.update(value));
    }
}
