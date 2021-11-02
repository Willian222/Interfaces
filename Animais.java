package Exercícios.Ex.Interface.Interface02;

public class Animais implements Ave, Repteis, Mamifero, Animal {


    @Override
    public String getnome() {
        return ("Macaco");
    }

    @Override
    public int getidade() {
        return 6;
    }

    @Override
    public double getpeso() {
        return 25.96;
    }

    @Override
    public String getalimentacao() {
        return ("Onivoro");
    }

    @Override
    public String getsom() {
        return null;
    }

    @Override
    public String getlocomover() {
        return null;
    }

    @Override
    public boolean conhecido() {
        return true;
    }

    @Override
    public String getcor_pena() {
        return null;
    }

    @Override
    public String getcor_pelo() {
        return ("Marrom");
    }

    @Override
    public String getcor_escama() {
        return null;
    }
}

