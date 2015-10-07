package teameleven.smartbells_prototype0001;

/**
 * subclass of Routine. Contains the additional Attribute time-stamp. used to record when a routine has been completed.
 * A Workout is simply a Completed, thus time-stamped, Routine.
 * created : October 4th, 2015
 * @author Andrew Rabb
 */
public class Workout extends Routine {
	/**************************					Attributes                 ********************************************/
	/**
	 * record of the current time when the workout is created.
	 */
	private String timeStamp;
	/**
	 * retrieves the time-stamp of the created workout.
	 * @return Time-stamp of the Workout
	 */
	public String getTimeStamp() {
		return timeStamp;
	}
	/**************************					Constructors               ********************************************/
	/**
	 * Default Constructor
	 * TODO adjust for Android, including a timestamp from Android
	 */
	public Workout(){}
	/**************************					Base Methods               ********************************************/
	/**
	 * creates a Time-stamp.
	 * TODO create or alter this method to auto-timestamp the created object.
	 * @param timeStamp : time of object creation
	 */
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
}
