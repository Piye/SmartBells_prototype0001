package teameleven.smartbells_prototype0001;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Design extends Fragment implements View.OnClickListener {

    Button createButton;
    Button createExercise;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab_fragment_design, container, false);
        createButton = (Button) view.findViewById(R.id.design_routine);
        createButton.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.design_routine:
                Intent intent = new Intent(getActivity(), CreateRoutine.class);
                startActivity(intent);
            case R.id.design_exercise:
                //start exercise
        }


    }
}
