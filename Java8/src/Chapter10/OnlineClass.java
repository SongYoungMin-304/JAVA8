package Chapter10;

import java.util.Optional;

public class OnlineClass {
	
	private Integer id;
	
	private String title;
	
	private boolean closed;
	
	public Progress progress;
	

	// 리턴 타입에만 Optinal 처리를 하자
	public Optional<Progress> getProgress() {
		return Optional.ofNullable(progress);
	}

	public void setProgress(Progress progress) {
		this.progress = progress;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}

	public OnlineClass(Integer id, String title, boolean closed) {
		super();
		this.id = id;
		this.title = title;
		this.closed = closed;
	}
	
	
	

}
