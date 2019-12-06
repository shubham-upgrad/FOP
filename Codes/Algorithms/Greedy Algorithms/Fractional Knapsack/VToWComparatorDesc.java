
// compare()  method basically takes two items i1 and i2 and gives :
// + value if  i1>i2
// - value if  i1<i2
// 0 value if i1==i2
// We want to sort in descending order of v/w so we will make the compare method to return:
// + value if (v/w of i1) < (v/w of i2) so that it means i1 > i2
// - value if (v/w of i1) > (v/w of i2) so that it means i1 < i2
// 0 value if i1==i2
import java.util.Comparator;
public class VToWComparatorDesc implements Comparator<Item>{
	public int compare(Item i1,Item i2){
		double i1ValueToWeight = (double)i1.getValue() / i1.getWeight();
        double i2ValueToWeight = (double)i2.getValue() / i2.getWeight();
        
        if (i2ValueToWeight > i1ValueToWeight) {
            return 1;
        }
        else if (i2ValueToWeight == i1ValueToWeight) {
            return 0;
        }
        else {
            return -1;
        }
	}
}
