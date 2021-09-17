

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class Sort_Comparator extends WritableComparator {
	
	@Override
	public int compare(WritableComparable k1, WritableComparable k2) {
		IntWritable v1 = (IntWritable) k1;
		IntWritable v2 = (IntWritable) k2;
		
		return v1.get() < v2.get() ? 1 : v1.get() == v2.get() ? 0 : -1; 
		
	}

	protected Sort_Comparator() {
        super(IntWritable.class, true);
    }
}
