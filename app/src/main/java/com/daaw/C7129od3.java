package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.measurement.internal.zzq;
import com.revenuecat.purchases.common.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.od3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7129od3 extends AD2 {
    public final ServiceConnectionC6292ld3 c;
    public InterfaceC9167vt2 d;
    public volatile Boolean e;
    public final AbstractC0585Cu1 f;
    public final C7970re3 g;
    public final List h;
    public final AbstractC0585Cu1 i;

    public C7129od3(C9327wU2 c9327wU2) {
        super(c9327wU2);
        this.h = new ArrayList();
        this.g = new C7970re3(c9327wU2.p());
        this.c = new ServiceConnectionC6292ld3(this);
        this.f = new C8239sc3(this, c9327wU2);
        this.i = new C9920yc3(this, c9327wU2);
    }

    public static /* bridge */ /* synthetic */ void M(C7129od3 c7129od3, ComponentName componentName) {
        c7129od3.d();
        if (c7129od3.d != null) {
            c7129od3.d = null;
            c7129od3.a.w().s().b("Disconnected from device MeasurementService", componentName);
            c7129od3.d();
            c7129od3.P();
        }
    }

    public final boolean A() {
        d();
        e();
        return !B() || this.a.N().q0() >= ((Integer) AbstractC1311Jr2.j0.a(null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B() {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7129od3.B():boolean");
    }

    public final zzq C(boolean z) {
        Pair pairA;
        this.a.a();
        C3006Zt2 c3006Zt2B = this.a.B();
        String str = null;
        if (z) {
            C6675mz2 c6675mz2W = this.a.w();
            if (c6675mz2W.a.F().d != null && (pairA = c6675mz2W.a.F().d.a()) != null && pairA != C5634jI2.y) {
                str = String.valueOf(pairA.second) + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + ((String) pairA.first);
            }
        }
        return c3006Zt2B.m(str);
    }

    public final void D() {
        d();
        this.a.w().s().b("Processing queued up service tasks", Integer.valueOf(this.h.size()));
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                this.a.w().n().b("Task exception while flushing queue", e);
            }
        }
        this.h.clear();
        this.i.b();
    }

    public final void E() {
        d();
        this.g.b();
        AbstractC0585Cu1 abstractC0585Cu1 = this.f;
        this.a.z();
        abstractC0585Cu1.d(((Long) AbstractC1311Jr2.L.a(null)).longValue());
    }

    public final void F(Runnable runnable) {
        d();
        if (z()) {
            runnable.run();
            return;
        }
        long size = this.h.size();
        this.a.z();
        if (size >= 1000) {
            this.a.w().n().a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.h.add(runnable);
        this.i.d(60000L);
        P();
    }

    public final boolean G() {
        this.a.a();
        return true;
    }

    public final Boolean J() {
        return this.e;
    }

    public final void O() {
        d();
        e();
        zzq zzqVarC = C(true);
        this.a.C().n();
        F(new RunnableC5720jc3(this, zzqVarC));
    }

    public final void P() {
        d();
        e();
        if (z()) {
            return;
        }
        if (B()) {
            this.c.c();
            return;
        }
        if (this.a.z().G()) {
            return;
        }
        this.a.a();
        List<ResolveInfo> listQueryIntentServices = this.a.v().getPackageManager().queryIntentServices(new Intent().setClassName(this.a.v(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            this.a.w().n().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context contextV = this.a.v();
        this.a.a();
        intent.setComponent(new ComponentName(contextV, "com.google.android.gms.measurement.AppMeasurementService"));
        this.c.b(intent);
    }

    public final void Q() {
        d();
        e();
        this.c.d();
        try {
            C0784Eq.b().c(this.a.v(), this.c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.d = null;
    }

    public final void R(LV1 lv1) {
        d();
        e();
        F(new RunnableC4882gc3(this, C(false), lv1));
    }

    public final void S(AtomicReference atomicReference) {
        d();
        e();
        F(new RunnableC4036dc3(this, atomicReference, C(false)));
    }

    public final void T(LV1 lv1, String str, String str2) {
        d();
        e();
        F(new Pc3(this, str, str2, C(false), lv1));
    }

    public final void U(AtomicReference atomicReference, String str, String str2, String str3) {
        d();
        e();
        F(new Mc3(this, atomicReference, null, str2, str3, C(false)));
    }

    public final void V(LV1 lv1, String str, String str2, boolean z) {
        d();
        e();
        F(new Sb3(this, str, str2, C(false), z, lv1));
    }

    public final void W(AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        d();
        e();
        F(new Tc3(this, atomicReference, null, str2, str3, C(false), z));
    }

    @Override // com.daaw.AD2
    public final boolean j() {
        return false;
    }

    public final void k(zzau zzauVar, String str) {
        AbstractC7506py0.l(zzauVar);
        d();
        e();
        G();
        F(new Hc3(this, true, C(true), this.a.C().s(zzauVar), zzauVar, str));
    }

    public final void l(LV1 lv1, zzau zzauVar, String str) {
        d();
        e();
        if (this.a.N().r0(12451000) == 0) {
            F(new RunnableC9083vc3(this, zzauVar, str, lv1));
        } else {
            this.a.w().t().a("Not bundling data. Service unavailable or out of date");
            this.a.N().H(lv1, new byte[0]);
        }
    }

    public final void m() {
        d();
        e();
        zzq zzqVarC = C(false);
        G();
        this.a.C().m();
        F(new RunnableC3200ac3(this, zzqVarC));
    }

    public final void n(InterfaceC9167vt2 interfaceC9167vt2, AbstractSafeParcelable abstractSafeParcelable, zzq zzqVar) {
        int size;
        d();
        e();
        G();
        this.a.z();
        int i = 0;
        int i2 = 100;
        while (i < 1001 && i2 == 100) {
            ArrayList arrayList = new ArrayList();
            List listL = this.a.C().l(100);
            if (listL != null) {
                arrayList.addAll(listL);
                size = listL.size();
            } else {
                size = 0;
            }
            if (abstractSafeParcelable != null && size < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i3);
                if (abstractSafeParcelable2 instanceof zzau) {
                    try {
                        interfaceC9167vt2.y0((zzau) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e) {
                        this.a.w().n().b("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzlk) {
                    try {
                        interfaceC9167vt2.V2((zzlk) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e2) {
                        this.a.w().n().b("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        interfaceC9167vt2.r2((zzac) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e3) {
                        this.a.w().n().b("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    this.a.w().n().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i++;
            i2 = size;
        }
    }

    public final void o(zzac zzacVar) {
        AbstractC7506py0.l(zzacVar);
        d();
        e();
        this.a.a();
        F(new Jc3(this, true, C(true), this.a.C().r(zzacVar), new zzac(zzacVar), zzacVar));
    }

    public final void q(boolean z) {
        d();
        e();
        if (z) {
            G();
            this.a.C().m();
        }
        if (A()) {
            F(new Ec3(this, C(false)));
        }
    }

    public final void r(C5715jb3 c5715jb3) {
        d();
        e();
        F(new RunnableC6566mc3(this, c5715jb3));
    }

    public final void s(Bundle bundle) {
        d();
        e();
        F(new RunnableC7403pc3(this, C(false), bundle));
    }

    public final void t() {
        d();
        e();
        F(new Bc3(this, C(true)));
    }

    public final void u(InterfaceC9167vt2 interfaceC9167vt2) {
        d();
        AbstractC7506py0.l(interfaceC9167vt2);
        this.d = interfaceC9167vt2;
        E();
        D();
    }

    public final void y(zzlk zzlkVar) {
        d();
        e();
        G();
        F(new Xb3(this, C(true), this.a.C().t(zzlkVar), zzlkVar));
    }

    public final boolean z() {
        d();
        e();
        return this.d != null;
    }
}
