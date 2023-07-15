package models;

import java.util.Date;
import lombok.Setter;
import lombok.Getter;

@Getter
public abstract class BaseModel 
{
	
	private Long id;
	
	private Date createdAt;
	
	private Date updatedAt;
	
	

}
