package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: renamed from: com.daaw.dd2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4040dd2 implements J72, zzo, InterfaceC7273p72 {
    public final Context B;
    public final InterfaceC9334wW1 C;
    public final C4498fF2 D;
    public final zzcaz E;
    public final AB1 F;
    public AbstractC9841yJ2 G;

    public C4040dd2(Context context, InterfaceC9334wW1 interfaceC9334wW1, C4498fF2 c4498fF2, zzcaz zzcazVar, AB1 ab1) {
        this.B = context;
        this.C = interfaceC9334wW1;
        this.D = c4498fF2;
        this.E = zzcazVar;
        this.F = ab1;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        if (this.G == null || this.C == null) {
            return;
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.X4)).booleanValue()) {
            return;
        }
        this.C.U("onSdkImpression", new C2407Ua());
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int i) {
        this.G = null;
    }

    @Override // com.daaw.InterfaceC7273p72
    public final void zzq() {
        if (this.G == null || this.C == null) {
            return;
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.X4)).booleanValue()) {
            this.C.U("onSdkImpression", new C2407Ua());
        }
    }

    @Override // com.daaw.J72
    public final void zzr() {
        EnumC2160Rq2 enumC2160Rq2;
        EnumC2056Qq2 enumC2056Qq2;
        AB1 ab1 = this.F;
        if ((ab1 == AB1.REWARD_BASED_VIDEO_AD || ab1 == AB1.INTERSTITIAL || ab1 == AB1.APP_OPEN) && this.D.V && this.C != null) {
            if (zzt.zzA().b(this.B)) {
                zzcaz zzcazVar = this.E;
                String str = zzcazVar.C + "." + zzcazVar.D;
                IF2 if2 = this.D.X;
                String strA = if2.a();
                if (if2.b() == 1) {
                    enumC2056Qq2 = EnumC2056Qq2.VIDEO;
                    enumC2160Rq2 = EnumC2160Rq2.DEFINED_BY_JAVASCRIPT;
                } else {
                    enumC2160Rq2 = this.D.a0 == 2 ? EnumC2160Rq2.UNSPECIFIED : EnumC2160Rq2.BEGIN_TO_RENDER;
                    enumC2056Qq2 = EnumC2056Qq2.HTML_DISPLAY;
                }
                AbstractC9841yJ2 abstractC9841yJ2A = zzt.zzA().a(str, this.C.j(), "", "javascript", strA, enumC2160Rq2, enumC2056Qq2, this.D.n0);
                this.G = abstractC9841yJ2A;
                if (abstractC9841yJ2A != null) {
                    zzt.zzA().g(this.G, (View) this.C);
                    this.C.e0(this.G);
                    zzt.zzA().d(this.G);
                    this.C.U("onSdkLoaded", new C2407Ua());
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
    }
}
