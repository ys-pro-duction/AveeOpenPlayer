package com.daaw;

import android.app.UiModeManager;
import android.content.Context;

/* JADX INFO: renamed from: com.daaw.lK2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6212lK2 {
    public static UiModeManager a;

    public static EJ2 a() {
        UiModeManager uiModeManager = a;
        if (uiModeManager == null) {
            return EJ2.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? EJ2.OTHER : EJ2.CTV : EJ2.MOBILE;
    }

    public static void b(Context context) {
        if (context != null) {
            a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
