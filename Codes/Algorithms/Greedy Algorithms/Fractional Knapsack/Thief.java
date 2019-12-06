import java.util.Comparator;
import java.util.Arrays;

public class Thief{
	int maxKnapsackCapacity;
	Thief(int maxKnapsackCapacity){
		this.maxKnapsackCapacity=maxKnapsackCapacity;
	}
	public void rob(Item[] items){
		// Sort the available items on the basis of their v/w value(in DECREASING ORDER)
		// Get a comparator that will sort the items in descending order of v/w
		Comparator<Item> v_to_w_comparator_desc=new VToWComparatorDesc();
		Arrays.sort(items,v_to_w_comparator_desc);
		int currentKnapsackWeight=0;
		double currentKnapsackValue= 0.0;
		// Traverse each item and add it to the knapsack
		// Till you reach an item which cannot be added(whereby you need take fraction of it)
		// OR if knapsack is full to its capacity
		// OR you exhaust the list of items
		for (Item item : items) { 
            int newWeight = currentKnapsackWeight + item.getWeight();

            // if we can add a whole item into the knapsack
            if (newWeight <= maxKnapsackCapacity) {
                currentKnapsackWeight = newWeight;
                currentKnapsackValue += item.getValue();
                System.out.println("Taking "+item.getWeight() + " of " + item.getType() + " knapsack Weight :::"+currentKnapsackWeight);
            }
            // if we can't add a whole item into the knapsack
            // let's just add a fraction of the item into the knapsack 
            else {
                int remainingWeight = maxKnapsackCapacity - currentKnapsackWeight;                
                double fractionalValue = ((double)item.getValue()/item.getWeight()) * ((double) remainingWeight );
                currentKnapsackValue += fractionalValue;
                currentKnapsackWeight = maxKnapsackCapacity;

                System.out.println("Taking fraction : " + remainingWeight + " of " + item.getType() + " knapsack Weight :::"+currentKnapsackWeight);
                break; // breaking out of the loop because we can't add more weight after this
            }
        }
        System.out.println("Total knapsack value :::"+currentKnapsackValue);
	}



}