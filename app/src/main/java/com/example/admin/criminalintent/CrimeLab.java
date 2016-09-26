package com.example.admin.criminalintent;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by admin on 2016/9/26.
 */
public class CrimeLab {
    private static CrimeLab ourInstance = new CrimeLab();
    private List<Crime> mCrimeList;

    public static CrimeLab getInstance() {
        return ourInstance;
    }

    private CrimeLab() {
        mCrimeList = new ArrayList<Crime>();
        for (int i = 0; i < 25; i++)
        {
            Crime crime = new Crime();
            crime.setTitle("Crime #" + i);
            crime.setSolved(i % 2 == 0);
            mCrimeList.add(crime);
        }
    }

    public List<Crime> getCrimeList() {
        return mCrimeList;
    }
    public Crime getCrime(UUID id){
        for (Crime crime : mCrimeList)
        {
            if (crime.getId().equals(id))
            {
                return crime;
            }
        }
        Log.d("CrimeLab", "can not find the crime");
        return null;
    }

    public static CrimeLab get(Context context)
    {
        if (ourInstance == null)
        {
            ourInstance = new CrimeLab();
        }
        else {
            ;
        }
        return ourInstance;
    }
}
