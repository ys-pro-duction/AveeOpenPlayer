package com.daaw;

import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: renamed from: com.daaw.Rk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2136Rk2 extends UJ1 {
    public final /* synthetic */ Object B;
    public final /* synthetic */ String C;
    public final /* synthetic */ long D;
    public final /* synthetic */ EI2 E;
    public final /* synthetic */ BT1 F;
    public final /* synthetic */ C2242Sk2 G;

    public BinderC2136Rk2(C2242Sk2 c2242Sk2, Object obj, String str, long j, EI2 ei2, BT1 bt1) {
        this.G = c2242Sk2;
        this.B = obj;
        this.C = str;
        this.D = j;
        this.E = ei2;
        this.F = bt1;
    }

    @Override // com.daaw.VJ1
    public final void a(String str) {
        synchronized (this.B) {
            this.G.v(this.C, false, str, (int) (zzt.zzB().b() - this.D));
            this.G.l.b(this.C, "error");
            this.G.o.a(this.C, "error");
            WI2 wi2 = this.G.p;
            EI2 ei2 = this.E;
            ei2.o(str);
            ei2.zzf(false);
            wi2.b(ei2.zzl());
            this.F.b(Boolean.FALSE);
        }
    }

    @Override // com.daaw.VJ1
    public final void zzf() {
        synchronized (this.B) {
            this.G.v(this.C, true, "", (int) (zzt.zzB().b() - this.D));
            this.G.l.d(this.C);
            this.G.o.l(this.C);
            WI2 wi2 = this.G.p;
            EI2 ei2 = this.E;
            ei2.zzf(true);
            wi2.b(ei2.zzl());
            this.F.b(Boolean.TRUE);
        }
    }
}
