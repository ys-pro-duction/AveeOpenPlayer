package com.daaw;

import com.daaw.HN;

/* JADX INFO: loaded from: classes.dex */
public final class QN implements PN {
    public final SN a;
    public final InterfaceC1073Hk0 b;
    public EnumC7560q90 c;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4252eO.values().length];
            iArr[EnumC4252eO.Active.ordinal()] = 1;
            iArr[EnumC4252eO.ActiveParent.ordinal()] = 2;
            iArr[EnumC4252eO.Captured.ordinal()] = 3;
            iArr[EnumC4252eO.Deactivated.ordinal()] = 4;
            iArr[EnumC4252eO.DeactivatedParent.ordinal()] = 5;
            iArr[EnumC4252eO.Inactive.ordinal()] = 6;
            a = iArr;
        }
    }

    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ SN B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SN sn) {
            super(1);
            this.B = sn;
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SN sn) {
            G10.g(sn, "destination");
            if (G10.c(sn, this.B)) {
                return Boolean.FALSE;
            }
            if (sn.s() == null) {
                throw new IllegalStateException("Move focus landed at the root.");
            }
            AbstractC4820gO.h(sn);
            return Boolean.TRUE;
        }
    }

    public QN(SN sn) {
        G10.g(sn, "focusModifier");
        this.a = sn;
        this.b = TN.b(InterfaceC1073Hk0.m, sn);
    }

    @Override // com.daaw.PN
    public boolean a(int i) {
        SN snB = AbstractC5099hO.b(this.a);
        if (snB == null) {
            return false;
        }
        ZN znA = UN.a(snB, i, e());
        if (G10.c(znA, ZN.b.a())) {
            return AbstractC5099hO.f(this.a, i, e(), new b(snB)) || j(i);
        }
        znA.c();
        return true;
    }

    @Override // com.daaw.PN
    public void b(boolean z) {
        EnumC4252eO enumC4252eO;
        EnumC4252eO enumC4252eOL = this.a.l();
        if (AbstractC4820gO.c(this.a, z)) {
            SN sn = this.a;
            switch (a.a[enumC4252eOL.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    enumC4252eO = EnumC4252eO.Active;
                    break;
                case 4:
                case 5:
                    enumC4252eO = EnumC4252eO.Deactivated;
                    break;
                case 6:
                    enumC4252eO = EnumC4252eO.Inactive;
                    break;
                default:
                    throw new C6902no0();
            }
            sn.w(enumC4252eO);
        }
    }

    public final void c() {
        RN.d(this.a);
    }

    public final SN d() {
        return RN.c(this.a);
    }

    public final EnumC7560q90 e() {
        EnumC7560q90 enumC7560q90 = this.c;
        if (enumC7560q90 != null) {
            return enumC7560q90;
        }
        G10.u("layoutDirection");
        return null;
    }

    public final InterfaceC1073Hk0 f() {
        return this.b;
    }

    public final void g() {
        AbstractC4820gO.c(this.a, true);
    }

    public final void h(EnumC7560q90 enumC7560q90) {
        G10.g(enumC7560q90, "<set-?>");
        this.c = enumC7560q90;
    }

    public final void i() {
        if (this.a.l() == EnumC4252eO.Inactive) {
            this.a.w(EnumC4252eO.Active);
        }
    }

    public final boolean j(int i) {
        if (this.a.l().g() && !this.a.l().a()) {
            HN.a aVar = HN.b;
            if (HN.l(i, aVar.d()) ? true : HN.l(i, aVar.f())) {
                b(false);
                if (this.a.l().a()) {
                    return a(i);
                }
                return false;
            }
        }
        return false;
    }

    public /* synthetic */ QN(SN sn, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? new SN(EnumC4252eO.Inactive, null, 2, null) : sn);
    }
}
