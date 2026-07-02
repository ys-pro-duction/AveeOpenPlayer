package com.daaw;

import com.daaw.AbstractC7898rO;
import com.daaw.D7;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Tl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2348Tl0 implements InterfaceC1105Hs0 {
    public final D7 a;
    public final List b;
    public final O90 c;
    public final O90 d;
    public final List e;

    /* JADX INFO: renamed from: com.daaw.Tl0$a */
    public static final class a extends AbstractC4192e90 implements LQ {
        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            Object obj;
            InterfaceC1105Hs0 interfaceC1105Hs0B;
            List listF = C2348Tl0.this.f();
            if (listF.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = listF.get(0);
                float fC = ((C1001Gs0) obj2).b().c();
                int iM = AbstractC1599Mm.m(listF);
                int i = 1;
                if (1 <= iM) {
                    while (true) {
                        Object obj3 = listF.get(i);
                        float fC2 = ((C1001Gs0) obj3).b().c();
                        if (Float.compare(fC, fC2) < 0) {
                            obj2 = obj3;
                            fC = fC2;
                        }
                        if (i == iM) {
                            break;
                        }
                        i++;
                    }
                }
                obj = obj2;
            }
            C1001Gs0 c1001Gs0 = (C1001Gs0) obj;
            return Float.valueOf((c1001Gs0 == null || (interfaceC1105Hs0B = c1001Gs0.b()) == null) ? 0.0f : interfaceC1105Hs0B.c());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Tl0$b */
    public static final class b extends AbstractC4192e90 implements LQ {
        public b() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            Object obj;
            InterfaceC1105Hs0 interfaceC1105Hs0B;
            List listF = C2348Tl0.this.f();
            if (listF.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = listF.get(0);
                float fB = ((C1001Gs0) obj2).b().b();
                int iM = AbstractC1599Mm.m(listF);
                int i = 1;
                if (1 <= iM) {
                    while (true) {
                        Object obj3 = listF.get(i);
                        float fB2 = ((C1001Gs0) obj3).b().b();
                        if (Float.compare(fB, fB2) < 0) {
                            obj2 = obj3;
                            fB = fB2;
                        }
                        if (i == iM) {
                            break;
                        }
                        i++;
                    }
                }
                obj = obj2;
            }
            C1001Gs0 c1001Gs0 = (C1001Gs0) obj;
            return Float.valueOf((c1001Gs0 == null || (interfaceC1105Hs0B = c1001Gs0.b()) == null) ? 0.0f : interfaceC1105Hs0B.b());
        }
    }

    public C2348Tl0(D7 d7, O21 o21, List list, InterfaceC4988gz interfaceC4988gz, AbstractC7898rO.b bVar) {
        D7 d72 = d7;
        O21 o212 = o21;
        G10.g(d72, "annotatedString");
        G10.g(o212, "style");
        G10.g(list, "placeholders");
        InterfaceC4988gz interfaceC4988gz2 = interfaceC4988gz;
        G10.g(interfaceC4988gz2, "density");
        AbstractC7898rO.b bVar2 = bVar;
        G10.g(bVar2, "fontFamilyResolver");
        this.a = d72;
        this.b = list;
        EnumC7395pb0 enumC7395pb0 = EnumC7395pb0.D;
        this.c = AbstractC3192ab0.b(enumC7395pb0, new b());
        this.d = AbstractC3192ab0.b(enumC7395pb0, new a());
        C1417Ks0 c1417Ks0D = o212.D();
        List listG = E7.g(d72, c1417Ks0D);
        ArrayList arrayList = new ArrayList(listG.size());
        int size = listG.size();
        int i = 0;
        while (i < size) {
            D7.b bVar3 = (D7.b) listG.get(i);
            D7 d7H = E7.h(d72, bVar3.f(), bVar3.d());
            arrayList.add(new C1001Gs0(AbstractC1209Is0.a(d7H.g(), o212.B(h((C1417Ks0) bVar3.e(), c1417Ks0D)), d7H.e(), AbstractC2452Ul0.b(g(), bVar3.f(), bVar3.d()), interfaceC4988gz2, bVar2), bVar3.f(), bVar3.d()));
            i++;
            d72 = d7;
            o212 = o21;
            interfaceC4988gz2 = interfaceC4988gz;
            bVar2 = bVar;
        }
        this.e = arrayList;
    }

    @Override // com.daaw.InterfaceC1105Hs0
    public boolean a() {
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C1001Gs0) list.get(i)).b().a()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.InterfaceC1105Hs0
    public float b() {
        return ((Number) this.c.getValue()).floatValue();
    }

    @Override // com.daaw.InterfaceC1105Hs0
    public float c() {
        return ((Number) this.d.getValue()).floatValue();
    }

    public final D7 e() {
        return this.a;
    }

    public final List f() {
        return this.e;
    }

    public final List g() {
        return this.b;
    }

    public final C1417Ks0 h(C1417Ks0 c1417Ks0, C1417Ks0 c1417Ks02) {
        T11 t11G = c1417Ks0.g();
        if (t11G == null) {
            return C1417Ks0.b(c1417Ks0, null, c1417Ks02.g(), 0L, null, 13, null);
        }
        t11G.l();
        return c1417Ks0;
    }
}
