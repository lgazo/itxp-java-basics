package sk.seges.itxp.shared.domain;

import java.util.Date;

public class Task {
	private String label;
	private Date created;
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

}
