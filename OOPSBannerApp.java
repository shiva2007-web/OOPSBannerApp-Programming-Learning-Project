/**
 * OOPSBannerApp
 * UC3: Render OOPS as Banner using String.join()
 *
 * @author YourName
 * @version 3.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String row1 = String.join("",
                "  *****   ",
                "  *****   ",
                " ******   ",
                " ****** ");

        String row2 = String.join("",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                " *      ");

        String row3 = String.join("",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                " *      ");

        String row4 = String.join("",
                " *     *  ",
                " *     *  ",
                " ******   ",
                "  ***** ");

        String row5 = String.join("",
                " *     *  ",
                " *     *  ",
                " *        ",
                "       *");

        String row6 = String.join("",
                " *     *  ",
                " *     *  ",
                " *        ",
                "       *");

        String row7 = String.join("",
                "  *****   ",
                "  *****   ",
                " *        ",
                " ****** ");

        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);
        System.out.println(row5);
        System.out.println(row6);
        System.out.println(row7);
    }
}