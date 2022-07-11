package String;

class Age {
	private int date;
	private int month;
	private int year;

	public Age(int date, int month, int year) {
		this.date = date;
		this.month = month;
		this.year = year;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Age [date=" + date + ", month=" + month + ", year=" + year + "]";
	}
}

final class ImmutableStudent {
	private final int id;
	private final String name;
	private final Age age;

	public ImmutableStudent(int id, String name, Age passedAge) {
		this.id = id;
		this.name = name;
		Age cloneAge = new Age(passedAge.getDate(), passedAge.getMonth(), passedAge.getYear());
		//this.age = cloneAge;
		this.age = passedAge;
	}

	public int getId() {
		return id;
	}
	

	public String getName() {
		return name;
	}

	public Age getAge() {
		Age age1 = this.age;
		Age toPassed = new Age(age1.getDate(), age1.getMonth(), age1.getYear());
		return toPassed;
		//return age1;
	}

	@Override
	public String toString() {
		return "ImmutableStudent [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}

public class njkl {

	public static void main(String[] args) {
		Age passedAge = new Age(18, 07, 1994);
		ImmutableStudent s = new ImmutableStudent(101, "aaa", passedAge);
		
		passedAge.setYear(1993);
		System.out.println(s.getAge().getYear());
		
		//from here
		Age takenFromImmutableObject = s.getAge();
		System.out.println(takenFromImmutableObject.toString());
		takenFromImmutableObject.setYear(1992);
		System.out.println(takenFromImmutableObject.toString());
		
		System.out.println("Original immutable objectv: "+s.toString());
		
		Age takenFromImmutableObject1 = s.getAge();
		System.out.println(takenFromImmutableObject1.toString());
		System.out.println(takenFromImmutableObject1.getYear());
		System.out.println("Original immutable objectv: "+s.toString());
	}

}
