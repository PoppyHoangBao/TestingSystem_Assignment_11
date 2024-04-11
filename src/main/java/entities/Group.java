package entities;

public class Group {
	private String groupId;
	private String groupName;
	
	public Group() {
		// TODO Auto-generated constructor stub
	}

	public Group(String groupId, String groupName) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		return "Group [groupId=" + groupId + ", groupName=" + groupName + "]";
	}	
}
