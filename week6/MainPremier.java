package week6;

public class MainPremier {
    public static void main(String[] args) {
        PremierLeagueService pr = new PremierLeagueService() ;
        pr.add(new PremierLeague("Liverpool", 29, 45, 82));
        pr.add(new PremierLeague("Manchester city", 27, 39, 57));
        pr.add(new PremierLeague("leicestern", 28, 26, 50));
        pr.add(new PremierLeague("Chelsea", 29, 9, 48));
        pr.add(new PremierLeague("Wolvehampton", 29, 7, 43));
        pr.add(new PremierLeague("shelfield", 29, 5, 43));
        pr.add(new PremierLeague("Manchester united", 29, 9, 48));
        pr.add(new PremierLeague("Tottenham", 29, 7, 41));
        pr.add(new PremierLeague("Arsenal", 28, 4, 40));
        pr.add(new PremierLeague("Bumley", 29, -6, 39));
        pr.add(new PremierLeague("Crystal palace", 29, -6, 39));
        pr.add(new PremierLeague("everton", 29, -6, 37));
        pr.add(new PremierLeague("New Castle united", 29, -16, 35));
        pr.add(new PremierLeague("Southampton", 29, 17, 34));
        pr.add(new PremierLeague("brighton", 29, -8, 29));
        pr.add(new PremierLeague("westham united", 29, -15, 27));
        pr.add(new PremierLeague("watford", 29, -17, 27));
        pr.add(new PremierLeague("AFC Bournemouth", 29, -18, 27));
        pr.add(new PremierLeague("Aston villa", 27, -18, 25));
        pr.add(new PremierLeague("Norwitch city", 29, -27, 21));


        


    System.out.println("points before sorting");
    pr.displayAll();

    pr.bubbleSort(false);
    System.out.println(" \n Points after sorting (ascending)");
    pr.displayAll();

    
    }
}

