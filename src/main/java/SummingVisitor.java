/*
 *   @author ethcsak
 *
 */

public class SummingVisitor implements FsVisitor{

	long allFileSize = 0;


	public void visit(Directory d) {

	}


	public void visit(RegularFile rf) {
		allFileSize += rf.getSize();
	}


	public void visit(SpecialFile sf) {
		allFileSize += sf.getSize();
	}


	public String toString()
	{
		return "allFileSize: " + String.valueOf( allFileSize ) ;
	}


}
