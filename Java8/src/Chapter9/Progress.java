package Chapter9;

import java.time.Duration;

/**
 * @author 82108
 *
 */
public class Progress {
	
	private Duration studyDuration;
	
	private boolean finished;

	public Duration getStudyDuration() {
		return studyDuration;
	}

	public void setStudyDuration(Duration studyDuration) {
		this.studyDuration = studyDuration;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	public Progress(Duration studyDuration, boolean finished) {
		super();
		this.studyDuration = studyDuration;
		this.finished = finished;
	}
	
	

}
