package com.daaw;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.daaw.AbstractC1316Jt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.qQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7629qQ0 {
    public final C1420Kt a;
    public final C2795Xt b;
    public final C3294aw c;
    public final C0941Gd0 d;
    public final C2199Sa1 e;

    public C7629qQ0(C1420Kt c1420Kt, C2795Xt c2795Xt, C3294aw c3294aw, C0941Gd0 c0941Gd0, C2199Sa1 c2199Sa1) {
        this.a = c1420Kt;
        this.b = c2795Xt;
        this.c = c3294aw;
        this.d = c0941Gd0;
        this.e = c2199Sa1;
    }

    public static AbstractC1316Jt.a e(ApplicationExitInfo applicationExitInfo) {
        String strF = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strF = f(traceInputStream);
            }
        } catch (IOException e) {
            C2106Rd0.f().k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e);
        }
        return AbstractC1316Jt.a.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(strF).a();
    }

    public static String f(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static C7629qQ0 g(Context context, SX sx, RK rk, U9 u9, C0941Gd0 c0941Gd0, C2199Sa1 c2199Sa1, SV0 sv0, OQ0 oq0, C7191oq0 c7191oq0) {
        return new C7629qQ0(new C1420Kt(context, sx, u9, sv0, oq0), new C2795Xt(rk, oq0), C3294aw.b(context, oq0, c7191oq0), c0941Gd0, c2199Sa1);
    }

    public static List k(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(AbstractC1316Jt.c.a().b((String) entry.getKey()).c((String) entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.daaw.oQ0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((AbstractC1316Jt.c) obj).b().compareTo(((AbstractC1316Jt.c) obj2).b());
            }
        });
        return arrayList;
    }

    public final AbstractC1316Jt.e.d c(AbstractC1316Jt.e.d dVar) {
        return d(dVar, this.d, this.e);
    }

    public final AbstractC1316Jt.e.d d(AbstractC1316Jt.e.d dVar, C0941Gd0 c0941Gd0, C2199Sa1 c2199Sa1) {
        AbstractC1316Jt.e.d.b bVarG = dVar.g();
        String strC = c0941Gd0.c();
        if (strC != null) {
            bVarG.d(AbstractC1316Jt.e.d.AbstractC0085d.a().b(strC).a());
        } else {
            C2106Rd0.f().i("No log data to include with this event.");
        }
        List listK = k(c2199Sa1.d());
        List listK2 = k(c2199Sa1.e());
        if (!listK.isEmpty() || !listK2.isEmpty()) {
            bVarG.b(dVar.b().g().c(NY.e(listK)).e(NY.e(listK2)).a());
        }
        return bVarG.a();
    }

    public void h(String str, List list, AbstractC1316Jt.a aVar) {
        C2106Rd0.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1316Jt.d.b bVarH = ((InterfaceC5213hn0) it.next()).h();
            if (bVarH != null) {
                arrayList.add(bVarH);
            }
        }
        this.b.l(str, AbstractC1316Jt.d.a().b(NY.e(arrayList)).a(), aVar);
    }

    public void i(long j, String str) {
        this.b.k(str, j);
    }

    public final ApplicationExitInfo j(String str, List list) {
        long jQ = this.b.q(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoA = ZO.a(it.next());
            if (applicationExitInfoA.getTimestamp() < jQ) {
                return null;
            }
            if (applicationExitInfoA.getReason() == 6) {
                return applicationExitInfoA;
            }
        }
        return null;
    }

    public boolean l() {
        return this.b.r();
    }

    public SortedSet m() {
        return this.b.p();
    }

    public void n(String str, long j) {
        this.b.x(this.a.e(str, j));
    }

    public final boolean o(AbstractC6963o11 abstractC6963o11) {
        if (!abstractC6963o11.n()) {
            C2106Rd0.f().l("Crashlytics report could not be enqueued to DataTransport", abstractC6963o11.j());
            return false;
        }
        AbstractC2899Yt abstractC2899Yt = (AbstractC2899Yt) abstractC6963o11.k();
        C2106Rd0.f().b("Crashlytics report successfully enqueued to DataTransport: " + abstractC2899Yt.d());
        File fileC = abstractC2899Yt.c();
        if (fileC.delete()) {
            C2106Rd0.f().b("Deleted report file: " + fileC.getPath());
            return true;
        }
        C2106Rd0.f().k("Crashlytics could not delete report file: " + fileC.getPath());
        return true;
    }

    public final void p(Throwable th, Thread thread, String str, String str2, long j, boolean z) {
        this.b.w(c(this.a.d(th, thread, str2, j, 4, 8, z)), str, str2.equals("crash"));
    }

    public void q(Throwable th, Thread thread, String str, long j) {
        C2106Rd0.f().i("Persisting fatal event for session " + str);
        p(th, thread, str, "crash", j, true);
    }

    public void r(Throwable th, Thread thread, String str, long j) {
        C2106Rd0.f().i("Persisting non-fatal event for session " + str);
        p(th, thread, str, "error", j, false);
    }

    public void s(String str, List list, C0941Gd0 c0941Gd0, C2199Sa1 c2199Sa1) {
        ApplicationExitInfo applicationExitInfoJ = j(str, list);
        if (applicationExitInfoJ == null) {
            C2106Rd0.f().i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        AbstractC1316Jt.e.d dVarC = this.a.c(e(applicationExitInfoJ));
        C2106Rd0.f().b("Persisting anr for session " + str);
        this.b.w(d(dVarC, c0941Gd0, c2199Sa1), str, true);
    }

    public void t() {
        this.b.i();
    }

    public AbstractC6963o11 u(Executor executor) {
        return v(executor, null);
    }

    public AbstractC6963o11 v(Executor executor, String str) {
        List<AbstractC2899Yt> listU = this.b.u();
        ArrayList arrayList = new ArrayList();
        for (AbstractC2899Yt abstractC2899Yt : listU) {
            if (str == null || str.equals(abstractC2899Yt.d())) {
                arrayList.add(this.c.c(abstractC2899Yt, str != null).g(executor, new InterfaceC1519Ls() { // from class: com.daaw.pQ0
                    @Override // com.daaw.InterfaceC1519Ls
                    public final Object a(AbstractC6963o11 abstractC6963o11) {
                        return Boolean.valueOf(this.a.o(abstractC6963o11));
                    }
                }));
            }
        }
        return A11.f(arrayList);
    }
}
