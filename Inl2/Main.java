public class Main {
    public static void main(String[] args) {

        RootUser lazyUser = LazyInit.getInstance();
        System.out.println("LAZY INITIALZATION");
        System.out.println(lazyUser.toString()+"\n");

        RootUser pubStatic = PublicStaticFinalInst.getInstance();
        System.out.println("PUBLIC STATIC FINAL INSTANCE FIELD");
        System.out.println(pubStatic.toString()+"\n");

        System.out.println("ENUM");
        System.out.println(EnumSingleton.INSTANCE);

    }
}
