package com.daaw;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: renamed from: com.daaw.pK2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7328pK2 {
    public static int a = 2;

    public static void a(Context context) {
        context.registerReceiver(new C7049oK2(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int b() {
        if (AbstractC6212lK2.a() != EJ2.CTV) {
            return 2;
        }
        return a;
    }
}
