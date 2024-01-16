public class LazyInit {
    private static RootUser instance;

    private LazyInit() {
    }

    public static RootUser getInstance() {
        if (instance == null) {
            instance = new RootUser();
        }
        return instance;
    }
}
