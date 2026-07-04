package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: renamed from: com.daaw.Ev2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0807Ev2 {
    public final InterfaceC1742Nv2 a;
    public final String b;
    public zzdn c;

    public C0807Ev2(InterfaceC1742Nv2 interfaceC1742Nv2, String str) {
        this.a = interfaceC1742Nv2;
        this.b = str;
    }

    public final synchronized String a() {
        zzdn zzdnVar;
        try {
            zzdnVar = this.c;
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdnVar != null ? zzdnVar.zzg() : null;
    }

    public final synchronized String b() {
        zzdn zzdnVar;
        try {
            zzdnVar = this.c;
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdnVar != null ? zzdnVar.zzg() : null;
    }

    public final synchronized void d(zzl zzlVar, int i) {
        this.c = null;
        C1846Ov2 c1846Ov2 = new C1846Ov2(i);
        C0703Dv2 c0703Dv2 = new C0703Dv2(this);
        this.a.a(zzlVar, this.b, c1846Ov2, c0703Dv2);
    }

    public final synchronized boolean e() {
        return this.a.zza();
    }
}
