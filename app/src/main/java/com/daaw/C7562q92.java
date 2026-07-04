package com.daaw;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.q92, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7562q92 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public int e;
    public int f;
    public boolean g;
    public final OP2 h;
    public final OP2 i;
    public final int j;
    public final int k;
    public final OP2 l;
    public OP2 m;
    public int n;
    public final HashMap o;
    public final HashSet p;

    public C7562q92() {
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        this.f = Integer.MAX_VALUE;
        this.g = true;
        this.h = OP2.J();
        this.i = OP2.J();
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.l = OP2.J();
        this.m = OP2.J();
        this.n = 0;
        this.o = new HashMap();
        this.p = new HashSet();
    }

    public final C7562q92 d(Context context) {
        CaptioningManager captioningManager;
        if ((AbstractC9004vJ2.a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.n = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.m = OP2.K(AbstractC9004vJ2.L(locale));
            }
        }
        return this;
    }

    public C7562q92 e(int i, int i2, boolean z) {
        this.e = i;
        this.f = i2;
        this.g = true;
        return this;
    }

    public C7562q92(R92 r92) {
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MAX_VALUE;
        this.e = r92.i;
        this.f = r92.j;
        this.g = r92.k;
        this.h = r92.l;
        this.i = r92.n;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.l = r92.r;
        this.m = r92.t;
        this.n = r92.u;
        this.p = new HashSet(r92.A);
        this.o = new HashMap(r92.z);
    }
}
