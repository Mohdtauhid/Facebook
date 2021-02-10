
package com.test.UserApi.model;
    
  import javax.persistence.Column; import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table; 
  import javax.validation.constraints.NotNull;
  
  import org.springframework.lang.NonNull;
  
  @Entity
  @Table(name="mobile_number") 
  public class MobileNumber {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="id")
  private int id;
  
@NotNull
  @Column 
  private String cc;
  
  @NotNull
  @Column 
  private String number;
  
  @OneToOne
  @JoinColumn(name="id")
  private User user;
  
  public MobileNumber() {
		super();
		// TODO Auto-generated constructor stub
	}
  public String getCc() { 
	  return cc; }
  
  public void setCc(String cc) { 
	  this.cc = cc; }
  
  public MobileNumber(@NotNull String cc, @NotNull String number) {
	  super();
	  this.cc = cc; this.number = number; 
	  }
  
  public String getNumber() { 
	  return number; 
	  }
  
  public void setNumber(String number) { 
	  this.number = number; 
	  }
  
  
  }
 