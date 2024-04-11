package presentationLayer;

import java.util.List;

import bussinessLayer.GroupService;
import entities.Group;

public class GroupController {
	private final GroupService groupService;

  public GroupController(GroupService groupService) {
    this.groupService = groupService;
  }
  
  public List<Group> getListAccounts() {
    return this.groupService.getListGroups();
  }
}
