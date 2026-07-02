package com.daaw;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Handler;
import android.preference.DialogPreference;
import android.preference.Preference;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Zn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2980Zn0 implements Preference.OnPreferenceClickListener {
    public final Activity a;
    public final List b;

    public C2980Zn0(Activity activity) {
        G10.g(activity, "activity");
        this.a = activity;
        String[] stringArray = activity.getResources().getStringArray(CC0.a);
        G10.f(stringArray, "getStringArray(...)");
        ArrayList arrayList = new ArrayList();
        int length = stringArray.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = stringArray[i];
            int i3 = i2 + 1;
            if (i2 < 2) {
                arrayList.add(str);
            }
            i++;
            i2 = i3;
        }
        this.b = arrayList;
    }

    public static final void c(Preference preference, C2980Zn0 c2980Zn0) {
        ListView listView;
        G10.g(c2980Zn0, "this$0");
        DialogPreference dialogPreference = preference instanceof DialogPreference ? (DialogPreference) preference : null;
        Dialog dialog = dialogPreference != null ? dialogPreference.getDialog() : null;
        AlertDialog alertDialog = dialog instanceof AlertDialog ? (AlertDialog) dialog : null;
        if (alertDialog == null || (listView = alertDialog.getListView()) == null) {
            return;
        }
        H00 h00Q = AbstractC8417tE0.q(0, listView.getChildCount());
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(h00Q, 10));
        Iterator it = h00Q.iterator();
        while (it.hasNext()) {
            arrayList.add(listView.getChildAt(((A00) it).b()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (c2980Zn0.d((View) obj)) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c2980Zn0.b((View) it2.next());
        }
    }

    public final void b(View view) {
        G10.g(view, "view");
        U8 u8 = view instanceof U8 ? (U8) view : null;
        if (u8 != null) {
            u8.setTypeface(null, 1);
        }
    }

    public final boolean d(View view) {
        G10.g(view, "child");
        List list = this.b;
        U8 u8 = view instanceof U8 ? (U8) view : null;
        return AbstractC2455Um.W(list, u8 != null ? u8.getText() : null);
    }

    @Override // android.preference.Preference.OnPreferenceClickListener
    public boolean onPreferenceClick(final Preference preference) {
        new Handler(this.a.getMainLooper()).post(new Runnable() { // from class: com.daaw.Yn0
            @Override // java.lang.Runnable
            public final void run() {
                C2980Zn0.c(preference, this);
            }
        });
        return false;
    }
}
