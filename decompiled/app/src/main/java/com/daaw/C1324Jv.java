package com.daaw;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.daaw.C0384Aw0;
import com.daaw.C0833Fc0;
import com.daaw.C3561bt0;
import com.daaw.InterfaceC0804Ev;
import com.daaw.InterfaceC0937Gc0;
import com.daaw.InterfaceC1792Oi0;
import com.daaw.InterfaceC1896Pi0;
import com.daaw.InterfaceC2595Vv;
import com.daaw.L31;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.Jv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1324Jv extends AbstractC0632De {
    public final boolean G;
    public final InterfaceC2595Vv.a H;
    public final InterfaceC0804Ev.a I;
    public final InterfaceC0884Fp J;
    public final int K;
    public final long L;
    public final InterfaceC1896Pi0.a M;
    public final C3561bt0.a N;
    public final g O;
    public final Object P;
    public final SparseArray Q;
    public final Runnable R;
    public final Runnable S;
    public final C0384Aw0.b T;
    public final InterfaceC0937Gc0 U;
    public final Object V;
    public InterfaceC2595Vv W;
    public C0833Fc0 X;
    public IOException Y;
    public Handler Z;
    public Uri a0;
    public Uri b0;
    public C0908Fv c0;
    public boolean d0;
    public long e0;
    public long f0;
    public long g0;
    public int h0;
    public long i0;
    public boolean j0;
    public int k0;

    /* JADX INFO: renamed from: com.daaw.Jv$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1324Jv.this.N();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Jv$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1324Jv.this.H(false);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Jv$c */
    public static final class c extends L31 {
        public final long b;
        public final long c;
        public final int d;
        public final long e;
        public final long f;
        public final long g;
        public final C0908Fv h;
        public final Object i;

        public c(long j, long j2, int i, long j3, long j4, long j5, C0908Fv c0908Fv, Object obj) {
            this.b = j;
            this.c = j2;
            this.d = i;
            this.e = j3;
            this.f = j4;
            this.g = j5;
            this.h = c0908Fv;
            this.i = obj;
        }

        @Override // com.daaw.L31
        public int b(Object obj) {
            int iIntValue;
            int i;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue()) >= (i = this.d) && iIntValue < i + h()) {
                return iIntValue - this.d;
            }
            return -1;
        }

        @Override // com.daaw.L31
        public L31.b g(int i, L31.b bVar, boolean z) {
            AbstractC7115ob.c(i, 0, this.h.e());
            return bVar.o(z ? this.h.d(i).a : null, z ? Integer.valueOf(this.d + AbstractC7115ob.c(i, 0, this.h.e())) : null, 0, this.h.g(i), AbstractC6025ki.a(this.h.d(i).b - this.h.d(0).b) - this.e);
        }

        @Override // com.daaw.L31
        public int h() {
            return this.h.e();
        }

        @Override // com.daaw.L31
        public L31.c m(int i, L31.c cVar, boolean z, long j) {
            AbstractC7115ob.c(i, 0, 1);
            long jQ = q(j);
            return cVar.e(z ? this.i : null, this.b, this.c, true, this.h.d, jQ, this.f, 0, r1.e() - 1, this.e);
        }

        @Override // com.daaw.L31
        public int n() {
            return 1;
        }

        public final long q(long j) {
            InterfaceC1428Kv interfaceC1428KvI;
            long j2 = this.g;
            C0908Fv c0908Fv = this.h;
            if (!c0908Fv.d) {
                return j2;
            }
            if (j > 0) {
                j2 += j;
                if (j2 > this.f) {
                    return -9223372036854775807L;
                }
            }
            long j3 = this.e + j2;
            long jG = c0908Fv.g(0);
            int i = 0;
            while (i < this.h.e() - 1 && j3 >= jG) {
                j3 -= jG;
                i++;
                jG = this.h.g(i);
            }
            C1421Kt0 c1421Kt0D = this.h.d(i);
            int iA = c1421Kt0D.a(2);
            return (iA == -1 || (interfaceC1428KvI = ((AbstractC6202lI0) ((W2) c1421Kt0D.c.get(iA)).c.get(0)).i()) == null || interfaceC1428KvI.h(jG) == 0) ? j2 : (j2 + interfaceC1428KvI.b(interfaceC1428KvI.e(j3, jG))) - j3;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Jv$d */
    public final class d implements C0384Aw0.b {
        public d() {
        }

        @Override // com.daaw.C0384Aw0.b
        public void a() {
            C1324Jv.this.z();
        }

        @Override // com.daaw.C0384Aw0.b
        public void b(long j) {
            C1324Jv.this.y(j);
        }

        @Override // com.daaw.C0384Aw0.b
        public void c() {
            C1324Jv.this.x();
        }

        public /* synthetic */ d(C1324Jv c1324Jv, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Jv$e */
    public static final class e {
        public final InterfaceC0804Ev.a a;
        public final InterfaceC2595Vv.a b;
        public C3561bt0.a c;
        public boolean g;
        public Object h;
        public int e = 3;
        public long f = -1;
        public InterfaceC0884Fp d = new C2703Ww();

        public e(InterfaceC0804Ev.a aVar, InterfaceC2595Vv.a aVar2) {
            this.a = (InterfaceC0804Ev.a) AbstractC7115ob.e(aVar);
            this.b = aVar2;
        }

        public C1324Jv a(Uri uri) {
            this.g = true;
            if (this.c == null) {
                this.c = new C1012Gv();
            }
            return new C1324Jv(null, (Uri) AbstractC7115ob.e(uri), this.b, this.c, this.a, this.d, this.e, this.f, this.h, null);
        }

        public e b(C3561bt0.a aVar) {
            AbstractC7115ob.f(!this.g);
            this.c = (C3561bt0.a) AbstractC7115ob.e(aVar);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Jv$f */
    public static final class f implements C3561bt0.a {
        public static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // com.daaw.C3561bt0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8"))).readLine();
            try {
                Matcher matcher = a.matcher(line);
                if (!matcher.matches()) {
                    throw new C3000Zs0("Couldn't parse timestamp: " + line);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j2 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= j * (((j2 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000);
                }
                return Long.valueOf(time);
            } catch (ParseException e) {
                throw new C3000Zs0(e);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Jv$g */
    public final class g implements C0833Fc0.a {
        public g() {
        }

        @Override // com.daaw.C0833Fc0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void p(C3561bt0 c3561bt0, long j, long j2, boolean z) {
            C1324Jv.this.A(c3561bt0, j, j2);
        }

        @Override // com.daaw.C0833Fc0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void s(C3561bt0 c3561bt0, long j, long j2) {
            C1324Jv.this.B(c3561bt0, j, j2);
        }

        @Override // com.daaw.C0833Fc0.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int k(C3561bt0 c3561bt0, long j, long j2, IOException iOException) {
            return C1324Jv.this.C(c3561bt0, j, j2, iOException);
        }

        public /* synthetic */ g(C1324Jv c1324Jv, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Jv$h */
    public final class h implements InterfaceC0937Gc0 {
        public h() {
        }

        public final void a() throws IOException {
            if (C1324Jv.this.Y != null) {
                throw C1324Jv.this.Y;
            }
        }

        @Override // com.daaw.InterfaceC0937Gc0
        public void b() throws IOException {
            C1324Jv.this.X.b();
            a();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Jv$i */
    public static final class i {
        public final boolean a;
        public final long b;
        public final long c;

        public i(boolean z, long j, long j2) {
            this.a = z;
            this.b = j;
            this.c = j2;
        }

        public static i a(C1421Kt0 c1421Kt0, long j) {
            int i;
            C1421Kt0 c1421Kt02 = c1421Kt0;
            int size = c1421Kt02.c.size();
            long jMin = Long.MAX_VALUE;
            int i2 = 0;
            boolean z = false;
            boolean zF = false;
            long jMax = 0;
            while (i2 < size) {
                InterfaceC1428Kv interfaceC1428KvI = ((AbstractC6202lI0) ((W2) c1421Kt02.c.get(i2)).c.get(0)).i();
                if (interfaceC1428KvI == null) {
                    return new i(true, 0L, j);
                }
                zF |= interfaceC1428KvI.f();
                int iH = interfaceC1428KvI.h(j);
                if (iH == 0) {
                    z = true;
                    i = size;
                    jMax = 0;
                    jMin = 0;
                } else if (z) {
                    i = size;
                } else {
                    long jG = interfaceC1428KvI.g();
                    i = size;
                    jMax = Math.max(jMax, interfaceC1428KvI.b(jG));
                    if (iH != -1) {
                        long j2 = (jG + ((long) iH)) - 1;
                        jMin = Math.min(jMin, interfaceC1428KvI.b(j2) + interfaceC1428KvI.c(j2, j));
                    }
                }
                i2++;
                c1421Kt02 = c1421Kt0;
                size = i;
            }
            return new i(zF, jMax, jMin);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Jv$j */
    public final class j implements C0833Fc0.a {
        public j() {
        }

        @Override // com.daaw.C0833Fc0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void p(C3561bt0 c3561bt0, long j, long j2, boolean z) {
            C1324Jv.this.A(c3561bt0, j, j2);
        }

        @Override // com.daaw.C0833Fc0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void s(C3561bt0 c3561bt0, long j, long j2) {
            C1324Jv.this.D(c3561bt0, j, j2);
        }

        @Override // com.daaw.C0833Fc0.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int k(C3561bt0 c3561bt0, long j, long j2, IOException iOException) {
            return C1324Jv.this.E(c3561bt0, j, j2, iOException);
        }

        public /* synthetic */ j(C1324Jv c1324Jv, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Jv$k */
    public static final class k implements C3561bt0.a {
        public k() {
        }

        @Override // com.daaw.C3561bt0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) {
            return Long.valueOf(AbstractC6280lb1.O(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        public /* synthetic */ k(a aVar) {
            this();
        }
    }

    static {
        AbstractC3118aJ.a("goog.exo.dash");
    }

    public /* synthetic */ C1324Jv(C0908Fv c0908Fv, Uri uri, InterfaceC2595Vv.a aVar, C3561bt0.a aVar2, InterfaceC0804Ev.a aVar3, InterfaceC0884Fp interfaceC0884Fp, int i2, long j2, Object obj, a aVar4) {
        this(c0908Fv, uri, aVar, aVar2, aVar3, interfaceC0884Fp, i2, j2, obj);
    }

    public void A(C3561bt0 c3561bt0, long j2, long j3) {
        this.M.f(c3561bt0.a, c3561bt0.b, j2, j3, c3561bt0.c());
    }

    public void B(C3561bt0 c3561bt0, long j2, long j3) {
        this.M.i(c3561bt0.a, c3561bt0.b, j2, j3, c3561bt0.c());
        C0908Fv c0908Fv = (C0908Fv) c3561bt0.d();
        C0908Fv c0908Fv2 = this.c0;
        int iE = c0908Fv2 == null ? 0 : c0908Fv2.e();
        long j4 = c0908Fv.d(0).b;
        int i2 = 0;
        while (i2 < iE && this.c0.d(i2).b < j4) {
            i2++;
        }
        if (c0908Fv.d) {
            if (iE - i2 <= c0908Fv.e() && !this.j0) {
                long j5 = this.i0;
                if (j5 == -9223372036854775807L || c0908Fv.h * 1000 > j5) {
                    this.h0 = 0;
                }
            }
            int i3 = this.h0;
            this.h0 = i3 + 1;
            if (i3 < this.K) {
                L(v());
                return;
            } else {
                this.Y = new C1116Hv();
                return;
            }
        }
        this.c0 = c0908Fv;
        this.d0 &= c0908Fv.d;
        this.e0 = j2 - j3;
        this.f0 = j2;
        if (c0908Fv.j != null) {
            synchronized (this.P) {
                try {
                    if (c3561bt0.a.a == this.b0) {
                        this.b0 = this.c0.j;
                    }
                } finally {
                }
            }
        }
        if (iE != 0) {
            this.k0 += i2;
            H(true);
            return;
        }
        C3193ab1 c3193ab1 = this.c0.i;
        if (c3193ab1 != null) {
            I(c3193ab1);
        } else {
            H(true);
        }
    }

    public int C(C3561bt0 c3561bt0, long j2, long j3, IOException iOException) {
        boolean z = iOException instanceof C3000Zs0;
        this.M.l(c3561bt0.a, c3561bt0.b, j2, j3, c3561bt0.c(), iOException, z);
        return z ? 3 : 0;
    }

    public void D(C3561bt0 c3561bt0, long j2, long j3) {
        this.M.i(c3561bt0.a, c3561bt0.b, j2, j3, c3561bt0.c());
        G(((Long) c3561bt0.d()).longValue() - j2);
    }

    public int E(C3561bt0 c3561bt0, long j2, long j3, IOException iOException) {
        this.M.l(c3561bt0.a, c3561bt0.b, j2, j3, c3561bt0.c(), iOException, true);
        F(iOException);
        return 2;
    }

    public final void F(IOException iOException) {
        H(true);
    }

    public final void G(long j2) {
        this.g0 = j2;
        H(true);
    }

    public final void H(boolean z) {
        boolean z2;
        long j2;
        for (int i2 = 0; i2 < this.Q.size(); i2++) {
            int iKeyAt = this.Q.keyAt(i2);
            if (iKeyAt >= this.k0) {
                ((C1220Iv) this.Q.valueAt(i2)).H(this.c0, iKeyAt - this.k0);
            }
        }
        int iE = this.c0.e() - 1;
        i iVarA = i.a(this.c0.d(0), this.c0.g(0));
        i iVarA2 = i.a(this.c0.d(iE), this.c0.g(iE));
        long jMax = iVarA.b;
        long jMin = iVarA2.c;
        if (!this.c0.d || iVarA2.a) {
            z2 = false;
        } else {
            jMin = Math.min((w() - AbstractC6025ki.a(this.c0.a)) - AbstractC6025ki.a(this.c0.d(iE).b), jMin);
            long j3 = this.c0.f;
            if (j3 != -9223372036854775807L) {
                long jA = jMin - AbstractC6025ki.a(j3);
                while (jA < 0 && iE > 0) {
                    iE--;
                    jA += this.c0.g(iE);
                }
                jMax = iE == 0 ? Math.max(jMax, jA) : this.c0.g(0);
            }
            z2 = true;
        }
        long j4 = jMax;
        long jG = jMin - j4;
        for (int i3 = 0; i3 < this.c0.e() - 1; i3++) {
            jG += this.c0.g(i3);
        }
        C0908Fv c0908Fv = this.c0;
        if (c0908Fv.d) {
            long j5 = this.L;
            if (j5 == -1) {
                long j6 = c0908Fv.g;
                if (j6 == -9223372036854775807L) {
                    j6 = 30000;
                }
                j5 = j6;
            }
            long jA2 = jG - AbstractC6025ki.a(j5);
            if (jA2 < 5000000) {
                jA2 = Math.min(5000000L, jG / 2);
            }
            j2 = jA2;
        } else {
            j2 = 0;
        }
        C0908Fv c0908Fv2 = this.c0;
        long jB = c0908Fv2.a + c0908Fv2.d(0).b + AbstractC6025ki.b(j4);
        C0908Fv c0908Fv3 = this.c0;
        n(new c(c0908Fv3.a, jB, this.k0, j4, jG, j2, c0908Fv3, this.V), this.c0);
        if (this.G) {
            return;
        }
        this.Z.removeCallbacks(this.S);
        if (z2) {
            this.Z.postDelayed(this.S, 5000L);
        }
        if (this.d0) {
            N();
            return;
        }
        if (z) {
            C0908Fv c0908Fv4 = this.c0;
            if (c0908Fv4.d) {
                long j7 = c0908Fv4.e;
                if (j7 != -9223372036854775807L) {
                    L(Math.max(0L, (this.e0 + (j7 != 0 ? j7 : 5000L)) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    public final void I(C3193ab1 c3193ab1) {
        String str = c3193ab1.a;
        if (AbstractC6280lb1.b(str, "urn:mpeg:dash:utc:direct:2014") || AbstractC6280lb1.b(str, "urn:mpeg:dash:utc:direct:2012")) {
            J(c3193ab1);
            return;
        }
        if (AbstractC6280lb1.b(str, "urn:mpeg:dash:utc:http-iso:2014") || AbstractC6280lb1.b(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            K(c3193ab1, new f());
        } else if (AbstractC6280lb1.b(str, "urn:mpeg:dash:utc:http-xsdate:2014") || AbstractC6280lb1.b(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            K(c3193ab1, new k(null));
        } else {
            F(new IOException("Unsupported UTC timing scheme"));
        }
    }

    public final void J(C3193ab1 c3193ab1) {
        try {
            G(AbstractC6280lb1.O(c3193ab1.b) - this.f0);
        } catch (C3000Zs0 e2) {
            F(e2);
        }
    }

    public final void K(C3193ab1 c3193ab1, C3561bt0.a aVar) {
        M(new C3561bt0(this.W, Uri.parse(c3193ab1.b), 5, aVar), new j(this, null), 1);
    }

    public final void L(long j2) {
        this.Z.postDelayed(this.R, j2);
    }

    public final void M(C3561bt0 c3561bt0, C0833Fc0.a aVar, int i2) {
        this.M.o(c3561bt0.a, c3561bt0.b, this.X.k(c3561bt0, aVar, i2));
    }

    public final void N() {
        Uri uri;
        this.Z.removeCallbacks(this.R);
        if (this.X.g()) {
            this.d0 = true;
            return;
        }
        synchronized (this.P) {
            uri = this.b0;
        }
        this.d0 = false;
        M(new C3561bt0(this.W, uri, 4, this.N), this.O, this.K);
    }

    @Override // com.daaw.InterfaceC1792Oi0
    public void a(InterfaceC9110vi0 interfaceC9110vi0) {
        C1220Iv c1220Iv = (C1220Iv) interfaceC9110vi0;
        c1220Iv.C();
        this.Q.remove(c1220Iv.B);
    }

    @Override // com.daaw.InterfaceC1792Oi0
    public void e() {
        this.U.b();
    }

    @Override // com.daaw.InterfaceC1792Oi0
    public InterfaceC9110vi0 g(InterfaceC1792Oi0.a aVar, O3 o3) {
        int i2 = aVar.a;
        C1220Iv c1220Iv = new C1220Iv(this.k0 + i2, this.c0, i2, this.I, this.K, l(aVar, this.c0.d(i2).b), this.g0, this.U, o3, this.J, this.T);
        this.Q.put(c1220Iv.B, c1220Iv);
        return c1220Iv;
    }

    @Override // com.daaw.AbstractC0632De
    public void m(WI wi, boolean z) {
        if (this.G) {
            H(false);
            return;
        }
        this.W = this.H.a();
        this.X = new C0833Fc0("Loader:DashMediaSource");
        this.Z = new Handler();
        N();
    }

    @Override // com.daaw.AbstractC0632De
    public void o() {
        this.d0 = false;
        this.W = null;
        C0833Fc0 c0833Fc0 = this.X;
        if (c0833Fc0 != null) {
            c0833Fc0.i();
            this.X = null;
        }
        this.e0 = 0L;
        this.f0 = 0L;
        this.c0 = this.G ? this.c0 : null;
        this.b0 = this.a0;
        this.Y = null;
        Handler handler = this.Z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.Z = null;
        }
        this.g0 = 0L;
        this.h0 = 0;
        this.i0 = -9223372036854775807L;
        this.j0 = false;
        this.k0 = 0;
        this.Q.clear();
    }

    public final long v() {
        return Math.min((this.h0 - 1) * 1000, 5000);
    }

    public final long w() {
        return this.g0 != 0 ? AbstractC6025ki.a(SystemClock.elapsedRealtime() + this.g0) : AbstractC6025ki.a(System.currentTimeMillis());
    }

    public void x() {
        this.j0 = true;
    }

    public void y(long j2) {
        long j3 = this.i0;
        if (j3 == -9223372036854775807L || j3 < j2) {
            this.i0 = j2;
        }
    }

    public void z() {
        this.Z.removeCallbacks(this.S);
        N();
    }

    public C1324Jv(C0908Fv c0908Fv, Uri uri, InterfaceC2595Vv.a aVar, C3561bt0.a aVar2, InterfaceC0804Ev.a aVar3, InterfaceC0884Fp interfaceC0884Fp, int i2, long j2, Object obj) {
        this.a0 = uri;
        this.c0 = c0908Fv;
        this.b0 = uri;
        this.H = aVar;
        this.N = aVar2;
        this.I = aVar3;
        this.K = i2;
        this.L = j2;
        this.J = interfaceC0884Fp;
        this.V = obj;
        boolean z = c0908Fv != null;
        this.G = z;
        a aVar4 = null;
        this.M = j(null);
        this.P = new Object();
        this.Q = new SparseArray();
        this.T = new d(this, aVar4);
        this.i0 = -9223372036854775807L;
        if (!z) {
            this.O = new g(this, aVar4);
            this.U = new h();
            this.R = new a();
            this.S = new b();
            return;
        }
        AbstractC7115ob.f(!c0908Fv.d);
        this.O = null;
        this.R = null;
        this.S = null;
        this.U = new InterfaceC0937Gc0.a();
    }
}
