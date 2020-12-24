public class Question2 {
	String name;
	int height;
	public Question2(String name,int height) {
		this.name = name;
		this.height= height;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println(" Question 2 equals method executed s");
		if(obj instanceof Question2) {
			Question2 q = (Question2)obj;
			if(this.name.equals(q.name) && this.height==q.height)
				return true;
			else
				return false;
		}
		return false;
	}
	@Override
	public int hashCode() {
		//use state to override
		return (name+height).hashCode();
	}
	@Override
	public String toString() {
		return "Question2 [name=" + name + ", height=" + height + "]";
	}
}