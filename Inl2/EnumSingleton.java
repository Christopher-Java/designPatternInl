public enum EnumSingleton {
    INSTANCE;
    private int UID = 0;
    private int GID = 0;
    private String userName = "root";
    private String name = "Super user";
    private String home = "/root";
    private String shell = "/bin/sh";

    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public int getUID() {
        return UID;
    }

    public int getGID() {
        return GID;
    }

    public String getHome() {
        return home;
    }

    public String getShell() {
        return shell;
    }

    @Override
    public String toString() {
        return new StringBuilder(userName)
                .append("(").append(name).append(")")
                .append(" ").append(UID).append(":").append(GID)
                .append(" home: ").append(home).append(" ")
                .append("shell: ").append(shell)
                .toString();
    }

}
