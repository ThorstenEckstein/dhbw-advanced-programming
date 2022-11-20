package de.juwi.pattern.filter.v1;

import java.util.LinkedList;
import java.util.Queue;

import de.juwi.pattern.filter.v1.mock.Input;
import de.juwi.pattern.filter.v1.mock.Output;

/* FilterChain acting like a controller, but should be a separate class! 
 * Although * unused, the FilterChainManager in this package could be that 
 * controller */
public class FilterChain {

	private Queue<Filter> filters = new LinkedList<Filter>();

	StringBuilder trace = new StringBuilder();

	public void add(Filter filter) {
		filters.add(filter);
	}

	public Queue<Filter> getFilters() {
		return filters;
	}

	public void setFilters(Queue<Filter> filters) {
		this.filters = filters;
	}

	public String getTrace() {
		return trace.toString();
	}
	
	public void trace(String traceItem) {
		trace.append(traceItem).append("\n");
	}

	public void doFilter(Input input, Output output) throws FilterException {
		Filter filter = filters.poll();
		if (filter != null) {
			trace("Filtering: " + filter);
			filter.doFilter(input, output, this);
		} else {
			trace("End of Queue reached");
		}
	}

}