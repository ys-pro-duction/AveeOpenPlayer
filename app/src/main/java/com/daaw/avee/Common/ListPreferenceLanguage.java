package com.daaw.avee.Common;

import android.content.Context;
import android.util.AttributeSet;
import com.daaw.C5163hd0;
import com.daaw.Z8;

/* JADX INFO: loaded from: classes.dex */
public class ListPreferenceLanguage extends ListPreferenceCompat {
    public ListPreferenceLanguage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void a(String str) {
        if (str.equals("en") && Z8.o().f()) {
            return;
        }
        Z8.L(C5163hd0.c(str));
    }

    @Override // com.daaw.avee.Common.ListPreferenceCompat, android.preference.ListPreference
    public void setValue(String str) {
        super.setValue(str);
        a(str);
    }

    public ListPreferenceLanguage(Context context) {
        super(context);
    }
}
