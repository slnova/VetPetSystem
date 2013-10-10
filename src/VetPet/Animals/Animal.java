package VetPet.Animals;

public abstract class Animal {
	
	protected String ID;
	protected String type;
	protected String Name;

	public Animal(String ID, String type, String Name)
	{
		this.ID = ID;
		this.type = type;
		this.Name = Name;

	}

	@Override
	public String toString()
	{
		
		return("");
		
	}
	
	protected String getID() {
		return ID;
	}

	protected void setID(String iD) {
		ID = iD;
	}

	protected String getType() {
		return type;
	}

	protected void setType(String type) {
		this.type = type;
	}

	protected String getName() {
		return Name;
	}

}
