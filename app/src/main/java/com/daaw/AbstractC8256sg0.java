package com.daaw;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.sg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8256sg0 {
    public static boolean a() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu");
    }
}
