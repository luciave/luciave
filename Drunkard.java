//code by lve2104

import java.util.Random;


public class Drunkard {

    //instance variable(s)
    private int startAvenue;
    private int startStreet;
    private int avenue;
    private int street;

    //constructor(s) 
    public Drunkard(int avenue, int street) {
        this.startAvenue = avenue;
        this.startStreet = street;
        this.avenue = avenue;
        this.street = street;
    }

    Random rand = new Random();

    //method(s)
    public void step() {
    int nextMove = rand.nextInt(4);
    if(nextMove == 0) {
        this.street -= 1;
    } else if(nextMove == 1) {
        this.street += 1;
    } else if(nextMove == 2) {
        this.avenue += 1;
    } else {
        this.avenue -= 1;
    }
}
    
    public void fastForward(int steps) {
        for (int i=0;i < steps; i++) {
      step();
    }
    }
    public String getLocation() {
        return "Avenue " + avenue + ", Street " + street;
    }
    public int howFar() {
         int distance = Math.abs(startAvenue-avenue) + Math.abs(startStreet-street);
         return distance;
    }

}
