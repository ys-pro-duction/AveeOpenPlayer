package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class F32 extends AbstractC8127sB1 {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected C3113aH2 zzc = C3113aH2.c();

    public static F32 g(Class cls) {
        Map map = zzb;
        F32 f32 = (F32) map.get(cls);
        if (f32 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                f32 = (F32) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (f32 != null) {
            return f32;
        }
        F32 f322 = (F32) ((F32) AbstractC4247eM2.j(cls)).u(6, null, null);
        if (f322 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, f322);
        return f322;
    }

    public static F32 j(F32 f32, byte[] bArr, AU1 au1) throws U92 {
        F32 f32W = w(f32, bArr, 0, bArr.length, au1);
        if (f32W == null || f32W.h()) {
            return f32W;
        }
        U92 u92A = new TF2(f32W).a();
        u92A.f(f32W);
        throw u92A;
    }

    public static D62 k() {
        return C5854k42.p();
    }

    public static M72 l() {
        return C4975gv2.m();
    }

    public static Object m(Method method, Object obj, Object... objArr) {
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

    public static Object n(InterfaceC7467pp2 interfaceC7467pp2, String str, Object[] objArr) {
        return new C1431Kv2(interfaceC7467pp2, str, objArr);
    }

    public static void q(Class cls, F32 f32) {
        f32.p();
        zzb.put(cls, f32);
    }

    public static final boolean s(F32 f32, boolean z) {
        byte bByteValue = ((Byte) f32.u(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zC = C0586Cu2.a().b(f32.getClass()).c(f32);
        if (z) {
            f32.u(2, true != zC ? null : f32, null);
        }
        return zC;
    }

    public static F32 w(F32 f32, byte[] bArr, int i, int i2, AU1 au1) throws U92 {
        if (i2 == 0) {
            return f32;
        }
        F32 f32I = f32.i();
        try {
            InterfaceC7500pw2 interfaceC7500pw2B = C0586Cu2.a().b(f32I.getClass());
            interfaceC7500pw2B.f(f32I, bArr, 0, i2, new C6745nE1(au1));
            interfaceC7500pw2B.b(f32I);
            return f32I;
        } catch (TF2 e) {
            U92 u92A = e.a();
            u92A.f(f32I);
            throw u92A;
        } catch (U92 e2) {
            e2.f(f32I);
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof U92) {
                throw ((U92) e3.getCause());
            }
            U92 u92 = new U92(e3);
            u92.f(f32I);
            throw u92;
        } catch (IndexOutOfBoundsException unused) {
            U92 u92G = U92.g();
            u92G.f(f32I);
            throw u92G;
        }
    }

    @Override // com.daaw.AbstractC8127sB1
    public final int a(InterfaceC7500pw2 interfaceC7500pw2) {
        if (t()) {
            int iZza = interfaceC7500pw2.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZza2 = interfaceC7500pw2.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZza2);
    }

    @Override // com.daaw.InterfaceC7467pp2
    public final void b(AbstractC5392iR1 abstractC5392iR1) {
        C0586Cu2.a().b(getClass()).g(this, NR1.o(abstractC5392iR1));
    }

    public final int d() {
        return C0586Cu2.a().b(getClass()).a(this);
    }

    public final J02 e() {
        return (J02) u(5, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C0586Cu2.a().b(getClass()).e(this, (F32) obj);
    }

    public final J02 f() {
        J02 j02 = (J02) u(5, null, null);
        j02.d(this);
        return j02;
    }

    public final boolean h() {
        return s(this, true);
    }

    public final int hashCode() {
        if (t()) {
            return d();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iD = d();
        this.zza = iD;
        return iD;
    }

    public final F32 i() {
        return (F32) u(4, null, null);
    }

    public final void o() {
        C0586Cu2.a().b(getClass()).b(this);
        p();
    }

    public final void p() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void r(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean t() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final String toString() {
        return AbstractC10268zq2.a(this, super.toString());
    }

    public abstract Object u(int i, Object obj, Object obj2);

    public final int v(InterfaceC7500pw2 interfaceC7500pw2) {
        return C0586Cu2.a().b(getClass()).zza(this);
    }

    @Override // com.daaw.InterfaceC7467pp2
    public final /* synthetic */ InterfaceC1507Lo2 zzE() {
        return (J02) u(5, null, null);
    }

    @Override // com.daaw.InterfaceC7467pp2
    public final int zzf() {
        if (t()) {
            int iV = v(null);
            if (iV >= 0) {
                return iV;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iV);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iV2 = v(null);
        if (iV2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iV2;
            return iV2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iV2);
    }

    @Override // com.daaw.InterfaceC2366Tp2
    public final /* synthetic */ InterfaceC7467pp2 zzh() {
        return (F32) u(6, null, null);
    }
}
