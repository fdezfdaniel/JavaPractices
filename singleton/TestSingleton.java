package singleton;


public class TestSingleton {
    public static void main(String[] args){    
        EnumSingleton singleton = EnumSingleton.getINSTANCE();
        singleton.setNumeroPatas(4);
        System.out.println(singleton.getNumeroPatas());
        System.out.println(EnumSingleton.INSTANCE.getNumeroPatas());
        EnumSingleton.INSTANCE.setNumeroPatas(8);
        System.out.println(EnumSingleton.INSTANCE.getNumeroPatas());
        UsingSingleton clase = new UsingSingleton();
        clase.leerSingleton();
        clase.modificarSingleton();
        System.out.println(singleton.getNumeroPatas());
    }
}
