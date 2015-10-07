package teameleven.smartbells_prototype0001;
/**
 * Base Exercise Class. Describes a Single Exercise, including the number of reps and sets in a basic performance of the exercise.
 * portion of the SmartBells Project, created by Team Eleven.
 * created : October 4th, 2015
 * @author Andrew Rabb
 */
public class Exercise {
	/**************************					Attributes                 ********************************************/
	/**
	 * specific Name of the Exercise
	 */
	private String name;
	/**
	 * Number of Repetitions in the basic exercise.
	 */
	private int reps;
	/**
	 * Number of Sets of Repetitions to be performed for one exercise.
	 * As an example, an exercise with 5 reps and 5 sets, will be performed 5 times for each set, or 25 times in total.
	 */
	private int sets;
	/**
	 * Resistance, or Weight used in the Exercise. Resistance is used to account for some exercises which do not have actual weights.
	 * The resistance is set when a workout is completed, and so should be null until saved into a Work out.
	 */
	private int resistance;
	/**************************					Constructors               ********************************************/
	/**
	 * Constructor, sets name of object
	 * @param name : name of the exercise to be created.
	 */
	public Exercise(String name) {
		this.setName(name);
	}
	/**
	 * Default constructor
	 */
	public Exercise() {}
	/**************************					Base Methods               ********************************************/
	/**
	 * retrieves the name of the exercise
	 * @return Exercise Name
	 */
	public String getName() {
		return name;
	}
	/**
	 * retrieves the number of Repetitions (reps) for the exercise.
	 * @return Exercise Repetitions (reps)
	 */
	public int getReps() {
		return reps;
	}
	/**
	 * retrieves the number of sets for the exercise
	 * @return Exercise Sets
	 */
	public int getSets() {
		return sets;
	}
	/**
	 * retrieves the Resistance of an exercise.
	 * @return Exercise Resistance
	 */
	public int getResistance() {
		return resistance;
	}
	/**
	 * changes or creates the Name of the Exercise
	 * @param name : name to be changed to
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * changes or sets the number of repetitions for the exercise
	 * @param reps : number of repetitions for the specific exercise.
	 */
	public void setReps(int reps) {
		this.reps = reps;
	}
	/**
	 * changes or sets the number of sets for the next exercise
	 * @param sets : number of sets for the specific exercise.
	 */
	public void setSets(int sets) {
		this.sets = sets;
	}
	/**
	 * changes or sets the resistance for an exercise.
	 * @param resistance : resistance for a specific workout
	 */
	public void setResistance(int resistance) {
		this.resistance = resistance;
	}

	/* (non-Javadoc)'
	 * returns the Name of the Exercise
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return (this.name);
	}
}
