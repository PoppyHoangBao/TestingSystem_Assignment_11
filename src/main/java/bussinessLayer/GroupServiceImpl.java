package bussinessLayer;

import java.util.List;

import dataLayer.GroupRepository;
import entities.Group;

public class GroupServiceImpl implements GroupService {
	private GroupRepository groupRepository;
	
	public GroupServiceImpl(GroupRepository groupRepository) {
		this.groupRepository = groupRepository;
	}
	
	public List<Group> getListGroups() {
		// TODO Auto-generated method stub
		return this.groupRepository.findAll();
	}

}
