package com.daaw;

import android.content.Context;
import com.daaw.KZ0;
import com.daaw.QJ0;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.bw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3573bw {
    public final KZ0.c a;
    public final Context b;
    public final String c;
    public final QJ0.d d;
    public final List e;
    public final boolean f;
    public final QJ0.c g;
    public final Executor h;
    public final Executor i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final Set m;
    public final String n;
    public final File o;

    public C3573bw(Context context, String str, KZ0.c cVar, QJ0.d dVar, List list, boolean z, QJ0.c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set set, String str2, File file) {
        this.a = cVar;
        this.b = context;
        this.c = str;
        this.d = dVar;
        this.e = list;
        this.f = z;
        this.g = cVar2;
        this.h = executor;
        this.i = executor2;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = set;
        this.n = str2;
        this.o = file;
    }

    public boolean a(int i, int i2) {
        Set set;
        return (i <= i2 || !this.l) && this.k && ((set = this.m) == null || !set.contains(Integer.valueOf(i)));
    }
}
