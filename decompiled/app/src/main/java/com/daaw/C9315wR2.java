package com.daaw;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.daaw.wR2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9315wR2 extends AbstractC6798nR2 {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    /* JADX INFO: renamed from: com.daaw.wR2$a */
    public class a implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Object run() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                c = unsafe.objectFieldOffset(AbstractC9873yR2.class.getDeclaredField("D"));
                b = unsafe.objectFieldOffset(AbstractC9873yR2.class.getDeclaredField("C"));
                d = unsafe.objectFieldOffset(AbstractC9873yR2.class.getDeclaredField("B"));
                e = unsafe.objectFieldOffset(C9594xR2.class.getDeclaredField("a"));
                f = unsafe.objectFieldOffset(C9594xR2.class.getDeclaredField("b"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            } catch (RuntimeException e3) {
                throw e3;
            }
        } catch (PrivilegedActionException e4) {
            throw new RuntimeException("Could not initialize intrinsics", e4.getCause());
        }
    }

    public /* synthetic */ C9315wR2(DR2 dr2) {
        super(null);
    }

    @Override // com.daaw.AbstractC6798nR2
    public final C7635qR2 a(AbstractC9873yR2 abstractC9873yR2, C7635qR2 c7635qR2) {
        C7635qR2 c7635qR22;
        do {
            c7635qR22 = abstractC9873yR2.C;
            if (c7635qR2 == c7635qR22) {
                break;
            }
        } while (!e(abstractC9873yR2, c7635qR22, c7635qR2));
        return c7635qR22;
    }

    @Override // com.daaw.AbstractC6798nR2
    public final C9594xR2 b(AbstractC9873yR2 abstractC9873yR2, C9594xR2 c9594xR2) {
        C9594xR2 c9594xR22;
        do {
            c9594xR22 = abstractC9873yR2.D;
            if (c9594xR2 == c9594xR22) {
                break;
            }
        } while (!g(abstractC9873yR2, c9594xR22, c9594xR2));
        return c9594xR22;
    }

    @Override // com.daaw.AbstractC6798nR2
    public final void c(C9594xR2 c9594xR2, C9594xR2 c9594xR22) {
        a.putObject(c9594xR2, f, c9594xR22);
    }

    @Override // com.daaw.AbstractC6798nR2
    public final void d(C9594xR2 c9594xR2, Thread thread) {
        a.putObject(c9594xR2, e, thread);
    }

    @Override // com.daaw.AbstractC6798nR2
    public final boolean e(AbstractC9873yR2 abstractC9873yR2, C7635qR2 c7635qR2, C7635qR2 c7635qR22) {
        return CR2.a(a, abstractC9873yR2, b, c7635qR2, c7635qR22);
    }

    @Override // com.daaw.AbstractC6798nR2
    public final boolean f(AbstractC9873yR2 abstractC9873yR2, Object obj, Object obj2) {
        return CR2.a(a, abstractC9873yR2, d, obj, obj2);
    }

    @Override // com.daaw.AbstractC6798nR2
    public final boolean g(AbstractC9873yR2 abstractC9873yR2, C9594xR2 c9594xR2, C9594xR2 c9594xR22) {
        return CR2.a(a, abstractC9873yR2, c, c9594xR2, c9594xR22);
    }
}
