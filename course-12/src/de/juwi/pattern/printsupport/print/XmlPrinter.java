package de.juwi.pattern.printsupport.print;

import de.juwi.pattern.printsupport.model.A;
import de.juwi.pattern.printsupport.model.B;
import de.juwi.pattern.printsupport.model.C;

public class XmlPrinter extends AbstractPrinter {

	public String print(Object o) throws PrintException {
		String ret = null;
		if      (o instanceof A) { ret = print((A)o); }
		else if (o instanceof B) { ret = print((B)o); }
		else if (o instanceof C) { ret = print((C)o); }
		else { throw new PrintException("Unbekannter Typ");}
		return ret;
	}
	
	private String print(A a) throws PrintException {
		return toXml(a, "Name=" + a.getName());
	}
	
	private String print(B b) throws PrintException {
		//throw new PrintException("not supported");
		return toXml(b, "ID=" + b.getId());
	}
	
	private String print(C c) throws PrintException {
		return toXml(c, "IsReal=" + c.isReal());
	}
	
	private String toXml(Object obj, String body) {
		return "<xml type=\""+obj.getClass().getSimpleName()+"\">" + body + "</xml>";
	}

}
