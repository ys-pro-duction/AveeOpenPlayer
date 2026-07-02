package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class RS1 implements InterfaceC2717Wz1 {
    public final zzg b;
    public final PS1 d;
    public final Object a = new Object();
    public final HashSet e = new HashSet();
    public final HashSet f = new HashSet();
    public boolean g = false;
    public final QS1 c = new QS1();

    public RS1(String str, zzg zzgVar) {
        this.d = new PS1(str, zzgVar);
        this.b = zzgVar;
    }

    public final int a() {
        int iA;
        synchronized (this.a) {
            iA = this.d.a();
        }
        return iA;
    }

    public final C5955kS1 b(InterfaceC5485im interfaceC5485im, String str) {
        return new C5955kS1(interfaceC5485im, this, this.c.a(), str);
    }

    public final String c() {
        return this.c.b();
    }

    public final void d(C5955kS1 c5955kS1) {
        synchronized (this.a) {
            this.e.add(c5955kS1);
        }
    }

    public final void e() {
        synchronized (this.a) {
            this.d.c();
        }
    }

    public final void f() {
        synchronized (this.a) {
            this.d.d();
        }
    }

    public final void g() {
        synchronized (this.a) {
            this.d.e();
        }
    }

    public final void h() {
        synchronized (this.a) {
            this.d.f();
        }
    }

    public final void i(zzl zzlVar, long j) {
        synchronized (this.a) {
            this.d.g(zzlVar, j);
        }
    }

    public final void j() {
        synchronized (this.a) {
            this.d.h();
        }
    }

    public final void k(HashSet hashSet) {
        synchronized (this.a) {
            this.e.addAll(hashSet);
        }
    }

    public final boolean l() {
        return this.g;
    }

    public final Bundle m(Context context, C7591qG2 c7591qG2) {
        HashSet hashSet = new HashSet();
        synchronized (this.a) {
            hashSet.addAll(this.e);
            this.e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.d.b(context, this.c.b()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.f.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C5955kS1) it2.next()).a());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        c7591qG2.b(hashSet);
        return bundle;
    }

    @Override // com.daaw.InterfaceC2717Wz1
    public final void zza(boolean z) {
        long jA = zzt.zzB().a();
        if (!z) {
            this.b.zzt(jA);
            this.b.zzK(this.d.d);
            return;
        }
        if (jA - this.b.zzd() > ((Long) zzba.zzc().b(AbstractC9820yE1.S0)).longValue()) {
            this.d.d = -1;
        } else {
            this.d.d = this.b.zzc();
        }
        this.g = true;
    }
}
