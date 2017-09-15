package singleton;

public class UsingSingleton {
    public void leerSingleton(){
        System.out.println("Clase UsingSingleton - numero de patas: " + EnumSingleton.INSTANCE.getNumeroPatas());
    }
    
    public void modificarSingleton(){
        EnumSingleton.INSTANCE.setNumeroPatas(500);
        System.out.println("Se modific� el numero de patas: " + EnumSingleton.INSTANCE.getNumeroPatas());
    }
}
