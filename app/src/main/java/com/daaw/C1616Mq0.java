package com.daaw;

import com.daaw.C9632xb;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.Mq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1616Mq0 {
    public int b;
    public C9632xb.b c;
    public final C9632xb e;
    public final a f;
    public EnumC1409Kq0 a = EnumC1409Kq0.UNKNOWN;
    public boolean d = true;

    /* JADX INFO: renamed from: com.daaw.Mq0$a */
    public interface a {
        void a(EnumC1409Kq0 enumC1409Kq0);
    }

    public C1616Mq0(C9632xb c9632xb, a aVar) {
        this.e = c9632xb;
        this.f = aVar;
    }

    public static /* synthetic */ void a(C1616Mq0 c1616Mq0) {
        c1616Mq0.c = null;
        AbstractC6557mb.d(c1616Mq0.a == EnumC1409Kq0.UNKNOWN, "Timer should be canceled if we transitioned to a different state.", new Object[0]);
        c1616Mq0.f(String.format(Locale.ENGLISH, "Backend didn't respond within %d seconds\n", 10));
        c1616Mq0.g(EnumC1409Kq0.OFFLINE);
    }

    public final void b() {
        C9632xb.b bVar = this.c;
        if (bVar != null) {
            bVar.c();
            this.c = null;
        }
    }

    public EnumC1409Kq0 c() {
        return this.a;
    }

    public void d(C6262lX0 c6262lX0) {
        if (this.a == EnumC1409Kq0.ONLINE) {
            g(EnumC1409Kq0.UNKNOWN);
            AbstractC6557mb.d(this.b == 0, "watchStreamFailures must be 0", new Object[0]);
            AbstractC6557mb.d(this.c == null, "onlineStateTimer must be null", new Object[0]);
            return;
        }
        int i = this.b + 1;
        this.b = i;
        if (i >= 1) {
            b();
            f(String.format(Locale.ENGLISH, "Connection failed %d times. Most recent error: %s", 1, c6262lX0));
            g(EnumC1409Kq0.OFFLINE);
        }
    }

    public void e() {
        if (this.b == 0) {
            g(EnumC1409Kq0.UNKNOWN);
            AbstractC6557mb.d(this.c == null, "onlineStateTimer shouldn't be started yet", new Object[0]);
            this.c = this.e.h(C9632xb.d.ONLINE_STATE_TIMEOUT, 10000L, new Runnable() { // from class: com.daaw.Lq0
                @Override // java.lang.Runnable
                public final void run() {
                    C1616Mq0.a(this.B);
                }
            });
        }
    }

    public final void f(String str) {
        String str2 = String.format("Could not reach Cloud Firestore backend. %s\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend.", str);
        if (!this.d) {
            AbstractC2212Sd0.a("OnlineStateTracker", "%s", str2);
        } else {
            AbstractC2212Sd0.d("OnlineStateTracker", "%s", str2);
            this.d = false;
        }
    }

    public final void g(EnumC1409Kq0 enumC1409Kq0) {
        if (enumC1409Kq0 != this.a) {
            this.a = enumC1409Kq0;
            this.f.a(enumC1409Kq0);
        }
    }

    public void h(EnumC1409Kq0 enumC1409Kq0) {
        b();
        this.b = 0;
        if (enumC1409Kq0 == EnumC1409Kq0.ONLINE) {
            this.d = false;
        }
        g(enumC1409Kq0);
    }
}
