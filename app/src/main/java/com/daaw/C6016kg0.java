package com.daaw;

import com.daaw.AbstractC2560Vm0;
import com.daaw.C5079hJ;
import java.lang.reflect.InvocationTargetException;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.kg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6016kg0 extends AbstractC5456ig0 {
    public static final Logger H = Logger.getLogger(C6016kg0.class.getName());
    public static final long I = TimeUnit.MINUTES.toMillis(30);
    public static final long J = TimeUnit.SECONDS.toMillis(1);
    public static final InterfaceC6907np0 K = OR0.c(AbstractC7365pU.u);
    public static final C1224Iw L = C1224Iw.c();
    public static final C2779Xp M = C2779Xp.a();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final c F;
    public final b G;
    public InterfaceC6907np0 a;
    public InterfaceC6907np0 b;
    public final List c;
    public final C2976Zm0 d;
    public AbstractC2560Vm0.c e;
    public final String f;
    public final AbstractC0960Gi g;
    public final SocketAddress h;
    public String i;
    public String j;
    public String k;
    public boolean l;
    public C1224Iw m;
    public C2779Xp n;
    public long o;
    public int p;
    public int q;
    public long r;
    public long s;
    public boolean t;
    public C4720g10 u;
    public int v;
    public Map w;
    public boolean x;
    public InterfaceC8405tB0 y;
    public boolean z;

    /* JADX INFO: renamed from: com.daaw.kg0$b */
    public interface b {
        int a();
    }

    /* JADX INFO: renamed from: com.daaw.kg0$c */
    public interface c {
        InterfaceC3803cm a();
    }

    /* JADX INFO: renamed from: com.daaw.kg0$d */
    public static final class d implements b {
        public d() {
        }

        @Override // com.daaw.C6016kg0.b
        public int a() {
            return 443;
        }
    }

    public C6016kg0(String str, c cVar, b bVar) {
        this(str, null, null, cVar, bVar);
    }

    @Override // com.daaw.AbstractC5456ig0
    public AbstractC5178hg0 a() {
        return new C6304lg0(new C5737jg0(this, this.F.a(), new C5079hJ.a(), OR0.c(AbstractC7365pU.u), AbstractC7365pU.w, f(), G31.a));
    }

    public int e() {
        return this.G.a();
    }

    public List f() {
        boolean z;
        ArrayList arrayList = new ArrayList(this.c);
        List listA = AbstractC5837k10.a();
        if (listA != null) {
            arrayList.addAll(listA);
            z = true;
        } else {
            z = false;
        }
        if (!z && this.z) {
            try {
                Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
                Class<?> cls2 = Boolean.TYPE;
                AbstractC6314li0.a(cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2).invoke(null, Boolean.valueOf(this.A), Boolean.valueOf(this.B), Boolean.valueOf(this.C), Boolean.valueOf(this.D)));
            } catch (ClassNotFoundException e) {
                H.log(Level.FINE, "Unable to apply census stats", (Throwable) e);
            } catch (IllegalAccessException e2) {
                H.log(Level.FINE, "Unable to apply census stats", (Throwable) e2);
            } catch (NoSuchMethodException e3) {
                H.log(Level.FINE, "Unable to apply census stats", (Throwable) e3);
            } catch (InvocationTargetException e4) {
                H.log(Level.FINE, "Unable to apply census stats", (Throwable) e4);
            }
        }
        if (!z && this.E) {
            try {
                AbstractC6314li0.a(Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", null).invoke(null, null));
            } catch (ClassNotFoundException e5) {
                H.log(Level.FINE, "Unable to apply census stats", (Throwable) e5);
            } catch (IllegalAccessException e6) {
                H.log(Level.FINE, "Unable to apply census stats", (Throwable) e6);
            } catch (NoSuchMethodException e7) {
                H.log(Level.FINE, "Unable to apply census stats", (Throwable) e7);
            } catch (InvocationTargetException e8) {
                H.log(Level.FINE, "Unable to apply census stats", (Throwable) e8);
            }
        }
        return arrayList;
    }

    public C6016kg0(String str, AbstractC4072dk abstractC4072dk, AbstractC0960Gi abstractC0960Gi, c cVar, b bVar) {
        InterfaceC6907np0 interfaceC6907np0 = K;
        this.a = interfaceC6907np0;
        this.b = interfaceC6907np0;
        this.c = new ArrayList();
        C2976Zm0 c2976Zm0D = C2976Zm0.d();
        this.d = c2976Zm0D;
        this.e = c2976Zm0D.c();
        this.k = "pick_first";
        this.m = L;
        this.n = M;
        this.o = I;
        this.p = 5;
        this.q = 5;
        this.r = 16777216L;
        this.s = 1048576L;
        this.t = true;
        this.u = C4720g10.g();
        this.x = true;
        this.z = true;
        this.A = true;
        this.B = true;
        this.C = false;
        this.D = true;
        this.E = true;
        this.f = (String) AbstractC7785qy0.o(str, "target");
        this.g = abstractC0960Gi;
        this.F = (c) AbstractC7785qy0.o(cVar, "clientTransportFactoryBuilder");
        this.h = null;
        if (bVar != null) {
            this.G = bVar;
        } else {
            this.G = new d();
        }
    }
}
