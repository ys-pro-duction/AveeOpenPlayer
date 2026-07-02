package com.daaw;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: renamed from: com.daaw.ep3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4379ep3 implements InterfaceC3822cp3 {
    public /* synthetic */ C4379ep3(AbstractC4100dp3 abstractC4100dp3) {
    }

    @Override // com.daaw.InterfaceC3822cp3
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.daaw.InterfaceC3822cp3
    public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.daaw.InterfaceC3822cp3
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.daaw.InterfaceC3822cp3
    public final MediaCodecInfo zzb(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.daaw.InterfaceC3822cp3
    public final boolean zze() {
        return false;
    }
}
