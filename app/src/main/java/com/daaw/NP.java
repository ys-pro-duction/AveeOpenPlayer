package com.daaw;

import android.app.Fragment;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class NP {
    public static final e a;

    public static class a extends d {
        @Override // com.daaw.NP.e
        public void a(Fragment fragment, boolean z) {
            fragment.setUserVisibleHint(z);
        }
    }

    public static class b extends a {
    }

    public static class c extends b {
        @Override // com.daaw.NP.a, com.daaw.NP.e
        public void a(Fragment fragment, boolean z) {
            fragment.setUserVisibleHint(z);
        }
    }

    public static class d implements e {
    }

    public interface e {
        void a(Fragment fragment, boolean z);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            a = new c();
        } else if (i >= 23) {
            a = new b();
        } else {
            a = new a();
        }
    }

    public static void a(Fragment fragment, boolean z) {
        a.a(fragment, z);
    }
}
