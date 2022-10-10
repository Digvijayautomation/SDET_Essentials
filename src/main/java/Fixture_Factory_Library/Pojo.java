package Fixture_Factory_Library;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter //Lombok will create the getter , setter methods  and constructors using this anotationsand so many other things automatically 
@Setter
@AllArgsConstructor
public class Pojo {
	
		
		private int id;
		private String name;
		private String job;
		
		

		
		@Override
		public String toString() {
			return "Pojo [id=" + id + ", name=" + name + ", job=" + job + "]";
		}
	
	}
