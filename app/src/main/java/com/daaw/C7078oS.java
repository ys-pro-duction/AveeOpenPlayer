package com.daaw;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.daaw.KG;
import java.util.Queue;

/* JADX INFO: renamed from: com.daaw.oS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7078oS implements InterfaceC7039oI0, ET0, MI0 {
    public static final Queue D = AbstractC6559mb1.d(0);
    public KG.c A;
    public long B;
    public a C;
    public final String a = String.valueOf(hashCode());
    public H70 b;
    public Drawable c;
    public int d;
    public int e;
    public int f;
    public Context g;
    public InterfaceC6983o51 h;
    public InterfaceC0729Ec0 i;
    public InterfaceC7318pI0 j;
    public Object k;
    public Class l;
    public boolean m;
    public EnumC9190vz0 n;
    public InterfaceC3596c11 o;
    public InterfaceC8433tI0 p;
    public float q;
    public KG r;
    public YS s;
    public int t;
    public int u;
    public EnumC4772gC v;
    public Drawable w;
    public Drawable x;
    public boolean y;
    public KI0 z;

    /* JADX INFO: renamed from: com.daaw.oS$a */
    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CANCELLED,
        CLEARED,
        PAUSED
    }

    public static void m(String str, Object obj, String str2) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(" must not be null");
            if (str2 != null) {
                sb.append(", ");
                sb.append(str2);
            }
            throw new NullPointerException(sb.toString());
        }
    }

    public static C7078oS v(InterfaceC0729Ec0 interfaceC0729Ec0, Object obj, H70 h70, Context context, EnumC9190vz0 enumC9190vz0, InterfaceC3596c11 interfaceC3596c11, float f, Drawable drawable, int i, Drawable drawable2, int i2, Drawable drawable3, int i3, InterfaceC8433tI0 interfaceC8433tI0, InterfaceC7318pI0 interfaceC7318pI0, KG kg, InterfaceC6983o51 interfaceC6983o51, Class cls, boolean z, YS ys, int i4, int i5, EnumC4772gC enumC4772gC) {
        C7078oS c7078oS = (C7078oS) D.poll();
        if (c7078oS == null) {
            c7078oS = new C7078oS();
        }
        C7078oS c7078oS2 = c7078oS;
        c7078oS2.q(interfaceC0729Ec0, obj, h70, context, enumC9190vz0, interfaceC3596c11, f, drawable, i, drawable2, i2, drawable3, i3, interfaceC8433tI0, interfaceC7318pI0, kg, interfaceC6983o51, cls, z, ys, i4, i5, enumC4772gC);
        return c7078oS2;
    }

    @Override // com.daaw.MI0
    public void a(Exception exc) {
        this.C = a.FAILED;
        InterfaceC8433tI0 interfaceC8433tI0 = this.p;
        if (interfaceC8433tI0 == null || !interfaceC8433tI0.a(exc, this.k, this.o, s())) {
            y(exc);
        }
    }

    @Override // com.daaw.InterfaceC7039oI0
    public void b() {
        clear();
        this.C = a.PAUSED;
    }

    @Override // com.daaw.InterfaceC7039oI0
    public void c() {
        this.i = null;
        this.k = null;
        this.g = null;
        this.o = null;
        this.w = null;
        this.x = null;
        this.c = null;
        this.p = null;
        this.j = null;
        this.h = null;
        this.s = null;
        this.y = false;
        this.A = null;
        D.offer(this);
    }

    @Override // com.daaw.InterfaceC7039oI0
    public void clear() {
        AbstractC6559mb1.b();
        a aVar = this.C;
        a aVar2 = a.CLEARED;
        if (aVar == aVar2) {
            return;
        }
        l();
        KI0 ki0 = this.z;
        if (ki0 != null) {
            x(ki0);
        }
        if (j()) {
            this.o.k(p());
        }
        this.C = aVar2;
    }

    @Override // com.daaw.MI0
    public void d(KI0 ki0) {
        if (ki0 == null) {
            a(new Exception("Expected to receive a Resource<R> with an object of " + this.l + " inside, but instead got null."));
            return;
        }
        Object obj = ki0.get();
        if (obj != null && this.l.isAssignableFrom(obj.getClass())) {
            if (k()) {
                w(ki0, obj);
                return;
            } else {
                x(ki0);
                this.C = a.COMPLETE;
                return;
            }
        }
        x(ki0);
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to receive an object of ");
        sb.append(this.l);
        sb.append(" but instead got ");
        sb.append(obj != null ? obj.getClass() : "");
        sb.append("{");
        sb.append(obj);
        sb.append("}");
        sb.append(" inside Resource{");
        sb.append(ki0);
        sb.append("}.");
        sb.append(obj == null ? " To indicate failure return a null Resource object, rather than a Resource object containing null data." : "");
        a(new Exception(sb.toString()));
    }

    @Override // com.daaw.InterfaceC7039oI0
    public boolean e() {
        return i();
    }

    @Override // com.daaw.ET0
    public void f(int i, int i2) {
        if (Log.isLoggable("GenericRequest", 2)) {
            t("Got onSizeReady in " + AbstractC1357Kd0.a(this.B));
        }
        if (this.C != a.WAITING_FOR_SIZE) {
            return;
        }
        this.C = a.RUNNING;
        int iRound = Math.round(this.q * i);
        int iRound2 = Math.round(this.q * i2);
        InterfaceC2177Rv interfaceC2177RvA = this.i.g().a(this.k, iRound, iRound2);
        if (interfaceC2177RvA == null) {
            a(new Exception("Failed to load model: '" + this.k + "'"));
            return;
        }
        WI0 wi0C = this.i.c();
        if (Log.isLoggable("GenericRequest", 2)) {
            t("finished setup for calling load in " + AbstractC1357Kd0.a(this.B));
        }
        this.y = true;
        this.A = this.r.g(this.b, iRound, iRound2, interfaceC2177RvA, this.i, this.h, wi0C, this.n, this.m, this.v, this);
        this.y = this.z != null;
        if (Log.isLoggable("GenericRequest", 2)) {
            t("finished onSizeReady in " + AbstractC1357Kd0.a(this.B));
        }
    }

    @Override // com.daaw.InterfaceC7039oI0
    public void g() {
        this.B = AbstractC1357Kd0.b();
        if (this.k == null) {
            a(null);
            return;
        }
        this.C = a.WAITING_FOR_SIZE;
        if (AbstractC6559mb1.l(this.t, this.u)) {
            f(this.t, this.u);
        } else {
            this.o.e(this);
        }
        if (!i() && !r() && j()) {
            this.o.i(p());
        }
        if (Log.isLoggable("GenericRequest", 2)) {
            t("finished run method in " + AbstractC1357Kd0.a(this.B));
        }
    }

    @Override // com.daaw.InterfaceC7039oI0
    public boolean i() {
        return this.C == a.COMPLETE;
    }

    @Override // com.daaw.InterfaceC7039oI0
    public boolean isCancelled() {
        a aVar = this.C;
        return aVar == a.CANCELLED || aVar == a.CLEARED;
    }

    @Override // com.daaw.InterfaceC7039oI0
    public boolean isRunning() {
        a aVar = this.C;
        return aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
    }

    public final boolean j() {
        InterfaceC7318pI0 interfaceC7318pI0 = this.j;
        return interfaceC7318pI0 == null || interfaceC7318pI0.d(this);
    }

    public final boolean k() {
        InterfaceC7318pI0 interfaceC7318pI0 = this.j;
        return interfaceC7318pI0 == null || interfaceC7318pI0.h(this);
    }

    public void l() {
        this.C = a.CANCELLED;
        KG.c cVar = this.A;
        if (cVar != null) {
            cVar.a();
            this.A = null;
        }
    }

    public final Drawable n() {
        if (this.x == null && this.f > 0) {
            this.x = this.g.getResources().getDrawable(this.f);
        }
        return this.x;
    }

    public final Drawable o() {
        if (this.c == null && this.d > 0) {
            this.c = this.g.getResources().getDrawable(this.d);
        }
        return this.c;
    }

    public final Drawable p() {
        if (this.w == null && this.e > 0) {
            this.w = this.g.getResources().getDrawable(this.e);
        }
        return this.w;
    }

    public final void q(InterfaceC0729Ec0 interfaceC0729Ec0, Object obj, H70 h70, Context context, EnumC9190vz0 enumC9190vz0, InterfaceC3596c11 interfaceC3596c11, float f, Drawable drawable, int i, Drawable drawable2, int i2, Drawable drawable3, int i3, InterfaceC8433tI0 interfaceC8433tI0, InterfaceC7318pI0 interfaceC7318pI0, KG kg, InterfaceC6983o51 interfaceC6983o51, Class cls, boolean z, YS ys, int i4, int i5, EnumC4772gC enumC4772gC) {
        this.i = interfaceC0729Ec0;
        this.k = obj;
        this.b = h70;
        this.c = drawable3;
        this.d = i3;
        this.g = context.getApplicationContext();
        this.n = enumC9190vz0;
        this.o = interfaceC3596c11;
        this.q = f;
        this.w = drawable;
        this.e = i;
        this.x = drawable2;
        this.f = i2;
        this.p = interfaceC8433tI0;
        this.j = interfaceC7318pI0;
        this.r = kg;
        this.h = interfaceC6983o51;
        this.l = cls;
        this.m = z;
        this.s = ys;
        this.t = i4;
        this.u = i5;
        this.v = enumC4772gC;
        this.C = a.PENDING;
        if (obj != null) {
            m("ModelLoader", interfaceC0729Ec0.g(), "try .using(ModelLoader)");
            m("Transcoder", interfaceC0729Ec0.c(), "try .as*(Class).transcode(ResourceTranscoder)");
            m("Transformation", interfaceC6983o51, "try .transform(UnitTransformation.get())");
            if (enumC4772gC.c()) {
                m("SourceEncoder", interfaceC0729Ec0.b(), "try .sourceEncoder(Encoder) or .diskCacheStrategy(NONE/RESULT)");
            } else {
                m("SourceDecoder", interfaceC0729Ec0.e(), "try .decoder/.imageDecoder/.videoDecoder(ResourceDecoder) or .diskCacheStrategy(ALL/SOURCE)");
            }
            if (enumC4772gC.c() || enumC4772gC.a()) {
                m("CacheDecoder", interfaceC0729Ec0.f(), "try .cacheDecoder(ResouceDecoder) or .diskCacheStrategy(NONE)");
            }
            if (enumC4772gC.a()) {
                m("Encoder", interfaceC0729Ec0.d(), "try .encode(ResourceEncoder) or .diskCacheStrategy(NONE/SOURCE)");
            }
        }
    }

    public boolean r() {
        return this.C == a.FAILED;
    }

    public final boolean s() {
        InterfaceC7318pI0 interfaceC7318pI0 = this.j;
        return interfaceC7318pI0 == null || !interfaceC7318pI0.a();
    }

    public final void u() {
        InterfaceC7318pI0 interfaceC7318pI0 = this.j;
        if (interfaceC7318pI0 != null) {
            interfaceC7318pI0.f(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(com.daaw.KI0 r7, java.lang.Object r8) {
        /*
            r6 = this;
            boolean r5 = r6.s()
            com.daaw.oS$a r0 = com.daaw.C7078oS.a.COMPLETE
            r6.C = r0
            r6.z = r7
            com.daaw.tI0 r0 = r6.p
            if (r0 == 0) goto L1c
            java.lang.Object r2 = r6.k
            com.daaw.c11 r3 = r6.o
            boolean r4 = r6.y
            r1 = r8
            boolean r8 = r0.b(r1, r2, r3, r4, r5)
            if (r8 != 0) goto L2a
            goto L1d
        L1c:
            r1 = r8
        L1d:
            com.daaw.YS r8 = r6.s
            boolean r0 = r6.y
            com.daaw.XS r8 = r8.a(r0, r5)
            com.daaw.c11 r0 = r6.o
            r0.d(r1, r8)
        L2a:
            r6.u()
            java.lang.String r8 = "GenericRequest"
            r0 = 2
            boolean r8 = android.util.Log.isLoggable(r8, r0)
            if (r8 == 0) goto L6b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Resource ready in "
            r8.append(r0)
            long r0 = r6.B
            double r0 = com.daaw.AbstractC1357Kd0.a(r0)
            r8.append(r0)
            java.lang.String r0 = " size: "
            r8.append(r0)
            int r7 = r7.a()
            double r0 = (double) r7
            r2 = 4517110426252607488(0x3eb0000000000000, double:9.5367431640625E-7)
            double r0 = r0 * r2
            r8.append(r0)
            java.lang.String r7 = " fromCache: "
            r8.append(r7)
            boolean r7 = r6.y
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.t(r7)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7078oS.w(com.daaw.KI0, java.lang.Object):void");
    }

    public final void x(KI0 ki0) {
        this.r.k(ki0);
        this.z = null;
    }

    public final void y(Exception exc) {
        if (j()) {
            Drawable drawableO = this.k == null ? o() : null;
            if (drawableO == null) {
                drawableO = n();
            }
            if (drawableO == null) {
                drawableO = p();
            }
            this.o.h(exc, drawableO);
        }
    }

    public final void t(String str) {
    }
}
