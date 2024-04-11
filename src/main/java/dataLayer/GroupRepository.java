package dataLayer;

import java.util.List;

import entities.Group;

public interface GroupRepository {
	List<Group> findAll();
}
