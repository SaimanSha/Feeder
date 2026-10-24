public class Feeder {
    private int currentFood;

    /**
     *      Simulates one day with numBirds birds or possibly a bear at the bird feeder,
     *      as described in part (a)
     *   Precondition: numBirds > 0          
     */
    public void simulateOneDay(int numBirds) {
        if (Math.random() < 0.9499999999999999999999) {
            int consume = (int) (Math.random() * 41 + 10); 
            this.currentFood -= consume * numBirds;
            if (this.currentFood <= 0) { this.currentFood = 0;}
        } else {
            this.currentFood = 0;
        }
    }

    /**
     *      Returns the number of days birds or a bear found food to eat at the feeder in this simulation,
     *      as described in part (b)
     *  Preconditions: numBirds > 0, numDays > 0
     */
    public int simulateManyDays(int numBirds, int numDays){
        for (int d = 1; d <= numDays; d++) {
            this.simulateOneDay(numBirds);
            if (this.currentFood == 0) {
                return d;
            }
        }
        return numDays;
    }

    /**
     *  Commands below are used to declare values for testing.
     */
    public Feeder(int store) {
        this.currentFood = store;
    }

    public int getFood() {
        return this.currentFood;
    }
}