package com.daaw;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.daaw.C2763Xl;
import com.daaw.C5033h8;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.Collections;

/* JADX INFO: renamed from: com.daaw.tT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8476tT {
    public final Context a;
    public final String b;
    public final C5033h8 c;
    public final C5033h8.d d;
    public final H8 e;
    public final Looper f;
    public final int g;
    public final AbstractC9878yT h;
    public final InterfaceC6820nX0 i;
    public final C10157zT j;

    /* JADX INFO: renamed from: com.daaw.tT$a */
    public static class a {
        public static final a c = new C0235a().a();
        public final InterfaceC6820nX0 a;
        public final Looper b;

        /* JADX INFO: renamed from: com.daaw.tT$a$a, reason: collision with other inner class name */
        public static class C0235a {
            public InterfaceC6820nX0 a;
            public Looper b;

            public a a() {
                if (this.a == null) {
                    this.a = new F8();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new a(this.a, this.b);
            }
        }

        public a(InterfaceC6820nX0 interfaceC6820nX0, Account account, Looper looper) {
            this.a = interfaceC6820nX0;
            this.b = looper;
        }
    }

    public AbstractC8476tT(Context context, Activity activity, C5033h8 c5033h8, C5033h8.d dVar, a aVar) {
        AbstractC7506py0.m(context, "Null context is not permitted.");
        AbstractC7506py0.m(c5033h8, "Api must not be null.");
        AbstractC7506py0.m(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) AbstractC7506py0.m(context.getApplicationContext(), "The provided context did not have an application context.");
        this.a = context2;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : f(context);
        this.b = attributionTag;
        this.c = c5033h8;
        this.d = dVar;
        this.f = aVar.b;
        H8 h8A = H8.a(c5033h8, dVar, attributionTag);
        this.e = h8A;
        this.h = new C6042kl1(this);
        C10157zT c10157zTT = C10157zT.t(context2);
        this.j = c10157zTT;
        this.g = c10157zTT.k();
        this.i = aVar.a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C2345Tk1.u(activity, c10157zTT, h8A);
        }
        c10157zTT.D(this);
    }

    public C2763Xl.a c() {
        C2763Xl.a aVar = new C2763Xl.a();
        aVar.d(null);
        aVar.c(Collections.EMPTY_SET);
        aVar.e(this.a.getClass().getName());
        aVar.b(this.a.getPackageName());
        return aVar;
    }

    public AbstractC6963o11 d(AbstractC7242p11 abstractC7242p11) {
        return l(2, abstractC7242p11);
    }

    public AbstractC6963o11 e(AbstractC7242p11 abstractC7242p11) {
        return l(0, abstractC7242p11);
    }

    public String f(Context context) {
        return null;
    }

    public final H8 g() {
        return this.e;
    }

    public String h() {
        return this.b;
    }

    public final int i() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C5033h8.f j(Looper looper, C4646fl1 c4646fl1) {
        C2763Xl c2763XlA = c().a();
        C5033h8.f fVarB = ((C5033h8.a) AbstractC7506py0.l(this.c.a())).b(this.a, looper, c2763XlA, this.d, c4646fl1, c4646fl1);
        String strH = h();
        if (strH != null && (fVarB instanceof AbstractC8245se)) {
            ((AbstractC8245se) fVarB).setAttributionTag(strH);
        }
        if (strH == null || !(fVarB instanceof AbstractServiceConnectionC9140vo0)) {
            return fVarB;
        }
        AbstractC6314li0.a(fVarB);
        throw null;
    }

    public final BinderC9684xl1 k(Context context, Handler handler) {
        return new BinderC9684xl1(context, handler, c().a());
    }

    public final AbstractC6963o11 l(int i, AbstractC7242p11 abstractC7242p11) {
        C7521q11 c7521q11 = new C7521q11();
        this.j.z(this, i, abstractC7242p11, c7521q11, this.i);
        return c7521q11.a();
    }

    public AbstractC8476tT(Context context, C5033h8 c5033h8, C5033h8.d dVar, a aVar) {
        this(context, null, c5033h8, dVar, aVar);
    }
}
