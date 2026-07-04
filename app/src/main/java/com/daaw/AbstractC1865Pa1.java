package com.daaw;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* JADX INFO: renamed from: com.daaw.Pa1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1865Pa1 {

    /* JADX INFO: renamed from: com.daaw.Pa1$a */
    public static class a {
        public static boolean a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(context);
        }
        return true;
    }
}
