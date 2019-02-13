package lib.Misc;

public abstract class Asserts {

    public static Boolean consoleAssert() {
        switch ((int) IO.scanChar()) {
            case 121: // 'y'
            case 89:  // 'Y'
                return true;
            case 110: // 'n'
            case 78:  // 'N'
                return false;
        }
        return null;
    }

    /**
     * Muestra un mensaje por ventana solicitando introducir datos Devuelve un
     * String introducido en la ventana
     *
     * @param msg String a ser mostrado
     * @param title String a ser titulo de la ventana
     * @return String introducido
     */
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Comprueba si el argumento str es float
     *
     * @param str String a ser comprobado
     * @return boolean true si es float
     * @exception NumberFormatException e si str no es float
     */
    public static boolean isFloat(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
