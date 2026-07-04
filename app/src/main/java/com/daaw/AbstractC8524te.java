package com.daaw;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: com.daaw.te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8524te extends AbstractC6851ne {
    public static C0746Eg1 v = new C0746Eg1();
    public static C10217zg1 w = new C10217zg1();
    public static C10217zg1 x = new C10217zg1();
    public static C10217zg1 y = new C10217zg1();
    public static C0321Ag1 z = new C0321Ag1();
    public static C9938yg1 A = new C9938yg1();
    public static C0321Ag1 B = new C0321Ag1();

    public AbstractC8524te(View view, boolean z2) {
        super(view, 0, z2);
    }

    public static void R(TextView[] textViewArr, Context context) {
        boolean zL = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.L(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().p(context), "pref_toolButtonsShowTexts", true);
        for (TextView textView : textViewArr) {
            if (textView != null) {
                textView.setVisibility(zL ? 0 : 8);
            }
        }
    }

    public AbstractC8524te(View view) {
        super(view, 0, true);
    }
}
