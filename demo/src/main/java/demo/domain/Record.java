package demo.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Record {

	private Long id;
    private String title;
    private Date created;
    private String summary;
    private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    
 
	public Record(Long id, String title, Date created, String summary) {
		super();
		this.id = id;
		this.title = title;
		this.created = created;
		this.summary = summary;
	}


	public Record() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Date getCreated() {
		return created;
	}


	public void setCreated(Date created) {
		this.created = created;
	}


	public String getSummary() {
		return summary;
	}


	public void setSummary(String summary) {
		this.summary = summary;
	}


	public SimpleDateFormat getFormat() {
		return format;
	}


	public void setFormat(SimpleDateFormat format) {
		this.format = format;
	}
    
	public String getCreatedAsShort(){
        return format.format(created);
    }


	@Override
	public String toString() {
		return "Record [id=" + id + ", title=" + title + ", created=" + created + ", summary=" + summary + ", format="
				+ format + "]";
	}

    
}
