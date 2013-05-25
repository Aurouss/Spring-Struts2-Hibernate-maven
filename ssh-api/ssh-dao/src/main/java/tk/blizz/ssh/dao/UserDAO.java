package tk.blizz.ssh.dao;

import java.util.List;

import tk.blizz.ssh.model.User;

public interface UserDAO extends GenericDAO<Long, User> {
	/**
	 * find any users by user's name
	 * 
	 * @param name
	 * @return
	 */
	List<User> findByUserName(String name);

}
