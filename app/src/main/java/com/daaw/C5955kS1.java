package com.daaw;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.daaw.kS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5955kS1 {
    public final InterfaceC5485im a;
    public final RS1 b;
    public final String e;
    public final String f;
    public final Object d = new Object();
    public long g = -1;
    public long h = -1;
    public long i = 0;
    public long j = -1;
    public long k = -1;
    public final LinkedList c = new LinkedList();

    public C5955kS1(InterfaceC5485im interfaceC5485im, RS1 rs1, String str, String str2) {
        this.a = interfaceC5485im;
        this.b = rs1;
        this.e = str;
        this.f = str2;
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.d) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.e);
                bundle.putString("slotid", this.f);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.j);
                bundle.putLong("tresponse", this.k);
                bundle.putLong("timp", this.g);
                bundle.putLong("tload", this.h);
                bundle.putLong("pcc", this.i);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C5676jS1) it.next()).b());
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final String c() {
        return this.e;
    }

    public final void d() {
        synchronized (this.d) {
            try {
                if (this.k != -1) {
                    C5676jS1 c5676jS1 = new C5676jS1(this);
                    c5676jS1.d();
                    this.c.add(c5676jS1);
                    this.i++;
                    this.b.e();
                    this.b.d(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.d) {
            try {
                if (this.k != -1 && !this.c.isEmpty()) {
                    C5676jS1 c5676jS1 = (C5676jS1) this.c.getLast();
                    if (c5676jS1.a() == -1) {
                        c5676jS1.c();
                        this.b.d(this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.d) {
            try {
                if (this.k != -1 && this.g == -1) {
                    this.g = this.a.b();
                    this.b.d(this);
                }
                this.b.f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.d) {
            this.b.g();
        }
    }

    public final void h(boolean z) {
        synchronized (this.d) {
            try {
                if (this.k != -1) {
                    this.h = this.a.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.d) {
            this.b.h();
        }
    }

    public final void j(zzl zzlVar) {
        synchronized (this.d) {
            long jB = this.a.b();
            this.j = jB;
            this.b.i(zzlVar, jB);
        }
    }

    public final void k(long j) {
        synchronized (this.d) {
            try {
                this.k = j;
                if (j != -1) {
                    this.b.d(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
