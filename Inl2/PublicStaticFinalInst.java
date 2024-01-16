public class PublicStaticFinalInst {

    public static RootUser INSTANCE = new RootUser();

    private PublicStaticFinalInst() {
    }

    public static RootUser getInstance() {
        return INSTANCE;
    }
}
