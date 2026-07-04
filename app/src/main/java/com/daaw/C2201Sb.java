package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.Sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2201Sb {
    public static final C2201Sb c = new C2201Sb(new int[]{2}, 2);
    public final int[] a;
    public final int b;

    public C2201Sb(int[] iArr, int i) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.a = new int[0];
        }
        this.b = i;
    }

    public static C2201Sb a(Context context) {
        return b(context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    public static C2201Sb b(Intent intent) {
        return (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? c : new C2201Sb(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0));
    }

    public boolean c(int i) {
        return Arrays.binarySearch(this.a, i) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2201Sb)) {
            return false;
        }
        C2201Sb c2201Sb = (C2201Sb) obj;
        return Arrays.equals(this.a, c2201Sb.a) && this.b == c2201Sb.b;
    }

    public int hashCode() {
        return this.b + (Arrays.hashCode(this.a) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", supportedEncodings=" + Arrays.toString(this.a) + "]";
    }
}
