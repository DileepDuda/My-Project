package vtalent_Practise;

import java.util.*;

class StudentEx
{
	int Rollno;
	String Name,CollegeName,Address;
	char Batch;
	

	StudentEx(int Rollno,String Name,String Address,String CollegeName, char Batch)  //creating constructor
		{
		this.Rollno= Rollno;
		this.Name= Name;
		this.Batch=Batch;
		this.CollegeName= CollegeName;
		this.Address= Address;
		
}


    public class StudentEx1 {

	public static void main(String[] args) {
		List<StudentEx> list = new ArrayList<>();
		
		StudentEx Obj1 = new StudentEx(1,"Dileep","Globel Group of colleges","Nagaram",'A');
		StudentEx Obj2 = new StudentEx(1,"Madhu","Globel Group of colleges","Tenali",'A');
		StudentEx Obj3 = new StudentEx(1,"Lakshman","Globel Group of colleges","Manthani",'A');		
		StudentEx Obj4 = new StudentEx(1,"Narsing","Briliant college","Khammam",'B');
		StudentEx Obj5 = new StudentEx(1,"Seenu","Briliant college","Mancherial",'B');
		
		list.add(Obj1);
		list.add(Obj2);
		list.add(Obj3);
		list.add(Obj4);
		list.add(Obj5);
		
		
	

	for(StudentEx S:list)
	{
		System.out.println(S.Rollno+S.Name+" "+S.CollegeName+" "+S.Address+" "+S.Batch);
		
	}
}

}

}
