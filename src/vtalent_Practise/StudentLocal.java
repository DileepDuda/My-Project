package vtalent_Practise;

import java.util.*;

class StudentLoc
{
	int Rollno;
	String Name,Batch,CollegeName,Address;

	StudentLoc(int Rollno,String Name,String Batch,String CollegeName, String Address)  //creating constructor
		{
		this.Rollno= Rollno;
		this.Name= Name;
		this.Batch=Batch;
		this.CollegeName= CollegeName;
		this.Address= Address;
		
}


    public class StudentEx {

	public static void main(String[] args) {
		List<StudentLoc> list = new ArrayList<>();
		
		StudentLoc Obj1 = new StudentLoc(1,"Dileep","A","Globel Group of colleges","Nagaram");
		StudentLoc Obj2 = new StudentLoc(2,"Madhu","A","Globel Group of colleges","Tenali");
		StudentLoc Obj3 = new StudentLoc(3,"Lakshman","A","Globel Group of colleges","Manthani");		
		StudentLoc Obj4 = new StudentLoc(4,"Narsing","B","Briliant college","Khammam");
		StudentLoc Obj5 = new StudentLoc(5,"Seenu","B","Briliant college","Mancherial");
		
		list.add(Obj1);
		list.add(Obj2);
		list.add(Obj3);
		list.add(Obj4);
		list.add(Obj5);
		
		
	

	for(StudentLoc S:list)
	{
		System.out.println(S.Rollno+" "+S.Batch+" "+S.CollegeName+" "+S.Address);
		
	}
}

}

}
