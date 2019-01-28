package lib.Misc;

public abstract class Asserts {
    public static Boolean consoleAssert(){
        switch((int) IO.scanChar()){
            case 121: // 'y'
            case 89:  // 'Y'
                return true;
            case 110: // 'n'
            case 78:  // 'N'
                return false;
        }
        return null;
    }
}
