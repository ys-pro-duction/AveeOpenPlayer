package com.daaw;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* JADX INFO: renamed from: com.daaw.xq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9707xq {

    /* JADX INFO: renamed from: com.daaw.xq$a */
    public static class a {
        public static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        public static void b(Configuration configuration, C5163hd0 c5163hd0) {
            configuration.setLocales((LocaleList) c5163hd0.i());
        }
    }

    public static C5163hd0 a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? C5163hd0.j(a.a(configuration)) : C5163hd0.a(configuration.locale);
    }
}
