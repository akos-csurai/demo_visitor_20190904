/*
 * @author ethcsak
 */

public class Main {
	public static void main(String[] args) {
		System.out.println("Composite filesystem : ");
		Directory root = new Directory("root");
		Directory dir1 = new Directory("dir1");
		Directory dir2 = new Directory("dir2");
		RegularFile rf1 = new RegularFile("rf1");
		RegularFile rf2 = new RegularFile("rf2");
		SpecialFile sp1 = new SpecialFile("sf1", "attrib1");
		SpecialFile sp2 = new SpecialFile("sf2", "attrib2");
		root.add(dir1);
		dir1.add(dir2);
		root.add(rf1);
		root.add(rf2);
		dir1.add(sp1);
		dir1.add(sp2);


		System.out.println("" + root);

		CountingVisitor cv = new CountingVisitor();
		SummingVisitor  sv = new SummingVisitor();
		root.accept(cv);
		root.accept(sv);
		System.out.println("CountV: " + cv.toString());
		System.out.println("SummiV: " + sv.toString());

	}
}
