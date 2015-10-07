package teameleven.smartbells_prototype0001;

import java.util.ArrayList;
import java.util.List;


/**
 * Base Routine Class. consists of a collection of Exercises, stored in a List, as well as a name.
 * Routines are collections of exercises that can be saved by the Android Application.
 *  Each routine will have a name, as well as at least 1 exercise.
 * Routines at this point have no cap to the number of Exercises that can be added to the Routine.
 * created : October 4th, 2015
 * @author Andrew Rabb
 */
public class Routine {
	/**************************					Attributes                 ********************************************/
	/**
	 * Name of the Routine. Used to differentiate between routines
	 */
	private String name;
	/**
	 * collection of Exercises that make up a routine. There must be at least 1 Exercise in each routine, though there could be many more.
	 */
	private List<Exercise> exercise = new ArrayList<Exercise>();
	/**************************					Constructors               ********************************************/
	/**
	 * Default Constructor
	 */
	public Routine(){}
	/**
	 * Constructor allowing Routine name input
	 * @param name : Name of routine to be created
	 */
	public Routine(String name){
		this.setName(name);
	}
	/**************************					Base Methods               ********************************************/
	/**
	 * retrieves the name of the Routine.
	 * @return : Routine Name
	 */
	public String getName() {
		return name;
	}
	/**
	 * retrieves the entire List of Exercises in the Routine
	 * @return : Collection<> of Exercises
	 */
	public List<Exercise> getExercise() {
		return exercise;
	}
	/**
	 * retrieves a specific Exercise from the Collection, based upon an integer index
	 * TODO should throw exception instead of returning null perhaps?
	 * @param index : index of the Exercise to be retrieved.
	 * @return Exercise from collection at index. will return null if Index out of Bounds
	 */
	public Exercise getExercise(int index){
		return exercise.get(index);
	}
	/**
	 * changes or updates the name of a routine.
	 * @param name : name to be updated with
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * allows importing of a collection of Exercises.
	 * @param exercises : Collection of Exercises
	 */
	public void setExercise(List<Exercise> exercises) {
		this.exercise = exercises;
	}
	/**
	 * changes or updates specified Exercise.
	 * TODO look into exception throwing / handling in Android for index out of bounds
	 * @param index : location of Exercise to be edited or updated
	 * @param exercise : Exercise to be inserted at location index
	 */
	public void setExercise(int index, Exercise exercise){
		this.exercise.set(index, exercise);
	}
	/* (non-Javadoc)
	 * returns the name of the routine, and the names of all the exercises included
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String tempString = ("Routine Name : " + this.getName() + "\n" + "Exercises: \n");

		for (int i=0; i < this.getExercise().size(); i++){
			tempString += "\t\t\t" +this.getExercise().get(i).toString();
			if(i%2 == 1){
				tempString += "\n";
			}
		}
		return tempString;
	}
}
