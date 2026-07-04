package com.daaw;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.daaw.aa1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3188aa1 {
    public static final Unsafe a = H();
    public static final Class b = AbstractC6418m4.b();
    public static final boolean c = q(Long.TYPE);
    public static final boolean d = q(Integer.TYPE);
    public static final e e = F();
    public static final boolean f = X();
    public static final boolean g = W();
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public static final long n;
    public static final long o;
    public static final long p;
    public static final long q;
    public static final long r;
    public static final long s;
    public static final long t;
    public static final long u;
    public static final int v;
    public static final boolean w;

    /* JADX INFO: renamed from: com.daaw.aa1$a */
    public static class a implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.aa1$b */
    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public void c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public boolean d(Object obj, long j) {
            return AbstractC3188aa1.w ? AbstractC3188aa1.u(obj, j) : AbstractC3188aa1.v(obj, j);
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public byte e(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public byte f(Object obj, long j) {
            return AbstractC3188aa1.w ? AbstractC3188aa1.y(obj, j) : AbstractC3188aa1.z(obj, j);
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public double g(Object obj, long j) {
            return Double.longBitsToDouble(k(obj, j));
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public float h(Object obj, long j) {
            return Float.intBitsToFloat(i(obj, j));
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public long j(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public void n(Object obj, long j, boolean z) {
            if (AbstractC3188aa1.w) {
                AbstractC3188aa1.M(obj, j, z);
            } else {
                AbstractC3188aa1.N(obj, j, z);
            }
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public void o(Object obj, long j, byte b) {
            if (AbstractC3188aa1.w) {
                AbstractC3188aa1.P(obj, j, b);
            } else {
                AbstractC3188aa1.Q(obj, j, b);
            }
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public void p(Object obj, long j, double d) {
            s(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public void q(Object obj, long j, float f) {
            r(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public boolean v() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.daaw.aa1$c */
    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public void c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public boolean d(Object obj, long j) {
            return AbstractC3188aa1.w ? AbstractC3188aa1.u(obj, j) : AbstractC3188aa1.v(obj, j);
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public byte e(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public byte f(Object obj, long j) {
            return AbstractC3188aa1.w ? AbstractC3188aa1.y(obj, j) : AbstractC3188aa1.z(obj, j);
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public double g(Object obj, long j) {
            return Double.longBitsToDouble(k(obj, j));
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public float h(Object obj, long j) {
            return Float.intBitsToFloat(i(obj, j));
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public long j(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public void n(Object obj, long j, boolean z) {
            if (AbstractC3188aa1.w) {
                AbstractC3188aa1.M(obj, j, z);
            } else {
                AbstractC3188aa1.N(obj, j, z);
            }
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public void o(Object obj, long j, byte b) {
            if (AbstractC3188aa1.w) {
                AbstractC3188aa1.P(obj, j, b);
            } else {
                AbstractC3188aa1.Q(obj, j, b);
            }
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public void p(Object obj, long j, double d) {
            s(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public void q(Object obj, long j, float f) {
            r(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public boolean v() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.daaw.aa1$d */
    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public void c(long j, byte[] bArr, long j2, long j3) {
            this.a.copyMemory((Object) null, j, bArr, AbstractC3188aa1.h + j2, j3);
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public boolean d(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public byte e(long j) {
            return this.a.getByte(j);
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public byte f(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public double g(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public float h(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public long j(long j) {
            return this.a.getLong(j);
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public void n(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public void o(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public void p(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public void q(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public boolean u() {
            if (!super.u()) {
                return false;
            }
            try {
                Class<?> cls = this.a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                AbstractC3188aa1.K(th);
                return false;
            }
        }

        @Override // com.daaw.AbstractC3188aa1.e
        public boolean v() {
            if (!super.v()) {
                return false;
            }
            try {
                Class<?> cls = this.a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                AbstractC3188aa1.K(th);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.aa1$e */
    public static abstract class e {
        public Unsafe a;

        public e(Unsafe unsafe) {
            this.a = unsafe;
        }

        public final int a(Class cls) {
            return this.a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.a.arrayIndexScale(cls);
        }

        public abstract void c(long j, byte[] bArr, long j2, long j3);

        public abstract boolean d(Object obj, long j);

        public abstract byte e(long j);

        public abstract byte f(Object obj, long j);

        public abstract double g(Object obj, long j);

        public abstract float h(Object obj, long j);

        public final int i(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public abstract long j(long j);

        public final long k(Object obj, long j) {
            return this.a.getLong(obj, j);
        }

        public final Object l(Object obj, long j) {
            return this.a.getObject(obj, j);
        }

        public final long m(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void n(Object obj, long j, boolean z);

        public abstract void o(Object obj, long j, byte b);

        public abstract void p(Object obj, long j, double d);

        public abstract void q(Object obj, long j, float f);

        public final void r(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public final void s(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public final void t(Object obj, long j, Object obj2) {
            this.a.putObject(obj, j, obj2);
        }

        public boolean u() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                AbstractC3188aa1.K(th);
                return false;
            }
        }

        public boolean v() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return AbstractC3188aa1.o() != null;
            } catch (Throwable th) {
                AbstractC3188aa1.K(th);
                return false;
            }
        }
    }

    static {
        long jM = m(byte[].class);
        h = jM;
        i = m(boolean[].class);
        j = n(boolean[].class);
        k = m(int[].class);
        l = n(int[].class);
        m = m(long[].class);
        n = n(long[].class);
        o = m(float[].class);
        p = n(float[].class);
        q = m(double[].class);
        r = n(double[].class);
        s = m(Object[].class);
        t = n(Object[].class);
        u = s(o());
        v = (int) (jM & 7);
        w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static double A(Object obj, long j2) {
        return e.g(obj, j2);
    }

    public static float B(Object obj, long j2) {
        return e.h(obj, j2);
    }

    public static int C(Object obj, long j2) {
        return e.i(obj, j2);
    }

    public static long D(long j2) {
        return e.j(j2);
    }

    public static long E(Object obj, long j2) {
        return e.k(obj, j2);
    }

    public static e F() {
        Unsafe unsafe = a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC6418m4.c()) {
            return new d(unsafe);
        }
        if (c) {
            return new c(unsafe);
        }
        if (d) {
            return new b(unsafe);
        }
        return null;
    }

    public static Object G(Object obj, long j2) {
        return e.l(obj, j2);
    }

    public static Unsafe H() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean I() {
        return g;
    }

    public static boolean J() {
        return f;
    }

    public static void K(Throwable th) {
        Logger.getLogger(AbstractC3188aa1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void L(Object obj, long j2, boolean z) {
        e.n(obj, j2, z);
    }

    public static void M(Object obj, long j2, boolean z) {
        P(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    public static void N(Object obj, long j2, boolean z) {
        Q(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    public static void O(byte[] bArr, long j2, byte b2) {
        e.o(bArr, h + j2, b2);
    }

    public static void P(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int iC = C(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        T(obj, j3, ((255 & b2) << i2) | (iC & (~(255 << i2))));
    }

    public static void Q(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        T(obj, j3, ((255 & b2) << i2) | (C(obj, j3) & (~(255 << i2))));
    }

    public static void R(Object obj, long j2, double d2) {
        e.p(obj, j2, d2);
    }

    public static void S(Object obj, long j2, float f2) {
        e.q(obj, j2, f2);
    }

    public static void T(Object obj, long j2, int i2) {
        e.r(obj, j2, i2);
    }

    public static void U(Object obj, long j2, long j3) {
        e.s(obj, j2, j3);
    }

    public static void V(Object obj, long j2, Object obj2) {
        e.t(obj, j2, obj2);
    }

    public static boolean W() {
        e eVar = e;
        if (eVar == null) {
            return false;
        }
        return eVar.u();
    }

    public static boolean X() {
        e eVar = e;
        if (eVar == null) {
            return false;
        }
        return eVar.v();
    }

    public static long k(ByteBuffer byteBuffer) {
        return e.k(byteBuffer, u);
    }

    public static Object l(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int m(Class cls) {
        if (g) {
            return e.a(cls);
        }
        return -1;
    }

    public static int n(Class cls) {
        if (g) {
            return e.b(cls);
        }
        return -1;
    }

    public static Field o() {
        Field fieldR;
        if (AbstractC6418m4.c() && (fieldR = r(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldR;
        }
        Field fieldR2 = r(Buffer.class, "address");
        if (fieldR2 == null || fieldR2.getType() != Long.TYPE) {
            return null;
        }
        return fieldR2;
    }

    public static void p(long j2, byte[] bArr, long j3, long j4) {
        e.c(j2, bArr, j3, j4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean q(Class cls) {
        if (!AbstractC6418m4.c()) {
            return false;
        }
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Field r(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long s(Field field) {
        e eVar;
        if (field == null || (eVar = e) == null) {
            return -1L;
        }
        return eVar.m(field);
    }

    public static boolean t(Object obj, long j2) {
        return e.d(obj, j2);
    }

    public static boolean u(Object obj, long j2) {
        return y(obj, j2) != 0;
    }

    public static boolean v(Object obj, long j2) {
        return z(obj, j2) != 0;
    }

    public static byte w(long j2) {
        return e.e(j2);
    }

    public static byte x(byte[] bArr, long j2) {
        return e.f(bArr, h + j2);
    }

    public static byte y(Object obj, long j2) {
        return (byte) ((C(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    public static byte z(Object obj, long j2) {
        return (byte) ((C(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }
}
