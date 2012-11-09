public class VisualizeHelper {

    /**
     * indent a string to the given depth for visualizing recursive function call traces
     * @param depth
     * @return indented string
     */
    public static String indent(int depth) {
        if (depth == 0) return "";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        return sb.toString() + " ";
    }

    /**
     * Introduce a brief pause for visualization
     * @param ms
     */
    public static void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
