package com.example.sp.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	private List<String> friends;
	private Set<String> skills;
	private Map<String, String> bestFriends;
	private Properties prop;
	
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public Map<String, String> getBestFriends() {
		return bestFriends;
	}
	public void setBestFriends(Map<String, String> bestFriends) {
		this.bestFriends = bestFriends;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Set<String> getSkills() {
		return skills;
	}
	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}
	
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", skills=" + skills + ", bestFriends=" + bestFriends + ", prop=" + prop
				+ "]";
	}
	
}
