package com.daaw;

import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.internal.ads.zzbvg;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.tv2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8611tv2 implements AppEventListener, S82, J72, U62, InterfaceC7273p72, zza, R62, InterfaceC6162l82, InterfaceC6157l72, InterfaceC1974Qb2 {
    public final InterfaceC6483mI2 J;
    public final AtomicReference B = new AtomicReference();
    public final AtomicReference C = new AtomicReference();
    public final AtomicReference D = new AtomicReference();
    public final AtomicReference E = new AtomicReference();
    public final AtomicReference F = new AtomicReference();
    public final AtomicBoolean G = new AtomicBoolean(true);
    public final AtomicBoolean H = new AtomicBoolean(false);
    public final AtomicBoolean I = new AtomicBoolean(false);
    public final BlockingQueue K = new ArrayBlockingQueue(((Integer) zzba.zzc().b(AbstractC9820yE1.C8)).intValue());

    public C8611tv2(InterfaceC6483mI2 interfaceC6483mI2) {
        this.J = interfaceC6483mI2;
    }

    private final void R() {
        if (this.H.get() && this.I.get()) {
            for (final Pair pair : this.K) {
                AbstractC6742nD2.a(this.C, new InterfaceC6463mD2() { // from class: com.daaw.av2
                    @Override // com.daaw.InterfaceC6463mD2
                    public final void zza(Object obj) {
                        Pair pair2 = pair;
                        ((zzcb) obj).zzc((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.K.clear();
            this.G.set(false);
        }
    }

    public final void A(zzcb zzcbVar) {
        this.C.set(zzcbVar);
        this.H.set(true);
        R();
    }

    public final void G(zzci zzciVar) {
        this.F.set(zzciVar);
    }

    @Override // com.daaw.U62
    public final void P(final zze zzeVar) {
        AbstractC6742nD2.a(this.B, new InterfaceC6463mD2() { // from class: com.daaw.bv2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((zzbh) obj).zzf(zzeVar);
            }
        });
        AbstractC6742nD2.a(this.B, new InterfaceC6463mD2() { // from class: com.daaw.cv2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((zzbh) obj).zze(zzeVar.zza);
            }
        });
        AbstractC6742nD2.a(this.E, new InterfaceC6463mD2() { // from class: com.daaw.dv2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((zzbk) obj).zzb(zzeVar);
            }
        });
        this.G.set(false);
        this.K.clear();
    }

    public final synchronized zzbh a() {
        return (zzbh) this.B.get();
    }

    @Override // com.daaw.InterfaceC6157l72
    public final void d(final zze zzeVar) {
        AbstractC6742nD2.a(this.F, new InterfaceC6463mD2() { // from class: com.daaw.kv2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((zzci) obj).zzd(zzeVar);
            }
        });
    }

    @Override // com.daaw.InterfaceC6162l82
    public final void e(final zzs zzsVar) {
        AbstractC6742nD2.a(this.D, new InterfaceC6463mD2() { // from class: com.daaw.sv2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((zzdg) obj).zze(zzsVar);
            }
        });
    }

    @Override // com.daaw.InterfaceC1974Qb2
    public final void i0() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.U9)).booleanValue()) {
            AbstractC6742nD2.a(this.B, C8053rv2.a);
        }
        AbstractC6742nD2.a(this.F, new InterfaceC6463mD2() { // from class: com.daaw.Zu2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((zzci) obj).zzb();
            }
        });
    }

    public final synchronized zzcb l() {
        return (zzcb) this.C.get();
    }

    public final void m(zzbh zzbhVar) {
        this.B.set(zzbhVar);
    }

    public final void o(zzbk zzbkVar) {
        this.E.set(zzbkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.U9)).booleanValue()) {
            return;
        }
        AbstractC6742nD2.a(this.B, C8053rv2.a);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (!this.G.get()) {
            AbstractC6742nD2.a(this.C, new InterfaceC6463mD2() { // from class: com.daaw.lv2
                @Override // com.daaw.InterfaceC6463mD2
                public final void zza(Object obj) {
                    ((zzcb) obj).zzc(str, str2);
                }
            });
            return;
        }
        if (!this.K.offer(new Pair(str, str2))) {
            AbstractC4274eT1.zze("The queue for app events is full, dropping the new event.");
            InterfaceC6483mI2 interfaceC6483mI2 = this.J;
            if (interfaceC6483mI2 != null) {
                C6204lI2 c6204lI2B = C6204lI2.b("dae_action");
                c6204lI2B.a("dae_name", str);
                c6204lI2B.a("dae_data", str2);
                interfaceC6483mI2.a(c6204lI2B);
            }
        }
    }

    public final void r(zzdg zzdgVar) {
        this.D.set(zzdgVar);
    }

    @Override // com.daaw.S82
    public final void t0(C9267wF2 c9267wF2) {
        this.G.set(true);
        this.I.set(false);
    }

    @Override // com.daaw.R62
    public final void zza() {
        AbstractC6742nD2.a(this.B, new InterfaceC6463mD2() { // from class: com.daaw.Xu2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((zzbh) obj).zzd();
            }
        });
        AbstractC6742nD2.a(this.F, new InterfaceC6463mD2() { // from class: com.daaw.Yu2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((zzci) obj).zzc();
            }
        });
    }

    @Override // com.daaw.R62
    public final void zzb() {
        AbstractC6742nD2.a(this.B, new InterfaceC6463mD2() { // from class: com.daaw.mv2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((zzbh) obj).zzh();
            }
        });
    }

    @Override // com.daaw.R62
    public final void zzc() {
        AbstractC6742nD2.a(this.B, new InterfaceC6463mD2() { // from class: com.daaw.ov2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((zzbh) obj).zzj();
            }
        });
        AbstractC6742nD2.a(this.F, new InterfaceC6463mD2() { // from class: com.daaw.pv2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((zzci) obj).zzf();
            }
        });
        AbstractC6742nD2.a(this.F, new InterfaceC6463mD2() { // from class: com.daaw.qv2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((zzci) obj).zze();
            }
        });
    }

    @Override // com.daaw.InterfaceC7273p72
    public final void zzq() {
        AbstractC6742nD2.a(this.B, new InterfaceC6463mD2() { // from class: com.daaw.Wu2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((zzbh) obj).zzg();
            }
        });
    }

    @Override // com.daaw.J72
    public final synchronized void zzr() {
        AbstractC6742nD2.a(this.B, new InterfaceC6463mD2() { // from class: com.daaw.ev2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((zzbh) obj).zzi();
            }
        });
        AbstractC6742nD2.a(this.E, new InterfaceC6463mD2() { // from class: com.daaw.jv2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((zzbk) obj).zzc();
            }
        });
        this.I.set(true);
        R();
    }

    @Override // com.daaw.InterfaceC1974Qb2
    public final void zzs() {
        AbstractC6742nD2.a(this.B, new InterfaceC6463mD2() { // from class: com.daaw.nv2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((zzbh) obj).zzk();
            }
        });
    }

    @Override // com.daaw.R62
    public final void zze() {
    }

    @Override // com.daaw.R62
    public final void zzf() {
    }

    @Override // com.daaw.S82
    public final void v0(zzbvg zzbvgVar) {
    }

    @Override // com.daaw.R62
    public final void t(VP1 vp1, String str, String str2) {
    }
}
