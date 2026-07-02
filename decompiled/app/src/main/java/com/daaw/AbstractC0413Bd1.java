package com.daaw;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.daaw.Bd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0413Bd1 {
    public final C2407Ua a;
    public final C2407Ua b;
    public final C2407Ua c;

    public AbstractC0413Bd1(C2407Ua c2407Ua, C2407Ua c2407Ua2, C2407Ua c2407Ua3) {
        this.a = c2407Ua;
        this.b = c2407Ua2;
        this.c = c2407Ua3;
    }

    public abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i) {
        w(i);
        A(bArr);
    }

    public abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i) {
        w(i);
        C(charSequence);
    }

    public abstract void E(int i);

    public void F(int i, int i2) {
        w(i2);
        E(i);
    }

    public abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i) {
        w(i);
        G(parcelable);
    }

    public abstract void I(String str);

    public void J(String str, int i) {
        w(i);
        I(str);
    }

    public void K(InterfaceC0630Dd1 interfaceC0630Dd1, AbstractC0413Bd1 abstractC0413Bd1) {
        try {
            e(interfaceC0630Dd1.getClass()).invoke(null, interfaceC0630Dd1, abstractC0413Bd1);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (!(e4.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
            throw ((RuntimeException) e4.getCause());
        }
    }

    public void L(InterfaceC0630Dd1 interfaceC0630Dd1) {
        if (interfaceC0630Dd1 == null) {
            I(null);
            return;
        }
        N(interfaceC0630Dd1);
        AbstractC0413Bd1 abstractC0413Bd1B = b();
        K(interfaceC0630Dd1, abstractC0413Bd1B);
        abstractC0413Bd1B.a();
    }

    public void M(InterfaceC0630Dd1 interfaceC0630Dd1, int i) {
        w(i);
        L(interfaceC0630Dd1);
    }

    public final void N(InterfaceC0630Dd1 interfaceC0630Dd1) {
        try {
            I(c(interfaceC0630Dd1.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(interfaceC0630Dd1.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    public abstract void a();

    public abstract AbstractC0413Bd1 b();

    public final Class c(Class cls) throws ClassNotFoundException {
        Class cls2 = (Class) this.c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.c.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method d(String str) throws NoSuchMethodException {
        Method method = (Method) this.a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0413Bd1.class.getClassLoader()).getDeclaredMethod("read", AbstractC0413Bd1.class);
        this.a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method e(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        Method method = (Method) this.b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsC = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsC.getDeclaredMethod("write", cls, AbstractC0413Bd1.class);
        this.b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public boolean h(boolean z, int i) {
        return !m(i) ? z : g();
    }

    public abstract byte[] i();

    public byte[] j(byte[] bArr, int i) {
        return !m(i) ? bArr : i();
    }

    public abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i) {
        return !m(i) ? charSequence : k();
    }

    public abstract boolean m(int i);

    public InterfaceC0630Dd1 n(String str, AbstractC0413Bd1 abstractC0413Bd1) {
        try {
            return (InterfaceC0630Dd1) d(str).invoke(null, abstractC0413Bd1);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract int o();

    public int p(int i, int i2) {
        return !m(i2) ? i : o();
    }

    public abstract Parcelable q();

    public Parcelable r(Parcelable parcelable, int i) {
        return !m(i) ? parcelable : q();
    }

    public abstract String s();

    public String t(String str, int i) {
        return !m(i) ? str : s();
    }

    public InterfaceC0630Dd1 u() {
        String strS = s();
        if (strS == null) {
            return null;
        }
        return n(strS, b());
    }

    public InterfaceC0630Dd1 v(InterfaceC0630Dd1 interfaceC0630Dd1, int i) {
        return !m(i) ? interfaceC0630Dd1 : u();
    }

    public abstract void w(int i);

    public abstract void y(boolean z);

    public void z(boolean z, int i) {
        w(i);
        y(z);
    }

    public void x(boolean z, boolean z2) {
    }
}
