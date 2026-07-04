package com.daaw;

import com.daaw.AbstractC0304Ac0;
import com.daaw.AbstractC3246am;
import com.daaw.AbstractC6962o10;
import com.daaw.C1168Ii;
import com.daaw.C2756Xj0;
import com.daaw.C6262lX0;
import com.daaw.InterfaceC2971Zl;
import com.daaw.NR0;
import com.daaw.TX0;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.pU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7365pU {
    public static final Logger a = Logger.getLogger(AbstractC7365pU.class.getName());
    public static final Set b = DesugarCollections.unmodifiableSet(EnumSet.of(C6262lX0.b.OK, C6262lX0.b.INVALID_ARGUMENT, C6262lX0.b.NOT_FOUND, C6262lX0.b.ALREADY_EXISTS, C6262lX0.b.FAILED_PRECONDITION, C6262lX0.b.ABORTED, C6262lX0.b.OUT_OF_RANGE, C6262lX0.b.DATA_LOSS));
    public static final Charset c = Charset.forName("US-ASCII");
    public static final C2756Xj0.g d = C2756Xj0.g.e("grpc-timeout", new i());
    public static final C2756Xj0.g e;
    public static final C2756Xj0.g f;
    public static final C2756Xj0.g g;
    public static final C2756Xj0.g h;
    public static final C2756Xj0.g i;
    public static final C2756Xj0.g j;
    public static final C2756Xj0.g k;
    public static final C2756Xj0.g l;
    public static final C9329wV0 m;
    public static final long n;
    public static final long o;
    public static final long p;
    public static final InterfaceC8405tB0 q;
    public static final InterfaceC8405tB0 r;
    public static final C1168Ii.c s;
    public static final AbstractC3246am t;
    public static final NR0.d u;
    public static final NR0.d v;
    public static final AZ0 w;

    /* JADX INFO: renamed from: com.daaw.pU$a */
    public class a implements InterfaceC8405tB0 {
        @Override // com.daaw.InterfaceC8405tB0
        public AbstractC8126sB0 a(SocketAddress socketAddress) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.pU$b */
    public class b extends AbstractC3246am {
    }

    /* JADX INFO: renamed from: com.daaw.pU$c */
    public class c implements NR0.d {
        @Override // com.daaw.NR0.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // com.daaw.NR0.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Executor a() {
            return Executors.newCachedThreadPool(AbstractC7365pU.i("grpc-default-executor-%d", true));
        }

        public String toString() {
            return "grpc-default-executor";
        }
    }

    /* JADX INFO: renamed from: com.daaw.pU$d */
    public class d implements NR0.d {
        @Override // com.daaw.NR0.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }

        @Override // com.daaw.NR0.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ScheduledExecutorService a() {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, AbstractC7365pU.i("grpc-timer-%d", true));
            try {
                scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
            return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
        }
    }

    /* JADX INFO: renamed from: com.daaw.pU$e */
    public class e implements AZ0 {
        @Override // com.daaw.AZ0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C8772uX0 get() {
            return C8772uX0.c();
        }
    }

    /* JADX INFO: renamed from: com.daaw.pU$f */
    public class f implements InterfaceC3525bm {
        public final /* synthetic */ AbstractC3246am.a a;
        public final /* synthetic */ InterfaceC3525bm b;

        public f(AbstractC3246am.a aVar, InterfaceC3525bm interfaceC3525bm) {
            this.a = aVar;
            this.b = interfaceC3525bm;
        }

        @Override // com.daaw.InterfaceC3525bm
        public InterfaceC2867Yl c(C6882nk0 c6882nk0, C2756Xj0 c2756Xj0, C1168Ii c1168Ii, AbstractC3246am[] abstractC3246amArr) {
            AbstractC3246am abstractC3246amA = this.a.a(AbstractC3246am.b.a().b(c1168Ii).a(), c2756Xj0);
            AbstractC7785qy0.u(abstractC3246amArr[abstractC3246amArr.length - 1] == AbstractC7365pU.t, "lb tracer already assigned");
            abstractC3246amArr[abstractC3246amArr.length - 1] = abstractC3246amA;
            return this.b.c(c6882nk0, c2756Xj0, c1168Ii, abstractC3246amArr);
        }

        @Override // com.daaw.InterfaceC8921v10
        public C6404m10 f() {
            return this.b.f();
        }
    }

    /* JADX INFO: renamed from: com.daaw.pU$g */
    public static final class g implements AbstractC6962o10.a {
        public g() {
        }

        public /* synthetic */ g(a aVar) {
            this();
        }

        @Override // com.daaw.C2756Xj0.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] b(byte[] bArr) {
            return bArr;
        }

        @Override // com.daaw.C2756Xj0.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] a(byte[] bArr) {
            return bArr;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'D' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: com.daaw.pU$h */
    public static final class h {
        public static final h D;
        public static final h E;
        public static final h F;
        public static final h G;
        public static final h H;
        public static final h I;
        public static final h J;
        public static final h K;
        public static final h L;
        public static final h M;
        public static final h N;
        public static final h O;
        public static final h P;
        public static final h Q;
        public static final h[] R;
        public static final /* synthetic */ h[] S;
        public final int B;
        public final C6262lX0 C;

        static {
            C6262lX0 c6262lX0 = C6262lX0.u;
            h hVar = new h("NO_ERROR", 0, 0, c6262lX0);
            D = hVar;
            C6262lX0 c6262lX02 = C6262lX0.t;
            h hVar2 = new h("PROTOCOL_ERROR", 1, 1, c6262lX02);
            E = hVar2;
            h hVar3 = new h("INTERNAL_ERROR", 2, 2, c6262lX02);
            F = hVar3;
            h hVar4 = new h("FLOW_CONTROL_ERROR", 3, 3, c6262lX02);
            G = hVar4;
            h hVar5 = new h("SETTINGS_TIMEOUT", 4, 4, c6262lX02);
            H = hVar5;
            h hVar6 = new h("STREAM_CLOSED", 5, 5, c6262lX02);
            I = hVar6;
            h hVar7 = new h("FRAME_SIZE_ERROR", 6, 6, c6262lX02);
            J = hVar7;
            h hVar8 = new h("REFUSED_STREAM", 7, 7, c6262lX0);
            K = hVar8;
            h hVar9 = new h("CANCEL", 8, 8, C6262lX0.g);
            L = hVar9;
            h hVar10 = new h("COMPRESSION_ERROR", 9, 9, c6262lX02);
            M = hVar10;
            h hVar11 = new h("CONNECT_ERROR", 10, 10, c6262lX02);
            N = hVar11;
            h hVar12 = new h("ENHANCE_YOUR_CALM", 11, 11, C6262lX0.o.q("Bandwidth exhausted"));
            O = hVar12;
            h hVar13 = new h("INADEQUATE_SECURITY", 12, 12, C6262lX0.m.q("Permission denied as protocol is not secure enough to call"));
            P = hVar13;
            h hVar14 = new h("HTTP_1_1_REQUIRED", 13, 13, C6262lX0.h);
            Q = hVar14;
            S = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14};
            R = a();
        }

        public h(String str, int i, int i2, C6262lX0 c6262lX0) {
            this.B = i2;
            String str2 = "HTTP/2 error code: " + name();
            if (c6262lX0.n() != null) {
                str2 = str2 + " (" + c6262lX0.n() + ")";
            }
            this.C = c6262lX0.q(str2);
        }

        public static h[] a() {
            h[] hVarArrValues = values();
            h[] hVarArr = new h[((int) hVarArrValues[hVarArrValues.length - 1].c()) + 1];
            for (h hVar : hVarArrValues) {
                hVarArr[(int) hVar.c()] = hVar;
            }
            return hVarArr;
        }

        public static h g(long j) {
            h[] hVarArr = R;
            if (j >= hVarArr.length || j < 0) {
                return null;
            }
            return hVarArr[(int) j];
        }

        public static C6262lX0 k(long j) {
            h hVarG = g(j);
            if (hVarG != null) {
                return hVarG.h();
            }
            return C6262lX0.h(F.h().m().g()).q("Unrecognized HTTP/2 error code: " + j);
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) S.clone();
        }

        public long c() {
            return this.B;
        }

        public C6262lX0 h() {
            return this.C;
        }
    }

    /* JADX INFO: renamed from: com.daaw.pU$i */
    public static class i implements C2756Xj0.d {
        @Override // com.daaw.C2756Xj0.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Long b(String str) {
            AbstractC7785qy0.e(str.length() > 0, "empty timeout");
            AbstractC7785qy0.e(str.length() <= 9, "bad timeout format");
            long j = Long.parseLong(str.substring(0, str.length() - 1));
            char cCharAt = str.charAt(str.length() - 1);
            if (cCharAt == 'H') {
                return Long.valueOf(TimeUnit.HOURS.toNanos(j));
            }
            if (cCharAt == 'M') {
                return Long.valueOf(TimeUnit.MINUTES.toNanos(j));
            }
            if (cCharAt == 'S') {
                return Long.valueOf(TimeUnit.SECONDS.toNanos(j));
            }
            if (cCharAt == 'u') {
                return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j));
            }
            if (cCharAt == 'm') {
                return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j));
            }
            if (cCharAt == 'n') {
                return Long.valueOf(j);
            }
            throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(cCharAt)));
        }

        @Override // com.daaw.C2756Xj0.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a(Long l) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l.longValue() < 0) {
                throw new IllegalArgumentException("Timeout too small");
            }
            if (l.longValue() < 100000000) {
                return l + "n";
            }
            if (l.longValue() < 100000000000L) {
                return timeUnit.toMicros(l.longValue()) + "u";
            }
            if (l.longValue() < 100000000000000L) {
                return timeUnit.toMillis(l.longValue()) + "m";
            }
            if (l.longValue() < 100000000000000000L) {
                return timeUnit.toSeconds(l.longValue()) + "S";
            }
            if (l.longValue() < 6000000000000000000L) {
                return timeUnit.toMinutes(l.longValue()) + "M";
            }
            return timeUnit.toHours(l.longValue()) + "H";
        }
    }

    static {
        C2756Xj0.d dVar = C2756Xj0.e;
        e = C2756Xj0.g.e("grpc-encoding", dVar);
        a aVar = null;
        f = AbstractC6962o10.b("grpc-accept-encoding", new g(aVar));
        g = C2756Xj0.g.e("content-encoding", dVar);
        h = AbstractC6962o10.b("accept-encoding", new g(aVar));
        i = C2756Xj0.g.e("content-length", dVar);
        j = C2756Xj0.g.e("content-type", dVar);
        k = C2756Xj0.g.e("te", dVar);
        l = C2756Xj0.g.e("user-agent", dVar);
        m = C9329wV0.a(',').c();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        n = timeUnit.toNanos(20L);
        o = TimeUnit.HOURS.toNanos(2L);
        p = timeUnit.toNanos(20L);
        q = new C8684uB0();
        r = new a();
        s = C1168Ii.c.b("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        t = new b();
        u = new c();
        v = new d();
        w = new e();
    }

    public static URI b(String str) {
        String str2;
        AbstractC7785qy0.o(str, "authority");
        try {
            str2 = str;
        } catch (URISyntaxException e2) {
            e = e2;
            str2 = str;
        }
        try {
            return new URI(null, str2, null, null, null);
        } catch (URISyntaxException e3) {
            e = e3;
            throw new IllegalArgumentException("Invalid authority: " + str2, e);
        }
    }

    public static String c(String str) {
        URI uriB = b(str);
        AbstractC7785qy0.j(uriB.getHost() != null, "No host in authority '%s'", str);
        AbstractC7785qy0.j(uriB.getUserInfo() == null, "Userinfo must not be present on authority: '%s'", str);
        return str;
    }

    public static void d(TX0.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            } else {
                e(next);
            }
        }
    }

    public static void e(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e2) {
            a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    public static AbstractC3246am[] f(C1168Ii c1168Ii, C2756Xj0 c2756Xj0, int i2, boolean z) {
        List listI = c1168Ii.i();
        int size = listI.size();
        AbstractC3246am[] abstractC3246amArr = new AbstractC3246am[size + 1];
        AbstractC3246am.b bVarA = AbstractC3246am.b.a().b(c1168Ii).d(i2).c(z).a();
        for (int i3 = 0; i3 < listI.size(); i3++) {
            abstractC3246amArr[i3] = ((AbstractC3246am.a) listI.get(i3)).a(bVarA, c2756Xj0);
        }
        abstractC3246amArr[size] = t;
        return abstractC3246amArr;
    }

    public static String g(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append('/');
        sb.append("1.52.1");
        return sb.toString();
    }

    public static String h(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", null).invoke(inetSocketAddress, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static ThreadFactory i(String str, boolean z) {
        return new C5289i31().e(z).f(str).b();
    }

    public static InterfaceC3525bm j(AbstractC0304Ac0.e eVar, boolean z) {
        AbstractC0304Ac0.h hVarC = eVar.c();
        InterfaceC3525bm interfaceC3525bmA = hVarC != null ? ((O51) hVarC.d()).a() : null;
        if (interfaceC3525bmA != null) {
            AbstractC3246am.a aVarB = eVar.b();
            return aVarB == null ? interfaceC3525bmA : new f(aVarB, interfaceC3525bmA);
        }
        if (!eVar.a().o()) {
            if (eVar.d()) {
                return new LJ(n(eVar.a()), InterfaceC2971Zl.a.DROPPED);
            }
            if (!z) {
                return new LJ(n(eVar.a()), InterfaceC2971Zl.a.PROCESSED);
            }
        }
        return null;
    }

    public static C6262lX0.b k(int i2) {
        if (i2 >= 100 && i2 < 200) {
            return C6262lX0.b.INTERNAL;
        }
        if (i2 != 400) {
            if (i2 == 401) {
                return C6262lX0.b.UNAUTHENTICATED;
            }
            if (i2 == 403) {
                return C6262lX0.b.PERMISSION_DENIED;
            }
            if (i2 == 404) {
                return C6262lX0.b.UNIMPLEMENTED;
            }
            if (i2 != 429) {
                if (i2 != 431) {
                    switch (i2) {
                        case 502:
                        case 503:
                        case 504:
                            break;
                        default:
                            return C6262lX0.b.UNKNOWN;
                    }
                }
            }
            return C6262lX0.b.UNAVAILABLE;
        }
        return C6262lX0.b.INTERNAL;
    }

    public static C6262lX0 l(int i2) {
        return k(i2).c().q("HTTP status code " + i2);
    }

    public static boolean m(String str) {
        char cCharAt;
        if (str == null || 16 > str.length()) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("application/grpc")) {
            return lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';';
        }
        return false;
    }

    public static C6262lX0 n(C6262lX0 c6262lX0) {
        AbstractC7785qy0.d(c6262lX0 != null);
        if (!b.contains(c6262lX0.m())) {
            return c6262lX0;
        }
        return C6262lX0.t.q("Inappropriate status code from control plane: " + c6262lX0.m() + " " + c6262lX0.n()).p(c6262lX0.l());
    }

    public static boolean o(C1168Ii c1168Ii) {
        return !Boolean.TRUE.equals(c1168Ii.h(s));
    }
}
