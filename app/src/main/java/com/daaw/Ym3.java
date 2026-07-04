package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Ym3 implements InterfaceC4648fl3 {
    public final /* synthetic */ C3255an3 a;

    public /* synthetic */ Ym3(C3255an3 c3255an3, Wm3 wm3) {
        this.a = c3255an3;
    }

    @Override // com.daaw.InterfaceC4648fl3
    public final void a(Exception exc) {
        AbstractC3305ay2.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.a.C0.b(exc);
    }

    @Override // com.daaw.InterfaceC4648fl3
    public final void zzb() {
        C3255an3 c3255an3 = this.a;
        if (c3255an3.L0 != null) {
            c3255an3.L0.zzb();
        }
    }
}
