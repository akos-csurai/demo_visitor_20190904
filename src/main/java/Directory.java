/*
 *   @author ethcsak
 *
 */

import java.util.ArrayList;
import java.util.List;


public class Directory implements Item{
	private String name;
	private String ident = "";
	//Set<Item> items = new HashSet();
	List<Item> items = new ArrayList<>();
	public Directory(String name){
		this.name = name;
	}

	public void setName(String n) {
		this.name = n;
	}
	public void setIdent(String i) {
		this.ident = i;
	}
	public String getName() { return name;}
	public void add(Item i) {
		i.setIdent(this.ident + "---- ");
		items.add(i);
	}
	public void del(Item i) { items.remove(i);}
	public String toString(){
		String retval = this.ident + this.name + "\n";
		for (Item item : items)
		{
			retval +=  item.toString() + "";
		}
		return retval;
	}


	public void accept(FsVisitor v) {
		v.visit(this);
		for (Item item: items) {
			item.accept(v);
		}
	}

}
