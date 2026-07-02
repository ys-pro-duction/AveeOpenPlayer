package com.daaw;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.cH2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3670cH2 implements InterfaceC1834Os2 {
    public static final List b = new ArrayList(50);
    public final Handler a;

    public C3670cH2(Handler handler) {
        this.a = handler;
    }

    public static /* bridge */ /* synthetic */ void i(C10108zG2 c10108zG2) {
        List list = b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(c10108zG2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C10108zG2 j() {
        C10108zG2 c10108zG2;
        List list = b;
        synchronized (list) {
            try {
                c10108zG2 = list.isEmpty() ? new C10108zG2(null) : (C10108zG2) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c10108zG2;
    }

    @Override // com.daaw.InterfaceC1834Os2
    public final InterfaceC6924ns2 a(int i, Object obj) {
        Handler handler = this.a;
        C10108zG2 c10108zG2J = j();
        c10108zG2J.a(handler.obtainMessage(i, obj), this);
        return c10108zG2J;
    }

    @Override // com.daaw.InterfaceC1834Os2
    public final boolean b(int i) {
        return this.a.hasMessages(0);
    }

    @Override // com.daaw.InterfaceC1834Os2
    public final boolean c(int i, long j) {
        return this.a.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.daaw.InterfaceC1834Os2
    public final void d(int i) {
        this.a.removeMessages(i);
    }

    @Override // com.daaw.InterfaceC1834Os2
    public final void e(Object obj) {
        this.a.removeCallbacksAndMessages(null);
    }

    @Override // com.daaw.InterfaceC1834Os2
    public final boolean f(Runnable runnable) {
        return this.a.post(runnable);
    }

    @Override // com.daaw.InterfaceC1834Os2
    public final boolean g(InterfaceC6924ns2 interfaceC6924ns2) {
        return ((C10108zG2) interfaceC6924ns2).b(this.a);
    }

    @Override // com.daaw.InterfaceC1834Os2
    public final InterfaceC6924ns2 h(int i, int i2, int i3) {
        Handler handler = this.a;
        C10108zG2 c10108zG2J = j();
        c10108zG2J.a(handler.obtainMessage(1, i2, i3), this);
        return c10108zG2J;
    }

    @Override // com.daaw.InterfaceC1834Os2
    public final boolean n(int i) {
        return this.a.sendEmptyMessage(i);
    }

    @Override // com.daaw.InterfaceC1834Os2
    public final Looper zza() {
        return this.a.getLooper();
    }

    @Override // com.daaw.InterfaceC1834Os2
    public final InterfaceC6924ns2 zzb(int i) {
        Handler handler = this.a;
        C10108zG2 c10108zG2J = j();
        c10108zG2J.a(handler.obtainMessage(i), this);
        return c10108zG2J;
    }
}
