package com.daaw;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: renamed from: com.daaw.fp3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4668fp3 implements InterfaceC3822cp3 {
    public final int a;
    public MediaCodecInfo[] b;

    public C4668fp3(boolean z, boolean z2) {
        int i = 1;
        if (!z && !z2) {
            i = 0;
        }
        this.a = i;
    }

    @Override // com.daaw.InterfaceC3822cp3
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.daaw.InterfaceC3822cp3
    public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public final void c() {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
    }

    @Override // com.daaw.InterfaceC3822cp3
    public final int zza() {
        c();
        return this.b.length;
    }

    @Override // com.daaw.InterfaceC3822cp3
    public final MediaCodecInfo zzb(int i) {
        c();
        return this.b[i];
    }

    @Override // com.daaw.InterfaceC3822cp3
    public final boolean zze() {
        return true;
    }
}
