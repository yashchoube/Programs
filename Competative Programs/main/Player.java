package main;

public class Player {

	String name;
	int score;
	 
	public Player(String name, int score) {
		
		this.name = name;
		this.score = score;
	}

	@Override
	
	public String toString() {
		return "Player [name=" + name + ", score=" + score + "]";
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + score;
//		return result;
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Player other = (Player) obj;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (score != other.score)
//			return false;
//		return true;
//	}
	
	
}
