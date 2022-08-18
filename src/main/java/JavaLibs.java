import java.util.Scanner;

class JavaLibs {

    public static void main(String[] args) {
        //Create a Scanner
Scanner sc = new Scanner(System.in);
        System.out.println("==(0/10)== Welcome to Your Own Story, Answer All Questions as prompted, Include NO Spaces In Your Answers. ==== \n");

        System.out.println("           ==Old=Bones==              `'::::.");
        System.out.println("        ==Adventure=Tale==              _____A_");
        System.out.println("                x         +            /      /\\"   );
        System.out.println("     .-. _______|         A_        __/__/\\__/  \\__"   );
        System.out.println("     |=|/     /  \\       /\\-\\     /__|\" '' \"| /___/\\    ");
        System.out.println("_____| |_____|_\"\"_|______||\"|_____|''|\"'||'\"| |' '||___");
        System.out.println("^~^~^|_|_[X]_|____|~^~^~^~^~^~^~^~`\"\"`\"\"))\"\"`\"`\"\"\"\"`~^~^");
        System.out.println("Art by Joan Stark: ASCII Art Archive \n  ");


          System.out.println("==(1/10)== Declare First Name. Hit Enter to Confirm. ====");
        String firstName = sc.next();

          System.out.println("==(2/10)== Declare Last Name. Hit Enter to Confirm. ====");
        String lastName = sc.next();

          System.out.println("==(3/10)== Enter Birthday (Month.Day ex: 8.3). Hit Enter to Confirm. ====");
        double birthday = sc.nextDouble();

          System.out.println("==(4/10)== Enter Region/Area/State.(Broad) Hit Enter to Confirm. ====");
        String region = sc.next();

        System.out.println("==(5/10)== Enter Town/City/County Within "+region+ ".(Specific) Hit Enter to Confirm. ====");
        String town = sc.next();

        System.out.println("==(6/10)== Enter Random Number Between 1 and 7. Hit Enter to Confirm. ====");
        int number = sc.nextInt();

          System.out.println("Begin");
sc.close();
        //Find and print the sum of three integers entered by the user




        //Remember to close the Scanner

    }
}
