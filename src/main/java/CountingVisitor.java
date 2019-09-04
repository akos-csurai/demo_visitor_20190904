/*
 *   @author ethcsak
 *
 */

public class CountingVisitor implements FsVisitor{
	long dirCount = 0;
	long fileCount =0;
	public void visit(Directory d) {
		dirCount ++ ;
	}
	public void visit(RegularFile rf) {
		fileCount ++;
	}
	public void visit(SpecialFile sf) {
		fileCount ++;
	}
	public String toString()
	{
		return "dirCount: " + String.valueOf( dirCount ) + " fileCount: " + String.valueOf(fileCount);
	}

}
