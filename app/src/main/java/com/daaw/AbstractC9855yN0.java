package com.daaw;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.yN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9855yN0 {
    public static final String a = AbstractC1772Od0.f("Schedulers");

    public static InterfaceC8732uN0 a(Context context, C0537Ci1 c0537Ci1) {
        if (Build.VERSION.SDK_INT >= 23) {
            E01 e01 = new E01(context, c0537Ci1);
            AbstractC3834cs0.a(context, SystemJobService.class, true);
            AbstractC1772Od0.c().a(a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return e01;
        }
        InterfaceC8732uN0 interfaceC8732uN0C = c(context);
        if (interfaceC8732uN0C != null) {
            return interfaceC8732uN0C;
        }
        C5274i01 c5274i01 = new C5274i01(context);
        AbstractC3834cs0.a(context, SystemAlarmService.class, true);
        AbstractC1772Od0.c().a(a, "Created SystemAlarmScheduler", new Throwable[0]);
        return c5274i01;
    }

    public static void b(androidx.work.a aVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        InterfaceC1897Pi1 interfaceC1897Pi1B = workDatabase.B();
        workDatabase.c();
        try {
            List listE = interfaceC1897Pi1B.e(aVar.h());
            List listT = interfaceC1897Pi1B.t(RCHTTPStatusCodes.SUCCESS);
            if (listE != null && listE.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = listE.iterator();
                while (it.hasNext()) {
                    interfaceC1897Pi1B.b(((C1793Oi1) it.next()).a, jCurrentTimeMillis);
                }
            }
            workDatabase.r();
            workDatabase.g();
            if (listE != null && listE.size() > 0) {
                C1793Oi1[] c1793Oi1Arr = (C1793Oi1[]) listE.toArray(new C1793Oi1[listE.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC8732uN0 interfaceC8732uN0 = (InterfaceC8732uN0) it2.next();
                    if (interfaceC8732uN0.a()) {
                        interfaceC8732uN0.e(c1793Oi1Arr);
                    }
                }
            }
            if (listT == null || listT.size() <= 0) {
                return;
            }
            C1793Oi1[] c1793Oi1Arr2 = (C1793Oi1[]) listT.toArray(new C1793Oi1[listT.size()]);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                InterfaceC8732uN0 interfaceC8732uN02 = (InterfaceC8732uN0) it3.next();
                if (!interfaceC8732uN02.a()) {
                    interfaceC8732uN02.e(c1793Oi1Arr2);
                }
            }
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }

    public static InterfaceC8732uN0 c(Context context) {
        try {
            InterfaceC8732uN0 interfaceC8732uN0 = (InterfaceC8732uN0) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            AbstractC1772Od0.c().a(a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            return interfaceC8732uN0;
        } catch (Throwable th) {
            AbstractC1772Od0.c().a(a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
