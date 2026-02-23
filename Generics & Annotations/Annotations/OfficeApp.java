class LegacySystem {
    /** @deprecated Use newLogin() instead */
    @Deprecated
    public void oldLogin() {
        System.out.println("Using insecure login... please upgrade!");
    }

    public void newLogin() {
        System.out.println("Using secure OAuth 2.0 login.");
    }
}

public class OfficeApp {
    public static void main(String[] args) {
        LegacySystem sys = new LegacySystem();
        sys.oldLogin(); // Your IDE will show this with a strikethrough (strikeout)
    }
}