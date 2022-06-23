package id.ajr.taksutech.db.mysql.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_master_member")
public class TbMasterMember implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column(name = "tbmm_id")
	private Integer tbmm_id;

	@Column(name = "tbmm_create_date")
	private Timestamp tbmm_create_date;

	@Column(name = "tbmm_update_date")
	private Timestamp tbmm_update_date;

	@Column(name = "tbmm_status")
	private Integer tbmm_status;

	@Column(name = "tbmm_email")
	private String tbmm_email;

	@Column(name = "tbmm_firstname")
	private String tbmm_firstname;

	@Column(name = "tbmm_lastname")
	private String tbmm_lastname;

	@Column(name = "tbmm_gender")
	private String tbmm_gender;

	@Column(name = "tbmm_phone")
	private String tbmm_phone;

	@Column(name = "tbmm_dob")
	private Date tbmm_dob;

	@Column(name = "tbmm_last_login")
	private Timestamp tbmm_last_login;

	public Integer getTbmm_id() {
		return tbmm_id;
	}

	public void setTbmm_id(Integer tbmm_id) {
		this.tbmm_id = tbmm_id;
	}

	public Timestamp getTbmm_create_date() {
		return tbmm_create_date;
	}

	public void setTbmm_create_date(Timestamp tbmm_create_date) {
		this.tbmm_create_date = tbmm_create_date;
	}

	public Timestamp getTbmm_update_date() {
		return tbmm_update_date;
	}

	public void setTbmm_update_date(Timestamp tbmm_update_date) {
		this.tbmm_update_date = tbmm_update_date;
	}

	public Integer getTbmm_status() {
		return tbmm_status;
	}

	public void setTbmm_status(Integer tbmm_status) {
		this.tbmm_status = tbmm_status;
	}

	public String getTbmm_email() {
		return tbmm_email;
	}

	public void setTbmm_email(String tbmm_email) {
		this.tbmm_email = tbmm_email;
	}

	public String getTbmm_firstname() {
		return tbmm_firstname;
	}

	public void setTbmm_firstname(String tbmm_firstname) {
		this.tbmm_firstname = tbmm_firstname;
	}

	public String getTbmm_lastname() {
		return tbmm_lastname;
	}

	public void setTbmm_lastname(String tbmm_lastname) {
		this.tbmm_lastname = tbmm_lastname;
	}

	public String getTbmm_gender() {
		return tbmm_gender;
	}

	public void setTbmm_gender(String tbmm_gender) {
		this.tbmm_gender = tbmm_gender;
	}

	public String getTbmm_phone() {
		return tbmm_phone;
	}

	public void setTbmm_phone(String tbmm_phone) {
		this.tbmm_phone = tbmm_phone;
	}

	public Date getTbmm_dob() {
		return tbmm_dob;
	}

	public void setTbmm_dob(Date tbmm_dob) {
		this.tbmm_dob = tbmm_dob;
	}

	public Timestamp getTbmm_last_login() {
		return tbmm_last_login;
	}

	public void setTbmm_last_login(Timestamp tbmm_last_login) {
		this.tbmm_last_login = tbmm_last_login;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}