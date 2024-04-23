package week6;
public class PremierLeagueService {
    
    // Creating Object 
    PremierLeague[] league = new PremierLeague[1];
 
        public void add(PremierLeague p) {
            if (league[0] == null) {
                league[0] = p;
            } else {
                PremierLeague[] temp = league;
                int newleagueLen = league.length + 1;
                league = new PremierLeague[newleagueLen];

                for (int i = 0; i < temp.length; i++) {
                    league[i] = temp[i];
                }

                league[newleagueLen - 1] = p;
            }
        }
    
        public void displayAll() {
            for (int i = 0; i < league.length; i++) {
                System.out.println("------------------------------------------------");
                System.out.println(league[i].team + " Club");
                System.out.println("player: " + league[i].play);
                System.out.println("Goal " +league[i].goal);
                System.out.println("Points " +league[i].points);
            }
        }
        void bubbleSort(boolean asc) {
            for (int i = 0; i < league.length - 1; i++) {
                for (int j = 0; j < league.length - i - 1; j++) {
                    if (asc) {
                        if (league[j].points > league[j + 1].points) {
                            PremierLeague tmp = league[j];
                            league[j] = league[j + 1];
                            league[j + 1] = tmp;
                        }
                    } else {
                        if (league[j].points < league[j + 1].points) {
                            PremierLeague tmp = league[j];
                            league[j] = league[j + 1];
                            league[j + 1] = tmp;
                        }
                    }
                }
            }
        }
        
        void insertionSort(boolean asc) {
            for (int i = 1; i < league.length; i++) {
                PremierLeague key = league[i];
                int j = i - 1;
        
                while (j >= 0 && league[j].points > key.points) {
                    league[j + 1] = league[j];
                    j = j - 1;
                }
                league[j + 1] = key;
            }
        }
    }

