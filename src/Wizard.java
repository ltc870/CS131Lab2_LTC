
/**
 * This class represents a wizard for
 * a D&D type game.
 * 
 * @author rkelley
 * @version 1.0
 *          Lab 2
 *          CS131ON
 *
 */
public class Wizard implements Lockable {

	private String name;
	private int health;
	private int key;
	boolean locked;

	/**
	 * End constructor to put object into consistent state
	 */
	public Wizard() {
		this.name = "";
		this.health = 0;
		this.key = 0;
		this.locked = false;

	}// end constructor

	/**
	 * Constructor to create object with common
	 * usage. This is the preferred constructor.
	 * 
	 * @param name
	 */
	public Wizard(String name, int health, int key, boolean locked) {
		this.setName(name);
		this.setHealth(health);
		this.setKey(key);
		this.locked = locked;
	}// end constructor

	/**
	 * This method processes the
	 * damage to the object when
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * 
	 * @param power
	 */
	public void takeDamage(int power) {
		if (!isLocked()) {
			int damage = getHealth() - power;
			System.out.println("You've taken " + power + " hit points!!");
			setHealth(damage);
		} else {
			System.out.println("No damage taken!!");
		}
	}// end takeDamage

	/**
	 * Getter for name
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}// end getName

	/**
	 * Setter for name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}// end setName

	/**
	 * Getter for health
	 * 
	 * @return
	 */
	public int getHealth() {
		return health;
	}// end getHealth

	/**
	 * Setter for health
	 * 
	 * @param health
	 */
	public void setHealth(int health) {
		this.health = health;
	}// end setHealth

	/**
	 * Getter for the key
	 * 
	 * @return
	 */
	public int getKey() {
		return key;
	}// end getKey

	/**
	 * Setter for the key
	 * 
	 * @param key
	 */
	@Override
	public void setKey(int key) {
		if ((this.key != key) && (key > 0)) {
			this.key = key;
		} else {
			System.out.println("key not set");
		}
	}// end setKey

	@Override
	public boolean isLocked() {
		return locked;
	}

	@Override
	public void lock(int key) {
		if (this.key == key) {
			locked = true;
		} else {
			locked = false;
		}
	}

	@Override
	public void unlock(int key) {
		if (this.key == key) {
			locked = false;
		} else {
			locked = true;
		}
	}

	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}// end toString

}// end class
