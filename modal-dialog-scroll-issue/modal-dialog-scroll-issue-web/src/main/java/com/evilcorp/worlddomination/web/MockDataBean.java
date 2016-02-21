package com.evilcorp.worlddomination.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class MockDataBean implements Serializable {
	private List<String> listValues = new ArrayList<>();

	private String selectedValue = "";

	public void init() {
		listValues.add("Value 1");
		listValues.add("Value 2");
		listValues.add("Value 3");
		listValues.add("Value 4");
		listValues.add("Value 5");
	}

	public List<String> getListValues() {
		return listValues;
	}

	public List<String> onAutocomplete(String query) {
		return listValues;
	}

	public void setListValues(List<String> listValues) {
		this.listValues = listValues;
	}

	public String getSelectedValue() {
		return selectedValue;
	}

	public void setSelectedValue(String selectedValue) {
		this.selectedValue = selectedValue;
	}

}
