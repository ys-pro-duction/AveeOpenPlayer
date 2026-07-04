package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.cf3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3772cf3 extends AbstractC8797uc3 {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    protected Rh3 zzc = Rh3.c();

    public static AbstractC3772cf3 k(Class cls) {
        Map map = zza;
        AbstractC3772cf3 abstractC3772cf3 = (AbstractC3772cf3) map.get(cls);
        if (abstractC3772cf3 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC3772cf3 = (AbstractC3772cf3) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC3772cf3 != null) {
            return abstractC3772cf3;
        }
        AbstractC3772cf3 abstractC3772cf32 = (AbstractC3772cf3) ((AbstractC3772cf3) AbstractC5750ji3.j(cls)).A(6, null, null);
        if (abstractC3772cf32 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC3772cf32);
        return abstractC3772cf32;
    }

    public static InterfaceC7697qf3 m() {
        return C4618ff3.p();
    }

    public static InterfaceC8533tf3 n() {
        return C4623fg3.m();
    }

    public static InterfaceC8533tf3 o(InterfaceC8533tf3 interfaceC8533tf3) {
        int size = interfaceC8533tf3.size();
        return interfaceC8533tf3.f(size == 0 ? 10 : size + size);
    }

    public static InterfaceC9377wf3 p() {
        return C3782ch3.m();
    }

    public static InterfaceC9377wf3 q(InterfaceC9377wf3 interfaceC9377wf3) {
        int size = interfaceC9377wf3.size();
        return interfaceC9377wf3.f(size == 0 ? 10 : size + size);
    }

    public static Object r(Method method, Object obj, Object... objArr) {
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

    public static Object t(Kg3 kg3, String str, Object[] objArr) {
        return new C4339eh3(kg3, str, objArr);
    }

    public static void w(Class cls, AbstractC3772cf3 abstractC3772cf3) {
        abstractC3772cf3.v();
        zza.put(cls, abstractC3772cf3);
    }

    public abstract Object A(int i, Object obj, Object obj2);

    @Override // com.daaw.AbstractC8797uc3
    public final int a(InterfaceC4907gh3 interfaceC4907gh3) {
        if (y()) {
            int iH = h(interfaceC4907gh3);
            if (iH >= 0) {
                return iH;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iH);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iH2 = h(interfaceC4907gh3);
        if (iH2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iH2;
            return iH2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iH2);
    }

    @Override // com.daaw.Kg3
    public final int b() {
        if (y()) {
            int iH = h(null);
            if (iH >= 0) {
                return iH;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iH);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iH2 = h(null);
        if (iH2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iH2;
            return iH2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iH2);
    }

    @Override // com.daaw.Kg3
    public final void c(Vd3 vd3) {
        C3225ah3.a().b(getClass()).f(this, Wd3.J(vd3));
    }

    @Override // com.daaw.Mg3
    public final /* synthetic */ Kg3 d() {
        return (AbstractC3772cf3) A(6, null, null);
    }

    @Override // com.daaw.Kg3
    public final /* synthetic */ Ig3 e() {
        return (Je3) A(5, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C3225ah3.a().b(getClass()).e(this, (AbstractC3772cf3) obj);
    }

    public final int h(InterfaceC4907gh3 interfaceC4907gh3) {
        if (interfaceC4907gh3 != null) {
            return interfaceC4907gh3.zza(this);
        }
        return C3225ah3.a().b(getClass()).zza(this);
    }

    public final int hashCode() {
        if (y()) {
            return z();
        }
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int iZ = z();
        this.zzb = iZ;
        return iZ;
    }

    public final Je3 i() {
        return (Je3) A(5, null, null);
    }

    public final Je3 j() {
        Je3 je3 = (Je3) A(5, null, null);
        je3.j(this);
        return je3;
    }

    public final AbstractC3772cf3 l() {
        return (AbstractC3772cf3) A(4, null, null);
    }

    public final String toString() {
        return Og3.a(this, super.toString());
    }

    public final void u() {
        C3225ah3.a().b(getClass()).b(this);
        v();
    }

    public final void v() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void x(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean y() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int z() {
        return C3225ah3.a().b(getClass()).a(this);
    }
}
