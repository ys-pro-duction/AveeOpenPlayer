package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.daaw.oK2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7049oK2 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
            int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
            if (intExtra == 0) {
                AbstractC7328pK2.a = 1;
            } else if (intExtra == 1) {
                AbstractC7328pK2.a = 2;
            }
        }
    }
}
