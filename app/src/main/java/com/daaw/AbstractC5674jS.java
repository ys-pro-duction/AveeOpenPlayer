package com.daaw;

import com.daaw.AbstractC3595c10;
import com.daaw.AbstractC6315li1;
import com.daaw.C7604qK;
import com.daaw.InterfaceC2026Qj0;
import com.daaw.S;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.jS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5674jS extends S implements Serializable {

    /* JADX INFO: renamed from: com.daaw.jS$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AbstractC6315li1.c.values().length];
            a = iArr;
            try {
                iArr[AbstractC6315li1.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AbstractC6315li1.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.jS$b */
    public static abstract class b extends S.a {
        public AbstractC4629fi B = AbstractC4629fi.B;

        public final AbstractC4629fi i() {
            return this.B;
        }

        public abstract b j(AbstractC5674jS abstractC5674jS);

        public final b k(AbstractC4629fi abstractC4629fi) {
            this.B = abstractC4629fi;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.daaw.jS$c */
    public static abstract class c extends b implements InterfaceC2130Rj0 {
        public C7604qK C = C7604qK.g();
        public boolean D;

        public final C7604qK m() {
            this.C.q();
            this.D = false;
            return this.C;
        }

        public final void n() {
            if (this.D) {
                return;
            }
            this.C = this.C.clone();
            this.D = true;
        }

        public final void o(d dVar) {
            n();
            this.C.r(dVar.C);
        }
    }

    /* JADX INFO: renamed from: com.daaw.jS$e */
    public static final class e implements C7604qK.b {
        public final AbstractC3595c10.b B;
        public final int C;
        public final AbstractC6315li1.b D;
        public final boolean E;
        public final boolean F;

        public e(AbstractC3595c10.b bVar, int i, AbstractC6315li1.b bVar2, boolean z, boolean z2) {
            this.B = bVar;
            this.C = i;
            this.D = bVar2;
            this.E = z;
            this.F = z2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return this.C - eVar.C;
        }

        @Override // com.daaw.C7604qK.b
        public int b() {
            return this.C;
        }

        public AbstractC3595c10.b c() {
            return this.B;
        }

        @Override // com.daaw.C7604qK.b
        public boolean d() {
            return this.E;
        }

        @Override // com.daaw.C7604qK.b
        public AbstractC6315li1.b e() {
            return this.D;
        }

        @Override // com.daaw.C7604qK.b
        public boolean f() {
            return this.F;
        }

        @Override // com.daaw.C7604qK.b
        public InterfaceC2026Qj0.a i(InterfaceC2026Qj0.a aVar, InterfaceC2026Qj0 interfaceC2026Qj0) {
            return ((b) aVar).j((AbstractC5674jS) interfaceC2026Qj0);
        }

        @Override // com.daaw.C7604qK.b
        public AbstractC6315li1.c j() {
            return this.D.a();
        }
    }

    /* JADX INFO: renamed from: com.daaw.jS$f */
    public static class f {
        public final InterfaceC2026Qj0 a;
        public final Object b;
        public final InterfaceC2026Qj0 c;
        public final e d;
        public final Class e;
        public final Method f;

        public f(InterfaceC2026Qj0 interfaceC2026Qj0, Object obj, InterfaceC2026Qj0 interfaceC2026Qj02, e eVar, Class cls) {
            if (interfaceC2026Qj0 == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (eVar.e() == AbstractC6315li1.b.N && interfaceC2026Qj02 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.a = interfaceC2026Qj0;
            this.b = obj;
            this.c = interfaceC2026Qj02;
            this.d = eVar;
            this.e = cls;
            if (AbstractC3595c10.a.class.isAssignableFrom(cls)) {
                this.f = AbstractC5674jS.k(cls, "valueOf", Integer.TYPE);
            } else {
                this.f = null;
            }
        }

        public Object a(Object obj) {
            if (!this.d.d()) {
                return e(obj);
            }
            if (this.d.j() != AbstractC6315li1.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(e(it.next()));
            }
            return arrayList;
        }

        public InterfaceC2026Qj0 b() {
            return this.a;
        }

        public InterfaceC2026Qj0 c() {
            return this.c;
        }

        public int d() {
            return this.d.b();
        }

        public Object e(Object obj) {
            return this.d.j() == AbstractC6315li1.c.ENUM ? AbstractC5674jS.l(this.f, null, (Integer) obj) : obj;
        }

        public Object f(Object obj) {
            return this.d.j() == AbstractC6315li1.c.ENUM ? Integer.valueOf(((AbstractC3595c10.a) obj).b()) : obj;
        }
    }

    public AbstractC5674jS() {
    }

    public static Method k(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            String name = cls.getName();
            String strValueOf = String.valueOf(str);
            StringBuilder sb = new StringBuilder(name.length() + 45 + strValueOf.length());
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(strValueOf);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    public static Object l(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static f o(InterfaceC2026Qj0 interfaceC2026Qj0, InterfaceC2026Qj0 interfaceC2026Qj02, AbstractC3595c10.b bVar, int i, AbstractC6315li1.b bVar2, boolean z, Class cls) {
        return new f(interfaceC2026Qj0, Collections.EMPTY_LIST, interfaceC2026Qj02, new e(bVar, i, bVar2, true, z), cls);
    }

    public static f q(InterfaceC2026Qj0 interfaceC2026Qj0, Object obj, InterfaceC2026Qj0 interfaceC2026Qj02, AbstractC3595c10.b bVar, int i, AbstractC6315li1.b bVar2, Class cls) {
        return new f(interfaceC2026Qj0, obj, interfaceC2026Qj02, new e(bVar, i, bVar2, false, false), cls);
    }

    public static boolean s(C7604qK c7604qK, InterfaceC2026Qj0 interfaceC2026Qj0, C9687xm c9687xm, C0343Am c0343Am, C6763nJ c6763nJ, int i) throws IOException {
        boolean z;
        boolean z2;
        Object objA;
        InterfaceC2026Qj0 interfaceC2026Qj02;
        int iB = AbstractC6315li1.b(i);
        f fVarB = c6763nJ.b(interfaceC2026Qj0, AbstractC6315li1.a(i));
        if (fVarB == null) {
            z = true;
            z2 = false;
        } else if (iB == C7604qK.l(fVarB.d.e(), false)) {
            z = false;
            z2 = false;
        } else {
            e eVar = fVarB.d;
            if (eVar.E && eVar.D.g() && iB == C7604qK.l(fVarB.d.e(), true)) {
                z = false;
                z2 = true;
            }
            z = true;
            z2 = false;
        }
        if (z) {
            return c9687xm.O(i, c0343Am);
        }
        if (z2) {
            int i2 = c9687xm.i(c9687xm.z());
            if (fVarB.d.e() == AbstractC6315li1.b.Q) {
                while (c9687xm.e() > 0) {
                    AbstractC3595c10.a aVarA = fVarB.d.c().a(c9687xm.m());
                    if (aVarA == null) {
                        return true;
                    }
                    c7604qK.a(fVarB.d, fVarB.f(aVarA));
                }
            } else {
                while (c9687xm.e() > 0) {
                    c7604qK.a(fVarB.d, C7604qK.u(c9687xm, fVarB.d.e(), false));
                }
            }
            c9687xm.h(i2);
        } else {
            int i3 = a.a[fVarB.d.j().ordinal()];
            if (i3 == 1) {
                InterfaceC2026Qj0.a aVarF = (fVarB.d.d() || (interfaceC2026Qj02 = (InterfaceC2026Qj0) c7604qK.h(fVarB.d)) == null) ? null : interfaceC2026Qj02.f();
                if (aVarF == null) {
                    aVarF = fVarB.c().d();
                }
                if (fVarB.d.e() == AbstractC6315li1.b.M) {
                    c9687xm.q(fVarB.d(), aVarF, c6763nJ);
                } else {
                    c9687xm.u(aVarF, c6763nJ);
                }
                objA = aVarF.a();
            } else if (i3 != 2) {
                objA = C7604qK.u(c9687xm, fVarB.d.e(), false);
            } else {
                int iM = c9687xm.m();
                AbstractC3595c10.a aVarA2 = fVarB.d.c().a(iM);
                if (aVarA2 == null) {
                    c0343Am.n0(i);
                    c0343Am.x0(iM);
                    return true;
                }
                objA = aVarA2;
            }
            if (fVarB.d.d()) {
                c7604qK.a(fVarB.d, fVarB.f(objA));
            } else {
                c7604qK.v(fVarB.d, fVarB.f(objA));
            }
        }
        return true;
    }

    public boolean r(C9687xm c9687xm, C0343Am c0343Am, C6763nJ c6763nJ, int i) {
        return c9687xm.O(i, c0343Am);
    }

    /* JADX INFO: renamed from: com.daaw.jS$d */
    public static abstract class d extends AbstractC5674jS implements InterfaceC2130Rj0 {
        public final C7604qK C;

        /* JADX INFO: renamed from: com.daaw.jS$d$a */
        public class a {
            public final Iterator a;
            public Map.Entry b;
            public final boolean c;

            public /* synthetic */ a(d dVar, boolean z, a aVar) {
                this(z);
            }

            public void a(int i, C0343Am c0343Am) {
                while (true) {
                    Map.Entry entry = this.b;
                    if (entry == null || ((e) entry.getKey()).b() >= i) {
                        return;
                    }
                    e eVar = (e) this.b.getKey();
                    if (this.c && eVar.j() == AbstractC6315li1.c.MESSAGE && !eVar.d()) {
                        c0343Am.e0(eVar.b(), (InterfaceC2026Qj0) this.b.getValue());
                    } else {
                        C7604qK.z(eVar, this.b.getValue(), c0343Am);
                    }
                    if (this.a.hasNext()) {
                        this.b = (Map.Entry) this.a.next();
                    } else {
                        this.b = null;
                    }
                }
            }

            public a(boolean z) {
                Iterator itP = d.this.C.p();
                this.a = itP;
                if (itP.hasNext()) {
                    this.b = (Map.Entry) itP.next();
                }
                this.c = z;
            }
        }

        public d() {
            this.C = C7604qK.t();
        }

        public final boolean A(f fVar) {
            C(fVar);
            return this.C.m(fVar.d);
        }

        public a B() {
            return new a(this, false, null);
        }

        public final void C(f fVar) {
            if (fVar.b() != b()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // com.daaw.AbstractC5674jS
        public void n() {
            this.C.q();
        }

        @Override // com.daaw.AbstractC5674jS
        public boolean r(C9687xm c9687xm, C0343Am c0343Am, C6763nJ c6763nJ, int i) {
            return AbstractC5674jS.s(this.C, b(), c9687xm, c0343Am, c6763nJ, i);
        }

        public boolean u() {
            return this.C.n();
        }

        public int w() {
            return this.C.k();
        }

        public final Object x(f fVar) {
            C(fVar);
            Object objH = this.C.h(fVar.d);
            return objH == null ? fVar.b : fVar.a(objH);
        }

        public final Object y(f fVar, int i) {
            C(fVar);
            return fVar.e(this.C.i(fVar.d, i));
        }

        public final int z(f fVar) {
            C(fVar);
            return this.C.j(fVar.d);
        }

        public d(c cVar) {
            this.C = cVar.m();
        }
    }

    public AbstractC5674jS(b bVar) {
    }

    public void n() {
    }
}
