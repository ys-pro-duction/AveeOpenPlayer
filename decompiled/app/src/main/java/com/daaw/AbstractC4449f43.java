package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.f43, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4449f43 extends AbstractC4444f33 {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected C9502x53 zzc = C9502x53.c();

    public static Object A(U43 u43, String str, Object[] objArr) {
        return new C4175e53(u43, str, objArr);
    }

    public static void D(Class cls, AbstractC4449f43 abstractC4449f43) {
        abstractC4449f43.C();
        zzb.put(cls, abstractC4449f43);
    }

    public static AbstractC4449f43 K(AbstractC4449f43 abstractC4449f43) throws C8939v43 {
        if (abstractC4449f43 == null || abstractC4449f43.G()) {
            return abstractC4449f43;
        }
        C8939v43 c8939v43A = new C8944v53(abstractC4449f43).a();
        c8939v43A.h(abstractC4449f43);
        throw c8939v43A;
    }

    public static AbstractC4449f43 L(AbstractC4449f43 abstractC4449f43, byte[] bArr, int i, int i2, U33 u33) throws C8939v43 {
        AbstractC4449f43 abstractC4449f43M = abstractC4449f43.m();
        try {
            InterfaceC7821r53 interfaceC7821r53B = C3618c53.a().b(abstractC4449f43M.getClass());
            interfaceC7821r53B.h(abstractC4449f43M, bArr, 0, i2, new C5291i33(u33));
            interfaceC7821r53B.b(abstractC4449f43M);
            return abstractC4449f43M;
        } catch (C8939v43 e) {
            C8939v43 c8939v43 = e;
            if (c8939v43.l()) {
                c8939v43 = new C8939v43(c8939v43);
            }
            c8939v43.h(abstractC4449f43M);
            throw c8939v43;
        } catch (C8944v53 e2) {
            C8939v43 c8939v43A = e2.a();
            c8939v43A.h(abstractC4449f43M);
            throw c8939v43A;
        } catch (IOException e3) {
            if (e3.getCause() instanceof C8939v43) {
                throw ((C8939v43) e3.getCause());
            }
            C8939v43 c8939v432 = new C8939v43(e3);
            c8939v432.h(abstractC4449f43M);
            throw c8939v432;
        } catch (IndexOutOfBoundsException unused) {
            C8939v43 c8939v43J = C8939v43.j();
            c8939v43J.h(abstractC4449f43M);
            throw c8939v43J;
        }
    }

    public static AbstractC4449f43 l(Class cls) {
        Map map = zzb;
        AbstractC4449f43 abstractC4449f43 = (AbstractC4449f43) map.get(cls);
        if (abstractC4449f43 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC4449f43 = (AbstractC4449f43) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC4449f43 != null) {
            return abstractC4449f43;
        }
        AbstractC4449f43 abstractC4449f432 = (AbstractC4449f43) ((AbstractC4449f43) K53.o(cls)).J(6, null, null);
        if (abstractC4449f432 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC4449f432);
        return abstractC4449f432;
    }

    public static AbstractC4449f43 n(AbstractC4449f43 abstractC4449f43, AbstractC9213w33 abstractC9213w33) throws C8939v43 {
        U33 u33 = U33.c;
        E33 e33J = abstractC9213w33.J();
        AbstractC4449f43 abstractC4449f43M = abstractC4449f43.m();
        try {
            InterfaceC7821r53 interfaceC7821r53B = C3618c53.a().b(abstractC4449f43M.getClass());
            interfaceC7821r53B.f(abstractC4449f43M, J33.A(e33J), u33);
            interfaceC7821r53B.b(abstractC4449f43M);
            try {
                e33J.B(0);
                K(abstractC4449f43M);
                K(abstractC4449f43M);
                return abstractC4449f43M;
            } catch (C8939v43 e) {
                e.h(abstractC4449f43M);
                throw e;
            }
        } catch (C8939v43 e2) {
            e = e2;
            if (e.l()) {
                e = new C8939v43(e);
            }
            e.h(abstractC4449f43M);
            throw e;
        } catch (C8944v53 e3) {
            C8939v43 c8939v43A = e3.a();
            c8939v43A.h(abstractC4449f43M);
            throw c8939v43A;
        } catch (IOException e4) {
            if (e4.getCause() instanceof C8939v43) {
                throw ((C8939v43) e4.getCause());
            }
            C8939v43 c8939v43 = new C8939v43(e4);
            c8939v43.h(abstractC4449f43M);
            throw c8939v43;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof C8939v43) {
                throw ((C8939v43) e5.getCause());
            }
            throw e5;
        }
    }

    public static AbstractC4449f43 o(AbstractC4449f43 abstractC4449f43, byte[] bArr) throws C8939v43 {
        AbstractC4449f43 abstractC4449f43L = L(abstractC4449f43, bArr, 0, bArr.length, U33.c);
        K(abstractC4449f43L);
        return abstractC4449f43L;
    }

    public static AbstractC4449f43 p(AbstractC4449f43 abstractC4449f43, AbstractC9213w33 abstractC9213w33, U33 u33) throws C8939v43 {
        E33 e33J = abstractC9213w33.J();
        AbstractC4449f43 abstractC4449f43M = abstractC4449f43.m();
        try {
            InterfaceC7821r53 interfaceC7821r53B = C3618c53.a().b(abstractC4449f43M.getClass());
            interfaceC7821r53B.f(abstractC4449f43M, J33.A(e33J), u33);
            interfaceC7821r53B.b(abstractC4449f43M);
            try {
                e33J.B(0);
                K(abstractC4449f43M);
                return abstractC4449f43M;
            } catch (C8939v43 e) {
                e.h(abstractC4449f43M);
                throw e;
            }
        } catch (C8939v43 e2) {
            e = e2;
            if (e.l()) {
                e = new C8939v43(e);
            }
            e.h(abstractC4449f43M);
            throw e;
        } catch (C8944v53 e3) {
            C8939v43 c8939v43A = e3.a();
            c8939v43A.h(abstractC4449f43M);
            throw c8939v43A;
        } catch (IOException e4) {
            if (e4.getCause() instanceof C8939v43) {
                throw ((C8939v43) e4.getCause());
            }
            C8939v43 c8939v43 = new C8939v43(e4);
            c8939v43.h(abstractC4449f43M);
            throw c8939v43;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof C8939v43) {
                throw ((C8939v43) e5.getCause());
            }
            throw e5;
        }
    }

    public static AbstractC4449f43 r(AbstractC4449f43 abstractC4449f43, InputStream inputStream, U33 u33) throws C8939v43 {
        E33 e33G = E33.g(inputStream, 4096);
        AbstractC4449f43 abstractC4449f43M = abstractC4449f43.m();
        try {
            InterfaceC7821r53 interfaceC7821r53B = C3618c53.a().b(abstractC4449f43M.getClass());
            interfaceC7821r53B.f(abstractC4449f43M, J33.A(e33G), u33);
            interfaceC7821r53B.b(abstractC4449f43M);
            K(abstractC4449f43M);
            return abstractC4449f43M;
        } catch (C8939v43 e) {
            e = e;
            if (e.l()) {
                e = new C8939v43(e);
            }
            e.h(abstractC4449f43M);
            throw e;
        } catch (C8944v53 e2) {
            C8939v43 c8939v43A = e2.a();
            c8939v43A.h(abstractC4449f43M);
            throw c8939v43A;
        } catch (IOException e3) {
            if (e3.getCause() instanceof C8939v43) {
                throw ((C8939v43) e3.getCause());
            }
            C8939v43 c8939v43 = new C8939v43(e3);
            c8939v43.h(abstractC4449f43M);
            throw c8939v43;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof C8939v43) {
                throw ((C8939v43) e4.getCause());
            }
            throw e4;
        }
    }

    public static AbstractC4449f43 s(AbstractC4449f43 abstractC4449f43, byte[] bArr, U33 u33) throws C8939v43 {
        AbstractC4449f43 abstractC4449f43L = L(abstractC4449f43, bArr, 0, bArr.length, u33);
        K(abstractC4449f43L);
        return abstractC4449f43L;
    }

    public static InterfaceC6980o43 t() {
        return C5855k43.p();
    }

    public static InterfaceC6980o43 u(InterfaceC6980o43 interfaceC6980o43) {
        int size = interfaceC6980o43.size();
        return interfaceC6980o43.f(size == 0 ? 10 : size + size);
    }

    public static InterfaceC7816r43 v() {
        return G43.p();
    }

    public static InterfaceC7816r43 w(InterfaceC7816r43 interfaceC7816r43) {
        int size = interfaceC7816r43.size();
        return interfaceC7816r43.f(size == 0 ? 10 : size + size);
    }

    public static InterfaceC8095s43 x() {
        return C3897d53.m();
    }

    public static InterfaceC8095s43 y(InterfaceC8095s43 interfaceC8095s43) {
        int size = interfaceC8095s43.size();
        return interfaceC8095s43.f(size == 0 ? 10 : size + size);
    }

    public static Object z(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final void B() {
        C3618c53.a().b(getClass()).b(this);
        C();
    }

    public final void C() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void E(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean G() {
        byte bByteValue = ((Byte) J(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zC = C3618c53.a().b(getClass()).c(this);
        J(2, true != zC ? null : this, null);
        return zC;
    }

    public final boolean H() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int I() {
        return C3618c53.a().b(getClass()).a(this);
    }

    public abstract Object J(int i, Object obj, Object obj2);

    @Override // com.daaw.AbstractC4444f33
    public final int a(InterfaceC7821r53 interfaceC7821r53) {
        if (H()) {
            int iZza = interfaceC7821r53.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZza2 = interfaceC7821r53.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZza2);
    }

    @Override // com.daaw.V43
    public final /* synthetic */ U43 b() {
        return (AbstractC4449f43) J(6, null, null);
    }

    @Override // com.daaw.U43
    public final void c(P33 p33) {
        C3618c53.a().b(getClass()).g(this, Q33.l(p33));
    }

    @Override // com.daaw.U43
    public final /* synthetic */ T43 e() {
        return (AbstractC3892d43) J(5, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C3618c53.a().b(getClass()).e(this, (AbstractC4449f43) obj);
    }

    public final int hashCode() {
        if (H()) {
            return I();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int I = I();
        this.zza = I;
        return I;
    }

    public final int i(InterfaceC7821r53 interfaceC7821r53) {
        return C3618c53.a().b(getClass()).zza(this);
    }

    public final AbstractC3892d43 j() {
        return (AbstractC3892d43) J(5, null, null);
    }

    public final AbstractC3892d43 k() {
        AbstractC3892d43 abstractC3892d43 = (AbstractC3892d43) J(5, null, null);
        abstractC3892d43.h(this);
        return abstractC3892d43;
    }

    public final AbstractC4449f43 m() {
        return (AbstractC4449f43) J(4, null, null);
    }

    @Override // com.daaw.U43
    public final int q() {
        if (H()) {
            int i = i(null);
            if (i >= 0) {
                return i;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + i);
        }
        int i2 = this.zzd & Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int i3 = i(null);
        if (i3 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | i3;
            return i3;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i3);
    }

    public final String toString() {
        return W43.a(this, super.toString());
    }
}
