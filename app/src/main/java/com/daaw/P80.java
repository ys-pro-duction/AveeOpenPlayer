package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class P80 extends Y0 {

    public static final class a extends P80 {
        public static final a a = new a();
    }

    public /* synthetic */ class b extends AbstractC9312wR implements NQ {
        public b(Object obj) {
            super(1, obj);
        }

        @Override // com.daaw.AbstractC1687Ni, com.daaw.InterfaceC9220w50
        public final String getName() {
            return "prepareType";
        }

        @Override // com.daaw.AbstractC1687Ni
        public final InterfaceC6429m60 getOwner() {
            return AbstractC5624jG0.b(P80.class);
        }

        @Override // com.daaw.AbstractC1687Ni
        public final String getSignature() {
            return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final AbstractC5708ja1 invoke(O80 o80) {
            G10.g(o80, "p0");
            return ((P80) this.receiver).a(o80);
        }
    }

    @Override // com.daaw.Y0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC5708ja1 a(O80 o80) {
        AbstractC5708ja1 abstractC5708ja1E;
        G10.g(o80, "type");
        if (!(o80 instanceof I80)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        AbstractC5708ja1 abstractC5708ja1Q0 = ((I80) o80).Q0();
        if (abstractC5708ja1Q0 instanceof YS0) {
            abstractC5708ja1E = c((YS0) abstractC5708ja1Q0);
        } else {
            if (!(abstractC5708ja1Q0 instanceof UM)) {
                throw new C6902no0();
            }
            UM um = (UM) abstractC5708ja1Q0;
            YS0 ys0C = c(um.V0());
            YS0 ys0C2 = c(um.W0());
            abstractC5708ja1E = (ys0C == um.V0() && ys0C2 == um.W0()) ? abstractC5708ja1Q0 : M80.e(ys0C, ys0C2);
        }
        return L81.c(abstractC5708ja1E, abstractC5708ja1Q0, new b(this));
    }

    public final YS0 c(YS0 ys0) {
        I80 type;
        C71 c71N0 = ys0.N0();
        B10 b10S = null;
        abstractC5708ja1Q0 = null;
        AbstractC5708ja1 abstractC5708ja1Q0 = null;
        if (!(c71N0 instanceof C0652Dj)) {
            if (!(c71N0 instanceof B10) || !ys0.O0()) {
                return ys0;
            }
            B10 b10 = (B10) c71N0;
            Collection collectionB = b10.b();
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(collectionB, 10));
            Iterator it = collectionB.iterator();
            boolean z = false;
            while (it.hasNext()) {
                arrayList.add(H81.B((I80) it.next()));
                z = true;
            }
            if (z) {
                I80 i80L = b10.l();
                b10S = new B10(arrayList).s(i80L != null ? H81.B(i80L) : null);
            }
            if (b10S != null) {
                b10 = b10S;
            }
            return b10.j();
        }
        C0652Dj c0652Dj = (C0652Dj) c71N0;
        InterfaceC6440m81 interfaceC6440m81E = c0652Dj.e();
        if (interfaceC6440m81E.b() != EnumC1042Hc1.G) {
            interfaceC6440m81E = null;
        }
        if (interfaceC6440m81E != null && (type = interfaceC6440m81E.getType()) != null) {
            abstractC5708ja1Q0 = type.Q0();
        }
        AbstractC5708ja1 abstractC5708ja1 = abstractC5708ja1Q0;
        if (c0652Dj.g() == null) {
            InterfaceC6440m81 interfaceC6440m81E2 = c0652Dj.e();
            Collection collectionB2 = c0652Dj.b();
            ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(collectionB2, 10));
            Iterator it2 = collectionB2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((I80) it2.next()).Q0());
            }
            c0652Dj.i(new C2146Rn0(interfaceC6440m81E2, arrayList2, null, 4, null));
        }
        EnumC9951yj enumC9951yj = EnumC9951yj.B;
        C2146Rn0 c2146Rn0G = c0652Dj.g();
        G10.d(c2146Rn0G);
        return new C1604Mn0(enumC9951yj, c2146Rn0G, abstractC5708ja1, ys0.M0(), ys0.O0(), false, 32, null);
    }
}
