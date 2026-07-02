package com.daaw;

import com.daaw.AbstractC8869ur0;

/* JADX INFO: renamed from: com.daaw.fK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4516fK0 extends AbstractC2583Vs {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4516fK0(InterfaceC3281at interfaceC3281at, InterfaceC3281at interfaceC3281at2, InterfaceC3281at interfaceC3281at3, InterfaceC3281at interfaceC3281at4) {
        super(interfaceC3281at, interfaceC3281at2, interfaceC3281at3, interfaceC3281at4);
        G10.g(interfaceC3281at, "topStart");
        G10.g(interfaceC3281at2, "topEnd");
        G10.g(interfaceC3281at3, "bottomEnd");
        G10.g(interfaceC3281at4, "bottomStart");
    }

    @Override // com.daaw.AbstractC2583Vs
    public AbstractC8869ur0 d(long j, float f, float f2, float f3, float f4, EnumC7560q90 enumC7560q90) {
        G10.g(enumC7560q90, "layoutDirection");
        if (f + f2 + f3 + f4 == 0.0f) {
            return new AbstractC8869ur0.a(BT0.c(j));
        }
        C3103aF0 c3103aF0C = BT0.c(j);
        EnumC7560q90 enumC7560q902 = EnumC7560q90.Ltr;
        return new AbstractC8869ur0.b(AbstractC3959dK0.b(c3103aF0C, AbstractC2895Ys.b(enumC7560q90 == enumC7560q902 ? f : f2, 0.0f, 2, null), AbstractC2895Ys.b(enumC7560q90 == enumC7560q902 ? f2 : f, 0.0f, 2, null), AbstractC2895Ys.b(enumC7560q90 == enumC7560q902 ? f3 : f4, 0.0f, 2, null), AbstractC2895Ys.b(enumC7560q90 == enumC7560q902 ? f4 : f3, 0.0f, 2, null)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4516fK0)) {
            return false;
        }
        C4516fK0 c4516fK0 = (C4516fK0) obj;
        return G10.c(h(), c4516fK0.h()) && G10.c(g(), c4516fK0.g()) && G10.c(e(), c4516fK0.e()) && G10.c(f(), c4516fK0.f());
    }

    public int hashCode() {
        return (((((h().hashCode() * 31) + g().hashCode()) * 31) + e().hashCode()) * 31) + f().hashCode();
    }

    @Override // com.daaw.AbstractC2583Vs
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C4516fK0 c(InterfaceC3281at interfaceC3281at, InterfaceC3281at interfaceC3281at2, InterfaceC3281at interfaceC3281at3, InterfaceC3281at interfaceC3281at4) {
        G10.g(interfaceC3281at, "topStart");
        G10.g(interfaceC3281at2, "topEnd");
        G10.g(interfaceC3281at3, "bottomEnd");
        G10.g(interfaceC3281at4, "bottomStart");
        return new C4516fK0(interfaceC3281at, interfaceC3281at2, interfaceC3281at3, interfaceC3281at4);
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + h() + ", topEnd = " + g() + ", bottomEnd = " + e() + ", bottomStart = " + f() + ')';
    }
}
