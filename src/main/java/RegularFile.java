/*
 *   @author ethcsak
 *
 */

public class RegularFile implements File {

	String name;
	String ident = "";
	public RegularFile() {
		this.name = "unnamed";

	}
	public RegularFile(String name) {
		this.name = name;
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
