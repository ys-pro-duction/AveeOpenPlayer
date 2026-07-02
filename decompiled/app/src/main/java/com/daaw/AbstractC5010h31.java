package com.daaw;

import com.daaw.InterfaceC4684ft;

/* JADX INFO: renamed from: com.daaw.h31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5010h31 {
    public static final YZ0 a = new YZ0("NO_THREAD_ELEMENTS");
    public static final InterfaceC3429bR b = a.B;
    public static final InterfaceC3429bR c = b.B;
    public static final InterfaceC3429bR d = c.B;

    /* JADX INFO: renamed from: com.daaw.h31$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final a B = new a();

        public a() {
            super(2);
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, InterfaceC4684ft.b bVar) {
            if (!(bVar instanceof InterfaceC4731g31)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
        }
    }

    /* JADX INFO: renamed from: com.daaw.h31$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final b B = new b();

        public b() {
            super(2);
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4731g31 invoke(InterfaceC4731g31 interfaceC4731g31, InterfaceC4684ft.b bVar) {
            if (interfaceC4731g31 != null) {
                return interfaceC4731g31;
            }
            if (bVar instanceof InterfaceC4731g31) {
                return (InterfaceC4731g31) bVar;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.h31$c */
    public static final class c extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final c B = new c();

        public c() {
            super(2);
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7809r31 invoke(C7809r31 c7809r31, InterfaceC4684ft.b bVar) {
            if (bVar instanceof InterfaceC4731g31) {
                InterfaceC4731g31 interfaceC4731g31 = (InterfaceC4731g31) bVar;
                c7809r31.a(interfaceC4731g31, interfaceC4731g31.I(c7809r31.a));
            }
            return c7809r31;
        }
    }

    public static final void a(InterfaceC4684ft interfaceC4684ft, Object obj) {
        if (obj == a) {
            return;
        }
        if (obj instanceof C7809r31) {
            ((C7809r31) obj).b(interfaceC4684ft);
            return;
        }
        Object objC1 = interfaceC4684ft.c1(null, c);
        G10.e(objC1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((InterfaceC4731g31) objC1).W(interfaceC4684ft, obj);
    }

    public static final Object b(InterfaceC4684ft interfaceC4684ft) {
        Object objC1 = interfaceC4684ft.c1(0, b);
        G10.d(objC1);
        return objC1;
    }

    public static final Object c(InterfaceC4684ft interfaceC4684ft, Object obj) {
        if (obj == null) {
            obj = b(interfaceC4684ft);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return interfaceC4684ft.c1(new C7809r31(interfaceC4684ft, ((Number) obj).intValue()), d);
        }
        G10.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((InterfaceC4731g31) obj).I(interfaceC4684ft);
    }
}
