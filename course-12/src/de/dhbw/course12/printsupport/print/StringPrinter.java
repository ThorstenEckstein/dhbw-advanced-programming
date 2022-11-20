package de.dhbw.course12.printsupport.print;

import de.dhbw.course12.printsupport.model.A;
import de.dhbw.course12.printsupport.model.B;
import de.dhbw.course12.printsupport.model.C;

public class StringPrinter extends AbstractPrinter {
	
	public String print(Object o) throws PrintException {
		String ret = null;
		if      (o instanceof A) { ret = print((A)o); }
		else if (o instanceof B) { ret = print((B)o); }
		else if (o instanceof C) { ret = print((C)o); }
		else { throw new PrintException("Unbekannter Typ");}
		return ret;
	}
	
	private String print(A a) throws PrintException {
		StringBuffer sb = new StringBuffer();
		sb.append(getIndention()).append(toFormattedName(a));
		indent();
		sb.append(getIndention()).append("name="+a.getName());
		unindent();
		return sb.toString();
	}
	
	private String print(B b) throws PrintException {
		StringBuffer sb = new StringBuffer();
		sb.append(getIndention()).append(toFormattedName(b));
		indent();
		sb.append(getIndention()).append("id="+b.getId());
		//increase();
		B.Sub sub = b.getSub();
		sb.append(getIndention()).append(sub.getClass().getName());
		indent();
		sb.append(getIndention()).append("amount="+sub.getAmount());
		unindent(2);
		return sb.toString();
	}
	
	private String print(C c) throws PrintException {
		StringBuffer sb = new StringBuffer();
		sb.append(getIndention()).append(toFormattedName(c));
		indent();
		sb.append(getIndention()).append("isreal="+c.isReal());
		unindent();
		return sb.toString();
	}
	
}
