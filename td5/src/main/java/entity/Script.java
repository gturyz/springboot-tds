package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "SCRIPT")
public class Script {

	@Id
	@GeneratedValue
	@Column(name = "Id", nullable = false)
	private int id;
	
	@Column(name = "Title", length = 64, nullable = false)
	private String title;
	
	@Temporal(TemporalType.DATE)
    @Column(name = "CreationDate", nullable = false)
    private Date creationDate;
	
}
