package com.afollestad.materialdialogssample;

import ir.iranapps.rtlizer.RtlApplication;
import ir.iranapps.rtlizer.RtlizerListener;

/**
 * Created by Khaled Bakhtiari on 12/27/2014.
 * <a href="http://about.me/kh.bakhtiari">
 */
public class App extends RtlApplication implements RtlizerListener {

    @Override
    public boolean isApplicationRtl() {
        return true;
    }
}
