package teameleven.smartbells_prototype0001;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jare on 2015-10-06.
 */
public class CreateCustomSession extends AppCompatActivity {

    Routine routine;
    private Spinner exerciseSpinner;
    int numberOfGroups = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_custom_session);
        //addListenerOnSpinnerExerciseSelection();
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

    //Add Resistance
    public void addResistance() {
        //call set method
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
    public void saveSession(View view) {
        // ADD Everything
       /*  addName();

        */

        //Back to menu
        Toast.makeText(this, "Nothing was added.", Toast.LENGTH_LONG).show();
        CreateCustomSession.this.finish();

    }

    //Cancel - back to menu
    public void cancelCreateCustomSession(View view) {
        CreateCustomSession.this.finish();
    }

}
