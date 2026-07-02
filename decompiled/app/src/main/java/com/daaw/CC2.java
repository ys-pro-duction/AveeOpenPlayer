package com.daaw;

import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class CC2 implements U62, Z72, MD2, zzo, InterfaceC6162l82, InterfaceC6157l72, InterfaceC1974Qb2 {
    public final C8148sG2 B;
    public final AtomicReference C = new AtomicReference();
    public final AtomicReference D = new AtomicReference();
    public final AtomicReference E = new AtomicReference();
    public final AtomicReference F = new AtomicReference();
    public final AtomicReference G = new AtomicReference();
    public final AtomicReference H = new AtomicReference();
    public CC2 I = null;

    public CC2(C8148sG2 c8148sG2) {
        this.B = c8148sG2;
    }

    public static CC2 l(CC2 cc2) {
        CC2 cc22 = new CC2(cc2.B);
        cc22.I = cc2;
        return cc22;
    }

    public final void A(EA1 ea1) {
        this.C.set(ea1);
    }

    public final void G(IA1 ia1) {
        this.E.set(ia1);
    }

    @Override // com.daaw.U62
    public final void P(final zze zzeVar) {
        CC2 cc2 = this.I;
        if (cc2 != null) {
            cc2.P(zzeVar);
        } else {
            AbstractC6742nD2.a(this.C, new InterfaceC6463mD2() { // from class: com.daaw.xC2
                @Override // com.daaw.InterfaceC6463mD2
                public final void zza(Object obj) {
                    ((EA1) obj).U1(zzeVar);
                }
            });
            AbstractC6742nD2.a(this.C, new InterfaceC6463mD2() { // from class: com.daaw.yC2
                @Override // com.daaw.InterfaceC6463mD2
                public final void zza(Object obj) {
                    ((EA1) obj).zzb(zzeVar.zza);
                }
            });
        }
    }

    @Override // com.daaw.MD2
    public final void a(MD2 md2) {
        this.I = (CC2) md2;
    }

    @Override // com.daaw.InterfaceC6157l72
    public final void d(final zze zzeVar) {
        CC2 cc2 = this.I;
        if (cc2 != null) {
            cc2.d(zzeVar);
        } else {
            AbstractC6742nD2.a(this.E, new InterfaceC6463mD2() { // from class: com.daaw.rC2
                @Override // com.daaw.InterfaceC6463mD2
                public final void zza(Object obj) {
                    ((IA1) obj).zzd(zzeVar);
                }
            });
        }
    }

    @Override // com.daaw.InterfaceC6162l82
    public final void e(final zzs zzsVar) {
        CC2 cc2 = this.I;
        if (cc2 != null) {
            cc2.e(zzsVar);
        } else {
            AbstractC6742nD2.a(this.H, new InterfaceC6463mD2() { // from class: com.daaw.nC2
                @Override // com.daaw.InterfaceC6463mD2
                public final void zza(Object obj) {
                    ((zzdg) obj).zze(zzsVar);
                }
            });
        }
    }

    @Override // com.daaw.InterfaceC1974Qb2
    public final void i0() {
        CC2 cc2 = this.I;
        if (cc2 != null) {
            cc2.i0();
        } else {
            AbstractC6742nD2.a(this.E, new InterfaceC6463mD2() { // from class: com.daaw.tC2
                @Override // com.daaw.InterfaceC6463mD2
                public final void zza(Object obj) {
                    ((IA1) obj).zzb();
                }
            });
        }
    }

    public final void m() {
        CC2 cc2 = this.I;
        if (cc2 != null) {
            cc2.m();
            return;
        }
        this.B.a();
        AbstractC6742nD2.a(this.D, new InterfaceC6463mD2() { // from class: com.daaw.uC2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                AbstractC6314li0.a(obj);
                throw null;
            }
        });
        AbstractC6742nD2.a(this.E, new InterfaceC6463mD2() { // from class: com.daaw.vC2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((IA1) obj).zzc();
            }
        });
    }

    public final void o(final BA1 ba1) {
        CC2 cc2 = this.I;
        if (cc2 != null) {
            cc2.o(ba1);
        } else {
            AbstractC6742nD2.a(this.C, new InterfaceC6463mD2() { // from class: com.daaw.sC2
                @Override // com.daaw.InterfaceC6463mD2
                public final void zza(Object obj) {
                    ((EA1) obj).b2(ba1);
                }
            });
        }
    }

    public final void r(zzo zzoVar) {
        this.G.set(zzoVar);
    }

    public final void t(zzdg zzdgVar) {
        this.H.set(zzdgVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
        CC2 cc2 = this.I;
        if (cc2 != null) {
            cc2.zzbu();
        } else {
            AbstractC6742nD2.a(this.G, new InterfaceC6463mD2() { // from class: com.daaw.qC2
                @Override // com.daaw.InterfaceC6463mD2
                public final void zza(Object obj) {
                    ((zzo) obj).zzbu();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        CC2 cc2 = this.I;
        if (cc2 != null) {
            cc2.zzbv();
            return;
        }
        AbstractC6742nD2.a(this.G, new InterfaceC6463mD2() { // from class: com.daaw.BC2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((zzo) obj).zzbv();
            }
        });
        AbstractC6742nD2.a(this.E, new InterfaceC6463mD2() { // from class: com.daaw.oC2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((IA1) obj).zzf();
            }
        });
        AbstractC6742nD2.a(this.E, new InterfaceC6463mD2() { // from class: com.daaw.pC2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((IA1) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
        CC2 cc2 = this.I;
        if (cc2 != null) {
            cc2.zzbx();
        } else {
            AbstractC6742nD2.a(this.G, new InterfaceC6463mD2() { // from class: com.daaw.AC2
                @Override // com.daaw.InterfaceC6463mD2
                public final void zza(Object obj) {
                    ((zzo) obj).zzbx();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(final int i) {
        CC2 cc2 = this.I;
        if (cc2 != null) {
            cc2.zzby(i);
        } else {
            AbstractC6742nD2.a(this.G, new InterfaceC6463mD2() { // from class: com.daaw.wC2
                @Override // com.daaw.InterfaceC6463mD2
                public final void zza(Object obj) {
                    ((zzo) obj).zzby(i);
                }
            });
        }
    }

    @Override // com.daaw.Z72
    public final void zzg() {
        CC2 cc2 = this.I;
        if (cc2 != null) {
            cc2.zzg();
        } else {
            AbstractC6742nD2.a(this.F, new InterfaceC6463mD2() { // from class: com.daaw.zC2
                @Override // com.daaw.InterfaceC6463mD2
                public final void zza(Object obj) {
                    ((Z72) obj).zzg();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.daaw.InterfaceC1974Qb2
    public final void zzs() {
    }
}
