package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import com.daaw.AbstractC4274eT1;
import com.daaw.AbstractC7506py0;
import com.google.android.gms.ads.mediation.NetworkExtras;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzdw {
    public Date g;
    public String h;
    public String k;
    public String l;
    public boolean n;
    public String o;
    public final HashSet a = new HashSet();
    public final Bundle b = new Bundle();
    public final HashMap c = new HashMap();
    public final HashSet d = new HashSet();
    public final Bundle e = new Bundle();
    public final HashSet f = new HashSet();
    public final List i = new ArrayList();
    public int j = -1;
    public int m = -1;
    public int p = 60000;

    @Deprecated
    public final void zzA(int i) {
        this.j = i;
    }

    public final void zzB(int i) {
        this.p = i;
    }

    @Deprecated
    public final void zzC(boolean z) {
        this.n = z;
    }

    public final void zzD(List list) {
        this.i.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                AbstractC4274eT1.zzj("neighboring content URL should not be null or empty");
            } else {
                this.i.add(str);
            }
        }
    }

    public final void zzE(String str) {
        this.k = str;
    }

    public final void zzF(String str) {
        this.l = str;
    }

    @Deprecated
    public final void zzG(boolean z) {
        this.m = z ? 1 : 0;
    }

    public final void zzp(String str) {
        this.f.add(str);
    }

    public final void zzq(Class cls, Bundle bundle) {
        if (this.b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.b.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        Bundle bundle2 = this.b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        AbstractC7506py0.l(bundle2);
        bundle2.putBundle(cls.getName(), bundle);
    }

    public final void zzr(String str, String str2) {
        this.e.putString(str, str2);
    }

    public final void zzs(String str) {
        this.a.add(str);
    }

    public final void zzt(Class cls, Bundle bundle) {
        this.b.putBundle(cls.getName(), bundle);
    }

    @Deprecated
    public final void zzu(NetworkExtras networkExtras) {
        this.c.put(networkExtras.getClass(), networkExtras);
    }

    public final void zzv(String str) {
        this.d.add(str);
    }

    public final void zzw(String str) {
        this.d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final void zzx(String str) {
        this.o = str;
    }

    @Deprecated
    public final void zzy(Date date) {
        this.g = date;
    }

    public final void zzz(String str) {
        this.h = str;
    }
}
