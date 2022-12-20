package de.dhbw.course9.decorator.example2.record;

public class Recorder {

	private String recording;

	public String getRecording() {
		return recording;
	}

	public void record(String recording) {
		this.recording = recording;
		System.out.println(recording);
	}

}