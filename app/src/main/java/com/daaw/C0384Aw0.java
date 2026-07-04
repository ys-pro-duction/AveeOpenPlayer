package com.daaw;

import android.os.Handler;
import android.os.Message;
import com.daaw.Z41;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.daaw.Aw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0384Aw0 implements Handler.Callback {
    public final O3 B;
    public final b C;
    public C0908Fv G;
    public boolean H;
    public long I;
    public boolean L;
    public boolean M;
    public final TreeMap F = new TreeMap();
    public final Handler E = new Handler(this);
    public final TH D = new TH();
    public long J = -9223372036854775807L;
    public long K = -9223372036854775807L;

    /* JADX INFO: renamed from: com.daaw.Aw0$a */
    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Aw0$b */
    public interface b {
        void a();

        void b(long j);

        void c();
    }

    /* JADX INFO: renamed from: com.daaw.Aw0$c */
    public final class c implements Z41 {
        public final OM0 a;
        public final C5103hP b = new C5103hP();
        public final C4073dk0 c = new C4073dk0();

        public c(OM0 om0) {
            this.a = om0;
        }

        @Override // com.daaw.Z41
        public void a(long j, int i, int i2, int i3, Z41.a aVar) {
            this.a.a(j, i, i2, i3, aVar);
            k();
        }

        @Override // com.daaw.Z41
        public int b(InterfaceC9001vJ interfaceC9001vJ, int i, boolean z) {
            return this.a.b(interfaceC9001vJ, i, z);
        }

        @Override // com.daaw.Z41
        public void c(C2584Vs0 c2584Vs0, int i) {
            this.a.c(c2584Vs0, i);
        }

        @Override // com.daaw.Z41
        public void d(Format format) {
            this.a.d(format);
        }

        public final C4073dk0 e() {
            this.c.l();
            if (this.a.y(this.b, this.c, false, false, 0L) != -4) {
                return null;
            }
            this.c.u();
            return this.c;
        }

        public boolean f(long j) {
            return C0384Aw0.this.l(j);
        }

        public boolean g(AbstractC1799Ok abstractC1799Ok) {
            return C0384Aw0.this.m(abstractC1799Ok);
        }

        public void h(AbstractC1799Ok abstractC1799Ok) {
            C0384Aw0.this.q(abstractC1799Ok);
        }

        public final void i(long j, long j2) {
            C0384Aw0.this.E.sendMessage(C0384Aw0.this.E.obtainMessage(2, new a(j, j2)));
        }

        public final void j() {
            C0384Aw0.this.E.sendMessage(C0384Aw0.this.E.obtainMessage(1));
        }

        public final void k() {
            while (this.a.u()) {
                C4073dk0 c4073dk0E = e();
                if (c4073dk0E != null) {
                    long j = c4073dk0E.E;
                    EventMessage eventMessage = (EventMessage) C0384Aw0.this.D.a(c4073dk0E).a(0);
                    if (C0384Aw0.j(eventMessage.B, eventMessage.C)) {
                        l(j, eventMessage);
                    }
                }
            }
            this.a.l();
        }

        public final void l(long j, EventMessage eventMessage) {
            long jF = C0384Aw0.f(eventMessage);
            if (jF == -9223372036854775807L) {
                return;
            }
            if (C0384Aw0.i(eventMessage)) {
                j();
            } else {
                i(j, jF);
            }
        }

        public void m() {
            this.a.C();
        }
    }

    public C0384Aw0(C0908Fv c0908Fv, b bVar, O3 o3) {
        this.G = c0908Fv;
        this.C = bVar;
        this.B = o3;
    }

    public static long f(EventMessage eventMessage) {
        try {
            return AbstractC6280lb1.O(new String(eventMessage.G));
        } catch (C3000Zs0 unused) {
            return -9223372036854775807L;
        }
    }

    public static boolean i(EventMessage eventMessage) {
        return eventMessage.E == 0 && eventMessage.D == 0;
    }

    public static boolean j(String str, String str2) {
        if ("urn:mpeg:dash:event:2012".equals(str)) {
            return "1".equals(str2) || "2".equals(str2) || "3".equals(str2);
        }
        return false;
    }

    public final Map.Entry e(long j) {
        return this.F.ceilingEntry(Long.valueOf(j));
    }

    public final void g(long j, long j2) {
        Long l = (Long) this.F.get(Long.valueOf(j2));
        if (l == null) {
            this.F.put(Long.valueOf(j2), Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.F.put(Long.valueOf(j2), Long.valueOf(j));
        }
    }

    public final void h() {
        this.H = true;
        p();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.M) {
            return true;
        }
        int i = message.what;
        if (i == 1) {
            h();
            return true;
        }
        if (i != 2) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.a, aVar.b);
        return true;
    }

    public final void k() {
        long j = this.K;
        if (j == -9223372036854775807L || j != this.J) {
            this.L = true;
            this.K = this.J;
            this.C.a();
        }
    }

    public boolean l(long j) {
        C0908Fv c0908Fv = this.G;
        boolean z = false;
        if (!c0908Fv.d) {
            return false;
        }
        if (this.L) {
            return true;
        }
        if (this.H) {
            z = true;
        } else {
            Map.Entry entryE = e(c0908Fv.h);
            if (entryE != null && ((Long) entryE.getValue()).longValue() < j) {
                this.I = ((Long) entryE.getKey()).longValue();
                o();
                z = true;
            }
        }
        if (z) {
            k();
        }
        return z;
    }

    public boolean m(AbstractC1799Ok abstractC1799Ok) {
        if (!this.G.d) {
            return false;
        }
        if (this.L) {
            return true;
        }
        long j = this.J;
        if (j == -9223372036854775807L || j >= abstractC1799Ok.f) {
            return false;
        }
        k();
        return true;
    }

    public c n() {
        return new c(new OM0(this.B));
    }

    public final void o() {
        this.C.b(this.I);
    }

    public final void p() {
        this.C.c();
    }

    public void q(AbstractC1799Ok abstractC1799Ok) {
        long j = this.J;
        if (j != -9223372036854775807L || abstractC1799Ok.g > j) {
            this.J = abstractC1799Ok.g;
        }
    }

    public void r() {
        this.M = true;
        this.E.removeCallbacksAndMessages(null);
    }

    public final void s() {
        Iterator it = this.F.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < this.G.h) {
                it.remove();
            }
        }
    }

    public void t(C0908Fv c0908Fv) {
        this.L = false;
        this.I = -9223372036854775807L;
        this.G = c0908Fv;
        s();
    }
}
