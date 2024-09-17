public class Feeder {
    private int currentFood;
    private int RandBirds;
    public Feeder (int c)
    {
     currentFood = c;
    }


    public int getCurrentFood()
    {
     return (currentFood);
    }


    public void simulateOneDay(int numBirds)
    {
        int RandBirds = (int) (Math.random() * numBirds );
        currentFood 
    }


    public int simulateManyDays(int numBirds, int numDays) 
    {
        return 0;
    }

}