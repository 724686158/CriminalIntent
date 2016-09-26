package com.example.admin.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by admin on 2016/9/26.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
