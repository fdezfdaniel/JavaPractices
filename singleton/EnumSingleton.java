package singleton;


public enum EnumSingleton {    
    INSTANCE;
    private int numeroPatas;

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public static EnumSingleton getINSTANCE() {
        return INSTANCE;
    }
}
