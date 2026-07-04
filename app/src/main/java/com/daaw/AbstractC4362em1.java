package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: renamed from: com.daaw.em1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4362em1 extends AbstractC9438ws {
    public static Intent l(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (AbstractC3527bm1.a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter, true != AbstractC3527bm1.a() ? 0 : 2);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
