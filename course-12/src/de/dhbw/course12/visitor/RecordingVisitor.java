package de.dhbw.course12.visitor;

public interface RecordingVisitor {

	public void visit(CreateCommandVisitee createCommand);
	
	public void visit(UpdateCommandVisitee updateCommand);

}