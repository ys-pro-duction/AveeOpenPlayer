package com.daaw;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.Jx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1332Jx implements ZH0 {
    public final Context a;
    public final int b;
    public final long c;

    public AbstractC1332Jx(Context context, int i) {
        this(context, null, i, 5000L);
    }

    @Override // com.daaw.ZH0
    public VH0[] a(Handler handler, InterfaceC1358Kd1 interfaceC1358Kd1, InterfaceC2931Zb interfaceC2931Zb, B21 b21, InterfaceC5198hk0 interfaceC5198hk0, InterfaceC7580qE interfaceC7580qE) {
        if (interfaceC7580qE == null) {
            interfaceC7580qE = null;
        }
        InterfaceC7580qE interfaceC7580qE2 = interfaceC7580qE;
        ArrayList arrayList = new ArrayList();
        g(this.a, interfaceC7580qE2, this.c, handler, interfaceC1358Kd1, this.b, arrayList);
        c(this.a, interfaceC7580qE2, b(), handler, interfaceC2931Zb, this.b, arrayList);
        f(this.a, b21, handler.getLooper(), this.b, arrayList);
        d(this.a, interfaceC5198hk0, handler.getLooper(), this.b, arrayList);
        e(this.a, handler, this.b, arrayList);
        return (VH0[]) arrayList.toArray(new VH0[arrayList.size()]);
    }

    public InterfaceC2827Yb[] b() {
        return new InterfaceC2827Yb[0];
    }

    public abstract void c(Context context, InterfaceC7580qE interfaceC7580qE, InterfaceC2827Yb[] interfaceC2827YbArr, Handler handler, InterfaceC2931Zb interfaceC2931Zb, int i, ArrayList arrayList);

    public void d(Context context, InterfaceC5198hk0 interfaceC5198hk0, Looper looper, int i, ArrayList arrayList) {
        arrayList.add(new C5476ik0(interfaceC5198hk0, looper));
    }

    public void f(Context context, B21 b21, Looper looper, int i, ArrayList arrayList) {
        arrayList.add(new I21(b21, looper));
    }

    public void g(Context context, InterfaceC7580qE interfaceC7580qE, long j, Handler handler, InterfaceC1358Kd1 interfaceC1358Kd1, int i, ArrayList arrayList) {
        arrayList.add(new C5747ji0(context, InterfaceC4909gi0.a, j, interfaceC7580qE, false, handler, interfaceC1358Kd1, 50));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            arrayList.add(size, (VH0) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Boolean.TYPE, Long.TYPE, Handler.class, InterfaceC1358Kd1.class, Integer.TYPE).newInstance(Boolean.TRUE, Long.valueOf(j), handler, interfaceC1358Kd1, 50));
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating VP9 extension", e);
        }
    }

    public AbstractC1332Jx(Context context, InterfaceC7580qE interfaceC7580qE, int i, long j) {
        this.a = context;
        this.b = i;
        this.c = j;
    }

    public void e(Context context, Handler handler, int i, ArrayList arrayList) {
    }
}
