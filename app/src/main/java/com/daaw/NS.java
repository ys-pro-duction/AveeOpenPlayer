package com.daaw;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.security.MessageDigest;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class NS {
    public final c a;
    public final HS b;
    public final Handler c;
    public boolean d;
    public boolean e;
    public AbstractC7357pS f;
    public b g;
    public boolean h;

    public static class b extends WS0 {
        public final Handler E;
        public final int F;
        public final long G;
        public Bitmap H;

        public b(Handler handler, int i, long j) {
            this.E = handler;
            this.F = i;
            this.G = j;
        }

        public Bitmap m() {
            return this.H;
        }

        @Override // com.daaw.InterfaceC3596c11
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void d(Bitmap bitmap, XS xs) {
            this.H = bitmap;
            this.E.sendMessageAtTime(this.E.obtainMessage(1, this), this.G);
        }
    }

    public interface c {
        void a(int i);
    }

    public class d implements Handler.Callback {
        public d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                NS.this.e((b) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            WS.h((b) message.obj);
            return false;
        }
    }

    public static class e implements H70 {
        public final UUID a;

        public e() {
            this(UUID.randomUUID());
        }

        @Override // com.daaw.H70
        public void a(MessageDigest messageDigest) {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.daaw.H70
        public boolean equals(Object obj) {
            if (obj instanceof e) {
                return ((e) obj).a.equals(this.a);
            }
            return false;
        }

        @Override // com.daaw.H70
        public int hashCode() {
            return this.a.hashCode();
        }

        public e(UUID uuid) {
            this.a = uuid;
        }
    }

    public NS(Context context, c cVar, HS hs, int i, int i2) {
        this(cVar, hs, null, c(context, hs, i, i2, WS.j(context).k()));
    }

    public static AbstractC7357pS c(Context context, HS hs, int i, int i2, InterfaceC1883Pf interfaceC1883Pf) {
        PS ps = new PS(interfaceC1883Pf);
        OS os = new OS();
        return WS.t(context).A(os, HS.class).c(hs).a(Bitmap.class).x(C1920Po0.b()).h(ps).w(true).i(EnumC4772gC.NONE).t(i, i2);
    }

    public void a() {
        h();
        b bVar = this.g;
        if (bVar != null) {
            WS.h(bVar);
            this.g = null;
        }
        this.h = true;
    }

    public Bitmap b() {
        b bVar = this.g;
        if (bVar != null) {
            return bVar.m();
        }
        return null;
    }

    public final void d() {
        if (!this.d || this.e) {
            return;
        }
        this.e = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.b.h());
        this.b.a();
        this.f.v(new e()).o(new b(this.c, this.b.d(), jUptimeMillis));
    }

    public void e(b bVar) {
        if (this.h) {
            this.c.obtainMessage(2, bVar).sendToTarget();
            return;
        }
        b bVar2 = this.g;
        this.g = bVar;
        this.a.a(bVar.F);
        if (bVar2 != null) {
            this.c.obtainMessage(2, bVar2).sendToTarget();
        }
        this.e = false;
        d();
    }

    public void f(InterfaceC6983o51 interfaceC6983o51) {
        if (interfaceC6983o51 == null) {
            throw new NullPointerException("Transformation must not be null");
        }
        this.f = this.f.y(interfaceC6983o51);
    }

    public void g() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.h = false;
        d();
    }

    public void h() {
        this.d = false;
    }

    public NS(c cVar, HS hs, Handler handler, AbstractC7357pS abstractC7357pS) {
        this.d = false;
        this.e = false;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new d()) : handler;
        this.a = cVar;
        this.b = hs;
        this.c = handler;
        this.f = abstractC7357pS;
    }
}
