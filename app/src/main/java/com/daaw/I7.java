package com.daaw;

import com.daaw.InterfaceC2231Si;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class I7 implements InterfaceC2231Si {
    public final Class a;
    public final List b;
    public final a c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a B = new a("CALL_BY_NAME", 0);
        public static final a C = new a("POSITIONAL_CALL", 1);
        public static final /* synthetic */ a[] D;
        public static final /* synthetic */ YG E;

        static {
            a[] aVarArrA = a();
            D = aVarArrA;
            E = AbstractC3110aH.a(aVarArrA);
        }

        public a(String str, int i) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{B, C};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) D.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b B = new b("JAVA", 0);
        public static final b C = new b("KOTLIN", 1);
        public static final /* synthetic */ b[] D;
        public static final /* synthetic */ YG E;

        static {
            b[] bVarArrA = a();
            D = bVarArrA;
            E = AbstractC3110aH.a(bVarArrA);
        }

        public b(String str, int i) {
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{B, C};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) D.clone();
        }
    }

    public I7(Class cls, List list, a aVar, b bVar, List list2) {
        G10.g(cls, "jClass");
        G10.g(list, "parameterNames");
        G10.g(aVar, "callMode");
        G10.g(bVar, "origin");
        G10.g(list2, "methods");
        this.a = cls;
        this.b = list;
        this.c = aVar;
        this.d = list2;
        List list3 = list2;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.e = arrayList;
        List list4 = this.d;
        ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(list4, 10));
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            G10.d(returnType);
            Class<?> clsK = AbstractC9544xF0.k(returnType);
            if (clsK != null) {
                returnType = clsK;
            }
            arrayList2.add(returnType);
        }
        this.f = arrayList2;
        List list5 = this.d;
        ArrayList arrayList3 = new ArrayList(AbstractC1703Nm.v(list5, 10));
        Iterator it3 = list5.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.g = arrayList3;
        if (this.c == a.C && bVar == b.B && !AbstractC2455Um.w0(this.b, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // com.daaw.InterfaceC2231Si
    public List a() {
        return this.e;
    }

    @Override // com.daaw.InterfaceC2231Si
    public /* bridge */ /* synthetic */ Member b() {
        return (Member) d();
    }

    public void c(Object[] objArr) {
        InterfaceC2231Si.a.a(this, objArr);
    }

    @Override // com.daaw.InterfaceC2231Si
    public Object call(Object[] objArr) {
        G10.g(objArr, "args");
        c(objArr);
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Object obj = objArr[i];
            int i3 = i2 + 1;
            Object objQ = (obj == null && this.c == a.B) ? this.g.get(i2) : N7.q(obj, (Class) this.f.get(i2));
            if (objQ == null) {
                N7.p(i2, (String) this.b.get(i2), (Class) this.f.get(i2));
                throw null;
            }
            arrayList.add(objQ);
            i++;
            i2 = i3;
        }
        return N7.g(this.a, AbstractC1473Lg0.t(AbstractC2455Um.T0(this.b, arrayList)), this.d);
    }

    public Void d() {
        return null;
    }

    @Override // com.daaw.InterfaceC2231Si
    public Type getReturnType() {
        return this.a;
    }

    public /* synthetic */ I7(Class cls, List list, a aVar, b bVar, List list2, int i, AbstractC2911Yw abstractC2911Yw) {
        List list3;
        if ((i & 16) != 0) {
            List list4 = list;
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list3 = arrayList;
        } else {
            list3 = list2;
        }
        this(cls, list, aVar, bVar, list3);
    }
}
