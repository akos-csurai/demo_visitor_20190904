/*
 *   @author ethcsak
 *
 */

public interface FsVisitor {
	public void visit(Directory d);
	public void visit(RegularFile rf);
	public void visit(SpecialFile sf);
}
