package com.daaw;

import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class SK2 {
    public static volatile int e = 1;
    public final Context a;
    public final Executor b;
    public final AbstractC6963o11 c;
    public final boolean d;

    public SK2(Context context, Executor executor, AbstractC6963o11 abstractC6963o11, boolean z) {
        this.a = context;
        this.b = executor;
        this.c = abstractC6963o11;
        this.d = z;
    }

    public static SK2 a(final Context context, Executor executor, boolean z) {
        final C7521q11 c7521q11 = new C7521q11();
        if (z) {
            executor.execute(new Runnable() { // from class: com.daaw.QK2
                @Override // java.lang.Runnable
                public final void run() {
                    c7521q11.c(WL2.b(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.daaw.RK2
                @Override // java.lang.Runnable
                public final void run() {
                    c7521q11.c(WL2.c());
                }
            });
        }
        return new SK2(context, executor, c7521q11.a(), z);
    }

    public static void g(int i) {
        e = i;
    }

    public final AbstractC6963o11 b(int i, String str) {
        return h(i, 0L, null, null, null, str);
    }

    public final AbstractC6963o11 c(int i, long j, Exception exc) {
        return h(i, j, exc, null, null, null);
    }

    public final AbstractC6963o11 d(int i, long j) {
        return h(i, j, null, null, null, null);
    }

    public final AbstractC6963o11 e(int i, long j, String str) {
        return h(i, j, null, null, null, str);
    }

    public final AbstractC6963o11 f(int i, long j, String str, Map map) {
        return h(i, j, null, str, null, null);
    }

    public final AbstractC6963o11 h(final int i, long j, Exception exc, String str, Map map, String str2) {
        if (!this.d) {
            return this.c.g(this.b, new InterfaceC1519Ls() { // from class: com.daaw.OK2
                @Override // com.daaw.InterfaceC1519Ls
                public final Object a(AbstractC6963o11 abstractC6963o11) {
                    return Boolean.valueOf(abstractC6963o11.n());
                }
            });
        }
        Context context = this.a;
        final C3849cv1 c3849cv1M = C6937nv1.M();
        c3849cv1M.n(context.getPackageName());
        c3849cv1M.t(j);
        c3849cv1M.v(e);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            c3849cv1M.u(stringWriter.toString());
            c3849cv1M.r(exc.getClass().getName());
        }
        if (str2 != null) {
            c3849cv1M.o(str2);
        }
        if (str != null) {
            c3849cv1M.p(str);
        }
        return this.c.g(this.b, new InterfaceC1519Ls() { // from class: com.daaw.PK2
            @Override // com.daaw.InterfaceC1519Ls
            public final Object a(AbstractC6963o11 abstractC6963o11) {
                int i2 = SK2.e;
                if (!abstractC6963o11.n()) {
                    return Boolean.FALSE;
                }
                int i3 = i;
                VL2 vl2A = ((WL2) abstractC6963o11.k()).a(((C6937nv1) c3849cv1M.j()).h());
                vl2A.a(i3);
                vl2A.c();
                return Boolean.TRUE;
            }
        });
    }
}
