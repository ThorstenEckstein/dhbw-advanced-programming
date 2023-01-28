package de.dhbw.course9.visitor;

public interface RecordingVisitor {

	public void visit(CreateCommandVisitee createCommand);
	
	public void visit(UpdateCommandVisitee updateCommand);

}