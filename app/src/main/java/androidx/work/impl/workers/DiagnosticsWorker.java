package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.daaw.AbstractC1772Od0;
import com.daaw.C0537Ci1;
import com.daaw.C1793Oi1;
import com.daaw.C7237p01;
import com.daaw.InterfaceC0858Fi1;
import com.daaw.InterfaceC1897Pi1;
import com.daaw.InterfaceC2233Si1;
import com.daaw.InterfaceC7516q01;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    public static final String H = AbstractC1772Od0.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(C1793Oi1 c1793Oi1, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", c1793Oi1.a, c1793Oi1.c, num, c1793Oi1.b.name(), str, str2);
    }

    public static String c(InterfaceC0858Fi1 interfaceC0858Fi1, InterfaceC2233Si1 interfaceC2233Si1, InterfaceC7516q01 interfaceC7516q01, List list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1793Oi1 c1793Oi1 = (C1793Oi1) it.next();
            C7237p01 c7237p01C = interfaceC7516q01.c(c1793Oi1.a);
            sb.append(a(c1793Oi1, TextUtils.join(",", interfaceC0858Fi1.b(c1793Oi1.a)), c7237p01C != null ? Integer.valueOf(c7237p01C.b) : null, TextUtils.join(",", interfaceC2233Si1.a(c1793Oi1.a))));
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() {
        WorkDatabase workDatabaseO = C0537Ci1.k(getApplicationContext()).o();
        InterfaceC1897Pi1 interfaceC1897Pi1B = workDatabaseO.B();
        InterfaceC0858Fi1 interfaceC0858Fi1Z = workDatabaseO.z();
        InterfaceC2233Si1 interfaceC2233Si1C = workDatabaseO.C();
        InterfaceC7516q01 interfaceC7516q01Y = workDatabaseO.y();
        List listD = interfaceC1897Pi1B.d(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List listH = interfaceC1897Pi1B.h();
        List listT = interfaceC1897Pi1B.t(RCHTTPStatusCodes.SUCCESS);
        if (listD != null && !listD.isEmpty()) {
            AbstractC1772Od0 abstractC1772Od0C = AbstractC1772Od0.c();
            String str = H;
            abstractC1772Od0C.d(str, "Recently completed work:\n\n", new Throwable[0]);
            AbstractC1772Od0.c().d(str, c(interfaceC0858Fi1Z, interfaceC2233Si1C, interfaceC7516q01Y, listD), new Throwable[0]);
        }
        if (listH != null && !listH.isEmpty()) {
            AbstractC1772Od0 abstractC1772Od0C2 = AbstractC1772Od0.c();
            String str2 = H;
            abstractC1772Od0C2.d(str2, "Running work:\n\n", new Throwable[0]);
            AbstractC1772Od0.c().d(str2, c(interfaceC0858Fi1Z, interfaceC2233Si1C, interfaceC7516q01Y, listH), new Throwable[0]);
        }
        if (listT != null && !listT.isEmpty()) {
            AbstractC1772Od0 abstractC1772Od0C3 = AbstractC1772Od0.c();
            String str3 = H;
            abstractC1772Od0C3.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            AbstractC1772Od0.c().d(str3, c(interfaceC0858Fi1Z, interfaceC2233Si1C, interfaceC7516q01Y, listT), new Throwable[0]);
        }
        return ListenableWorker.a.c();
    }
}
