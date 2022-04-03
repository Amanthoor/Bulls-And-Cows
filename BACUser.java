package zero;


public class BACUser implements Comparable<BACUser>{
    private String name;
    private int score = 0;

    public BACUser() {
    }

    public BACUser(String name) {
        this.name = name;
    }

    public BACUser(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public String guessNumEasy(){
        String tips = "This is Easy model." +
                "\nYou have 3 chances to guess the number." +
                "\nPlease enter an integer between 1 and 10!";
        return tips;
    }

    int guessNumE = (int)(Math.random() * 10 + 1);
    int countE = 1;
    public String guessNumEasy(int inputInt){
        String tips = "";

        if (countE <= 3){
            if (inputInt < guessNumE){
                tips = "Your chance number is " + countE + "/3" + "\nYour guess is less than the answer!";
                countE++;
            }
            else if (inputInt > guessNumE){
                tips = "Your chance number is " + countE + "/3" + "\nYour guess is greater than the answer!";
                countE++;
            }
            else{
                this.score++;
                tips = "*** BINGO *** \nYour score is: " + this.score;
                countE++;
            }
        }else {
            tips = "You don't have a chance. The answer is " + guessNumE + "\nYour score is: " + this.score;

        }
        return tips;
    }

    public String guessNumNor(){
        String tips = "This is Normal model." +
                "\nYou have 6 chances to guess the number." +
                "\nPlease enter an integer between 1 and 50!";
        return tips;
    }

    int guessNumN = (int)(Math.random() * 50 + 1);
    int countN = 1;
    public String guessNumNor(int inputInt){
        String tips = "";

        if (countN <= 6){
            if (inputInt < guessNumN){
                tips = "Your chance number is " + countN + "/6" + "\nYour guess is less than the answer!";
                countN++;
            }
            else if (inputInt > guessNumN){
                tips = "Your chance number is " + countN + "/6" + "\nYour guess is greater than the answer!";
                countN++;
            }
            else{
                this.score++;
                tips = "*** BINGO *** \nYour score is: " + this.score;
                countN++;
            }
        }else {
            tips = "You don't have a chance. The answer is " + guessNumN + "\nYour score is: " + this.score;

        }
        return tips;
    }

    public String guessNumHard(){
        String tips = "This is Hard model." +
                "\nYou have 9 chances to guess the number." +
                "\nPlease enter an integer between 1 and 100!";
        return tips;
    }

    int guessNumH = (int)(Math.random() * 100 + 1);
    int countH = 1;
    public String guessNumHard(int inputInt){
        String tips = "";

        if (countH <= 9){
            if (inputInt < guessNumH){
                tips = "Your chance number is " + countH + "/9" + "\nYour guess is less than the answer!";
                countH++;
            }
            else if (inputInt > guessNumH){
                tips = "Your chance number is " + countH + "/9" + "\nYour guess is greater than the answer!";
                countH++;
            }
            else{
                this.score++;
                tips = "*** BINGO *** \nYour score is: " + this.score;
                countH++;
            }
        }else {
            tips = "You don't have a chance. The answer is " + guessNumH + "\nYour score is: " + this.score;

        }
        return tips;
    }

    @Override
    public int compareTo(BACUser o) {
        return Double.compare(this.getScore(), o.getScore());
    }
}
