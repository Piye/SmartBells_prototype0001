package teameleven.smartbells_prototype0001;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jare on 2015-10-07.
 */
public class CreateExercise extends AppCompatActivity {

    Exercise exercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_exercise);
    }

    //Add Name
    public void addExerciseName() {
        TextView name = (TextView) findViewById(R.id.editExNameText);
        //Call setName() in Routine class
        exercise.setName(name.getText().toString());
    }

    //Add Increase Per Session
    public void addIncreasePerSession() {
        TextView repsText = (TextView) findViewById(R.id.editIncreasePerSessionText);
        //call set method in exercise class
        //exercise.set

    }

    /* BUTTONS */

    //SAVE new Routine to database
    public void saveExercise(View view) {
        // ADD Everything
       /*  addExerciseName();

        */

        //Back to menu
        Toast.makeText(this, "Nothing was added.", Toast.LENGTH_LONG).show();
        CreateExercise.this.finish();

    }

    //Cancel - back to menu
    public void cancelCreateExercise(View view) {
        CreateExercise.this.finish();
    }
}
