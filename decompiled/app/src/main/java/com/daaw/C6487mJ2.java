package com.daaw;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.mJ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6487mJ2 {
    public final Context a;
    public final Executor b;
    public final C5680jT1 c;
    public final WI2 d;

    public C6487mJ2(Context context, Executor executor, C5680jT1 c5680jT1, WI2 wi2) {
        this.a = context;
        this.b = executor;
        this.c = c5680jT1;
        this.d = wi2;
    }

    public final /* synthetic */ void a(String str) {
        this.c.zza(str);
    }

    public final /* synthetic */ void b(String str, TI2 ti2) {
        EI2 ei2A = DI2.a(this.a, 14);
        ei2A.zzh();
        ei2A.zzf(this.c.zza(str));
        if (ti2 == null) {
            this.d.b(ei2A.zzl());
        } else {
            ti2.a(ei2A);
            ti2.g();
        }
    }

    public final void c(final String str, final TI2 ti2) {
        if (WI2.a() && ((Boolean) AbstractC7307pF1.d.e()).booleanValue()) {
            this.b.execute(new Runnable() { // from class: com.daaw.lJ2
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.b(str, ti2);
                }
            });
        } else {
            this.b.execute(new Runnable() { // from class: com.daaw.kJ2
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.a(str);
                }
            });
        }
    }

    public final void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c((String) it.next(), null);
        }
    }
}
