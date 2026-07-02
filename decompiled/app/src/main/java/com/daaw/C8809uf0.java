package com.daaw;

import android.graphics.Bitmap;
import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.uf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8809uf0 implements InterfaceC1883Pf {
    public static final Bitmap.Config k = Bitmap.Config.ARGB_8888;
    public final InterfaceC0741Ef0 a;
    public final Set b;
    public final int c;
    public final b d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: com.daaw.uf0$b */
    public interface b {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    public C8809uf0(int i, InterfaceC0741Ef0 interfaceC0741Ef0, Set set) {
        this.c = i;
        this.e = i;
        this.a = interfaceC0741Ef0;
        this.b = set;
        this.d = new c();
    }

    public static Set i() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    public static InterfaceC0741Ef0 j() {
        return new C10158zT0();
    }

    @Override // com.daaw.InterfaceC1883Pf
    public synchronized boolean a(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isMutable() && this.a.d(bitmap) <= this.e && this.b.contains(bitmap.getConfig())) {
                int iD = this.a.d(bitmap);
                this.a.a(bitmap);
                this.d.b(bitmap);
                this.i++;
                this.f += iD;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    this.a.e(bitmap);
                }
                f();
                h();
                return true;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.a.e(bitmap);
                bitmap.isMutable();
                this.b.contains(bitmap.getConfig());
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC1883Pf
    public synchronized Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapE;
        bitmapE = e(i, i2, config);
        if (bitmapE != null) {
            bitmapE.eraseColor(0);
        }
        return bitmapE;
    }

    @Override // com.daaw.InterfaceC1883Pf
    public void c(int i) {
        if (i >= 60) {
            d();
        } else if (i >= 40) {
            k(this.e / 2);
        }
    }

    @Override // com.daaw.InterfaceC1883Pf
    public void d() {
        k(0);
    }

    @Override // com.daaw.InterfaceC1883Pf
    public synchronized Bitmap e(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            bitmapB = this.a.b(i, i2, config != null ? config : k);
            if (bitmapB == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.a.c(i, i2, config);
                }
                this.h++;
            } else {
                this.g++;
                this.f -= this.a.d(bitmapB);
                this.d.a(bitmapB);
                bitmapB.setHasAlpha(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.a.c(i, i2, config);
            }
            f();
        } catch (Throwable th) {
            throw th;
        }
        return bitmapB;
    }

    public final void f() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            g();
        }
    }

    public final void g() {
        Objects.toString(this.a);
    }

    public final void h() {
        k(this.e);
    }

    public final synchronized void k(int i) {
        while (this.f > i) {
            try {
                Bitmap bitmapRemoveLast = this.a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        g();
                    }
                    this.f = 0;
                    return;
                } else {
                    this.d.a(bitmapRemoveLast);
                    this.f -= this.a.d(bitmapRemoveLast);
                    bitmapRemoveLast.recycle();
                    this.j++;
                    if (Log.isLoggable("LruBitmapPool", 3)) {
                        this.a.e(bitmapRemoveLast);
                    }
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C8809uf0(int i) {
        this(i, j(), i());
    }

    /* JADX INFO: renamed from: com.daaw.uf0$c */
    public static class c implements b {
        public c() {
        }

        @Override // com.daaw.C8809uf0.b
        public void a(Bitmap bitmap) {
        }

        @Override // com.daaw.C8809uf0.b
        public void b(Bitmap bitmap) {
        }
    }
}
