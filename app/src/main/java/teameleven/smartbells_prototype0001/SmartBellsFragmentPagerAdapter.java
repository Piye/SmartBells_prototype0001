package teameleven.smartbells_prototype0001;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;import java.lang.CharSequence;import java.lang.Override;import java.lang.String;

public class SmartBellsFragmentPagerAdapter extends FragmentPagerAdapter {

    private String[] tabTitles = {"   Dashboard  ","  BeginWorkout ","    Design     "};

    private Context context;

    public SmartBellsFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int i) {
    //Navigation to the Fragments
        if (i == 0) {
            return new Dashboard();
        }else if (i == 1) {
            return new BeginWorkout();
        }else if (i == 2) {
            return new Design();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

}
