package io.mosip.pmp.partner.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author sanjeev.shrivastava
 *
 */

@Entity
@Table(name = "policy_group")
@Data
public class PolicyGroup {
	
	@Id
	@Column(name = "id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "descr")
	private String descr;
	
	@Column(name = "user_id")
	private String user_id;
	
	@Column(name = "is_active")
	private String is_active;
	
	@Column(name = "cr_by")
	private String cr_by;
	
	@Column(name = "cr_dtimes")
	private String cr_dtimes;
	
	@Column(name = "upd_by")
	private String upd_by;
	
	@Column(name = "upd_dtimes")
	private String upd_dtimes;
	
	@Column(name = "is_deleted")
	private String is_deleted;
	
	@Column(name = "del_dtimes")
	private String del_dtimes;
	
}
