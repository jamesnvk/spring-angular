package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "todos")
public class Todo {
	
	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", checked=" + checked + "]";
	}

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "checked")
	private Boolean checked;
	
	public Todo(){
		
	}
	
	public Todo(String title){
		this.title = title;
	}
	
	public Todo(Long id, String title, Boolean checked){
		this.id = id;
		this.title = title;
		this.checked = checked;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public Boolean isChecked(){
		return this.checked;
	}
	
	public void setChecked(Boolean checked){
		this.checked = checked;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((checked == null) ? 0 : checked.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (checked == null) {
			if (other.checked != null)
				return false;
		} else if (!checked.equals(other.checked))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
}
