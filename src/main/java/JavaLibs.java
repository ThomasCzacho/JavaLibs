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

// prompt asked for coded version of madlibs, I decided to make it into a short horror story

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

          System.out.println("==(6/10)== Enter Favorite Sport. Hit Enter to Confirm. ====");
        String Sport = sc.next();

          System.out.println("==(7/10)== Enter Random Number Between 1 and 7. Hit Enter to Confirm. ====");
        int number = sc.nextInt();

          System.out.println("==(8/10)== Enter Favored Past-time or Hobby. Hit Enter to Confirm. ====");
        String hobby = sc.next();

          System.out.println("==(9/10)== Enter Favorite Domestic Animal. Hit Enter to Confirm. ====");
        String animal = sc.next();

          System.out.println("==(10/10)== Enter Favorite Holiday. Hit Enter to Confirm. ====");
        String holiday = sc.next();

          System.out.println("==(10/10)== Survey Complete. Type any Letter and Hit Enter to Begin. ====");
        String p = sc.next();
     double date;
     date=birthday-0.1;

        System.out.println("It is\""+date+".95\", Your Birthday is tomorrow, \n" +
                " you were hoping to spend time with some friends but you \n" +
                "already made arrangments to see your your great uncle Huel.\n" +
                        "He lives far from "+town+". His farm lies halfway on \n" +
                        "the "+region+" State Border. It will take you all \n" +
                        "evening to make the drive. \n");
// get stopped by cop car, cop knows huel so lets go, cop liscense plate has number from earlier a lot
                System.out.println("========  Type any Letter and Hit Enter to Continue. ====");
        String o = sc.next();
        System.out.println("The sun is much lower in the sky than it was \n" +
                "when you left, you glance at your car's radio and notice it \n" +
                "reads \"7:2"+number+"\", You wonder if you will even make it.\n" +
                "Not too long later you see red and blue flashing in you rear \n" +
                "view mirror. You're confused since usually cops operate speed \n" +
                "traps in more populated areas, and not some pot-hole ridden \n" +
                "forgotten road west of "+town+". \n");
        System.out.println("========  Type any Letter and Hit Enter to Continue. ====");
        String i = sc.next();
        int number1;
        number1=number+1;

        System.out.println("Before the Officer even reaches your window you hear him \n" +
                        "reading off  a mental check-list.\n\n \" Liscense and Registration" +
                        " Please \".\n\n He is clutching his right side, His shirt has 3 small " +
                        "holes that you can see from where he is holding, \n yet he acts fine none the less. \n\n  " +
                        "\" You know- You look all too familiar, you happen to" +
                        " know Mr."+lastName+" by any chance? \" \n\n" +
                        "The Officer is talking about your uncle Huel, you explain how" +
                        " you were on your way right now to go meet him. \n\n" +
                        "\" Oh, is that so, Well, I'll leave you off on a warning, tell " +
                        "Huey I send my regards. \" \n\n Like that the officer returns to his" +
                        " car and pulls away infront of you, you glance at his license plate, \n \"" +
                        ""+number+number1+number+"2L"+number+"3H"+number+"\". You continue on your drive.\n");
        System.out.println("========  Type any Letter and Hit Enter to Continue. ====");
        String u = sc.next();
        System.out.println("It is now night, Your headlights fall on a large sign, \""+lastName+" Orchards.\" You pull your car \n" +
                "into the gravel driveway. To your left you notice a barn and a tractor, to your \n" +
                "right you see "+number+" Lone trees, lined parralel to the gravel path. Only now \n" +
                "does the mansion's full size dwell on you, seemingly towering over you, yet being no \n" +
                "taller than the buildings you traverse through on main street. You find yourself now at \n" +
                "the front door. The large iron door knocker intimidates you to the point where you perfer to \n" +
                "knock instead. When knocking on the door you accidentally move the door slightly, realizing " +
                "it's unlocked.\n");
        System.out.println("========  Type any Letter and Hit Enter to Continue. ====");
        String y = sc.next();
        System.out.println("Letting yourself in, you finally spot Uncle Huel cradling his "+animal+", Stimpy, On his Sofa.\n\n" +
                "\" "+firstName+", Come in, fancy seeing you here! \" \n\n You Explain to Uncle Huel that he invited you, \n" +
                "but he shrugs off his confusing comment, denoting it because of his old age.\n He goes on making conversation about family, the farm. \n" +
                "he mentions how his new delivery driver is still often late and forgets his address. \n\n" +
                "\" Guess the orchard sign is too small for him, even so, you figure he'd remember the way by now! \" He jokes, \n\n You leave the living room and  enter his dining room where" +
                "you realize the table is set, \n yet there is no plates or silverware, this seems odd but you take a seat without too much thought.\n" +
                "while you continue to talk your eyes drift to behind Uncle Huel, to his grand china cabinet, \nontop" +
                "sits a small white urn, with the name \"Stimpy\" spelled out. \n");

                System.out.println("========  Type any Letter and Hit Enter to Continue. ====");
                String e = sc.next();
                System.out.println("You're now very confused because the same Stimpy is begging for food next to you, despite the table being \n" +
                        " devoid of any, you now remember the reason why Uncle Huel has a new delivery driver. 4 years ago, 1990, Stimpy was ran \n" +
                        "over by the delivery truck. Looking back down you now notice that Stimpy's spine seems deformed. Flattened even.\n " +
                "Starting to panic you excuse yourself to go outside for a breather, the front door falls off when you touch it, now black\n" +
                "and charred. turning around you realize the house you were just in was nothing but the burnt remnants of a house. \n" +
                "Peering into what used to be the living room you see Uncle Huel cradling Stimpy as if everything is as normal.\n" +
                "In confusion you run to your car before you realize you can't find the door's handle. In fact, you can't find the door.\n" +
                "your car is warped beyond recognition, you notice the front is bent in a way that it could perfectly fit a large tree\n" +
                "between what used to be the wheel wells.\n\nThe Delivery Truck and Stimpy, the Fire and Huel, you and the tree. You Realize " +
                "that you are dead.\n\" "+firstName+", "+lastName+", date of death: "+date+".1995, at 7:1"+number+"pm. Car found "+number+" miles west of "+town+", "+region+" \".\n");

        System.out.println("========  Type any Letter and Hit Enter to Continue. ====");
        String t = sc.next();

        System.out.println("========  Thanks For Playing ====");
        String r = sc.next();
        sc.close();
    }
}
