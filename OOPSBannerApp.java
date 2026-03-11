/**
 * OOPSBannerApp
 * UC3: Render OOPS as Banner using String.join()
 *
 * @author gnanashiva
 * @author Gnanashiva
 * @version 3.0
 */

public class OOPSBannerApp {

    public static String[] getOPattern() {
        return new String[] {
            "  ***  ",
            " ** ** ",
            " ** ** ",
            " ** ** ",
            " ** ** ",
            " ** ** ",
            "  ***  "
        };
    }

    public static String[] getPPattern() {
        return new String[] {
            " ******",
            " **  **",
            " **  **",
            " ******",
            " **    ",
            " **    ",
            " **    "
        };
    }

    public static String[] getSPattern() {
        return new String[] {
            " ***** ",
            "**   **",
            "**     ",
            " ***** ",
            "     **",
            "**   **",
            " ***** "
        };
    }

    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + "  " + oPattern[i] + "  " + pPattern[i] + "  " + sPattern[i]);
        }
    }
}