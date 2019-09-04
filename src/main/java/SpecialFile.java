/*
 *   @author ethcsak
 *
 */

public class SpecialFile implements File{

	String name;
	String ident = "";
	String attribute;

	public SpecialFile() {
		this.name = "unnamed";

	}

	public SpecialFile(String name, String attrib) {
		this.name = name;
		this.attribute = attrib;
	}


	public long getSize() {
		return this.name.length();
	}


	public String getName() {
		return name;
	}
	public void setName(String n) {
		this.name = n;
	}

	public String toString(){
		return this.ident + this.name + "\n";
	}
	public void setIdent(String i) {
		this.ident = i;
	}



	public void accept(FsVisitor v) {
		v.visit(this);
	}


}
