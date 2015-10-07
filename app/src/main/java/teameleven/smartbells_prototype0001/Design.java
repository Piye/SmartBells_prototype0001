package teameleven.smartbells_prototype0001;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Design extends Fragment implements View.OnClickListener {

    Button createRoutine;
    Button createExercise;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab_fragment_design, container, false);
        //Set up Button Listeners
        createRoutine = (Button) view.findViewById(R.id.design_routine);
        createRoutine.setOnClickListener(this);
        createExercise = (Button) view.findViewById(R.id.design_exercise);
        createExercise.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //START NEW INTENT for each button
            case R.id.design_routine:
                Intent intent = new Intent(getActivity(), CreateRoutine.class);
                startActivity(intent);
                break;
            case R.id.design_exercise:
                Intent intent2 = new Intent(getActivity(), CreateExercise.class);
                startActivity(intent2);
                break;
        }


    }
}
