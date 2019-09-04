/*
 *   @author ethcsak
 *
 */



public interface Item {
	public String getName();
	public void setIdent(String i);
	public void accept(FsVisitor v);
}
