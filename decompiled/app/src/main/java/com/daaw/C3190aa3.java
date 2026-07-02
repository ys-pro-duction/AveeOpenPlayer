package com.daaw;

import android.media.AudioAttributes;

/* JADX INFO: renamed from: com.daaw.aa3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3190aa3 {
    public final AudioAttributes a;

    public /* synthetic */ C3190aa3(C7965rd3 c7965rd3, AbstractC6716n73 abstractC6716n73) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = AbstractC9004vJ2.a;
        if (i >= 29) {
            AbstractC8980vD2.a(usage, 1);
        }
        if (i >= 32) {
            AS2.a(usage, 0);
        }
        this.a = usage.build();
    }
}
