package com.daaw;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* JADX INFO: loaded from: classes3.dex */
public final class J92 implements AppEventListener, OnAdMetadataChangedListener, R62, zza, InterfaceC6162l82, InterfaceC7273p72, Z72, zzo, InterfaceC6157l72, InterfaceC1974Qb2 {
    public final H92 B = new H92(this, null);
    public C8611tv2 C;
    public C9734xv2 D;
    public CC2 E;
    public FE2 F;

    public static void A(Object obj, I92 i92) {
        if (obj != null) {
            i92.zza(obj);
        }
    }

    public final H92 a() {
        return this.B;
    }

    @Override // com.daaw.InterfaceC6157l72
    public final void d(final zze zzeVar) {
        A(this.F, new I92() { // from class: com.daaw.C92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((FE2) obj).d(zzeVar);
            }
        });
        A(this.C, new I92() { // from class: com.daaw.D92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((C8611tv2) obj).d(zzeVar);
            }
        });
    }

    @Override // com.daaw.InterfaceC6162l82
    public final void e(final zzs zzsVar) {
        A(this.C, new I92() { // from class: com.daaw.j92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((C8611tv2) obj).e(zzsVar);
            }
        });
        A(this.F, new I92() { // from class: com.daaw.k92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((FE2) obj).e(zzsVar);
            }
        });
        A(this.E, new I92() { // from class: com.daaw.l92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((CC2) obj).e(zzsVar);
            }
        });
    }

    @Override // com.daaw.InterfaceC1974Qb2
    public final void i0() {
        A(this.C, new I92() { // from class: com.daaw.u92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((C8611tv2) obj).i0();
            }
        });
        A(this.D, new I92() { // from class: com.daaw.z92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((C9734xv2) obj).i0();
            }
        });
        A(this.F, new I92() { // from class: com.daaw.A92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((FE2) obj).i0();
            }
        });
        A(this.E, new I92() { // from class: com.daaw.B92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((CC2) obj).i0();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        A(this.C, new I92() { // from class: com.daaw.U82
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((C8611tv2) obj).onAdClicked();
            }
        });
        A(this.D, new I92() { // from class: com.daaw.V82
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((C9734xv2) obj).onAdClicked();
            }
        });
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        A(this.F, new I92() { // from class: com.daaw.a92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((FE2) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(final String str, final String str2) {
        A(this.C, new I92() { // from class: com.daaw.g92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((C8611tv2) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.daaw.R62
    public final void t(final VP1 vp1, final String str, final String str2) {
        A(this.C, new I92() { // from class: com.daaw.d92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
            }
        });
        A(this.F, new I92() { // from class: com.daaw.f92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((FE2) obj).t(vp1, str, str2);
            }
        });
    }

    @Override // com.daaw.R62
    public final void zza() {
        A(this.C, new I92() { // from class: com.daaw.E92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((C8611tv2) obj).zza();
            }
        });
        A(this.F, new I92() { // from class: com.daaw.F92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((FE2) obj).zza();
            }
        });
    }

    @Override // com.daaw.R62
    public final void zzb() {
        A(this.C, new I92() { // from class: com.daaw.x92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((C8611tv2) obj).zzb();
            }
        });
        A(this.F, new I92() { // from class: com.daaw.y92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((FE2) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
        A(this.E, new I92() { // from class: com.daaw.s92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
        A(this.E, new I92() { // from class: com.daaw.Z82
            @Override // com.daaw.I92
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
        A(this.E, new I92() { // from class: com.daaw.r92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((CC2) obj).zzbu();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        A(this.E, new I92() { // from class: com.daaw.i92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((CC2) obj).zzbv();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
        A(this.E, new I92() { // from class: com.daaw.t92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((CC2) obj).zzbx();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(final int i) {
        A(this.E, new I92() { // from class: com.daaw.v92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((CC2) obj).zzby(i);
            }
        });
    }

    @Override // com.daaw.R62
    public final void zzc() {
        A(this.C, new I92() { // from class: com.daaw.b92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((C8611tv2) obj).zzc();
            }
        });
        A(this.F, new I92() { // from class: com.daaw.c92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((FE2) obj).zzc();
            }
        });
    }

    @Override // com.daaw.R62
    public final void zze() {
        A(this.C, new I92() { // from class: com.daaw.T82
            @Override // com.daaw.I92
            public final void zza(Object obj) {
            }
        });
        A(this.F, new I92() { // from class: com.daaw.e92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((FE2) obj).zze();
            }
        });
    }

    @Override // com.daaw.R62
    public final void zzf() {
        A(this.C, new I92() { // from class: com.daaw.W82
            @Override // com.daaw.I92
            public final void zza(Object obj) {
            }
        });
        A(this.F, new I92() { // from class: com.daaw.X82
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((FE2) obj).zzf();
            }
        });
    }

    @Override // com.daaw.Z72
    public final void zzg() {
        A(this.E, new I92() { // from class: com.daaw.w92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((CC2) obj).zzg();
            }
        });
    }

    @Override // com.daaw.InterfaceC7273p72
    public final void zzq() {
        A(this.C, new I92() { // from class: com.daaw.Y82
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((C8611tv2) obj).zzq();
            }
        });
    }

    @Override // com.daaw.InterfaceC1974Qb2
    public final void zzs() {
        A(this.C, new I92() { // from class: com.daaw.h92
            @Override // com.daaw.I92
            public final void zza(Object obj) {
                ((C8611tv2) obj).zzs();
            }
        });
    }
}
