package com.daaw;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.daaw.AbstractC1316Jt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Kt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1420Kt {
    public static final Map f;
    public static final String g;
    public final Context a;
    public final SX b;
    public final U9 c;
    public final SV0 d;
    public final OQ0 e;

    static {
        HashMap map = new HashMap();
        f = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        g = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.3.7");
    }

    public C1420Kt(Context context, SX sx, U9 u9, SV0 sv0, OQ0 oq0) {
        this.a = context;
        this.b = sx;
        this.c = u9;
        this.d = sv0;
        this.e = oq0;
    }

    public static int f() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = (Integer) f.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    public final AbstractC1316Jt.a a(AbstractC1316Jt.a aVar) {
        NY nyE;
        if (!this.e.b().b.c || this.c.c.size() <= 0) {
            nyE = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C8260sh c8260sh : this.c.c) {
                arrayList.add(AbstractC1316Jt.a.AbstractC0071a.a().d(c8260sh.c()).b(c8260sh.a()).c(c8260sh.b()).a());
            }
            nyE = NY.e(arrayList);
        }
        return AbstractC1316Jt.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(nyE).a();
    }

    public final AbstractC1316Jt.b b() {
        return AbstractC1316Jt.b().i("18.3.7").e(this.c.a).f(this.b.a()).c(this.c.f).d(this.c.g).h(4);
    }

    public AbstractC1316Jt.e.d c(AbstractC1316Jt.a aVar) {
        int i = this.a.getResources().getConfiguration().orientation;
        return AbstractC1316Jt.e.d.a().f("anr").e(aVar.i()).b(i(i, a(aVar))).c(k(i)).a();
    }

    public AbstractC1316Jt.e.d d(Throwable th, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3 = this.a.getResources().getConfiguration().orientation;
        return AbstractC1316Jt.e.d.a().f(str).e(j).b(j(i3, new C4457f61(th, this.d), thread, i, i2, z)).c(k(i3)).a();
    }

    public AbstractC1316Jt e(String str, long j) {
        return b().j(s(str, j)).a();
    }

    public final AbstractC1316Jt.e.d.a.b.AbstractC0075a g() {
        return AbstractC1316Jt.e.d.a.b.AbstractC0075a.a().b(0L).d(0L).c(this.c.e).e(this.c.b).a();
    }

    public final NY h() {
        return NY.m(g());
    }

    public final AbstractC1316Jt.e.d.a i(int i, AbstractC1316Jt.a aVar) {
        return AbstractC1316Jt.e.d.a.a().b(Boolean.valueOf(aVar.c() != 100)).f(i).d(n(aVar)).a();
    }

    public final AbstractC1316Jt.e.d.a j(int i, C4457f61 c4457f61, Thread thread, int i2, int i3, boolean z) {
        Boolean boolValueOf;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfoJ = AbstractC0555Cn.j(this.c.e, this.a);
        if (runningAppProcessInfoJ != null) {
            boolValueOf = Boolean.valueOf(runningAppProcessInfoJ.importance != 100);
        } else {
            boolValueOf = null;
        }
        return AbstractC1316Jt.e.d.a.a().b(boolValueOf).f(i).d(o(c4457f61, thread, i2, i3, z)).a();
    }

    public final AbstractC1316Jt.e.d.c k(int i) {
        C2943Ze c2943ZeA = C2943Ze.a(this.a);
        Float fB = c2943ZeA.b();
        Double dValueOf = fB != null ? Double.valueOf(fB.doubleValue()) : null;
        int iC = c2943ZeA.c();
        boolean zP = AbstractC0555Cn.p(this.a);
        return AbstractC1316Jt.e.d.c.a().b(dValueOf).c(iC).f(zP).e(i).g(AbstractC0555Cn.t() - AbstractC0555Cn.a(this.a)).d(AbstractC0555Cn.b(Environment.getDataDirectory().getPath())).a();
    }

    public final AbstractC1316Jt.e.d.a.b.c l(C4457f61 c4457f61, int i, int i2) {
        return m(c4457f61, i, i2, 0);
    }

    public final AbstractC1316Jt.e.d.a.b.c m(C4457f61 c4457f61, int i, int i2, int i3) {
        String str = c4457f61.b;
        String str2 = c4457f61.a;
        StackTraceElement[] stackTraceElementArr = c4457f61.c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C4457f61 c4457f612 = c4457f61.d;
        if (i3 >= i2) {
            C4457f61 c4457f613 = c4457f612;
            while (c4457f613 != null) {
                c4457f613 = c4457f613.d;
                i4++;
            }
        }
        AbstractC1316Jt.e.d.a.b.c.AbstractC0078a abstractC0078aD = AbstractC1316Jt.e.d.a.b.c.a().f(str).e(str2).c(NY.e(q(stackTraceElementArr, i))).d(i4);
        if (c4457f612 != null && i4 == 0) {
            abstractC0078aD.b(m(c4457f612, i, i2, i3 + 1));
        }
        return abstractC0078aD.a();
    }

    public final AbstractC1316Jt.e.d.a.b n(AbstractC1316Jt.a aVar) {
        return AbstractC1316Jt.e.d.a.b.a().b(aVar).e(v()).c(h()).a();
    }

    public final AbstractC1316Jt.e.d.a.b o(C4457f61 c4457f61, Thread thread, int i, int i2, boolean z) {
        return AbstractC1316Jt.e.d.a.b.a().f(y(c4457f61, thread, i, z)).d(l(c4457f61, i, i2)).e(v()).c(h()).a();
    }

    public final AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b p(StackTraceElement stackTraceElement, AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b.AbstractC0084a abstractC0084a) {
        long lineNumber = 0;
        long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return abstractC0084a.e(jMax).f(str).b(fileName).d(lineNumber).a();
    }

    public final NY q(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(p(stackTraceElement, AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b.a().c(i)));
        }
        return NY.e(arrayList);
    }

    public final AbstractC1316Jt.e.a r() {
        return AbstractC1316Jt.e.a.a().e(this.b.f()).g(this.c.f).d(this.c.g).f(this.b.a()).b(this.c.h.d()).c(this.c.h.e()).a();
    }

    public final AbstractC1316Jt.e s(String str, long j) {
        return AbstractC1316Jt.e.a().l(j).i(str).g(g).b(r()).k(u()).d(t()).h(3).a();
    }

    public final AbstractC1316Jt.e.c t() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iF = f();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jT = AbstractC0555Cn.t();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean z = AbstractC0555Cn.z();
        int iN = AbstractC0555Cn.n();
        String str = Build.MANUFACTURER;
        return AbstractC1316Jt.e.c.a().b(iF).f(Build.MODEL).c(iAvailableProcessors).h(jT).d(blockCount).i(z).j(iN).e(str).g(Build.PRODUCT).a();
    }

    public final AbstractC1316Jt.e.AbstractC0086e u() {
        return AbstractC1316Jt.e.AbstractC0086e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(AbstractC0555Cn.A()).a();
    }

    public final AbstractC1316Jt.e.d.a.b.AbstractC0079d v() {
        return AbstractC1316Jt.e.d.a.b.AbstractC0079d.a().d("0").c("0").b(0L).a();
    }

    public final AbstractC1316Jt.e.d.a.b.AbstractC0081e w(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return x(thread, stackTraceElementArr, 0);
    }

    public final AbstractC1316Jt.e.d.a.b.AbstractC0081e x(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        return AbstractC1316Jt.e.d.a.b.AbstractC0081e.a().d(thread.getName()).c(i).b(NY.e(q(stackTraceElementArr, i))).a();
    }

    public final NY y(C4457f61 c4457f61, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(x(thread, c4457f61.c, i));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(w(key, this.d.a(entry.getValue())));
                }
            }
        }
        return NY.e(arrayList);
    }
}
