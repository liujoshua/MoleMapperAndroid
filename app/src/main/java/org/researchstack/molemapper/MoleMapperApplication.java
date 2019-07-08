package org.researchstack.molemapper;

import android.app.Application;
import android.support.multidex.MultiDex;

import org.researchstack.skin.ResearchStack;

public class MoleMapperApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        MultiDex.install(this);

        ResearchStack.init(this, new MoleMapperResearchStack());
    }
}
