package com.daaw;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.daaw.AbstractC1316Jt;
import com.daaw.AbstractC3454bX0;
import com.daaw.C3003Zt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.daaw.zt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C10280zt {
    public static final FilenameFilter s = new FilenameFilter() { // from class: com.daaw.yt
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(".ae");
        }
    };
    public final Context a;
    public final C1739Nv b;
    public final C0579Ct c;
    public final C2199Sa1 d;
    public final C9722xt e;
    public final SX f;
    public final RK g;
    public final U9 h;
    public final C0941Gd0 i;
    public final InterfaceC0692Dt j;
    public final InterfaceC3609c4 k;
    public final C7629qQ0 l;
    public C3003Zt m;
    public OQ0 n = null;
    public final C7521q11 o = new C7521q11();
    public final C7521q11 p = new C7521q11();
    public final C7521q11 q = new C7521q11();
    public final AtomicBoolean r = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.daaw.zt$a */
    public class a implements C3003Zt.a {
        public a() {
        }

        @Override // com.daaw.C3003Zt.a
        public void a(OQ0 oq0, Thread thread, Throwable th) throws Throwable {
            C10280zt.this.H(oq0, thread, th);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zt$b */
    public class b implements Callable {
        public final /* synthetic */ long a;
        public final /* synthetic */ Throwable b;
        public final /* synthetic */ Thread c;
        public final /* synthetic */ OQ0 d;
        public final /* synthetic */ boolean e;

        /* JADX INFO: renamed from: com.daaw.zt$b$a */
        public class a implements InterfaceC9066vZ0 {
            public final /* synthetic */ Executor a;
            public final /* synthetic */ String b;

            public a(Executor executor, String str) {
                this.a = executor;
                this.b = str;
            }

            @Override // com.daaw.InterfaceC9066vZ0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public AbstractC6963o11 a(BQ0 bq0) {
                if (bq0 != null) {
                    return A11.g(C10280zt.this.M(), C10280zt.this.l.v(this.a, b.this.e ? this.b : null));
                }
                C2106Rd0.f().k("Received null app settings, cannot send reports at crash time.");
                return A11.e(null);
            }
        }

        public b(long j, Throwable th, Thread thread, OQ0 oq0, boolean z) {
            this.a = j;
            this.b = th;
            this.c = thread;
            this.d = oq0;
            this.e = z;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC6963o11 call() {
            long jF = C10280zt.F(this.a);
            String strB = C10280zt.this.B();
            if (strB == null) {
                C2106Rd0.f().d("Tried to write a fatal exception while no session was open.");
                return A11.e(null);
            }
            C10280zt.this.c.a();
            C10280zt.this.l.q(this.b, this.c, strB, jF);
            C10280zt.this.w(this.a);
            C10280zt.this.t(this.d);
            C10280zt.this.v(new C6592mi(C10280zt.this.f).toString());
            if (!C10280zt.this.b.d()) {
                return A11.e(null);
            }
            Executor executorC = C10280zt.this.e.c();
            return this.d.a().p(executorC, new a(executorC, strB));
        }
    }

    /* JADX INFO: renamed from: com.daaw.zt$c */
    public class c implements InterfaceC9066vZ0 {
        public c() {
        }

        @Override // com.daaw.InterfaceC9066vZ0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC6963o11 a(Void r1) {
            return A11.e(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zt$d */
    public class d implements InterfaceC9066vZ0 {
        public final /* synthetic */ AbstractC6963o11 a;

        /* JADX INFO: renamed from: com.daaw.zt$d$a */
        public class a implements Callable {
            public final /* synthetic */ Boolean a;

            /* JADX INFO: renamed from: com.daaw.zt$d$a$a, reason: collision with other inner class name */
            public class C0260a implements InterfaceC9066vZ0 {
                public final /* synthetic */ Executor a;

                public C0260a(Executor executor) {
                    this.a = executor;
                }

                @Override // com.daaw.InterfaceC9066vZ0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public AbstractC6963o11 a(BQ0 bq0) {
                    if (bq0 == null) {
                        C2106Rd0.f().k("Received null app settings at app startup. Cannot send cached reports");
                        return A11.e(null);
                    }
                    C10280zt.this.M();
                    C10280zt.this.l.u(this.a);
                    C10280zt.this.q.e(null);
                    return A11.e(null);
                }
            }

            public a(Boolean bool) {
                this.a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public AbstractC6963o11 call() {
                if (this.a.booleanValue()) {
                    C2106Rd0.f().b("Sending cached crash reports...");
                    C10280zt.this.b.c(this.a.booleanValue());
                    Executor executorC = C10280zt.this.e.c();
                    return d.this.a.p(executorC, new C0260a(executorC));
                }
                C2106Rd0.f().i("Deleting cached crash reports...");
                C10280zt.r(C10280zt.this.K());
                C10280zt.this.l.t();
                C10280zt.this.q.e(null);
                return A11.e(null);
            }
        }

        public d(AbstractC6963o11 abstractC6963o11) {
            this.a = abstractC6963o11;
        }

        @Override // com.daaw.InterfaceC9066vZ0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC6963o11 a(Boolean bool) {
            return C10280zt.this.e.i(new a(bool));
        }
    }

    /* JADX INFO: renamed from: com.daaw.zt$e */
    public class e implements Callable {
        public final /* synthetic */ long a;
        public final /* synthetic */ String b;

        public e(long j, String str) {
            this.a = j;
            this.b = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (C10280zt.this.J()) {
                return null;
            }
            C10280zt.this.i.g(this.a, this.b);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.zt$f */
    public class f implements Runnable {
        public final /* synthetic */ long B;
        public final /* synthetic */ Throwable C;
        public final /* synthetic */ Thread D;

        public f(long j, Throwable th, Thread thread) {
            this.B = j;
            this.C = th;
            this.D = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C10280zt.this.J()) {
                return;
            }
            long jF = C10280zt.F(this.B);
            String strB = C10280zt.this.B();
            if (strB == null) {
                C2106Rd0.f().k("Tried to write a non-fatal exception while no session was open.");
            } else {
                C10280zt.this.l.r(this.C, this.D, strB, jF);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.zt$g */
    public class g implements Callable {
        public final /* synthetic */ String a;

        public g(String str) {
            this.a = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            C10280zt.this.v(this.a);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.zt$h */
    public class h implements Callable {
        public final /* synthetic */ long a;

        public h(long j) {
            this.a = j;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong(DiagnosticsEntry.Event.TIMESTAMP_KEY, this.a);
            C10280zt.this.k.a("_ae", bundle);
            return null;
        }
    }

    public C10280zt(Context context, C9722xt c9722xt, SX sx, C1739Nv c1739Nv, RK rk, C0579Ct c0579Ct, U9 u9, C2199Sa1 c2199Sa1, C0941Gd0 c0941Gd0, C7629qQ0 c7629qQ0, InterfaceC0692Dt interfaceC0692Dt, InterfaceC3609c4 interfaceC3609c4) {
        this.a = context;
        this.e = c9722xt;
        this.f = sx;
        this.b = c1739Nv;
        this.g = rk;
        this.c = c0579Ct;
        this.h = u9;
        this.d = c2199Sa1;
        this.i = c0941Gd0;
        this.j = interfaceC0692Dt;
        this.k = interfaceC3609c4;
        this.l = c7629qQ0;
    }

    public static boolean A() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static long C() {
        return F(System.currentTimeMillis());
    }

    public static List D(InterfaceC5772jn0 interfaceC5772jn0, String str, RK rk, byte[] bArr) {
        File fileO = rk.o(str, "user-data");
        File fileO2 = rk.o(str, "keys");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C5746ji("logs_file", "logs", bArr));
        arrayList.add(new C10121zK("crash_meta_file", "metadata", interfaceC5772jn0.g()));
        arrayList.add(new C10121zK("session_meta_file", "session", interfaceC5772jn0.f()));
        arrayList.add(new C10121zK("app_meta_file", "app", interfaceC5772jn0.a()));
        arrayList.add(new C10121zK("device_meta_file", "device", interfaceC5772jn0.c()));
        arrayList.add(new C10121zK("os_meta_file", "os", interfaceC5772jn0.b()));
        arrayList.add(O(interfaceC5772jn0));
        arrayList.add(new C10121zK("user_meta_file", "user", fileO));
        arrayList.add(new C10121zK("keys_file", "keys", fileO2));
        return arrayList;
    }

    public static long F(long j) {
        return j / 1000;
    }

    public static boolean N(String str, File file, AbstractC1316Jt.a aVar) {
        if (file == null || !file.exists()) {
            C2106Rd0.f().k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            C2106Rd0.f().g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    public static InterfaceC5213hn0 O(InterfaceC5772jn0 interfaceC5772jn0) {
        File fileE = interfaceC5772jn0.e();
        return (fileE == null || !fileE.exists()) ? new C5746ji("minidump_file", "minidump", new byte[]{0}) : new C10121zK("minidump_file", "minidump", fileE);
    }

    public static byte[] Q(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static AbstractC3454bX0.a o(SX sx, U9 u9) {
        return AbstractC3454bX0.a.b(sx.f(), u9.f, u9.g, sx.a(), EnumC4141dz.a(u9.d).c(), u9.h);
    }

    public static AbstractC3454bX0.b p() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return AbstractC3454bX0.b.c(AbstractC0555Cn.m(), Build.MODEL, Runtime.getRuntime().availableProcessors(), AbstractC0555Cn.t(), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), AbstractC0555Cn.z(), AbstractC0555Cn.n(), Build.MANUFACTURER, Build.PRODUCT);
    }

    public static AbstractC3454bX0.c q() {
        return AbstractC3454bX0.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, AbstractC0555Cn.A());
    }

    public static void r(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public final String B() {
        SortedSet sortedSetM = this.l.m();
        if (sortedSetM.isEmpty()) {
            return null;
        }
        return (String) sortedSetM.first();
    }

    public final InputStream E(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            C2106Rd0.f().k("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        C2106Rd0.f().g("No version control information found");
        return null;
    }

    public String G() {
        InputStream inputStreamE = E("META-INF/version-control-info.textproto");
        if (inputStreamE == null) {
            return null;
        }
        C2106Rd0.f().b("Read version control info");
        return Base64.encodeToString(Q(inputStreamE), 0);
    }

    public void H(OQ0 oq0, Thread thread, Throwable th) throws Throwable {
        I(oq0, thread, th, false);
    }

    public synchronized void I(OQ0 oq0, Thread thread, Throwable th, boolean z) throws Throwable {
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            C2106Rd0.f().b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
            try {
                AbstractC0622Db1.f(this.e.i(new b(System.currentTimeMillis(), th, thread, oq0, z)));
            } catch (TimeoutException unused) {
                C2106Rd0.f().d("Cannot send reports. Timed out while fetching settings.");
            } catch (Exception e2) {
                C2106Rd0.f().e("Error handling uncaught exception", e2);
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public boolean J() {
        C3003Zt c3003Zt = this.m;
        return c3003Zt != null && c3003Zt.a();
    }

    public List K() {
        return this.g.f(s);
    }

    public final AbstractC6963o11 L(long j) {
        if (A()) {
            C2106Rd0.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return A11.e(null);
        }
        C2106Rd0.f().b("Logging app exception event to Firebase Analytics");
        return A11.c(new ScheduledThreadPoolExecutor(1), new h(j));
    }

    public final AbstractC6963o11 M() {
        ArrayList arrayList = new ArrayList();
        for (File file : K()) {
            try {
                arrayList.add(L(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                C2106Rd0.f().k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return A11.f(arrayList);
    }

    public void P(String str) {
        this.e.h(new g(str));
    }

    public void R() {
        try {
            String strG = G();
            if (strG != null) {
                S("com.crashlytics.version-control-info", strG);
                C2106Rd0.f().g("Saved version control info");
            }
        } catch (IOException e2) {
            C2106Rd0.f().l("Unable to save version control info", e2);
        }
    }

    public void S(String str, String str2) {
        try {
            this.d.h(str, str2);
        } catch (IllegalArgumentException e2) {
            Context context = this.a;
            if (context != null && AbstractC0555Cn.x(context)) {
                throw e2;
            }
            C2106Rd0.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public AbstractC6963o11 T(AbstractC6963o11 abstractC6963o11) {
        if (this.l.l()) {
            C2106Rd0.f().i("Crash reports are available to be sent.");
            return U().o(new d(abstractC6963o11));
        }
        C2106Rd0.f().i("No crash reports are available to be sent.");
        this.o.e(Boolean.FALSE);
        return A11.e(null);
    }

    public final AbstractC6963o11 U() {
        if (this.b.d()) {
            C2106Rd0.f().b("Automatic data collection is enabled. Allowing upload.");
            this.o.e(Boolean.FALSE);
            return A11.e(Boolean.TRUE);
        }
        C2106Rd0.f().b("Automatic data collection is disabled.");
        C2106Rd0.f().i("Notifying that unsent reports are available.");
        this.o.e(Boolean.TRUE);
        AbstractC6963o11 abstractC6963o11O = this.b.g().o(new c());
        C2106Rd0.f().b("Waiting for send/deleteUnsentReports to be called.");
        return AbstractC0622Db1.i(abstractC6963o11O, this.p.a());
    }

    public final void V(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            C2106Rd0.f().i("ANR feature enabled, but device is API " + i);
            return;
        }
        List historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.l.s(str, historicalProcessExitReasons, new C0941Gd0(this.g, str), C2199Sa1.f(str, this.g, this.e));
        } else {
            C2106Rd0.f().i("No ApplicationExitInfo available. Session: " + str);
        }
    }

    public void W(Thread thread, Throwable th) {
        this.e.g(new f(System.currentTimeMillis(), th, thread));
    }

    public void X(long j, String str) {
        this.e.h(new e(j, str));
    }

    public boolean s() {
        if (!this.c.c()) {
            String strB = B();
            return strB != null && this.j.c(strB);
        }
        C2106Rd0.f().i("Found previous crash marker.");
        this.c.d();
        return true;
    }

    public void t(OQ0 oq0) {
        u(false, oq0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(boolean z, OQ0 oq0) {
        ArrayList arrayList = new ArrayList(this.l.m());
        if (arrayList.size() <= z) {
            C2106Rd0.f().i("No open sessions to be closed.");
            return;
        }
        String str = (String) arrayList.get(z ? 1 : 0);
        if (oq0.b().b.b) {
            V(str);
        } else {
            C2106Rd0.f().i("ANR feature disabled.");
        }
        if (this.j.c(str)) {
            y(str);
        }
        this.l.i(C(), z != 0 ? (String) arrayList.get(0) : null);
    }

    public final void v(String str) {
        long jC = C();
        C2106Rd0.f().b("Opening a new session with ID " + str);
        this.j.d(str, String.format(Locale.US, "Crashlytics Android SDK/%s", C0475Bt.i()), jC, AbstractC3454bX0.b(o(this.f, this.h), q(), p()));
        this.i.e(str);
        this.l.n(str, jC);
    }

    public final void w(long j) {
        try {
            if (this.g.e(".ae" + j).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e2) {
            C2106Rd0.f().l("Could not create app exception marker file.", e2);
        }
    }

    public void x(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, OQ0 oq0) {
        this.n = oq0;
        P(str);
        C3003Zt c3003Zt = new C3003Zt(new a(), oq0, uncaughtExceptionHandler, this.j);
        this.m = c3003Zt;
        Thread.setDefaultUncaughtExceptionHandler(c3003Zt);
    }

    public final void y(String str) {
        C2106Rd0.f().i("Finalizing native report for session " + str);
        InterfaceC5772jn0 interfaceC5772jn0A = this.j.a(str);
        File fileE = interfaceC5772jn0A.e();
        AbstractC1316Jt.a aVarD = interfaceC5772jn0A.d();
        if (N(str, fileE, aVarD)) {
            C2106Rd0.f().k("No native core present");
            return;
        }
        long jLastModified = fileE.lastModified();
        C0941Gd0 c0941Gd0 = new C0941Gd0(this.g, str);
        File fileI = this.g.i(str);
        if (!fileI.isDirectory()) {
            C2106Rd0.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        w(jLastModified);
        List listD = D(interfaceC5772jn0A, str, this.g, c0941Gd0.b());
        AbstractC5491in0.b(fileI, listD);
        C2106Rd0.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.l.h(str, listD, aVarD);
        c0941Gd0.a();
    }

    public boolean z(OQ0 oq0) {
        this.e.b();
        if (J()) {
            C2106Rd0.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        C2106Rd0.f().i("Finalizing previously open sessions.");
        try {
            u(true, oq0);
            C2106Rd0.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e2) {
            C2106Rd0.f().e("Unable to finalize previously open sessions.", e2);
            return false;
        }
    }
}
