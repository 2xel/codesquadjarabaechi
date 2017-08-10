package jaribaechi;

import java.util.Collections;
import java.util.List;

public class Random {
	public List<String> RandomList(List<String> list) {
		Collections.shuffle(list);
		return list;
	}
}
