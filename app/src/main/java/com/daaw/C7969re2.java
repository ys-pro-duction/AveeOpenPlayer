package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzel;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.re2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7969re2 {
    public int a;
    public zzdq b;
    public InterfaceC5907kG1 c;
    public View d;
    public List e;
    public zzel g;
    public Bundle h;
    public InterfaceC9334wW1 i;
    public InterfaceC9334wW1 j;
    public InterfaceC9334wW1 k;
    public AbstractC9841yJ2 l;
    public InterfaceFutureC8236sc0 m;
    public BT1 n;
    public View o;
    public View p;
    public InterfaceC7934rX q;
    public double r;
    public InterfaceC8147sG1 s;
    public InterfaceC8147sG1 t;
    public String u;
    public float x;
    public String y;
    public final BS0 v = new BS0();
    public final BS0 w = new BS0();
    public List f = Collections.EMPTY_LIST;

    public static C7969re2 H(C5093hM1 c5093hM1) {
        C7969re2 c7969re2;
        BinderC7691qe2 binderC7691qe2L;
        InterfaceC5907kG1 interfaceC5907kG1B3;
        View view;
        String strZzo;
        List listF3;
        String strZzm;
        Bundle bundleZzf;
        String strZzn;
        View view2;
        InterfaceC7934rX interfaceC7934rXZzl;
        String strZzq;
        String strZzp;
        double dZze;
        InterfaceC8147sG1 interfaceC8147sG1C3;
        try {
            binderC7691qe2L = L(c5093hM1.a3(), null);
            interfaceC5907kG1B3 = c5093hM1.b3();
            view = (View) N(c5093hM1.d3());
            strZzo = c5093hM1.zzo();
            listF3 = c5093hM1.f3();
            strZzm = c5093hM1.zzm();
            bundleZzf = c5093hM1.zzf();
            strZzn = c5093hM1.zzn();
            view2 = (View) N(c5093hM1.e3());
            interfaceC7934rXZzl = c5093hM1.zzl();
            strZzq = c5093hM1.zzq();
            strZzp = c5093hM1.zzp();
            dZze = c5093hM1.zze();
            interfaceC8147sG1C3 = c5093hM1.c3();
            c7969re2 = null;
        } catch (RemoteException e) {
            e = e;
            c7969re2 = null;
        }
        try {
            C7969re2 c7969re22 = new C7969re2();
            c7969re22.a = 2;
            c7969re22.b = binderC7691qe2L;
            c7969re22.c = interfaceC5907kG1B3;
            c7969re22.d = view;
            c7969re22.z("headline", strZzo);
            c7969re22.e = listF3;
            c7969re22.z("body", strZzm);
            c7969re22.h = bundleZzf;
            c7969re22.z("call_to_action", strZzn);
            c7969re22.o = view2;
            c7969re22.q = interfaceC7934rXZzl;
            c7969re22.z(ProductResponseJsonKeys.STORE, strZzq);
            c7969re22.z("price", strZzp);
            c7969re22.r = dZze;
            c7969re22.s = interfaceC8147sG1C3;
            return c7969re22;
        } catch (RemoteException e2) {
            e = e2;
            AbstractC4274eT1.zzk("Failed to get native ad from app install ad mapper", e);
            return c7969re2;
        }
    }

    public static C7969re2 I(C5372iM1 c5372iM1) {
        try {
            BinderC7691qe2 binderC7691qe2L = L(c5372iM1.a3(), null);
            InterfaceC5907kG1 interfaceC5907kG1B3 = c5372iM1.b3();
            View view = (View) N(c5372iM1.zzi());
            String strZzo = c5372iM1.zzo();
            List listF3 = c5372iM1.f3();
            String strZzm = c5372iM1.zzm();
            Bundle bundleZze = c5372iM1.zze();
            String strZzn = c5372iM1.zzn();
            View view2 = (View) N(c5372iM1.d3());
            InterfaceC7934rX interfaceC7934rXE3 = c5372iM1.e3();
            String strZzl = c5372iM1.zzl();
            InterfaceC8147sG1 interfaceC8147sG1C3 = c5372iM1.c3();
            C7969re2 c7969re2 = new C7969re2();
            c7969re2.a = 1;
            c7969re2.b = binderC7691qe2L;
            c7969re2.c = interfaceC5907kG1B3;
            c7969re2.d = view;
            c7969re2.z("headline", strZzo);
            c7969re2.e = listF3;
            c7969re2.z("body", strZzm);
            c7969re2.h = bundleZze;
            c7969re2.z("call_to_action", strZzn);
            c7969re2.o = view2;
            c7969re2.q = interfaceC7934rXE3;
            c7969re2.z("advertiser", strZzl);
            c7969re2.t = interfaceC8147sG1C3;
            return c7969re2;
        } catch (RemoteException e) {
            AbstractC4274eT1.zzk("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static C7969re2 J(C5093hM1 c5093hM1) {
        try {
            return M(L(c5093hM1.a3(), null), c5093hM1.b3(), (View) N(c5093hM1.d3()), c5093hM1.zzo(), c5093hM1.f3(), c5093hM1.zzm(), c5093hM1.zzf(), c5093hM1.zzn(), (View) N(c5093hM1.e3()), c5093hM1.zzl(), c5093hM1.zzq(), c5093hM1.zzp(), c5093hM1.zze(), c5093hM1.c3(), null, 0.0f);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzk("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static C7969re2 K(C5372iM1 c5372iM1) {
        try {
            return M(L(c5372iM1.a3(), null), c5372iM1.b3(), (View) N(c5372iM1.zzi()), c5372iM1.zzo(), c5372iM1.f3(), c5372iM1.zzm(), c5372iM1.zze(), c5372iM1.zzn(), (View) N(c5372iM1.d3()), c5372iM1.e3(), null, null, -1.0d, c5372iM1.c3(), c5372iM1.zzl(), 0.0f);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzk("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    public static BinderC7691qe2 L(zzdq zzdqVar, InterfaceC6219lM1 interfaceC6219lM1) {
        if (zzdqVar == null) {
            return null;
        }
        return new BinderC7691qe2(zzdqVar, interfaceC6219lM1);
    }

    public static C7969re2 M(zzdq zzdqVar, InterfaceC5907kG1 interfaceC5907kG1, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, InterfaceC7934rX interfaceC7934rX, String str4, String str5, double d, InterfaceC8147sG1 interfaceC8147sG1, String str6, float f) {
        C7969re2 c7969re2 = new C7969re2();
        c7969re2.a = 6;
        c7969re2.b = zzdqVar;
        c7969re2.c = interfaceC5907kG1;
        c7969re2.d = view;
        c7969re2.z("headline", str);
        c7969re2.e = list;
        c7969re2.z("body", str2);
        c7969re2.h = bundle;
        c7969re2.z("call_to_action", str3);
        c7969re2.o = view2;
        c7969re2.q = interfaceC7934rX;
        c7969re2.z(ProductResponseJsonKeys.STORE, str4);
        c7969re2.z("price", str5);
        c7969re2.r = d;
        c7969re2.s = interfaceC8147sG1;
        c7969re2.z("advertiser", str6);
        c7969re2.r(f);
        return c7969re2;
    }

    public static Object N(InterfaceC7934rX interfaceC7934rX) {
        if (interfaceC7934rX == null) {
            return null;
        }
        return BinderC7744qp0.I(interfaceC7934rX);
    }

    public static C7969re2 g0(InterfaceC6219lM1 interfaceC6219lM1) {
        try {
            return M(L(interfaceC6219lM1.zzj(), interfaceC6219lM1), interfaceC6219lM1.zzk(), (View) N(interfaceC6219lM1.zzm()), interfaceC6219lM1.zzs(), interfaceC6219lM1.zzv(), interfaceC6219lM1.zzq(), interfaceC6219lM1.zzi(), interfaceC6219lM1.zzr(), (View) N(interfaceC6219lM1.zzn()), interfaceC6219lM1.zzo(), interfaceC6219lM1.zzu(), interfaceC6219lM1.zzt(), interfaceC6219lM1.zze(), interfaceC6219lM1.zzl(), interfaceC6219lM1.zzp(), interfaceC6219lM1.zzf());
        } catch (RemoteException e) {
            AbstractC4274eT1.zzk("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final synchronized double A() {
        return this.r;
    }

    public final synchronized void B(int i) {
        this.a = i;
    }

    public final synchronized void C(zzdq zzdqVar) {
        this.b = zzdqVar;
    }

    public final synchronized void D(View view) {
        this.o = view;
    }

    public final synchronized void E(InterfaceC9334wW1 interfaceC9334wW1) {
        this.i = interfaceC9334wW1;
    }

    public final synchronized void F(View view) {
        this.p = view;
    }

    public final synchronized boolean G() {
        return this.j != null;
    }

    public final synchronized float O() {
        return this.x;
    }

    public final synchronized int P() {
        return this.a;
    }

    public final synchronized Bundle Q() {
        try {
            if (this.h == null) {
                this.h = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.h;
    }

    public final synchronized View R() {
        return this.d;
    }

    public final synchronized View S() {
        return this.o;
    }

    public final synchronized View T() {
        return this.p;
    }

    public final synchronized BS0 U() {
        return this.v;
    }

    public final synchronized BS0 V() {
        return this.w;
    }

    public final synchronized zzdq W() {
        return this.b;
    }

    public final synchronized zzel X() {
        return this.g;
    }

    public final synchronized InterfaceC5907kG1 Y() {
        return this.c;
    }

    public final InterfaceC8147sG1 Z() {
        List list = this.e;
        if (list != null && !list.isEmpty()) {
            Object obj = this.e.get(0);
            if (obj instanceof IBinder) {
                return AbstractBinderC7868rG1.Z2((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized String a() {
        return this.u;
    }

    public final synchronized InterfaceC8147sG1 a0() {
        return this.s;
    }

    public final synchronized String b() {
        return f("headline");
    }

    public final synchronized InterfaceC8147sG1 b0() {
        return this.t;
    }

    public final synchronized String c() {
        return this.y;
    }

    public final synchronized BT1 c0() {
        return this.n;
    }

    public final synchronized String d() {
        return f("price");
    }

    public final synchronized InterfaceC9334wW1 d0() {
        return this.j;
    }

    public final synchronized String e() {
        return f(ProductResponseJsonKeys.STORE);
    }

    public final synchronized InterfaceC9334wW1 e0() {
        return this.k;
    }

    public final synchronized String f(String str) {
        return (String) this.w.get(str);
    }

    public final synchronized InterfaceC9334wW1 f0() {
        return this.i;
    }

    public final synchronized List g() {
        return this.e;
    }

    public final synchronized List h() {
        return this.f;
    }

    public final synchronized AbstractC9841yJ2 h0() {
        return this.l;
    }

    public final synchronized void i() {
        try {
            InterfaceC9334wW1 interfaceC9334wW1 = this.i;
            if (interfaceC9334wW1 != null) {
                interfaceC9334wW1.destroy();
                this.i = null;
            }
            InterfaceC9334wW1 interfaceC9334wW12 = this.j;
            if (interfaceC9334wW12 != null) {
                interfaceC9334wW12.destroy();
                this.j = null;
            }
            InterfaceC9334wW1 interfaceC9334wW13 = this.k;
            if (interfaceC9334wW13 != null) {
                interfaceC9334wW13.destroy();
                this.k = null;
            }
            InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = this.m;
            if (interfaceFutureC8236sc0 != null) {
                interfaceFutureC8236sc0.cancel(false);
                this.m = null;
            }
            BT1 bt1 = this.n;
            if (bt1 != null) {
                bt1.cancel(false);
                this.n = null;
            }
            this.l = null;
            this.v.clear();
            this.w.clear();
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.h = null;
            this.o = null;
            this.p = null;
            this.q = null;
            this.s = null;
            this.t = null;
            this.u = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized InterfaceC7934rX i0() {
        return this.q;
    }

    public final synchronized void j(InterfaceC5907kG1 interfaceC5907kG1) {
        this.c = interfaceC5907kG1;
    }

    public final synchronized InterfaceFutureC8236sc0 j0() {
        return this.m;
    }

    public final synchronized void k(String str) {
        this.u = str;
    }

    public final synchronized String k0() {
        return f("advertiser");
    }

    public final synchronized void l(zzel zzelVar) {
        this.g = zzelVar;
    }

    public final synchronized String l0() {
        return f("body");
    }

    public final synchronized void m(InterfaceC8147sG1 interfaceC8147sG1) {
        this.s = interfaceC8147sG1;
    }

    public final synchronized String m0() {
        return f("call_to_action");
    }

    public final synchronized void n(String str, BinderC4501fG1 binderC4501fG1) {
        if (binderC4501fG1 == null) {
            this.v.remove(str);
        } else {
            this.v.put(str, binderC4501fG1);
        }
    }

    public final synchronized void o(InterfaceC9334wW1 interfaceC9334wW1) {
        this.j = interfaceC9334wW1;
    }

    public final synchronized void p(List list) {
        this.e = list;
    }

    public final synchronized void q(InterfaceC8147sG1 interfaceC8147sG1) {
        this.t = interfaceC8147sG1;
    }

    public final synchronized void r(float f) {
        this.x = f;
    }

    public final synchronized void s(List list) {
        this.f = list;
    }

    public final synchronized void t(InterfaceC9334wW1 interfaceC9334wW1) {
        this.k = interfaceC9334wW1;
    }

    public final synchronized void u(InterfaceFutureC8236sc0 interfaceFutureC8236sc0) {
        this.m = interfaceFutureC8236sc0;
    }

    public final synchronized void v(String str) {
        this.y = str;
    }

    public final synchronized void w(AbstractC9841yJ2 abstractC9841yJ2) {
        this.l = abstractC9841yJ2;
    }

    public final synchronized void x(BT1 bt1) {
        this.n = bt1;
    }

    public final synchronized void y(double d) {
        this.r = d;
    }

    public final synchronized void z(String str, String str2) {
        if (str2 == null) {
            this.w.remove(str);
        } else {
            this.w.put(str, str2);
        }
    }
}
