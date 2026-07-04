package com.daaw;

import com.daaw.AbstractC1759Oa;
import com.daaw.AbstractC3317b10;
import com.daaw.Q;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.iS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5394iS extends Q {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC5394iS> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected L91 unknownFields = L91.c();

    /* JADX INFO: renamed from: com.daaw.iS$a */
    public static abstract class a extends Q.a {
        public final AbstractC5394iS B;
        public AbstractC5394iS C;

        public a(AbstractC5394iS abstractC5394iS) {
            this.B = abstractC5394iS;
            if (abstractC5394iS.H()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.C = w();
        }

        public static void v(Object obj, Object obj2) {
            C3923dB0.a().d(obj).a(obj, obj2);
        }

        private AbstractC5394iS w() {
            return this.B.O();
        }

        @Override // com.daaw.InterfaceC2236Sj0
        public final boolean e() {
            return AbstractC5394iS.G(this.C, false);
        }

        public final AbstractC5394iS n() {
            AbstractC5394iS abstractC5394iSI = I();
            if (abstractC5394iSI.e()) {
                return abstractC5394iSI;
            }
            throw Q.a.m(abstractC5394iSI);
        }

        @Override // com.daaw.InterfaceC1900Pj0.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public AbstractC5394iS I() {
            if (!this.C.H()) {
                return this.C;
            }
            this.C.J();
            return this.C;
        }

        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVarD = b().d();
            aVarD.C = I();
            return aVarD;
        }

        public final void q() {
            if (this.C.H()) {
                return;
            }
            r();
        }

        public void r() {
            AbstractC5394iS abstractC5394iSW = w();
            v(abstractC5394iSW, this.C);
            this.C = abstractC5394iSW;
        }

        @Override // com.daaw.InterfaceC2236Sj0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public AbstractC5394iS b() {
            return this.B;
        }

        public a u(AbstractC5394iS abstractC5394iS) {
            if (b().equals(abstractC5394iS)) {
                return this;
            }
            q();
            v(this.C, abstractC5394iS);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.daaw.iS$b */
    public static class b extends AbstractC3032a0 {
        public final AbstractC5394iS b;

        public b(AbstractC5394iS abstractC5394iS) {
            this.b = abstractC5394iS;
        }

        @Override // com.daaw.InterfaceC2896Ys0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public AbstractC5394iS b(AbstractC9408wm abstractC9408wm, C6484mJ c6484mJ) {
            return AbstractC5394iS.T(this.b, abstractC9408wm, c6484mJ);
        }
    }

    /* JADX INFO: renamed from: com.daaw.iS$c */
    public static class c extends AbstractC5358iJ {
    }

    /* JADX INFO: renamed from: com.daaw.iS$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static AbstractC5394iS A(Class cls) {
        AbstractC5394iS abstractC5394iS = defaultInstanceMap.get(cls);
        if (abstractC5394iS == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC5394iS = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC5394iS != null) {
            return abstractC5394iS;
        }
        AbstractC5394iS abstractC5394iSB = ((AbstractC5394iS) AbstractC3188aa1.l(cls)).b();
        if (abstractC5394iSB == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC5394iSB);
        return abstractC5394iSB;
    }

    public static Object F(Method method, Object obj, Object... objArr) {
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

    public static final boolean G(AbstractC5394iS abstractC5394iS, boolean z) {
        byte bByteValue = ((Byte) abstractC5394iS.v(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = C3923dB0.a().d(abstractC5394iS).d(abstractC5394iS);
        if (z) {
            abstractC5394iS.w(d.SET_MEMOIZED_IS_INITIALIZED, zD ? abstractC5394iS : null);
        }
        return zD;
    }

    public static AbstractC3317b10.e L(AbstractC3317b10.e eVar) {
        int size = eVar.size();
        return eVar.n(size == 0 ? 10 : size * 2);
    }

    public static Object N(InterfaceC1900Pj0 interfaceC1900Pj0, String str, Object[] objArr) {
        return new C9261wE0(interfaceC1900Pj0, str, objArr);
    }

    public static AbstractC5394iS P(AbstractC5394iS abstractC5394iS, AbstractC4340ei abstractC4340ei) {
        return o(Q(abstractC5394iS, abstractC4340ei, C6484mJ.b()));
    }

    public static AbstractC5394iS Q(AbstractC5394iS abstractC5394iS, AbstractC4340ei abstractC4340ei, C6484mJ c6484mJ) {
        return o(S(abstractC5394iS, abstractC4340ei, c6484mJ));
    }

    public static AbstractC5394iS R(AbstractC5394iS abstractC5394iS, byte[] bArr) {
        return o(U(abstractC5394iS, bArr, 0, bArr.length, C6484mJ.b()));
    }

    public static AbstractC5394iS S(AbstractC5394iS abstractC5394iS, AbstractC4340ei abstractC4340ei, C6484mJ c6484mJ) throws P10 {
        AbstractC9408wm abstractC9408wmQ = abstractC4340ei.Q();
        AbstractC5394iS abstractC5394iST = T(abstractC5394iS, abstractC9408wmQ, c6484mJ);
        try {
            abstractC9408wmQ.a(0);
            return abstractC5394iST;
        } catch (P10 e) {
            throw e.k(abstractC5394iST);
        }
    }

    public static AbstractC5394iS T(AbstractC5394iS abstractC5394iS, AbstractC9408wm abstractC9408wm, C6484mJ c6484mJ) throws P10 {
        AbstractC5394iS abstractC5394iSO = abstractC5394iS.O();
        try {
            DN0 dn0D = C3923dB0.a().d(abstractC5394iSO);
            dn0D.e(abstractC5394iSO, C9966ym.Q(abstractC9408wm), c6484mJ);
            dn0D.c(abstractC5394iSO);
            return abstractC5394iSO;
        } catch (D91 e) {
            throw e.a().k(abstractC5394iSO);
        } catch (P10 e2) {
            e = e2;
            if (e.a()) {
                e = new P10(e);
            }
            throw e.k(abstractC5394iSO);
        } catch (IOException e3) {
            if (e3.getCause() instanceof P10) {
                throw ((P10) e3.getCause());
            }
            throw new P10(e3).k(abstractC5394iSO);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof P10) {
                throw ((P10) e4.getCause());
            }
            throw e4;
        }
    }

    public static AbstractC5394iS U(AbstractC5394iS abstractC5394iS, byte[] bArr, int i, int i2, C6484mJ c6484mJ) throws P10 {
        AbstractC5394iS abstractC5394iSO = abstractC5394iS.O();
        try {
            DN0 dn0D = C3923dB0.a().d(abstractC5394iSO);
            dn0D.b(abstractC5394iSO, bArr, i, i + i2, new AbstractC1759Oa.a(c6484mJ));
            dn0D.c(abstractC5394iSO);
            return abstractC5394iSO;
        } catch (D91 e) {
            throw e.a().k(abstractC5394iSO);
        } catch (P10 e2) {
            P10 p10 = e2;
            if (p10.a()) {
                p10 = new P10(p10);
            }
            throw p10.k(abstractC5394iSO);
        } catch (IOException e3) {
            if (e3.getCause() instanceof P10) {
                throw ((P10) e3.getCause());
            }
            throw new P10(e3).k(abstractC5394iSO);
        } catch (IndexOutOfBoundsException unused) {
            throw P10.n().k(abstractC5394iSO);
        }
    }

    public static void V(Class cls, AbstractC5394iS abstractC5394iS) {
        defaultInstanceMap.put(cls, abstractC5394iS);
        abstractC5394iS.J();
    }

    public static AbstractC5394iS o(AbstractC5394iS abstractC5394iS) throws P10 {
        if (abstractC5394iS == null || abstractC5394iS.e()) {
            return abstractC5394iS;
        }
        throw abstractC5394iS.m().a().k(abstractC5394iS);
    }

    public static AbstractC3317b10.d y() {
        return C9753y00.v();
    }

    public static AbstractC3317b10.e z() {
        return C4201eB0.p();
    }

    @Override // com.daaw.InterfaceC2236Sj0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final AbstractC5394iS b() {
        return (AbstractC5394iS) v(d.GET_DEFAULT_INSTANCE);
    }

    public int C() {
        return this.memoizedHashCode;
    }

    public int D() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public boolean E() {
        return C() == 0;
    }

    public boolean H() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void J() {
        C3923dB0.a().d(this).c(this);
        K();
    }

    public void K() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // com.daaw.InterfaceC1900Pj0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final a d() {
        return (a) v(d.NEW_BUILDER);
    }

    public AbstractC5394iS O() {
        return (AbstractC5394iS) v(d.NEW_MUTABLE_INSTANCE);
    }

    public void W(int i) {
        this.memoizedHashCode = i;
    }

    public void X(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i);
        }
    }

    public final a Y() {
        return ((a) v(d.NEW_BUILDER)).u(this);
    }

    @Override // com.daaw.InterfaceC1900Pj0
    public int c() {
        return k(null);
    }

    @Override // com.daaw.InterfaceC2236Sj0
    public final boolean e() {
        return G(this, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C3923dB0.a().d(this).f(this, (AbstractC5394iS) obj);
        }
        return false;
    }

    public int hashCode() {
        if (H()) {
            return r();
        }
        if (E()) {
            W(r());
        }
        return C();
    }

    @Override // com.daaw.InterfaceC1900Pj0
    public void i(AbstractC10245zm abstractC10245zm) {
        C3923dB0.a().d(this).j(this, C0447Bm.P(abstractC10245zm));
    }

    @Override // com.daaw.InterfaceC1900Pj0
    public final InterfaceC2896Ys0 j() {
        return (InterfaceC2896Ys0) v(d.GET_PARSER);
    }

    @Override // com.daaw.Q
    public int k(DN0 dn0) {
        if (!H()) {
            if (D() != Integer.MAX_VALUE) {
                return D();
            }
            int iS = s(dn0);
            X(iS);
            return iS;
        }
        int iS2 = s(dn0);
        if (iS2 >= 0) {
            return iS2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iS2);
    }

    public Object n() {
        return v(d.BUILD_MESSAGE_INFO);
    }

    public void p() {
        this.memoizedHashCode = 0;
    }

    public void q() {
        X(Integer.MAX_VALUE);
    }

    public int r() {
        return C3923dB0.a().d(this).i(this);
    }

    public final int s(DN0 dn0) {
        return dn0 == null ? C3923dB0.a().d(this).g(this) : dn0.g(this);
    }

    public final a t() {
        return (a) v(d.NEW_BUILDER);
    }

    public String toString() {
        return AbstractC2340Tj0.f(this, super.toString());
    }

    public final a u(AbstractC5394iS abstractC5394iS) {
        return t().u(abstractC5394iS);
    }

    public Object v(d dVar) {
        return x(dVar, null, null);
    }

    public Object w(d dVar, Object obj) {
        return x(dVar, obj, null);
    }

    public abstract Object x(d dVar, Object obj, Object obj2);
}
