package com.daaw;

/* JADX INFO: renamed from: com.daaw.eO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4252eO implements InterfaceC3974dO {
    Active,
    ActiveParent,
    Captured,
    Deactivated,
    DeactivatedParent,
    Inactive;

    /* JADX INFO: renamed from: com.daaw.eO$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4252eO.values().length];
            iArr[EnumC4252eO.Captured.ordinal()] = 1;
            iArr[EnumC4252eO.Active.ordinal()] = 2;
            iArr[EnumC4252eO.ActiveParent.ordinal()] = 3;
            iArr[EnumC4252eO.Deactivated.ordinal()] = 4;
            iArr[EnumC4252eO.DeactivatedParent.ordinal()] = 5;
            iArr[EnumC4252eO.Inactive.ordinal()] = 6;
            a = iArr;
        }
    }

    @Override // com.daaw.InterfaceC3974dO
    public boolean a() {
        switch (a.a[ordinal()]) {
            case 1:
            case 2:
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new C6902no0();
        }
    }

    public boolean g() {
        switch (a.a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 5:
                return true;
            case 4:
            case 6:
                return false;
            default:
                throw new C6902no0();
        }
    }

    public final boolean h() {
        switch (a.a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 6:
                return false;
            case 4:
            case 5:
                return true;
            default:
                throw new C6902no0();
        }
    }
}
