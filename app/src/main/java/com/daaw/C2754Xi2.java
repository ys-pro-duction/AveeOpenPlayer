package com.daaw;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbvg;

/* JADX INFO: renamed from: com.daaw.Xi2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2754Xi2 implements S82, J72, U62, InterfaceC7273p72, zza, InterfaceC7392pa2 {
    public final C6454mB1 B;
    public boolean C = false;

    public C2754Xi2(C6454mB1 c6454mB1, TD2 td2) {
        this.B = c6454mB1;
        c6454mB1.c(2);
        if (td2 != null) {
            c6454mB1.c(1101);
        }
    }

    @Override // com.daaw.InterfaceC7392pa2
    public final void A(final LB1 lb1) {
        this.B.b(new InterfaceC6175lB1() { // from class: com.daaw.Vi2
            @Override // com.daaw.InterfaceC6175lB1
            public final void a(C5891kC1 c5891kC1) {
                c5891kC1.u(lb1);
            }
        });
        this.B.c(1104);
    }

    @Override // com.daaw.U62
    public final void P(zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.B.c(101);
                break;
            case 2:
                this.B.c(102);
                break;
            case 3:
                this.B.c(5);
                break;
            case 4:
                this.B.c(103);
                break;
            case 5:
                this.B.c(104);
                break;
            case 6:
                this.B.c(105);
                break;
            case 7:
                this.B.c(106);
                break;
            default:
                this.B.c(4);
                break;
        }
    }

    @Override // com.daaw.InterfaceC7392pa2
    public final void a0(final LB1 lb1) {
        this.B.b(new InterfaceC6175lB1() { // from class: com.daaw.Ui2
            @Override // com.daaw.InterfaceC6175lB1
            public final void a(C5891kC1 c5891kC1) {
                c5891kC1.u(lb1);
            }
        });
        this.B.c(1102);
    }

    @Override // com.daaw.InterfaceC7392pa2
    public final void h0(final LB1 lb1) {
        this.B.b(new InterfaceC6175lB1() { // from class: com.daaw.Wi2
            @Override // com.daaw.InterfaceC6175lB1
            public final void a(C5891kC1 c5891kC1) {
                c5891kC1.u(lb1);
            }
        });
        this.B.c(1103);
    }

    @Override // com.daaw.InterfaceC7392pa2
    public final void m(boolean z) {
        this.B.c(true != z ? 1108 : 1107);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.C) {
            this.B.c(8);
        } else {
            this.B.c(7);
            this.C = true;
        }
    }

    @Override // com.daaw.InterfaceC7392pa2
    public final void r(boolean z) {
        this.B.c(true != z ? 1106 : 1105);
    }

    @Override // com.daaw.S82
    public final void t0(final C9267wF2 c9267wF2) {
        this.B.b(new InterfaceC6175lB1() { // from class: com.daaw.Ti2
            @Override // com.daaw.InterfaceC6175lB1
            public final void a(C5891kC1 c5891kC1) {
                BB1 bb1 = (BB1) c5891kC1.n().k();
                TB1 tb1 = (TB1) c5891kC1.n().O().k();
                tb1.n(c9267wF2.b.b.b);
                bb1.o(tb1);
                c5891kC1.t(bb1);
            }
        });
    }

    @Override // com.daaw.InterfaceC7392pa2
    public final void zzh() {
        this.B.c(1109);
    }

    @Override // com.daaw.InterfaceC7273p72
    public final synchronized void zzq() {
        this.B.c(6);
    }

    @Override // com.daaw.J72
    public final void zzr() {
        this.B.c(3);
    }

    @Override // com.daaw.S82
    public final void v0(zzbvg zzbvgVar) {
    }
}
