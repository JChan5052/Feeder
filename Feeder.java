public class Feeder {

    public Feeder() {}
    private int currentFood;

  public int getCurrentFood()
    {
        return currentFood;
    }

  public Feeder (int c)
    {
        currentFood = c;
    }

  public String toString()
    {
    return "Current Food: " + currentFood;
    }

  public void simulateOneDay(int numBirds)
    {
      if (Math.random() < 0.05) 
      {
        currentFood=0;
      }
      else 
      {
       int eaten = (int) (Math.random() * 41)+10;
       currentFood -= eaten * numBirds;  //where is it getting current food from? how is it taking 500 from feeder g = new feeder
       if (currentFood < 0) currentFood = 0;
      }
 
    }

  
  public int simulateManyDays(int numBirds, int numDays) 
    {
     int days=0;
     for (int test=0;test<numDays;test++)
     {
      if (currentFood==0)
        {
            days++;
     
        }
        simulateOneDay(numBirds);
     }
     days=numDays-days;
     return days;
    }

}