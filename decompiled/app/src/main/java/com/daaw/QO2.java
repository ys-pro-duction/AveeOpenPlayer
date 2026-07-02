package com.daaw;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class QO2 extends Be3 implements InterfaceC1613Mp1 {
    public final Map d;
    public final Map e;
    public final Map f;
    public final Map g;
    public final Map h;
    public final Map i;
    public final C9653xf0 j;
    public final Fn3 k;
    public final Map l;
    public final Map m;
    public final Map n;

    public QO2(C8812uf3 c8812uf3) {
        super(c8812uf3);
        this.d = new C2407Ua();
        this.e = new C2407Ua();
        this.f = new C2407Ua();
        this.g = new C2407Ua();
        this.h = new C2407Ua();
        this.l = new C2407Ua();
        this.m = new C2407Ua();
        this.n = new C2407Ua();
        this.i = new C2407Ua();
        this.j = new C4819gN2(this, 20);
        this.k = new KN2(this);
    }

    public static final Map m(C9271wG2 c9271wG2) {
        C2407Ua c2407Ua = new C2407Ua();
        if (c9271wG2 != null) {
            for (LI2 li2 : c9271wG2.P()) {
                c2407Ua.put(li2.C(), li2.D());
            }
        }
        return c2407Ua;
    }

    public static /* bridge */ /* synthetic */ C7916rS1 o(QO2 qo2, String str) throws Throwable {
        qo2.e();
        AbstractC7506py0.f(str);
        if (!qo2.C(str)) {
            return null;
        }
        if (!qo2.h.containsKey(str) || qo2.h.get(str) == null) {
            qo2.k(str);
        } else {
            qo2.l(str, (C9271wG2) qo2.h.get(str));
        }
        return (C7916rS1) qo2.j.h().get(str);
    }

    public final void A(String str) {
        d();
        this.h.remove(str);
    }

    public final boolean B(String str) {
        d();
        C9271wG2 c9271wG2Q = q(str);
        if (c9271wG2Q == null) {
            return false;
        }
        return c9271wG2Q.T();
    }

    public final boolean C(String str) {
        C9271wG2 c9271wG2;
        return (TextUtils.isEmpty(str) || (c9271wG2 = (C9271wG2) this.h.get(str)) == null || c9271wG2.B() == 0) ? false : true;
    }

    public final boolean D(String str) {
        return "1".equals(b(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean E(String str, String str2) throws Throwable {
        Boolean bool;
        d();
        k(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean F(String str, String str2) throws Throwable {
        Boolean bool;
        d();
        k(str);
        if (D(str) && Pf3.Y(str2)) {
            return true;
        }
        if (G(str) && Pf3.Z(str2)) {
            return true;
        }
        Map map = (Map) this.f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean G(String str) {
        return "1".equals(b(str, "measurement.upload.blacklist_public"));
    }

    public final boolean H(String str, byte[] bArr, String str2, String str3) throws Throwable {
        e();
        d();
        AbstractC7506py0.f(str);
        SF2 sf2 = (SF2) i(str, bArr).j();
        j(str, sf2);
        l(str, (C9271wG2) sf2.l());
        this.h.put(str, (C9271wG2) sf2.l());
        this.l.put(str, sf2.u());
        this.m.put(str, str2);
        this.n.put(str, str3);
        this.d.put(str, m((C9271wG2) sf2.l()));
        this.b.V().j(str, new ArrayList(sf2.v()));
        try {
            sf2.r();
            bArr = ((C9271wG2) sf2.l()).g();
        } catch (RuntimeException e) {
            this.a.w().t().c("Unable to serialize reduced-size config. Storing full config instead. appId", C6675mz2.z(str), e);
        }
        C1521Ls1 c1521Ls1V = this.b.V();
        AbstractC7506py0.f(str);
        c1521Ls1V.d();
        c1521Ls1V.e();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (c1521Ls1V.P().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                c1521Ls1V.a.w().n().b("Failed to update remote config (got 0). appId", C6675mz2.z(str));
            }
        } catch (SQLiteException e2) {
            c1521Ls1V.a.w().n().c("Error storing remote config. appId", C6675mz2.z(str), e2);
        }
        this.h.put(str, (C9271wG2) sf2.l());
        return true;
    }

    public final boolean I(String str) throws Throwable {
        d();
        k(str);
        return this.e.get(str) != null && ((Set) this.e.get(str)).contains("app_instance_id");
    }

    public final boolean J(String str) throws Throwable {
        d();
        k(str);
        if (this.e.get(str) != null) {
            return ((Set) this.e.get(str)).contains("device_model") || ((Set) this.e.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean K(String str) throws Throwable {
        d();
        k(str);
        return this.e.get(str) != null && ((Set) this.e.get(str)).contains("enhanced_user_id");
    }

    public final boolean L(String str) throws Throwable {
        d();
        k(str);
        return this.e.get(str) != null && ((Set) this.e.get(str)).contains("google_signals");
    }

    public final boolean M(String str) throws Throwable {
        d();
        k(str);
        if (this.e.get(str) != null) {
            return ((Set) this.e.get(str)).contains("os_version") || ((Set) this.e.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean N(String str) throws Throwable {
        d();
        k(str);
        return this.e.get(str) != null && ((Set) this.e.get(str)).contains("user_id");
    }

    @Override // com.daaw.InterfaceC1613Mp1
    public final String b(String str, String str2) throws Throwable {
        d();
        k(str);
        Map map = (Map) this.d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.daaw.Be3
    public final boolean h() {
        return false;
    }

    public final C9271wG2 i(String str, byte[] bArr) {
        if (bArr == null) {
            return C9271wG2.H();
        }
        try {
            C9271wG2 c9271wG2 = (C9271wG2) ((SF2) Af3.E(C9271wG2.F(), bArr)).l();
            this.a.w().s().c("Parsed config. version, gmp_app_id", c9271wG2.W() ? Long.valueOf(c9271wG2.D()) : null, c9271wG2.V() ? c9271wG2.I() : null);
            return c9271wG2;
        } catch (Ef3 e) {
            this.a.w().t().c("Unable to merge remote config. appId", C6675mz2.z(str), e);
            return C9271wG2.H();
        } catch (RuntimeException e2) {
            this.a.w().t().c("Unable to merge remote config. appId", C6675mz2.z(str), e2);
            return C9271wG2.H();
        }
    }

    public final void j(String str, SF2 sf2) {
        HashSet hashSet = new HashSet();
        C2407Ua c2407Ua = new C2407Ua();
        C2407Ua c2407Ua2 = new C2407Ua();
        C2407Ua c2407Ua3 = new C2407Ua();
        Iterator it = sf2.w().iterator();
        while (it.hasNext()) {
            hashSet.add(((C5062hE2) it.next()).C());
        }
        for (int i = 0; i < sf2.p(); i++) {
            LE2 le2 = (LE2) sf2.q(i).j();
            if (le2.r().isEmpty()) {
                this.a.w().t().a("EventConfig contained null event name");
            } else {
                String strR = le2.r();
                String strB = AbstractC9517x83.b(le2.r());
                if (!TextUtils.isEmpty(strB)) {
                    le2.q(strB);
                    sf2.t(i, le2);
                }
                if (le2.v() && le2.t()) {
                    c2407Ua.put(strR, Boolean.TRUE);
                }
                if (le2.w() && le2.u()) {
                    c2407Ua2.put(le2.r(), Boolean.TRUE);
                }
                if (le2.x()) {
                    if (le2.p() < 2 || le2.p() > 65535) {
                        this.a.w().t().c("Invalid sampling rate. Event name, sample rate", le2.r(), Integer.valueOf(le2.p()));
                    } else {
                        c2407Ua3.put(le2.r(), Integer.valueOf(le2.p()));
                    }
                }
            }
        }
        this.e.put(str, hashSet);
        this.f.put(str, c2407Ua);
        this.g.put(str, c2407Ua2);
        this.i.put(str, c2407Ua3);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0083: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:132), block:B:22:0x0083 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.String r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.QO2.k(java.lang.String):void");
    }

    public final void l(final String str, C9271wG2 c9271wG2) {
        if (c9271wG2.B() == 0) {
            this.j.e(str);
            return;
        }
        this.a.w().s().b("EES programs found", Integer.valueOf(c9271wG2.B()));
        F33 f33 = (F33) c9271wG2.O().get(0);
        try {
            C7916rS1 c7916rS1 = new C7916rS1();
            c7916rS1.d("internal.remoteConfig", new Callable() { // from class: com.daaw.FL2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new Ah3("internal.remoteConfig", new C7065oO2(this.a, str));
                }
            });
            c7916rS1.d("internal.appMetadata", new Callable() { // from class: com.daaw.fM2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final QO2 qo2 = this.a;
                    final String str2 = str;
                    return new C3827cq3("internal.appMetadata", new Callable() { // from class: com.daaw.eL2
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            QO2 qo22 = qo2;
                            String str3 = str2;
                            C8110s73 c8110s73R = qo22.b.V().R(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            qo22.a.z().m();
                            map.put("gmp_version", 79000L);
                            if (c8110s73R != null) {
                                String strO0 = c8110s73R.o0();
                                if (strO0 != null) {
                                    map.put("app_version", strO0);
                                }
                                map.put("app_version_int", Long.valueOf(c8110s73R.R()));
                                map.put("dynamite_version", Long.valueOf(c8110s73R.a0()));
                            }
                            return map;
                        }
                    });
                }
            });
            c7916rS1.d("internal.logger", new Callable() { // from class: com.daaw.DM2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new C8862up3(this.a.k);
                }
            });
            c7916rS1.c(f33);
            this.j.d(str, c7916rS1);
            this.a.w().s().c("EES program loaded for appId, activities", str, Integer.valueOf(f33.B().B()));
            Iterator it = f33.B().E().iterator();
            while (it.hasNext()) {
                this.a.w().s().b("EES program activity", ((C9487x23) it.next()).C());
            }
        } catch (C7557q82 unused) {
            this.a.w().n().b("Failed to load EES program. appId", str);
        }
    }

    public final int n(String str, String str2) throws Throwable {
        Integer num;
        d();
        k(str);
        Map map = (Map) this.i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final C9271wG2 q(String str) {
        e();
        d();
        AbstractC7506py0.f(str);
        k(str);
        return (C9271wG2) this.h.get(str);
    }

    public final String r(String str) {
        d();
        return (String) this.n.get(str);
    }

    public final String s(String str) {
        d();
        return (String) this.m.get(str);
    }

    public final String t(String str) throws Throwable {
        d();
        k(str);
        return (String) this.l.get(str);
    }

    public final Set y(String str) {
        d();
        k(str);
        return (Set) this.e.get(str);
    }

    public final void z(String str) {
        d();
        this.m.put(str, null);
    }
}
