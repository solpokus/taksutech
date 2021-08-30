package id.ajr.taksutech.db.mysql.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_master_status")
public class TbMasterStatus implements Serializable {

	@Id
	@Column(name = "tbms_id")
	private Integer tbms_id;

	@Column(name = "tbms_en")
	private String tbms_en;

	@Column(name = "tbms_in")
	private String tbms_in;

	@Column(name = "tbms_create_date")
	private Timestamp tbms_create_date;

	public Integer getTbms_id() {
		return tbms_id;
	}

	public void setTbms_id(Integer tbms_id) {
		this.tbms_id = tbms_id;
	}

	public String getTbms_en() {
		return tbms_en;
	}

	public void setTbms_en(String tbms_en) {
		this.tbms_en = tbms_en;
	}

	public String getTbms_in() {
		return tbms_in;
	}

	public void setTbms_in(String tbms_in) {
		this.tbms_in = tbms_in;
	}

	public Timestamp getTbms_create_date() {
		return tbms_create_date;
	}

	public void setTbms_create_date(Timestamp tbms_create_date) {
		this.tbms_create_date = tbms_create_date;
	}

//	public TbMasterStatus() {}

//	 @Override
//	    public String toString() {
//	        return "TbMasterStatus{" +
//	                "tbms_id=" + tbms_id +
//	                ", tbms_en='" + tbms_en + '\'' +
//	                '}';
//	    }

}
