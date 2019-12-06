public class ThiefSituationMainClass{
	public static void main(String[] args) {
		// Once upon a time there was a thief with a knapsack that could take 5 units of weight
		Thief shubham=new Thief(5);
		// He entered a house having 4 items in it with some brand,type,weight,value
		Item item2 = new Onion("Unknown",2, 6); // 3
		Item item0 = new Sugar("Unknown",1, 2); // 2
        Item item1 = new Wine("Unknown",3, 4); // 1.33*2 ...2.66
        Item item3 = new Water("Unknown",3, 3); // 1
        
        Item[] house={item0,item1,item2,item3};
        shubham.rob(house);
        
	}

}