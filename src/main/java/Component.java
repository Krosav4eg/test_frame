public interface Component {
    void draw();

    default void animation() {
        System.out.println("animation");
    }

    static void printDoc() {
        System.out.println(
                "How to use a Component?");
    }
}