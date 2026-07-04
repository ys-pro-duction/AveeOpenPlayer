package com.daaw;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.gu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4970gu1 implements Comparable {
    public final C7491pu1 B;
    public final int C;
    public final String D;
    public final int E;
    public final Object F;
    public final InterfaceC5526iu1 G;
    public Integer H;
    public C5249hu1 I;
    public boolean J;
    public C1214It1 K;
    public InterfaceC4691fu1 L;
    public final C1733Nt1 M;

    public AbstractC4970gu1(int i, String str, InterfaceC5526iu1 interfaceC5526iu1) {
        Uri uri;
        String host;
        this.B = C7491pu1.c ? new C7491pu1() : null;
        this.F = new Object();
        int iHashCode = 0;
        this.J = false;
        this.K = null;
        this.C = i;
        this.D = str;
        this.G = interfaceC5526iu1;
        this.M = new C1733Nt1();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.E = iHashCode;
    }

    public abstract C6096ku1 a(C3845cu1 c3845cu1);

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.H.intValue() - ((AbstractC4970gu1) obj).H.intValue();
    }

    public abstract void g(Object obj);

    public final void h(String str) {
        C5249hu1 c5249hu1 = this.I;
        if (c5249hu1 != null) {
            c5249hu1.b(this);
        }
        if (C7491pu1.c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC4402eu1(this, str, id));
            } else {
                this.B.a(str, id);
                this.B.b(toString());
            }
        }
    }

    public final void k() {
        InterfaceC4691fu1 interfaceC4691fu1;
        synchronized (this.F) {
            interfaceC4691fu1 = this.L;
        }
        if (interfaceC4691fu1 != null) {
            interfaceC4691fu1.zza(this);
        }
    }

    public final void l(C6096ku1 c6096ku1) {
        InterfaceC4691fu1 interfaceC4691fu1;
        synchronized (this.F) {
            interfaceC4691fu1 = this.L;
        }
        if (interfaceC4691fu1 != null) {
            interfaceC4691fu1.a(this, c6096ku1);
        }
    }

    public final void m(int i) {
        C5249hu1 c5249hu1 = this.I;
        if (c5249hu1 != null) {
            c5249hu1.c(this, i);
        }
    }

    public final void n(InterfaceC4691fu1 interfaceC4691fu1) {
        synchronized (this.F) {
            this.L = interfaceC4691fu1;
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.E));
        zzw();
        return "[ ] " + this.D + " " + "0x".concat(strValueOf) + " NORMAL " + this.H;
    }

    public final int zza() {
        return this.C;
    }

    public final int zzb() {
        return this.M.b();
    }

    public final int zzc() {
        return this.E;
    }

    public final C1214It1 zzd() {
        return this.K;
    }

    public final AbstractC4970gu1 zze(C1214It1 c1214It1) {
        this.K = c1214It1;
        return this;
    }

    public final AbstractC4970gu1 zzf(C5249hu1 c5249hu1) {
        this.I = c5249hu1;
        return this;
    }

    public final AbstractC4970gu1 zzg(int i) {
        this.H = Integer.valueOf(i);
        return this;
    }

    public final String zzj() {
        int i = this.C;
        String str = this.D;
        if (i == 0) {
            return str;
        }
        return Integer.toString(1) + "-" + str;
    }

    public final String zzk() {
        return this.D;
    }

    public Map zzl() {
        return Collections.EMPTY_MAP;
    }

    public final void zzm(String str) {
        if (C7491pu1.c) {
            this.B.a(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(C6933nu1 c6933nu1) {
        InterfaceC5526iu1 interfaceC5526iu1;
        synchronized (this.F) {
            interfaceC5526iu1 = this.G;
        }
        interfaceC5526iu1.a(c6933nu1);
    }

    public final void zzq() {
        synchronized (this.F) {
            this.J = true;
        }
    }

    public final boolean zzv() {
        boolean z;
        synchronized (this.F) {
            z = this.J;
        }
        return z;
    }

    public final boolean zzw() {
        synchronized (this.F) {
        }
        return false;
    }

    public byte[] zzx() {
        return null;
    }

    public final C1733Nt1 zzy() {
        return this.M;
    }
}
