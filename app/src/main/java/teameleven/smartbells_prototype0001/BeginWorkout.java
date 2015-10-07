package teameleven.smartbells_prototype0001;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Jare on 2015-10-06.
 */
public class BeginWorkout extends Fragment implements View.OnClickListener {

        Button createCustomSession;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab_fragment_beginworkout, container, false);
        createCustomSession = (Button) view.findViewById(R.id.custom_session);
        createCustomSession.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.custom_session:
                Intent intent = new Intent(getActivity(), CreateCustomSession.class);
                startActivity(intent);

        }


    }

}
