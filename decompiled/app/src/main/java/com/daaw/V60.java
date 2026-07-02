package com.daaw;

import com.daaw.AbstractC5347iG0;
import com.daaw.C7401pc1;
import com.daaw.InterfaceC1583Mi;
import com.daaw.S60;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class V60 implements S60 {
    public static final /* synthetic */ W60[] G = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(V60.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(V60.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    public final H50 B;
    public final int C;
    public final S60.a D;
    public final AbstractC5347iG0.a E;
    public final AbstractC5347iG0.a F;

    public static final class a implements Type {
        public final Type[] a;
        public final int b;

        public a(Type[] typeArr) {
            G10.g(typeArr, "types");
            this.a = typeArr;
            this.b = Arrays.hashCode(typeArr);
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Arrays.equals(this.a, ((a) obj).a);
        }

        @Override // java.lang.reflect.Type
        public String getTypeName() {
            return AbstractC5431ib.P(this.a, ", ", "[", "]", 0, null, null, 56, null);
        }

        public int hashCode() {
            return this.b;
        }

        public String toString() {
            return getTypeName();
        }
    }

    public V60(H50 h50, int i, S60.a aVar, LQ lq) {
        G10.g(h50, "callable");
        G10.g(aVar, "kind");
        G10.g(lq, "computeDescriptor");
        this.B = h50;
        this.C = i;
        this.D = aVar;
        this.E = AbstractC5347iG0.b(lq);
        this.F = AbstractC5347iG0.b(new T60(this));
    }

    public static final Type b(V60 v60) {
        List listF0;
        G10.g(v60, "this$0");
        InterfaceC1624Ms0 interfaceC1624Ms0S = v60.s();
        if ((interfaceC1624Ms0S instanceof RE0) && G10.c(AbstractC8511tb1.i(v60.B.X()), interfaceC1624Ms0S) && v60.B.X().i() == InterfaceC1583Mi.a.FAKE_OVERRIDE) {
            InterfaceC8612tw interfaceC8612twB = v60.B.X().b();
            G10.e(interfaceC8612twB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class clsQ = AbstractC8511tb1.q((InterfaceC4923gl) interfaceC8612twB);
            if (clsQ != null) {
                return clsQ;
            }
            throw new E80("Cannot determine receiver Java type of inherited declaration: " + interfaceC1624Ms0S);
        }
        InterfaceC2231Si interfaceC2231SiP = v60.B.P();
        if (!(interfaceC2231SiP instanceof C7401pc1)) {
            if (!(interfaceC2231SiP instanceof C7401pc1.b)) {
                return (Type) interfaceC2231SiP.a().get(v60.getIndex());
            }
            Class[] clsArr = (Class[]) ((Collection) ((C7401pc1.b) interfaceC2231SiP).d().get(v60.getIndex())).toArray(new Class[0]);
            return v60.p((Type[]) Arrays.copyOf(clsArr, clsArr.length));
        }
        if (v60.B.V()) {
            C7401pc1 c7401pc1 = (C7401pc1) interfaceC2231SiP;
            H00 h00F = c7401pc1.f(v60.getIndex() + 1);
            int iS = c7401pc1.f(0).s() + 1;
            listF0 = AbstractC2455Um.F0(c7401pc1.a(), new H00(h00F.p() - iS, h00F.s() - iS));
        } else {
            C7401pc1 c7401pc12 = (C7401pc1) interfaceC2231SiP;
            listF0 = AbstractC2455Um.F0(c7401pc12.a(), c7401pc12.f(v60.getIndex()));
        }
        Type[] typeArr = (Type[]) listF0.toArray(new Type[0]);
        return v60.p((Type[]) Arrays.copyOf(typeArr, typeArr.length));
    }

    public static final List o(V60 v60) {
        G10.g(v60, "this$0");
        return AbstractC8511tb1.e(v60.s());
    }

    @Override // com.daaw.S60
    public boolean a() {
        InterfaceC1624Ms0 interfaceC1624Ms0S = s();
        return (interfaceC1624Ms0S instanceof InterfaceC9918yc1) && ((InterfaceC9918yc1) interfaceC1624Ms0S).g0() != null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof V60)) {
            return false;
        }
        V60 v60 = (V60) obj;
        return G10.c(this.B, v60.B) && getIndex() == v60.getIndex();
    }

    @Override // com.daaw.S60
    public int getIndex() {
        return this.C;
    }

    @Override // com.daaw.S60
    public String getName() {
        InterfaceC1624Ms0 interfaceC1624Ms0S = s();
        InterfaceC9918yc1 interfaceC9918yc1 = interfaceC1624Ms0S instanceof InterfaceC9918yc1 ? (InterfaceC9918yc1) interfaceC1624Ms0S : null;
        if (interfaceC9918yc1 == null || interfaceC9918yc1.b().E()) {
            return null;
        }
        C2352Tm0 name = interfaceC9918yc1.getName();
        G10.f(name, "getName(...)");
        if (name.m()) {
            return null;
        }
        return name.c();
    }

    @Override // com.daaw.S60
    public InterfaceC7550q70 getType() {
        I80 type = s().getType();
        G10.f(type, "getType(...)");
        return new C9230w70(type, new U60(this));
    }

    public int hashCode() {
        return (this.B.hashCode() * 31) + getIndex();
    }

    @Override // com.daaw.S60
    public S60.a i() {
        return this.D;
    }

    public final Type p(Type... typeArr) {
        int length = typeArr.length;
        if (length != 0) {
            return length != 1 ? new a(typeArr) : (Type) AbstractC5431ib.V(typeArr);
        }
        throw new F80("Expected at least 1 type for compound type");
    }

    @Override // com.daaw.S60
    public boolean q() {
        InterfaceC1624Ms0 interfaceC1624Ms0S = s();
        InterfaceC9918yc1 interfaceC9918yc1 = interfaceC1624Ms0S instanceof InterfaceC9918yc1 ? (InterfaceC9918yc1) interfaceC1624Ms0S : null;
        if (interfaceC9918yc1 != null) {
            return AbstractC8400tA.f(interfaceC9918yc1);
        }
        return false;
    }

    public final H50 r() {
        return this.B;
    }

    public final InterfaceC1624Ms0 s() {
        Object objC = this.E.c(this, G[0]);
        G10.f(objC, "getValue(...)");
        return (InterfaceC1624Ms0) objC;
    }

    public String toString() {
        return C7310pG0.a.j(this);
    }
}
