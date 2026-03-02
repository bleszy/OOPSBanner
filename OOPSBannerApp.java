public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create String array to store all 7 lines of the banner
        String[] banner = {

            String.join("   ",
                "  *****  ",   // O
                "  *****  ",   // O
                " ******  ",   // P
                "  *****  "    // S
            ),

            String.join("   ",
                " **   ** ",   // O
                " **   ** ",   // O
                " **   ** ",   // P
                " **   ** "    // S
            ),

            String.join("   ",
                " **   ** ",   // O
                " **   ** ",   // O
                " **   ** ",   // P
                " **      "    // S
            ),

            String.join("   ",
                " **   ** ",   // O
                " **   ** ",   // O
                " ******  ",   // P
                "  *****  "    // S
            ),

            String.join("   ",
                " **   ** ",   // O
                " **   ** ",   // O
                " **      ",   // P
                "       **"    // S
            ),

            String.join("   ",
                " **   ** ",   // O
                " **   ** ",   // O
                " **      ",   // P
                " **   ** "    // S
            ),

            String.join("   ",
                "  *****  ",   // O
                "  *****  ",   // O
                " **      ",   // P
                "  *****  "    // S
            )
        };

        // Use for-each loop to print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}