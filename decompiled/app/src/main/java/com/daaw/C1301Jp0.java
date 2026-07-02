package com.daaw;

import com.daaw.C0567Cq;
import com.daaw.C1452Lb;
import com.daaw.C6016kg0;
import com.daaw.InterfaceC3803cm;
import com.daaw.NR0;
import com.daaw.T51;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: com.daaw.Jp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1301Jp0 extends M {
    public static final Logger r = Logger.getLogger(C1301Jp0.class.getName());
    public static final C0567Cq s = new C0567Cq.b(C0567Cq.f).f(EnumC2551Vk.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, EnumC2551Vk.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, EnumC2551Vk.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, EnumC2551Vk.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, EnumC2551Vk.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, EnumC2551Vk.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256).i(EnumC4168e41.TLS_1_2).h(true).e();
    public static final long t = TimeUnit.DAYS.toNanos(1000);
    public static final NR0.d u;
    public static final InterfaceC6907np0 v;
    public static final EnumSet w;
    public final C6016kg0 b;
    public SocketFactory f;
    public SSLSocketFactory g;
    public HostnameVerifier i;
    public boolean o;
    public T51.b c = T51.a();
    public InterfaceC6907np0 d = v;
    public InterfaceC6907np0 e = OR0.c(AbstractC7365pU.v);
    public C0567Cq j = s;
    public c k = c.TLS;
    public long l = Long.MAX_VALUE;
    public long m = AbstractC7365pU.n;
    public int n = 65535;
    public int p = Integer.MAX_VALUE;
    public final boolean q = false;
    public final boolean h = false;

    /* JADX INFO: renamed from: com.daaw.Jp0$a */
    public class a implements NR0.d {
        @Override // com.daaw.NR0.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // com.daaw.NR0.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Executor a() {
            return Executors.newCachedThreadPool(AbstractC7365pU.i("grpc-okhttp-%d", true));
        }
    }

    /* JADX INFO: renamed from: com.daaw.Jp0$b */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[c.values().length];
            b = iArr;
            try {
                iArr[c.PLAINTEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[c.TLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC7734qn0.values().length];
            a = iArr2;
            try {
                iArr2[EnumC7734qn0.TLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC7734qn0.PLAINTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Jp0$c */
    public enum c {
        TLS,
        PLAINTEXT
    }

    /* JADX INFO: renamed from: com.daaw.Jp0$d */
    public final class d implements C6016kg0.b {
        public d() {
        }

        @Override // com.daaw.C6016kg0.b
        public int a() {
            return C1301Jp0.this.h();
        }

        public /* synthetic */ d(C1301Jp0 c1301Jp0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Jp0$e */
    public final class e implements C6016kg0.c {
        public e() {
        }

        @Override // com.daaw.C6016kg0.c
        public InterfaceC3803cm a() {
            return C1301Jp0.this.f();
        }

        public /* synthetic */ e(C1301Jp0 c1301Jp0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Jp0$f */
    public static final class f implements InterfaceC3803cm, AutoCloseable {
        public final InterfaceC6907np0 B;
        public final Executor C;
        public final InterfaceC6907np0 D;
        public final ScheduledExecutorService E;
        public final T51.b F;
        public final SocketFactory G;
        public final SSLSocketFactory H;
        public final HostnameVerifier I;
        public final C0567Cq J;
        public final int K;
        public final boolean L;
        public final long M;
        public final C1452Lb N;
        public final long O;
        public final int P;
        public final boolean Q;
        public final int R;
        public final boolean S;
        public boolean T;

        /* JADX INFO: renamed from: com.daaw.Jp0$f$a */
        public class a implements Runnable {
            public final /* synthetic */ C1452Lb.b B;

            public a(C1452Lb.b bVar) {
                this.B = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.B.a();
            }
        }

        public /* synthetic */ f(InterfaceC6907np0 interfaceC6907np0, InterfaceC6907np0 interfaceC6907np02, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C0567Cq c0567Cq, int i, boolean z, long j, long j2, int i2, boolean z2, int i3, T51.b bVar, boolean z3, a aVar) {
            this(interfaceC6907np0, interfaceC6907np02, socketFactory, sSLSocketFactory, hostnameVerifier, c0567Cq, i, z, j, j2, i2, z2, i3, bVar, z3);
        }

        @Override // com.daaw.InterfaceC3803cm
        public ScheduledExecutorService M0() {
            return this.E;
        }

        @Override // com.daaw.InterfaceC3803cm, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.T) {
                return;
            }
            this.T = true;
            this.B.b(this.C);
            this.D.b(this.E);
        }

        @Override // com.daaw.InterfaceC3803cm
        public InterfaceC0463Bq t0(SocketAddress socketAddress, InterfaceC3803cm.a aVar, AbstractC6323lk abstractC6323lk) {
            if (this.T) {
                throw new IllegalStateException("The transport factory is closed.");
            }
            C1452Lb.b bVarD = this.N.d();
            C1612Mp0 c1612Mp0 = new C1612Mp0(this, (InetSocketAddress) socketAddress, aVar.a(), aVar.d(), aVar.b(), aVar.c(), new a(bVarD));
            if (this.L) {
                c1612Mp0.T(true, bVarD.b(), this.O, this.Q);
            }
            return c1612Mp0;
        }

        public f(InterfaceC6907np0 interfaceC6907np0, InterfaceC6907np0 interfaceC6907np02, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C0567Cq c0567Cq, int i, boolean z, long j, long j2, int i2, boolean z2, int i3, T51.b bVar, boolean z3) {
            this.B = interfaceC6907np0;
            this.C = (Executor) interfaceC6907np0.a();
            this.D = interfaceC6907np02;
            this.E = (ScheduledExecutorService) interfaceC6907np02.a();
            this.G = socketFactory;
            this.H = sSLSocketFactory;
            this.I = hostnameVerifier;
            this.J = c0567Cq;
            this.K = i;
            this.L = z;
            this.M = j;
            this.N = new C1452Lb("keepalive time nanos", j);
            this.O = j2;
            this.P = i2;
            this.Q = z2;
            this.R = i3;
            this.S = z3;
            this.F = (T51.b) AbstractC7785qy0.o(bVar, "transportTracerFactory");
        }
    }

    static {
        a aVar = new a();
        u = aVar;
        v = OR0.c(aVar);
        w = EnumSet.of(EnumC3890d41.MTLS, EnumC3890d41.CUSTOM_MANAGERS);
    }

    public C1301Jp0(String str) {
        a aVar = null;
        this.b = new C6016kg0(str, new e(this, aVar), new d(this, aVar));
    }

    public static C1301Jp0 forTarget(String str) {
        return new C1301Jp0(str);
    }

    @Override // com.daaw.M
    public AbstractC5456ig0 e() {
        return this.b;
    }

    public f f() {
        return new f(this.d, this.e, this.f, g(), this.i, this.j, this.a, this.l != Long.MAX_VALUE, this.l, this.m, this.n, this.o, this.p, this.c, false, null);
    }

    public SSLSocketFactory g() {
        int i = b.b[this.k.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i != 2) {
            throw new RuntimeException("Unknown negotiation type: " + this.k);
        }
        try {
            if (this.g == null) {
                this.g = SSLContext.getInstance("Default", C1944Pu0.e().g()).getSocketFactory();
            }
            return this.g;
        } catch (GeneralSecurityException e2) {
            throw new RuntimeException("TLS Provider failure", e2);
        }
    }

    public int h() {
        int i = b.b[this.k.ordinal()];
        if (i == 1) {
            return 80;
        }
        if (i == 2) {
            return 443;
        }
        throw new AssertionError(this.k + " not handled");
    }

    @Override // com.daaw.AbstractC5456ig0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C1301Jp0 c(long j, TimeUnit timeUnit) {
        AbstractC7785qy0.e(j > 0, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j);
        this.l = nanos;
        long jL = F70.l(nanos);
        this.l = jL;
        if (jL >= t) {
            this.l = Long.MAX_VALUE;
        }
        return this;
    }

    @Override // com.daaw.AbstractC5456ig0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C1301Jp0 d() {
        AbstractC7785qy0.u(!this.h, "Cannot change security when using ChannelCredentials");
        this.k = c.PLAINTEXT;
        return this;
    }

    public C1301Jp0 scheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        this.e = new LM((ScheduledExecutorService) AbstractC7785qy0.o(scheduledExecutorService, "scheduledExecutorService"));
        return this;
    }

    public C1301Jp0 sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        AbstractC7785qy0.u(!this.h, "Cannot change security when using ChannelCredentials");
        this.g = sSLSocketFactory;
        this.k = c.TLS;
        return this;
    }

    public C1301Jp0 transportExecutor(Executor executor) {
        if (executor == null) {
            this.d = v;
            return this;
        }
        this.d = new LM(executor);
        return this;
    }
}
