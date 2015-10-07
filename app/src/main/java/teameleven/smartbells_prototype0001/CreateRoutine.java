package teameleven.smartbells_prototype0001;

/**
 * Created by Jarret on 2015-10-05.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CreateRoutine extends AppCompatActivity {

    Routine routine;
    private Spinner exerciseSpinner;
    int numberOfGroups = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_routine);
        addListenerOnSpinnerExerciseSelection();
        routine = new Routine( );

    }

    //Add Name
    public void addName() {
        TextView name = (TextView) findViewById(R.id.editNameText);
        //Call setName() in Routine class
        routine.setName(name.getText().toString());
    }

    //Set Groups

    public void setGroups(View view) {
        //Set the Number of Exercise Groups you want to create in this routine

        numberOfGroups++;

        for (int i = 1; i <= numberOfGroups; i++) {

        }

    }

    //Add Excercise
    public void addListenerOnSpinnerExerciseSelection() {

        exerciseSpinner = (Spinner) findViewById(R.id.exerciseSpinner);
        exerciseSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String exercise = String.valueOf(exerciseSpinner.getSelectedItem());
                //TextView categoryText = (TextView) findViewById(R.id.editCategoryText);
                //categoryText.setText(category);
                //routine.setExercise(exercise);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //Do Nothing
            }
        });
    }

    //Add Reps Per Set
    public void addRepsPerSet() {
        TextView repsText = (TextView) findViewById(R.id.editRepsText);
        //call set method in routine class

    }

    //Add Number of Sets
    public void addNumberOfSets() {
        TextView setsText = (TextView) findViewById(R.id.editSetsText);
        //call set method in routine class
    }

    //SAVE new Routine to database
    public void saveRoutine(View view) {
       // ADD Everything
       /*  addName();

        */

        //Back to menu
        Toast.makeText(this, "Add not successful.", Toast.LENGTH_LONG).show();
        CreateRoutine.this.finish();

    }

    //Cancel - back to menu
    public void cancelCreateRoutine(View view) {
        CreateRoutine.this.finish();
    }

}
