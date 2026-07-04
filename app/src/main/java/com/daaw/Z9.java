package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class Z9 {
    public final C3831cr2 a;

    public interface a extends M83 {
    }

    public Z9(C3831cr2 c3831cr2) {
        this.a = c3831cr2;
    }

    public static Z9 k(Context context, String str, String str2, String str3, Bundle bundle) {
        return C3831cr2.t(context, str, str2, str3, bundle).q();
    }

    public void a(String str) {
        this.a.F(str);
    }

    public void b(String str, String str2, Bundle bundle) {
        this.a.G(str, str2, bundle);
    }

    public void c(String str) {
        this.a.H(str);
    }

    public long d() {
        return this.a.o();
    }

    public String e() {
        return this.a.v();
    }

    public String f() {
        return this.a.w();
    }

    public List g(String str, String str2) {
        return this.a.A(str, str2);
    }

    public String h() {
        return this.a.x();
    }

    public String i() {
        return this.a.y();
    }

    public String j() {
        return this.a.z();
    }

    public int l(String str) {
        return this.a.n(str);
    }

    public Map m(String str, String str2, boolean z) {
        return this.a.B(str, str2, z);
    }

    public void n(String str, String str2, Bundle bundle) {
        this.a.I(str, str2, bundle);
    }

    public void o(Bundle bundle) {
        this.a.p(bundle, false);
    }

    public Bundle p(Bundle bundle) {
        return this.a.p(bundle, true);
    }

    public void q(a aVar) {
        this.a.b(aVar);
    }

    public void r(Bundle bundle) {
        this.a.c(bundle);
    }

    public void s(Bundle bundle) {
        this.a.d(bundle);
    }

    public void t(Activity activity, String str, String str2) {
        this.a.e(activity, str, str2);
    }

    public void u(String str, String str2, Object obj) {
        this.a.f(str, str2, obj, true);
    }
}
