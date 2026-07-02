package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.No, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1711No implements InterfaceC1607Mo {
    public final int B;
    public final boolean C;
    public Object D;
    public UE0 E;
    public List F;

    /* JADX INFO: renamed from: com.daaw.No$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ Object C;
        public final /* synthetic */ int D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, int i) {
            super(2);
            this.C = obj;
            this.D = i;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(interfaceC5781jp, "nc");
            C1711No.this.c(this.C, interfaceC5781jp, this.D | 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.No$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ Object C;
        public final /* synthetic */ Object D;
        public final /* synthetic */ int E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, Object obj2, int i) {
            super(2);
            this.C = obj;
            this.D = obj2;
            this.E = i;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(interfaceC5781jp, "nc");
            C1711No.this.d(this.C, this.D, interfaceC5781jp, this.E | 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.No$c */
    public static final class c extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ Object C;
        public final /* synthetic */ Object D;
        public final /* synthetic */ Object E;
        public final /* synthetic */ int F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, Object obj2, Object obj3, int i) {
            super(2);
            this.C = obj;
            this.D = obj2;
            this.E = obj3;
            this.F = i;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(interfaceC5781jp, "nc");
            C1711No.this.h(this.C, this.D, this.E, interfaceC5781jp, this.F | 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public C1711No(int i, boolean z) {
        this.B = i;
        this.C = z;
    }

    public Object a(InterfaceC5781jp interfaceC5781jp, int i) {
        G10.g(interfaceC5781jp, "c");
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(this.B);
        i(interfaceC5781jpQ);
        int iD = i | (interfaceC5781jpQ.P(this) ? AbstractC1815Oo.d(0) : AbstractC1815Oo.f(0));
        Object obj = this.D;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        Object objInvoke = ((InterfaceC3429bR) V71.e(obj, 2)).invoke(interfaceC5781jpQ, Integer.valueOf(iD));
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z != null) {
            qn0Z.a((InterfaceC3429bR) V71.e(this, 2));
        }
        return objInvoke;
    }

    @Override // com.daaw.InterfaceC4553fR
    public /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        return d(obj, obj2, (InterfaceC5781jp) obj3, ((Number) obj4).intValue());
    }

    public Object c(Object obj, InterfaceC5781jp interfaceC5781jp, int i) {
        G10.g(interfaceC5781jp, "c");
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(this.B);
        i(interfaceC5781jpQ);
        int iD = (interfaceC5781jpQ.P(this) ? AbstractC1815Oo.d(1) : AbstractC1815Oo.f(1)) | i;
        Object obj2 = this.D;
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        Object objInvoke = ((InterfaceC3986dR) V71.e(obj2, 3)).invoke(obj, interfaceC5781jpQ, Integer.valueOf(iD));
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z != null) {
            qn0Z.a(new a(obj, i));
        }
        return objInvoke;
    }

    public Object d(Object obj, Object obj2, InterfaceC5781jp interfaceC5781jp, int i) {
        G10.g(interfaceC5781jp, "c");
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(this.B);
        i(interfaceC5781jpQ);
        int iD = (interfaceC5781jpQ.P(this) ? AbstractC1815Oo.d(2) : AbstractC1815Oo.f(2)) | i;
        Object obj3 = this.D;
        if (obj3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        Object objB = ((InterfaceC4553fR) V71.e(obj3, 4)).b(obj, obj2, interfaceC5781jpQ, Integer.valueOf(iD));
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z != null) {
            qn0Z.a(new b(obj, obj2, i));
        }
        return objB;
    }

    @Override // com.daaw.InterfaceC5111hR
    public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return h(obj, obj2, obj3, (InterfaceC5781jp) obj4, ((Number) obj5).intValue());
    }

    public Object h(Object obj, Object obj2, Object obj3, InterfaceC5781jp interfaceC5781jp, int i) {
        G10.g(interfaceC5781jp, "c");
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(this.B);
        i(interfaceC5781jpQ);
        int iD = (interfaceC5781jpQ.P(this) ? AbstractC1815Oo.d(3) : AbstractC1815Oo.f(3)) | i;
        Object obj4 = this.D;
        if (obj4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        }
        Object objE = ((InterfaceC5111hR) V71.e(obj4, 5)).e(obj, obj2, obj3, interfaceC5781jpQ, Integer.valueOf(iD));
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z != null) {
            qn0Z.a(new c(obj, obj2, obj3, i));
        }
        return objE;
    }

    public final void i(InterfaceC5781jp interfaceC5781jp) {
        UE0 ue0B;
        if (!this.C || (ue0B = interfaceC5781jp.b()) == null) {
            return;
        }
        interfaceC5781jp.j(ue0B);
        if (AbstractC1815Oo.e(this.E, ue0B)) {
            this.E = ue0B;
            return;
        }
        List list = this.F;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.F = arrayList;
            arrayList.add(ue0B);
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (AbstractC1815Oo.e((UE0) list.get(i), ue0B)) {
                list.set(i, ue0B);
                return;
            }
        }
        list.add(ue0B);
    }

    @Override // com.daaw.InterfaceC3429bR
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
    }

    public final void j() {
        if (this.C) {
            UE0 ue0 = this.E;
            if (ue0 != null) {
                ue0.invalidate();
                this.E = null;
            }
            List list = this.F;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((UE0) list.get(i)).invalidate();
                }
                list.clear();
            }
        }
    }

    public final void k(Object obj) {
        G10.g(obj, "block");
        if (G10.c(this.D, obj)) {
            return;
        }
        boolean z = this.D == null;
        this.D = obj;
        if (z) {
            return;
        }
        j();
    }

    @Override // com.daaw.InterfaceC3986dR
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return c(obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
    }
}
