package com.daaw;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.yH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9830yH extends YS0 {
    public final C71 C;
    public final InterfaceC4346ej0 D;
    public final AH E;
    public final List F;
    public final boolean G;
    public final String[] H;
    public final String I;

    public /* synthetic */ C9830yH(C71 c71, InterfaceC4346ej0 interfaceC4346ej0, AH ah, List list, boolean z, String[] strArr, int i, AbstractC2911Yw abstractC2911Yw) {
        this(c71, interfaceC4346ej0, ah, (i & 8) != 0 ? AbstractC1599Mm.k() : list, (i & 16) != 0 ? false : z, strArr);
    }

    @Override // com.daaw.I80
    public List L0() {
        return this.F;
    }

    @Override // com.daaw.I80
    public C8387t71 M0() {
        return C8387t71.C.j();
    }

    @Override // com.daaw.I80
    public C71 N0() {
        return this.C;
    }

    @Override // com.daaw.I80
    public boolean O0() {
        return this.G;
    }

    @Override // com.daaw.AbstractC5708ja1
    /* JADX INFO: renamed from: U0 */
    public YS0 R0(boolean z) {
        C71 c71N0 = N0();
        InterfaceC4346ej0 interfaceC4346ej0Q = q();
        AH ah = this.E;
        List listL0 = L0();
        String[] strArr = this.H;
        return new C9830yH(c71N0, interfaceC4346ej0Q, ah, listL0, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // com.daaw.AbstractC5708ja1
    /* JADX INFO: renamed from: V0 */
    public YS0 T0(C8387t71 c8387t71) {
        G10.g(c8387t71, "newAttributes");
        return this;
    }

    public final String W0() {
        return this.I;
    }

    public final AH X0() {
        return this.E;
    }

    @Override // com.daaw.AbstractC5708ja1
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public C9830yH X0(Q80 q80) {
        G10.g(q80, "kotlinTypeRefiner");
        return this;
    }

    public final C9830yH Z0(List list) {
        G10.g(list, "newArguments");
        C71 c71N0 = N0();
        InterfaceC4346ej0 interfaceC4346ej0Q = q();
        AH ah = this.E;
        boolean zO0 = O0();
        String[] strArr = this.H;
        return new C9830yH(c71N0, interfaceC4346ej0Q, ah, list, zO0, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // com.daaw.I80
    public InterfaceC4346ej0 q() {
        return this.D;
    }

    public C9830yH(C71 c71, InterfaceC4346ej0 interfaceC4346ej0, AH ah, List list, boolean z, String... strArr) {
        G10.g(c71, "constructor");
        G10.g(interfaceC4346ej0, "memberScope");
        G10.g(ah, "kind");
        G10.g(list, "arguments");
        G10.g(strArr, "formatParams");
        this.C = c71;
        this.D = interfaceC4346ej0;
        this.E = ah;
        this.F = list;
        this.G = z;
        this.H = strArr;
        C4293eY0 c4293eY0 = C4293eY0.a;
        String strC = ah.c();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        String str = String.format(strC, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        G10.f(str, "format(...)");
        this.I = str;
    }
}
