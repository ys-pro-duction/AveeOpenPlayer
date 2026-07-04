package com.daaw;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzlk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class Oa3 extends AD2 {
    public La3 c;
    public J83 d;
    public final Set e;
    public boolean f;
    public final AtomicReference g;
    public final Object h;
    public C3633c83 i;
    public final AtomicLong j;
    public long k;
    public final Lo3 l;
    public boolean m;
    public final Mf3 n;

    public Oa3(C9327wU2 c9327wU2) {
        super(c9327wU2);
        this.e = new CopyOnWriteArraySet();
        this.h = new Object();
        this.m = true;
        this.n = new Y93(this);
        this.g = new AtomicReference();
        this.i = C3633c83.c;
        this.k = -1L;
        this.j = new AtomicLong(0L);
        this.l = new Lo3(c9327wU2);
    }

    public static /* bridge */ /* synthetic */ void b0(Oa3 oa3, C3633c83 c3633c83, C3633c83 c3633c832) {
        boolean z;
        EnumC9512x73[] enumC9512x73Arr = {EnumC9512x73.ANALYTICS_STORAGE, EnumC9512x73.AD_STORAGE};
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = false;
                break;
            }
            EnumC9512x73 enumC9512x73 = enumC9512x73Arr[i];
            if (!c3633c832.j(enumC9512x73) && c3633c83.j(enumC9512x73)) {
                z = true;
                break;
            }
            i++;
        }
        boolean zN = c3633c83.n(c3633c832, EnumC9512x73.ANALYTICS_STORAGE, EnumC9512x73.AD_STORAGE);
        if (z || zN) {
            oa3.a.B().s();
        }
    }

    public static /* synthetic */ void c0(Oa3 oa3, C3633c83 c3633c83, long j, boolean z, boolean z2) {
        oa3.d();
        oa3.e();
        C3633c83 c3633c83M = oa3.a.F().m();
        if (j <= oa3.k && C3633c83.k(c3633c83M.a(), c3633c83.a())) {
            oa3.a.w().r().b("Dropped out-of-date consent setting, proposed settings", c3633c83);
            return;
        }
        C5634jI2 c5634jI2F = oa3.a.F();
        C9327wU2 c9327wU2 = c5634jI2F.a;
        c5634jI2F.d();
        int iA = c3633c83.a();
        if (!c5634jI2F.t(iA)) {
            oa3.a.w().r().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(c3633c83.a()));
            return;
        }
        SharedPreferences.Editor editorEdit = c5634jI2F.k().edit();
        editorEdit.putString("consent_settings", c3633c83.i());
        editorEdit.putInt("consent_source", iA);
        editorEdit.apply();
        oa3.k = j;
        oa3.a.L().q(z);
        if (z2) {
            oa3.a.L().S(new AtomicReference());
        }
    }

    public final void A(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.a.x().z(new RunnableC8964v93(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    public final void B(String str, String str2, long j, Object obj) {
        this.a.x().z(new RunnableC9801y93(this, str, str2, obj, j));
    }

    public final void C(String str) {
        this.g.set(str);
    }

    public final void D(Bundle bundle) {
        E(bundle, this.a.p().a());
    }

    public final void E(Bundle bundle, long j) {
        AbstractC7506py0.l(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.a.w().t().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        AbstractC7506py0.l(bundle2);
        K63.a(bundle2, "app_id", String.class, null);
        K63.a(bundle2, "origin", String.class, null);
        K63.a(bundle2, "name", String.class, null);
        K63.a(bundle2, "value", Object.class, null);
        K63.a(bundle2, "trigger_event_name", String.class, null);
        K63.a(bundle2, "trigger_timeout", Long.class, 0L);
        K63.a(bundle2, "timed_out_event_name", String.class, null);
        K63.a(bundle2, "timed_out_event_params", Bundle.class, null);
        K63.a(bundle2, "triggered_event_name", String.class, null);
        K63.a(bundle2, "triggered_event_params", Bundle.class, null);
        K63.a(bundle2, "time_to_live", Long.class, 0L);
        K63.a(bundle2, "expired_event_name", String.class, null);
        K63.a(bundle2, "expired_event_params", Bundle.class, null);
        AbstractC7506py0.f(bundle2.getString("name"));
        AbstractC7506py0.f(bundle2.getString("origin"));
        AbstractC7506py0.l(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.a.N().p0(string) != 0) {
            this.a.w().n().b("Invalid conditional user property name", this.a.D().f(string));
            return;
        }
        if (this.a.N().l0(string, obj) != 0) {
            this.a.w().n().c("Invalid conditional user property value", this.a.D().f(string), obj);
            return;
        }
        Object objL = this.a.N().l(string, obj);
        if (objL == null) {
            this.a.w().n().c("Unable to normalize conditional user property value", this.a.D().f(string), obj);
            return;
        }
        K63.b(bundle2, objL);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            this.a.z();
            if (j2 > 15552000000L || j2 < 1) {
                this.a.w().n().c("Invalid conditional user property timeout", this.a.D().f(string), Long.valueOf(j2));
                return;
            }
        }
        long j3 = bundle2.getLong("time_to_live");
        this.a.z();
        if (j3 > 15552000000L || j3 < 1) {
            this.a.w().n().c("Invalid conditional user property time to live", this.a.D().f(string), Long.valueOf(j3));
        } else {
            this.a.x().z(new G93(this, bundle2));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:48:0x00c0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void F(com.daaw.C3633c83 r13, long r14) {
        /*
            r12 = this;
            r12.e()
            int r0 = r13.a()
            r1 = -10
            if (r0 == r1) goto L28
            java.lang.Boolean r2 = r13.f()
            if (r2 != 0) goto L28
            java.lang.Boolean r2 = r13.g()
            if (r2 == 0) goto L18
            goto L28
        L18:
            com.daaw.wU2 r13 = r12.a
            com.daaw.mz2 r13 = r13.w()
            com.daaw.dy2 r13 = r13.u()
            java.lang.String r14 = "Discarding empty consent settings"
            r13.a(r14)
            return
        L28:
            java.lang.Object r2 = r12.h
            monitor-enter(r2)
            com.daaw.c83 r9 = r12.i     // Catch: java.lang.Throwable -> Lbb
            int r3 = r9.a()     // Catch: java.lang.Throwable -> Lbb
            boolean r3 = com.daaw.C3633c83.k(r0, r3)     // Catch: java.lang.Throwable -> Lbb
            r4 = 0
            if (r3 == 0) goto L62
            com.daaw.c83 r3 = r12.i     // Catch: java.lang.Throwable -> L51
            boolean r3 = r13.m(r3)     // Catch: java.lang.Throwable -> L51
            com.daaw.x73 r5 = com.daaw.EnumC9512x73.ANALYTICS_STORAGE     // Catch: java.lang.Throwable -> L51
            boolean r6 = r13.j(r5)     // Catch: java.lang.Throwable -> L51
            r7 = 1
            if (r6 == 0) goto L56
            com.daaw.c83 r6 = r12.i     // Catch: java.lang.Throwable -> L51
            boolean r5 = r6.j(r5)     // Catch: java.lang.Throwable -> L51
            if (r5 != 0) goto L56
            r4 = 1
            goto L56
        L51:
            r0 = move-exception
            r13 = r0
            r4 = r12
            goto Lbe
        L56:
            com.daaw.c83 r5 = r12.i     // Catch: java.lang.Throwable -> L51
            com.daaw.c83 r13 = r13.e(r5)     // Catch: java.lang.Throwable -> L51
            r12.i = r13     // Catch: java.lang.Throwable -> L51
            r8 = r4
            r4 = 1
        L60:
            r5 = r13
            goto L65
        L62:
            r3 = 0
            r8 = 0
            goto L60
        L65:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lbb
            if (r4 != 0) goto L78
            com.daaw.wU2 r13 = r12.a
            com.daaw.mz2 r13 = r13.w()
            com.daaw.dy2 r13 = r13.r()
            java.lang.String r14 = "Ignoring lower-priority consent settings, proposed settings"
            r13.b(r14, r5)
            return
        L78:
            java.util.concurrent.atomic.AtomicLong r13 = r12.j
            long r6 = r13.getAndIncrement()
            if (r3 == 0) goto L9a
            java.util.concurrent.atomic.AtomicReference r13 = r12.g
            r0 = 0
            r13.set(r0)
            com.daaw.wU2 r13 = r12.a
            com.daaw.KS2 r13 = r13.x()
            com.daaw.za3 r3 = new com.daaw.za3
            r4 = r12
            r10 = r8
            r11 = r9
            r8 = r6
            r6 = r14
            r3.<init>(r4, r5, r6, r8, r10, r11)
            r13.A(r3)
            return
        L9a:
            com.daaw.Ca3 r3 = new com.daaw.Ca3
            r4 = r12
            r3.<init>(r4, r5, r6, r8, r9)
            r13 = 30
            if (r0 == r13) goto Lb1
            if (r0 != r1) goto La7
            goto Lb1
        La7:
            com.daaw.wU2 r13 = r4.a
            com.daaw.KS2 r13 = r13.x()
            r13.z(r3)
            return
        Lb1:
            com.daaw.wU2 r13 = r4.a
            com.daaw.KS2 r13 = r13.x()
            r13.A(r3)
            return
        Lbb:
            r0 = move-exception
            r4 = r12
        Lbd:
            r13 = r0
        Lbe:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc0
            throw r13
        Lc0:
            r0 = move-exception
            goto Lbd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Oa3.F(com.daaw.c83, long):void");
    }

    public final void G(Bundle bundle, int i, long j) {
        e();
        String strH = C3633c83.h(bundle);
        if (strH != null) {
            this.a.w().u().b("Ignoring invalid consent setting", strH);
            this.a.w().u().a("Valid consent values are 'granted', 'denied'");
        }
        F(C3633c83.b(bundle, i), j);
    }

    public final void H(J83 j83) {
        J83 j832;
        d();
        e();
        if (j83 != null && j83 != (j832 = this.d)) {
            AbstractC7506py0.p(j832 == null, "EventInterceptor already set.");
        }
        this.d = j83;
    }

    public final void I(Boolean bool) {
        e();
        this.a.x().z(new RunnableC9352wa3(this, bool));
    }

    public final void J(C3633c83 c3633c83) {
        d();
        boolean z = (c3633c83.j(EnumC9512x73.ANALYTICS_STORAGE) && c3633c83.j(EnumC9512x73.AD_STORAGE)) || this.a.L().A();
        if (z != this.a.l()) {
            this.a.h(z);
            C5634jI2 c5634jI2F = this.a.F();
            C9327wU2 c9327wU2 = c5634jI2F.a;
            c5634jI2F.d();
            Boolean boolValueOf = c5634jI2F.k().contains("measurement_enabled_from_api") ? Boolean.valueOf(c5634jI2F.k().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                O(Boolean.valueOf(z), false);
            }
        }
    }

    public final void K(String str, String str2, Object obj, boolean z) {
        L("auto", "_ldl", obj, true, this.a.p().a());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(java.lang.String r17, java.lang.String r18, java.lang.Object r19, boolean r20, long r21) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Oa3.L(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.daaw.AbstractC7506py0.f(r9)
            com.daaw.AbstractC7506py0.f(r10)
            r8.d()
            r8.e()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L62
            boolean r0 = r11 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L50
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L50
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            r11 = 1
            java.lang.String r0 = "false"
            boolean r10 = r0.equals(r10)
            r2 = 1
            if (r11 == r10) goto L37
            r10 = 0
            goto L38
        L37:
            r10 = r2
        L38:
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            com.daaw.wU2 r5 = r8.a
            com.daaw.jI2 r5 = r5.F()
            com.daaw.FH2 r5 = r5.m
            int r6 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r6 != 0) goto L4a
            java.lang.String r0 = "true"
        L4a:
            r5.b(r0)
            r3 = r1
            r6 = r4
            goto L64
        L50:
            if (r11 != 0) goto L62
            com.daaw.wU2 r10 = r8.a
            com.daaw.jI2 r10 = r10.F()
            com.daaw.FH2 r10 = r10.m
            java.lang.String r0 = "unset"
            r10.b(r0)
            r6 = r11
            r3 = r1
            goto L64
        L62:
            r3 = r10
            r6 = r11
        L64:
            com.daaw.wU2 r10 = r8.a
            boolean r10 = r10.k()
            if (r10 != 0) goto L7c
            com.daaw.wU2 r9 = r8.a
            com.daaw.mz2 r9 = r9.w()
            com.daaw.dy2 r9 = r9.s()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L7c:
            com.daaw.wU2 r10 = r8.a
            boolean r10 = r10.n()
            if (r10 != 0) goto L85
            return
        L85:
            com.google.android.gms.measurement.internal.zzlk r2 = new com.google.android.gms.measurement.internal.zzlk
            r7 = r9
            r4 = r12
            r2.<init>(r3, r4, r6, r7)
            com.daaw.wU2 r9 = r8.a
            com.daaw.od3 r9 = r9.L()
            r9.y(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Oa3.M(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void N(M83 m83) {
        e();
        AbstractC7506py0.l(m83);
        if (this.e.remove(m83)) {
            return;
        }
        this.a.w().t().a("OnEventListener had not been registered");
    }

    public final void O(Boolean bool, boolean z) {
        d();
        e();
        this.a.w().m().b("Setting app measurement enabled (FE)", bool);
        this.a.F().o(bool);
        if (z) {
            C5634jI2 c5634jI2F = this.a.F();
            C9327wU2 c9327wU2 = c5634jI2F.a;
            c5634jI2F.d();
            SharedPreferences.Editor editorEdit = c5634jI2F.k().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.a.l() || !(bool == null || bool.booleanValue())) {
            P();
        }
    }

    public final void P() {
        Oa3 oa3;
        d();
        String strA = this.a.F().m.a();
        if (strA == null) {
            oa3 = this;
        } else if ("unset".equals(strA)) {
            oa3 = this;
            oa3.M("app", "_npa", null, this.a.p().a());
        } else {
            oa3 = this;
            oa3.M("app", "_npa", Long.valueOf(true != "true".equals(strA) ? 0L : 1L), oa3.a.p().a());
        }
        if (!oa3.a.k() || !oa3.m) {
            oa3.a.w().m().a("Updating Scion state (FE)");
            oa3.a.L().t();
            return;
        }
        oa3.a.w().m().a("Recording app launch after enabling measurement for the first time (FE)");
        f0();
        C5484il3.b();
        if (oa3.a.z().B(null, AbstractC1311Jr2.h0)) {
            oa3.a.M().e.a();
        }
        oa3.a.x().z(new RunnableC7005o93(this));
    }

    public final int Q(String str) {
        AbstractC7506py0.f(str);
        this.a.z();
        return 25;
    }

    public final Boolean R() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.a.x().n(atomicReference, 15000L, "boolean test flag value", new P93(this, atomicReference));
    }

    public final Double S() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.a.x().n(atomicReference, 15000L, "double test flag value", new RunnableC8508ta3(this, atomicReference));
    }

    public final Integer T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.a.x().n(atomicReference, 15000L, "int test flag value", new RunnableC7672qa3(this, atomicReference));
    }

    public final Long U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.a.x().n(atomicReference, 15000L, "long test flag value", new RunnableC6835na3(this, atomicReference));
    }

    public final String V() {
        return (String) this.g.get();
    }

    public final String W() {
        C5715jb3 c5715jb3N = this.a.K().n();
        if (c5715jb3N != null) {
            return c5715jb3N.b;
        }
        return null;
    }

    public final String X() {
        C5715jb3 c5715jb3N = this.a.K().n();
        if (c5715jb3N != null) {
            return c5715jb3N.a;
        }
        return null;
    }

    public final String Y() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.a.x().n(atomicReference, 15000L, "String test flag value", new RunnableC5989ka3(this, atomicReference));
    }

    public final ArrayList Z(String str, String str2) {
        if (this.a.x().C()) {
            this.a.w().n().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.a.a();
        if (C8292sn1.a()) {
            this.a.w().n().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.a.x().n(atomicReference, 5000L, "get conditional user properties", new M93(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return Pf3.s(list);
        }
        this.a.w().n().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final Map a0(String str, String str2, boolean z) {
        if (this.a.x().C()) {
            this.a.w().n().a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        this.a.a();
        if (C8292sn1.a()) {
            this.a.w().n().a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.a.x().n(atomicReference, 5000L, "get user properties", new S93(this, atomicReference, null, str, str2, z));
        List<zzlk> list = (List) atomicReference.get();
        if (list == null) {
            this.a.w().n().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.EMPTY_MAP;
        }
        C2407Ua c2407Ua = new C2407Ua(list.size());
        for (zzlk zzlkVar : list) {
            Object objE = zzlkVar.e();
            if (objE != null) {
                c2407Ua.put(zzlkVar.C, objE);
            }
        }
        return c2407Ua;
    }

    public final void f0() {
        d();
        e();
        if (this.a.n()) {
            if (this.a.z().B(null, AbstractC1311Jr2.b0)) {
                C5788jq1 c5788jq1Z = this.a.z();
                c5788jq1Z.a.a();
                Boolean boolQ = c5788jq1Z.q("google_analytics_deferred_deep_link_enabled");
                if (boolQ != null && boolQ.booleanValue()) {
                    this.a.w().m().a("Deferred Deep Link feature enabled.");
                    this.a.x().z(new Runnable() { // from class: com.daaw.k93
                        @Override // java.lang.Runnable
                        public final void run() {
                            Oa3 oa3 = this.B;
                            oa3.d();
                            if (oa3.a.F().s.b()) {
                                oa3.a.w().m().a("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long jA = oa3.a.F().t.a();
                            oa3.a.F().t.b(1 + jA);
                            oa3.a.z();
                            if (jA < 5) {
                                oa3.a.f();
                            } else {
                                oa3.a.w().t().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                oa3.a.F().s.a(true);
                            }
                        }
                    });
                }
            }
            this.a.L().O();
            this.m = false;
            C5634jI2 c5634jI2F = this.a.F();
            c5634jI2F.d();
            String string = c5634jI2F.k().getString("previous_os_version", null);
            c5634jI2F.a.A().g();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = c5634jI2F.k().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.a.A().g();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            r("auto", "_ou", bundle);
        }
    }

    @Override // com.daaw.AD2
    public final boolean j() {
        return false;
    }

    public final void k(String str, String str2, Bundle bundle) {
        long jA = this.a.p().a();
        AbstractC7506py0.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jA);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.a.x().z(new J93(this, bundle2));
    }

    public final void l() {
        if (!(this.a.v().getApplicationContext() instanceof Application) || this.c == null) {
            return;
        }
        ((Application) this.a.v().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
    }

    public final /* synthetic */ void m(Bundle bundle) {
        if (bundle == null) {
            this.a.F().x.b(new Bundle());
            return;
        }
        Bundle bundleA = this.a.F().x.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.a.N().V(obj)) {
                    this.a.N().C(this.n, null, 27, null, null, 0);
                }
                this.a.w().u().c("Invalid default event parameter type. Name, value", str, obj);
            } else if (Pf3.Y(str)) {
                this.a.w().u().b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                bundleA.remove(str);
            } else {
                Pf3 pf3N = this.a.N();
                this.a.z();
                if (pf3N.Q("param", str, 100, obj)) {
                    this.a.N().D(bundleA, str, obj);
                }
            }
        }
        this.a.N();
        int i = this.a.z().i();
        if (bundleA.size() > i) {
            int i2 = 0;
            for (String str2 : new TreeSet(bundleA.keySet())) {
                i2++;
                if (i2 > i) {
                    bundleA.remove(str2);
                }
            }
            this.a.N().C(this.n, null, 26, null, null, 0);
            this.a.w().u().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.a.F().x.b(bundleA);
        this.a.L().s(bundleA);
    }

    public final void n(String str, String str2, Bundle bundle) {
        o(str, str2, bundle, true, true, this.a.p().a());
    }

    public final void o(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (str2 == "screen_view" || (str2 != null && str2.equals("screen_view"))) {
            this.a.K().E(bundle2, j);
            return;
        }
        boolean z3 = !z2 || this.d == null || Pf3.Y(str2);
        if (str == null) {
            str = "app";
        }
        A(str, str2, j, bundle2, z2, z3, z, null);
    }

    public final void q(String str, String str2, Bundle bundle, String str3) {
        C9327wU2.q();
        A("auto", str2, this.a.p().a(), bundle, false, true, true, str3);
    }

    public final void r(String str, String str2, Bundle bundle) {
        d();
        s(str, str2, this.a.p().a(), bundle);
    }

    public final void s(String str, String str2, long j, Bundle bundle) {
        d();
        t(str, str2, j, bundle, true, this.d == null || Pf3.Y(str2), true, null);
    }

    public final void t(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        long j2;
        boolean z4;
        long j3;
        char c;
        long j4;
        String str4;
        long j5;
        ArrayList arrayList;
        Bundle[] bundleArr;
        String str5 = str;
        AbstractC7506py0.f(str5);
        AbstractC7506py0.l(bundle);
        d();
        e();
        if (!this.a.k()) {
            this.a.w().m().a("Event not sent since app measurement is disabled");
            return;
        }
        List listR = this.a.B().r();
        if (listR != null && !listR.contains(str2)) {
            this.a.w().m().c("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.f) {
            this.f = true;
            try {
                try {
                    (!this.a.o() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.a.v().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.a.v());
                } catch (Exception e) {
                    this.a.w().t().b("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                this.a.w().r().a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            this.a.a();
            M("auto", "_lgclid", bundle.getString("gclid"), this.a.p().a());
        }
        Oa3 oa3 = this;
        oa3.a.a();
        if (z && Pf3.c0(str2)) {
            oa3.a.N().z(bundle, oa3.a.F().x.a());
        }
        if (!z3) {
            oa3.a.a();
            if (!"_iap".equals(str2)) {
                Pf3 pf3N = oa3.a.N();
                int i = 2;
                if (pf3N.S("event", str2)) {
                    if (pf3N.P("event", AbstractC9517x83.a, AbstractC9517x83.b, str2)) {
                        pf3N.a.z();
                        if (pf3N.N("event", 40, str2)) {
                            i = 0;
                        }
                    } else {
                        i = 13;
                    }
                }
                if (i != 0) {
                    oa3.a.w().o().b("Invalid public event name. Event will not be logged (FE)", oa3.a.D().d(str2));
                    Pf3 pf3N2 = oa3.a.N();
                    oa3.a.z();
                    oa3.a.N().C(oa3.n, null, i, "_ev", pf3N2.n(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        oa3.a.a();
        C5715jb3 c5715jb3O = oa3.a.K().o(false);
        if (c5715jb3O != null && !bundle.containsKey("_sc")) {
            c5715jb3O.d = true;
        }
        Pf3.y(c5715jb3O, bundle, z && !z3);
        boolean zEquals = "am".equals(str5);
        boolean zY = Pf3.Y(str2);
        if (!z || oa3.d == null || zY) {
            j2 = j;
            z4 = zEquals;
        } else {
            if (!zEquals) {
                oa3.a.w().m().c("Passing event to registered event handler (FE)", oa3.a.D().d(str2), oa3.a.D().b(bundle));
                AbstractC7506py0.l(oa3.d);
                oa3.d.a(str5, str2, bundle, j);
                return;
            }
            j2 = j;
            z4 = true;
        }
        if (oa3.a.n()) {
            int iM0 = oa3.a.N().m0(str2);
            if (iM0 != 0) {
                oa3.a.w().o().b("Invalid event name. Event will not be logged (FE)", oa3.a.D().d(str2));
                Pf3 pf3N3 = oa3.a.N();
                oa3.a.z();
                oa3.a.N().C(oa3.n, str3, iM0, "_ev", pf3N3.n(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleX0 = oa3.a.N().x0(str3, str2, bundle, AbstractC1184Im.b("_o", "_sn", "_sc", "_si"), z3);
            AbstractC7506py0.l(bundleX0);
            oa3.a.a();
            if (oa3.a.K().o(false) == null || !"_ae".equals(str2)) {
                j3 = 0;
                c = 0;
            } else {
                C5450ie3 c5450ie3 = oa3.a.M().f;
                j3 = 0;
                long jB = c5450ie3.d.a.p().b();
                c = 0;
                long j6 = jB - c5450ie3.b;
                c5450ie3.b = jB;
                if (j6 > 0) {
                    oa3.a.N().t(bundleX0, j6);
                }
            }
            C7443pk3.b();
            if (oa3.a.z().B(null, AbstractC1311Jr2.g0)) {
                if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                    Pf3 pf3N4 = oa3.a.N();
                    String string = bundleX0.getString("_ffr");
                    if (AbstractC7661qY0.b(string)) {
                        string = null;
                    } else if (string != null) {
                        string = string.trim();
                    }
                    if (Kf3.a(string, pf3N4.a.F().u.a())) {
                        pf3N4.a.w().m().a("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    pf3N4.a.F().u.b(string);
                } else if ("_ae".equals(str2)) {
                    String strA = oa3.a.N().a.F().u.a();
                    if (!TextUtils.isEmpty(strA)) {
                        bundleX0.putString("_ffr", strA);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(bundleX0);
            boolean zQ = oa3.a.z().B(null, AbstractC1311Jr2.I0) ? oa3.a.M().q() : oa3.a.F().r.b();
            if (oa3.a.F().o.a() > j3 && oa3.a.F().s(j2) && zQ) {
                oa3.a.w().s().a("Current session is expired, remove the session number, ID, and engagement time");
                j4 = j3;
                str4 = "_ae";
                M("auto", "_sid", null, oa3.a.p().a());
                M("auto", "_sno", null, this.a.p().a());
                M("auto", "_se", null, this.a.p().a());
                oa3 = this;
                oa3.a.F().p.b(j4);
            } else {
                j4 = j3;
                str4 = "_ae";
            }
            if (bundleX0.getLong("extend_session", j4) == 1) {
                oa3.a.w().s().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                j5 = j;
                oa3.a.M().e.b(j5, true);
            } else {
                j5 = j;
            }
            ArrayList arrayList3 = new ArrayList(bundleX0.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            int i2 = 0;
            while (i2 < size) {
                String str6 = (String) arrayList3.get(i2);
                if (str6 != null) {
                    oa3.a.N();
                    Object obj = bundleX0.get(str6);
                    if (obj instanceof Bundle) {
                        arrayList = arrayList3;
                        bundleArr = new Bundle[1];
                        bundleArr[c] = (Bundle) obj;
                    } else {
                        arrayList = arrayList3;
                        if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList4 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                        } else {
                            bundleArr = null;
                        }
                    }
                    if (bundleArr != null) {
                        bundleX0.putParcelableArray(str6, bundleArr);
                    }
                } else {
                    arrayList = arrayList3;
                }
                i2++;
                arrayList3 = arrayList;
            }
            int i3 = 0;
            while (i3 < arrayList2.size()) {
                Bundle bundleW0 = (Bundle) arrayList2.get(i3);
                String str7 = i3 != 0 ? "_ep" : str2;
                bundleW0.putString("_o", str5);
                if (z2) {
                    bundleW0 = oa3.a.N().w0(bundleW0);
                }
                Bundle bundle2 = bundleW0;
                oa3.a.L().k(new zzau(str7, new zzas(bundle2), str5, j5), str3);
                if (!z4) {
                    Iterator it = oa3.e.iterator();
                    while (it.hasNext()) {
                        ((M83) it.next()).a(str, str2, new Bundle(bundle2), j);
                    }
                }
                i3++;
                str5 = str;
                j5 = j;
            }
            oa3.a.a();
            if (oa3.a.K().o(false) == null || !str4.equals(str2)) {
                return;
            }
            oa3.a.M().f.d(true, true, oa3.a.p().b());
        }
    }

    public final void u(M83 m83) {
        e();
        AbstractC7506py0.l(m83);
        if (this.e.add(m83)) {
            return;
        }
        this.a.w().t().a("OnEventListener already registered");
    }

    public final void y(long j) {
        this.g.set(null);
        this.a.x().z(new D93(this, j));
    }

    public final void z(long j, boolean z) {
        d();
        e();
        this.a.w().m().a("Resetting analytics data (FE)");
        C7134oe3 c7134oe3M = this.a.M();
        c7134oe3M.d();
        c7134oe3M.f.a();
        C6054kn3.b();
        if (this.a.z().B(null, AbstractC1311Jr2.p0)) {
            this.a.B().s();
        }
        boolean zK = this.a.k();
        C5634jI2 c5634jI2F = this.a.F();
        c5634jI2F.e.b(j);
        if (!TextUtils.isEmpty(c5634jI2F.a.F().u.a())) {
            c5634jI2F.u.b(null);
        }
        C5484il3.b();
        C5788jq1 c5788jq1Z = c5634jI2F.a.z();
        C4388er2 c4388er2 = AbstractC1311Jr2.h0;
        if (c5788jq1Z.B(null, c4388er2)) {
            c5634jI2F.o.b(0L);
        }
        c5634jI2F.p.b(0L);
        if (!c5634jI2F.a.z().E()) {
            c5634jI2F.q(!zK);
        }
        c5634jI2F.v.b(null);
        c5634jI2F.w.b(0L);
        c5634jI2F.x.b(null);
        if (z) {
            this.a.L().m();
        }
        C5484il3.b();
        if (this.a.z().B(null, c4388er2)) {
            this.a.M().e.a();
        }
        this.m = !zK;
    }
}
