package jaribaechi;

import java.util.List;

public class Program {
	public static void main(String[] args) {
		Member member = new Member();
		Random random = new Random();
		Print print = new Print();
		
		List<String> list1 = member.list1();
		List<String> list2 = member.list2();
		List<String> list3 = member.list3();
		
		List<String> line1 = random.RandomList(list1);
		List<String> line2 = random.RandomList(list2);
		List<String> line3 = random.RandomList(list3);
		
		print.PrintJari(line1, line2, line3);
	}
}
