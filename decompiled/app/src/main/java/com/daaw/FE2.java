package com.daaw;

import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class FE2 implements OnAdMetadataChangedListener, J72, U62, R62, InterfaceC6157l72, InterfaceC6162l82, MD2, InterfaceC1974Qb2 {
    public final C8148sG2 B;
    public final AtomicReference C = new AtomicReference();
    public final AtomicReference D = new AtomicReference();
    public final AtomicReference E = new AtomicReference();
    public final AtomicReference F = new AtomicReference();
    public final AtomicReference G = new AtomicReference();
    public final AtomicReference H = new AtomicReference();
    public final AtomicReference I = new AtomicReference();

    public FE2(C8148sG2 c8148sG2) {
        this.B = c8148sG2;
    }

    public final void A(InterfaceC5109hQ1 interfaceC5109hQ1) {
        this.F.set(interfaceC5109hQ1);
    }

    public final void G(WP1 wp1) {
        this.H.set(wp1);
    }

    @Override // com.daaw.U62
    public final void P(final zze zzeVar) {
        final int i = zzeVar.zza;
        AbstractC6742nD2.a(this.D, new InterfaceC6463mD2() { // from class: com.daaw.yE2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((InterfaceC10147zQ1) obj).zzf(zzeVar);
            }
        });
        AbstractC6742nD2.a(this.D, new InterfaceC6463mD2() { // from class: com.daaw.zE2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((InterfaceC10147zQ1) obj).zze(i);
            }
        });
        AbstractC6742nD2.a(this.F, new InterfaceC6463mD2() { // from class: com.daaw.AE2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((InterfaceC5109hQ1) obj).b(i);
            }
        });
    }

    public final void R(AQ1 aq1) {
        this.G.set(aq1);
    }

    @Override // com.daaw.MD2
    public final void a(MD2 md2) {
        throw null;
    }

    @Override // com.daaw.InterfaceC6157l72
    public final void d(final zze zzeVar) {
        AbstractC6742nD2.a(this.E, new InterfaceC6463mD2() { // from class: com.daaw.vE2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((InterfaceC9031vQ1) obj).o2(zzeVar);
            }
        });
        AbstractC6742nD2.a(this.E, new InterfaceC6463mD2() { // from class: com.daaw.wE2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((InterfaceC9031vQ1) obj).g(zzeVar.zza);
            }
        });
    }

    @Override // com.daaw.InterfaceC6162l82
    public final void e(final zzs zzsVar) {
        AbstractC6742nD2.a(this.I, new InterfaceC6463mD2() { // from class: com.daaw.qE2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((zzdg) obj).zze(zzsVar);
            }
        });
    }

    @Override // com.daaw.InterfaceC1974Qb2
    public final void i0() {
        AbstractC6742nD2.a(this.E, new InterfaceC6463mD2() { // from class: com.daaw.uE2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((InterfaceC9031vQ1) obj).zze();
            }
        });
    }

    public final void l(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.C.set(onAdMetadataChangedListener);
    }

    public final void m(zzdg zzdgVar) {
        this.I.set(zzdgVar);
    }

    public final void o(InterfaceC9031vQ1 interfaceC9031vQ1) {
        this.E.set(interfaceC9031vQ1);
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        AbstractC6742nD2.a(this.C, new InterfaceC6463mD2() { // from class: com.daaw.tE2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
            }
        });
    }

    public final void r(InterfaceC10147zQ1 interfaceC10147zQ1) {
        this.D.set(interfaceC10147zQ1);
    }

    @Override // com.daaw.R62
    public final void t(final VP1 vp1, final String str, final String str2) {
        AbstractC6742nD2.a(this.E, new InterfaceC6463mD2() { // from class: com.daaw.EE2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                VP1 vp12 = vp1;
                ((InterfaceC9031vQ1) obj).e1(new NQ1(vp12.zzc(), vp12.zzb()));
            }
        });
        AbstractC6742nD2.a(this.G, new InterfaceC6463mD2() { // from class: com.daaw.gE2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                VP1 vp12 = vp1;
                ((AQ1) obj).a3(new NQ1(vp12.zzc(), vp12.zzb()), str, str2);
            }
        });
        AbstractC6742nD2.a(this.F, new InterfaceC6463mD2() { // from class: com.daaw.lE2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((InterfaceC5109hQ1) obj).r1(vp1);
            }
        });
        AbstractC6742nD2.a(this.H, new InterfaceC6463mD2() { // from class: com.daaw.mE2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((WP1) obj).a3(vp1, str, str2);
            }
        });
    }

    @Override // com.daaw.R62
    public final void zza() {
        this.B.a();
        AbstractC6742nD2.a(this.E, new InterfaceC6463mD2() { // from class: com.daaw.BE2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((InterfaceC9031vQ1) obj).zzg();
            }
        });
        AbstractC6742nD2.a(this.F, new InterfaceC6463mD2() { // from class: com.daaw.CE2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((InterfaceC5109hQ1) obj).zzf();
            }
        });
    }

    @Override // com.daaw.R62
    public final void zzb() {
        AbstractC6742nD2.a(this.F, new InterfaceC6463mD2() { // from class: com.daaw.DE2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((InterfaceC5109hQ1) obj).zzh();
            }
        });
    }

    @Override // com.daaw.R62
    public final void zzc() {
        AbstractC6742nD2.a(this.E, new InterfaceC6463mD2() { // from class: com.daaw.nE2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((InterfaceC9031vQ1) obj).zzj();
            }
        });
        AbstractC6742nD2.a(this.F, new InterfaceC6463mD2() { // from class: com.daaw.oE2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((InterfaceC5109hQ1) obj).zzj();
            }
        });
        AbstractC6742nD2.a(this.E, new InterfaceC6463mD2() { // from class: com.daaw.pE2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((InterfaceC9031vQ1) obj).zzf();
            }
        });
    }

    @Override // com.daaw.R62
    public final void zze() {
        AbstractC6742nD2.a(this.F, new InterfaceC6463mD2() { // from class: com.daaw.xE2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((InterfaceC5109hQ1) obj).zzk();
            }
        });
    }

    @Override // com.daaw.R62
    public final void zzf() {
        AbstractC6742nD2.a(this.F, new InterfaceC6463mD2() { // from class: com.daaw.fE2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((InterfaceC5109hQ1) obj).zzl();
            }
        });
    }

    @Override // com.daaw.J72
    public final void zzr() {
        AbstractC6742nD2.a(this.D, new InterfaceC6463mD2() { // from class: com.daaw.rE2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((InterfaceC10147zQ1) obj).zzg();
            }
        });
        AbstractC6742nD2.a(this.F, new InterfaceC6463mD2() { // from class: com.daaw.sE2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((InterfaceC5109hQ1) obj).zzi();
            }
        });
    }

    @Override // com.daaw.InterfaceC1974Qb2
    public final void zzs() {
    }
}
