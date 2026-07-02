package com.daaw;

import android.app.Activity;
import com.daaw.C10217zg1;
import com.daaw.avee.MainActivity;
import com.daaw.avee.SettingsActivity;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7110oa {
    public List a = new LinkedList();

    /* JADX INFO: renamed from: com.daaw.oa$a */
    public class a implements C10217zg1.a {
        public a() {
        }

        @Override // com.daaw.C10217zg1.a
        public void invoke(Object obj) {
            MainActivity mainActivityE1 = MainActivity.e1();
            if (mainActivityE1 != null) {
                mainActivityE1.recreate();
            }
        }
    }

    public C7110oa() {
        SettingsActivity.C.b(new a(), this.a);
    }

    public static int a(Activity activity) {
        switch (AbstractC0405Bb1.w(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().O(activity, "pref_appTheme", "0"))) {
            case 1:
                return RD0.b;
            case 2:
                return RD0.c;
            case 3:
                return RD0.d;
            case 4:
                return RD0.e;
            case 5:
                return RD0.f;
            case 6:
                return RD0.g;
            case 7:
                return RD0.h;
            case 8:
                return RD0.i;
            case 9:
                return RD0.j;
            default:
                return RD0.a;
        }
    }
}
