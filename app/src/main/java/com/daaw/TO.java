package com.daaw;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public abstract class TO {

    public static class a {
        public final int a;
        public final b[] b;

        public a(int i, b[] bVarArr) {
            this.a = i;
            this.b = bVarArr;
        }

        public static a a(int i, b[] bVarArr) {
            return new a(i, bVarArr);
        }

        public b[] b() {
            return this.b;
        }

        public int c() {
            return this.a;
        }
    }

    public static class b {
        public final Uri a;
        public final int b;
        public final int c;
        public final boolean d;
        public final int e;

        public b(Uri uri, int i, int i2, boolean z, int i3) {
            this.a = (Uri) AbstractC8621ty0.g(uri);
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = i3;
        }

        public static b a(Uri uri, int i, int i2, boolean z, int i3) {
            return new b(uri, i, i2, z, i3);
        }

        public int b() {
            return this.e;
        }

        public int c() {
            return this.b;
        }

        public Uri d() {
            return this.a;
        }

        public int e() {
            return this.c;
        }

        public boolean f() {
            return this.d;
        }
    }

    public static class c {
        public abstract void a(int i);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return Q81.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, LO lo) {
        return HO.e(context, lo, cancellationSignal);
    }

    public static Typeface c(Context context, LO lo, int i, boolean z, int i2, Handler handler, c cVar) {
        C1895Pi c1895Pi = new C1895Pi(cVar, handler);
        return z ? NO.e(context, lo, c1895Pi, i, i2) : NO.d(context, lo, i, null, c1895Pi);
    }
}
