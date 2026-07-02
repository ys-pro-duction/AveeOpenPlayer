package com.daaw;

import android.graphics.Paint;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.zR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C10150zR0 implements InterfaceC6921ns {
    public final String a;
    public final I6 b;
    public final List c;
    public final H6 d;
    public final K6 e;
    public final I6 f;
    public final b g;
    public final c h;
    public final float i;
    public final boolean j;

    /* JADX INFO: renamed from: com.daaw.zR0$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[c.values().length];
            b = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            a = iArr2;
            try {
                iArr2[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.zR0$b */
    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap a() {
            int i = a.a[ordinal()];
            return i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    /* JADX INFO: renamed from: com.daaw.zR0$c */
    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join a() {
            int i = a.b[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public C10150zR0(String str, I6 i6, List list, H6 h6, K6 k6, I6 i62, b bVar, c cVar, float f, boolean z) {
        this.a = str;
        this.b = i6;
        this.c = list;
        this.d = h6;
        this.e = k6;
        this.f = i62;
        this.g = bVar;
        this.h = cVar;
        this.i = f;
        this.j = z;
    }

    @Override // com.daaw.InterfaceC6921ns
    public InterfaceC2371Tr a(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe) {
        return new HY0(c4615ff0, abstractC9647xe, this);
    }

    public b b() {
        return this.g;
    }

    public H6 c() {
        return this.d;
    }

    public I6 d() {
        return this.b;
    }

    public c e() {
        return this.h;
    }

    public List f() {
        return this.c;
    }

    public float g() {
        return this.i;
    }

    public String h() {
        return this.a;
    }

    public K6 i() {
        return this.e;
    }

    public I6 j() {
        return this.f;
    }

    public boolean k() {
        return this.j;
    }
}
