package com.model;

/**
 * @author Ismael MR
 * @since 2019-06-11
 * 
 * <a href="mailto:ismaelmrdev@gmail.com">Correo electronico</a> * 
 * <a>https://museumis.github.io/Si/</a>
 */

import java.io.Serializable;
public class Hunter implements Serializable {

	private static final long serialVersionUID = 1L;

	String id;

	public Hunter(String string) {
	}

	public Hunter() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Hunter [id=" + id + "]";
	}

}
