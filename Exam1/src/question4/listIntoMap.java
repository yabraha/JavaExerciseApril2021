package question4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class listIntoMap {


		      private Integer id;
		      private String name;
		  
		    // create constructor for reference
		    public void Student(Integer id, String name){
		this.id = id;
		this.name = name;
		    }
		  
		    public Integer getId(){
		        return id;
		    }
		  
		    public String getName(){
		        return name;
		    }
		}
		 
		public class ListToMap {
		    
		    public static void main(String[] args){
		  
		        List<Student> students = new ArrayList<Student>();
		 
		        students.add(new Student(1, "Equar"));
		        students.add(new Student(2, "Amanuel"));
		        students.add(new Student(3, "Hawaz"));
		  
		        // create Map object
		        {
		        Map<Integer, String> studentsMap = new HashMap<Integer, String>();
		        // put every list element to the Map using the IDs as keys and the names as values
		 
		for(Student student : students)
		    }
		        Map<Integer, String> studentsMap;
				studentsMap.put(student.getId(), student.getName());
		
		    }
		    	return studentsMap;
	}

}
