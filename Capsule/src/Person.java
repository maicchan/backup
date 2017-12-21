
public class Person {
	
  private String name = null;
  
  private int age = 0;
  
  private String prefecture = "Tokyo";
  
  private String hobby = "baseball";
  
  public String getName(){
	  
	  return this.name;
  }
  
  public void setName(String name){
	  
	  this.name = name;
  }

  public int getAge(){
	  
	  return this.age;
  }
  
  public void setAge(int age){
	  
	  this.age = age;
  }
  
  public String getPrefecture(){
	  
	  return this.prefecture;
  }
  
  public void setPrefecture(String prefecture){
	  
	  this.prefecture = prefecture;
  }
  
  public String getHobby(){
	  
	  return this.hobby;
  }
  
  public void setHobby(String hobby){
	  
	  this.hobby = hobby;
  }
}
