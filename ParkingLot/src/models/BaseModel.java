package models;

import java.util.Date;
import java.util.List;

import lombok.Setter;
import lombok.experimental.SuperBuilder;
import lombok.Getter;

@Getter
@SuperBuilder
@Setter
public abstract class BaseModel 
{
	
	private Long id;
	
	private Date createdAt;
	
	private Date updatedAt;
	
	

}
