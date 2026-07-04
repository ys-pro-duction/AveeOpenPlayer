package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: loaded from: classes3.dex */
public final class S32 implements J72, InterfaceC7273p72 {
    public final Context B;
    public final InterfaceC9334wW1 C;
    public final C4498fF2 D;
    public final zzcaz E;
    public AbstractC9841yJ2 F;
    public boolean G;

    public S32(Context context, InterfaceC9334wW1 interfaceC9334wW1, C4498fF2 c4498fF2, zzcaz zzcazVar) {
        this.B = context;
        this.C = interfaceC9334wW1;
        this.D = c4498fF2;
        this.E = zzcazVar;
    }

    private final synchronized void a() {
        EnumC2160Rq2 enumC2160Rq2;
        EnumC2056Qq2 enumC2056Qq2;
        try {
            if (this.D.V) {
                if (this.C == null) {
                    return;
                }
                if (zzt.zzA().b(this.B)) {
                    zzcaz zzcazVar = this.E;
                    String str = zzcazVar.C + "." + zzcazVar.D;
                    IF2 if2 = this.D.X;
                    String strA = if2.a();
                    if (if2.b() == 1) {
                        enumC2056Qq2 = EnumC2056Qq2.VIDEO;
                        enumC2160Rq2 = EnumC2160Rq2.DEFINED_BY_JAVASCRIPT;
                    } else {
                        C4498fF2 c4498fF2 = this.D;
                        EnumC2056Qq2 enumC2056Qq22 = EnumC2056Qq2.HTML_DISPLAY;
                        enumC2160Rq2 = c4498fF2.f == 1 ? EnumC2160Rq2.ONE_PIXEL : EnumC2160Rq2.BEGIN_TO_RENDER;
                        enumC2056Qq2 = enumC2056Qq22;
                    }
                    AbstractC9841yJ2 abstractC9841yJ2A = zzt.zzA().a(str, this.C.j(), "", "javascript", strA, enumC2160Rq2, enumC2056Qq2, this.D.n0);
                    this.F = abstractC9841yJ2A;
                    Object obj = this.C;
                    if (abstractC9841yJ2A != null) {
                        zzt.zzA().g(this.F, (View) obj);
                        this.C.e0(this.F);
                        zzt.zzA().d(this.F);
                        this.G = true;
                        this.C.U("onSdkLoaded", new C2407Ua());
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC7273p72
    public final synchronized void zzq() {
        InterfaceC9334wW1 interfaceC9334wW1;
        try {
            if (!this.G) {
                a();
            }
            if (!this.D.V || this.F == null || (interfaceC9334wW1 = this.C) == null) {
                return;
            }
            interfaceC9334wW1.U("onSdkImpression", new C2407Ua());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.J72
    public final synchronized void zzr() {
        if (this.G) {
            return;
        }
        a();
    }
}
