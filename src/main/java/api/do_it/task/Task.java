package api.do_it.task;

import java.util.Date;
import java.util.Objects;

import api.do_it.category.Category;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name="tasks")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private Status status;
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	private Date creation;
	private Date deadline;
	private Date completion;
	
	public Task () {	
	}
	
	public Task(Long id, String name, String description, Status status, Category category, Date creation, Date deadline,
			Date completion) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.status = status;
		this.category = category;
		this.creation = creation;
		this.deadline = deadline;
		this.completion = completion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Date getCreation() {
		return creation;
	}

	public void setCreation(Date creation) {
		this.creation = creation;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Date getCompletion() {
		return completion;
	}

	public void setCompletion(Date completion) {
		this.completion = completion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(id, other.id);
	}
	
}
