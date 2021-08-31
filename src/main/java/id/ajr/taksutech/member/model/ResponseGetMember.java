package id.ajr.taksutech.member.model;

import java.sql.Timestamp;
import java.util.Date;

public class ResponseGetMember {

	private Timestamp tbmm_create_date;
	private Timestamp tbmm_update_date;
	private Integer tbmm_status;
	private String tbmm_email;
	private String tbmm_firstname;
	private String tbmm_lastname;
	private String tbmm_gender;
	private String tbmm_phone;
	private Date tbmm_dob;
	private Timestamp tbmm_last_login;

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

}
