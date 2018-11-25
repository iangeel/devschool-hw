package ro.ing.devschool.interfaces;

public interface Subject {
    void addClient(Observer client);
    void removeClient(Observer client);
    void notifyClient(String message);
}
